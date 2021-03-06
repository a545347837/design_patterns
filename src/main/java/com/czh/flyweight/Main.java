package com.czh.flyweight;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：享元模式
 *
 * 设计模式意图：运用共享技术有效地支持大量细粒度的对象。
 *
 * 适用性：
 *
 * 1、一个应用程序使用了大量的对象。
 *
 * 2、完全由于使用大量的对象，造成很大的存储开销。
 *
 * 3、对象的大多数状态都可变为外部状态。
 *
 * 4、如果删除对象的外部状态，那么可以用相对较少的共享对象取代很多组对象。
 *
 * 5、应用程序不依赖于对象标识。由于Flyweight对象可以被共享，对于概念上明显有别的对象，标识测试将返回真值。
 *
 */
public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = SimpleFlyweightFactory.getFactory();
        Flyweight flyweightA = flyweightFactory.getFlyweight("A");
        Flyweight flyweightB = flyweightFactory.getFlyweight("B");
        Flyweight flyweightC = flyweightFactory.getFlyweight("A");
        flyweightA.operator();
        flyweightB.operator();
        flyweightC.operator();
        System.out.println("flyweightA:" + flyweightA.hashCode());
        System.out.println("flyweightB:" + flyweightB.hashCode());
        System.out.println("flyweightC:" + flyweightC.hashCode());
    }
}
