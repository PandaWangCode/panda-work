package com.nx.ood.prototype;

/**
 * 原型模式
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
       RealizeType obj1 = new RealizeType();
       RealizeType obj2 = (RealizeType) obj1.clone();           // 克隆对象，打印日志可以看出来，克隆并没有调用构造方法
       System.out.println("obj1 == obj2 ? " + (obj1 == obj2));  // false:说明两个对象不一样
    }

//原型模式
//    用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。
//    在这里，原型实例指定了要创建的对象的种类。用这种方式创建对象非常高效，根本无须知道对象创建的细节
//什么时候用原型模式?
//      1.对象之间相同或相似，即只是个别属性不同的时候
//      2.对象的创建过程比较麻烦，但复制比简单的时候
//      3.资源优化场景，在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过 clone 的方法创建一个对象，然后由工厂方法提供给调用者
//      具体原型类:实现抽象原型类的 clone0)方法，它是可被复制的对象
}
