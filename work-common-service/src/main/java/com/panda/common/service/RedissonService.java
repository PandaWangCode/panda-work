package com.panda.common.service;

import com.panda.core.pojo.rsp.R;
import lombok.RequiredArgsConstructor;
import org.redisson.api.RList;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RedissonService {

    private final RedissonClient redissonClient;

    public R<String> getRedisson() {
        RList<String> nameList = redissonClient.getList("nameList");
        nameList.clear();
        nameList.add("bingo");
        nameList.add("yanglbme");
        nameList.add("https://github.com/yanglbme");
        // nameList.remove(-1);
        boolean contains = nameList.contains("yanglbme");
        System.out.println("List size: " + nameList.size());
        System.out.println("Is list contains name 'yanglbme': " + contains);
        nameList.forEach(System.out::println);

        return R.ok(nameList.toString());
    }

    /**
     * @author  wangpan
     * @create  2023/2/24
     * @desc   分布式锁
     * 基于Redis的Redisson分布式可重入锁RLock Java对象实现了java.util.concurrent.locks.Lock接口。同时还提供了异步（Async）、反射式（Reactive）和RxJava2标准的接口。
     **/
     public R<String> redissonLock() {
         // 1.获取一把锁，只要锁的名字一样，就是同一把锁
         RLock rLock = redissonClient.getLock("my-lock");
         rLock.lock();  // 阻塞式等待。默认加的锁是30s时间
         try {
             // 1、锁的自动续期，运行期间自动给锁续上新的30s，无需担心业务时间长，锁过期会自动被释放
             // 2、加锁的业务只要运行完成，就不会给当前锁续期，即使不手动释放锁，锁默认在30s后自动释放，避免死锁
             System.out.println("加锁成功，执行业务代码..."+Thread.currentThread().getId());
             Thread.sleep(30000);
         } catch (Exception e) {
             e.printStackTrace();
         } finally {
             System.out.println("释放锁..."+Thread.currentThread().getId());
             rLock.unlock();
         }
         return R.ok("成功！");
     }

     /**
      * @author  wangpan
      * @create  2023/2/24
      * @desc    读写锁
      * 一次只有一个线程可以占有写模式的读写锁, 但是可以有多个线程同时占有读模式的读写锁.（该数据加写锁、读数据加读锁）
      *
      * 当读写锁是写加锁状态时, 在这个锁被解锁之前, 所有试图对这个锁加锁的线程都会被阻塞.
      * 当读写锁在读加锁状态时, 所有试图以读模式对它进行加锁的线程都可以得到访问权, 但是如果线程希望以写模式对此锁进行加锁, 它必须直到所有的线程释放锁.
      **/
     public R<String> getReadWriteLock() {
        return R.ok("成功");

     }

}
