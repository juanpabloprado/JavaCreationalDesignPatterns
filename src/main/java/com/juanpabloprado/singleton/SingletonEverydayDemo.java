package com.juanpabloprado.singleton;

public class SingletonEverydayDemo {
    public static void main(String[] args) {
        Runtime singletoneRuntime = Runtime.getRuntime();
        singletoneRuntime.gc();

        System.out.println(singletoneRuntime);

        Runtime anotherInstance = Runtime.getRuntime();

        System.out.println(anotherInstance);

        if (singletoneRuntime == anotherInstance) {
            System.out.println("They are the same instance");
        }
    }
}
