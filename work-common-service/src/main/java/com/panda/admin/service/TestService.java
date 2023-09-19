package com.panda.admin.service;

import com.panda.core.pojo.rsp.R;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.Semaphore;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestService {

    public R<String> printABC() {
        Thread numberThread = new Thread(new NumberPrinter());
        Thread letterThread = new Thread(new LetterPrinter());
        numberThread.start();
        letterThread.start();
        return R.ok("");
    }

    private static final Semaphore semaphoreNumber = new Semaphore(1);
    private static final Semaphore semaphoreLetter = new Semaphore(0);

    public static void main(String[] args) {
        Thread numberThread = new Thread(new NumberPrinter());
        Thread letterThread = new Thread(new LetterPrinter());
        numberThread.start();
        letterThread.start();
    }

    static class NumberPrinter implements Runnable {
        @Override
        public void run() {
            try {
                for (int i = 1; i <= 3; i++) {
                    semaphoreNumber.acquire();
                    System.out.print(i);
                    semaphoreLetter.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class LetterPrinter implements Runnable {
        @Override
        public void run() {
            try {
                for (char c = 'A'; c <= 'C'; c++){
                    semaphoreLetter.acquire();
                    System.out.println(c);
                    semaphoreNumber.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
