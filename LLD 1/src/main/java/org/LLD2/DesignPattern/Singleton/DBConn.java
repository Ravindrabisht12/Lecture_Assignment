package org.LLD2.DesignPattern.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Design Patterns:
 * A design pattern is a proven, reusable solution to a common software design problem.
 * Patterns provide templates for solving recurring design challenges in a given context.
 *
 * Singleton Design Pattern:
 * Ensures a class has only one instance and provides a global point of access to it.
 *
 * Types of Design Patterns:
 * 1. Creational: Object creation mechanisms (Singleton, Factory, Abstract Factory, Builder, Prototype)
 * 2. Structural: Object composition/structure (Adapter, Composite, Proxy, Flyweight, Facade, Bridge, Decorator)
 * 3. Behavioral: Object interaction/responsibility (Observer, Strategy, Command, Iterator, Mediator, Memento, State, Template Method, Visitor)
 */

public class DBConn {
    private static volatile DBConn INSTANCE = null;
    private static final Lock lock = new ReentrantLock();

    private DBConn() {
        // Prevent external instantiation
    }

    // Eager initialization Singleton (Simple and Safe):
    //
    // This approach creates the Singleton instance when the class is loaded, before any method is called.
    // It's the simplest way to guarantee thread safety, since the JVM handles class loading in a thread-safe manner.
    // However, it always creates the instance, even if it's never used, which can waste resources for heavy objects.
    //
    // Key learning points:
    // - No synchronization needed; thread safety is automatic.
    // - Use when the Singleton is lightweight and always needed.
    // - Not suitable for lazy loading or expensive objects.
    //
    // Example:
    // private static final DBConn INSTANCE_EAGER = new DBConn();

    /**
     * Lazy initialization Singleton (Single-threaded, basic):
     *
     * This method demonstrates the simplest way to create a Singleton instance only when it's first needed.
     * It works fine in single-threaded scenarios, but is NOT safe in multi-threaded environments—multiple threads
     * could create multiple instances if they call this method at the same time.
     *
     * Key learning points:
     * - Good for learning the basic idea of lazy loading.
     * - Not thread-safe; avoid in concurrent applications.
     * - Shows why thread safety is important for Singletons.
     *
     * @return Singleton instance
     */
    public static DBConn getInstanceSingleThreaded(){
        if(INSTANCE == null){
            INSTANCE = new DBConn();
        }
        return INSTANCE;
    }

    /**
     * Synchronized method Singleton (Basic thread safety):
     *
     * This method uses the 'synchronized' keyword to make the Singleton getter thread-safe.
     * Only one thread can execute this method at a time, so only one instance will ever be created.
     * This is easy to understand and implement, but synchronizing the whole method can hurt performance
     * if the method is called frequently after the instance is created.
     *
     * Key learning points:
     * - Simple way to add thread safety to lazy initialization.
     * - Synchronization can be slow if called often.
     * - Good for learning about basic concurrency control in Java.
     *
     * @return Singleton instance
     */
    public synchronized static DBConn getInstanceSynchronized(){
        if(INSTANCE == null){
            INSTANCE = new DBConn();
        }
        return INSTANCE;
    }

    /**
     * Double-checked locking Singleton (Advanced Multi-threading):
     *
     * This method demonstrates how to safely create a Singleton instance in a multi-threaded environment
     * without incurring the performance cost of synchronizing every call. The first check avoids locking
     * if the instance is already created. The second check inside the lock ensures only one thread creates
     * the instance. This pattern is widely used in real-world systems for thread-safe lazy initialization.
     *
     * Key learning points:
     * - Use 'volatile' for the instance variable to prevent instruction reordering issues.
     * - Locking is only performed when necessary, improving performance.
     * - Understand why double-checking is needed: without it, multiple threads could create multiple instances.
     *
     * @return Singleton instance
     */
    public static DBConn getInstanceMultiThreaded(){
        if(INSTANCE == null){
            lock.lock();
            try {
                if(INSTANCE == null){
                    INSTANCE = new DBConn();
                }
            } finally {
                lock.unlock();
            }
        }
        return INSTANCE;
    }

    /**
     * Synchronized block Singleton (Classic Multi-threading):
     *
     * This method shows another way to ensure thread safety when creating a Singleton instance.
     * The synchronized block locks on the class object, so only one thread can enter the block at a time.
     * The double-check inside the block prevents multiple instantiations if several threads reach the first check simultaneously.
     *
     * Key learning points:
     * - Synchronized blocks are more efficient than synchronizing the whole method.
     * - Still uses double-checking for correctness.
     * - Useful for understanding basic thread synchronization in Java.
     *
     * @return Singleton instance
     */
    public static DBConn getInstanceSynchronizedBlock() {
        if (INSTANCE == null) {
            synchronized (DBConn.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DBConn();
                }
            }
        }
        return INSTANCE;
    }

    // Both double-checked locking and synchronized block approaches are suitable for multi-threaded environments.

}