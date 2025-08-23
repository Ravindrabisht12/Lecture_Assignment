package org.LLD2.Singleton;

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

    // Eager initialization: instance created at class loading time
    // private static final DBConn INSTANCE_EAGER = new DBConn();

    /**
     * Lazy initialization:
     * Returns the Singleton instance using lazy initialization (single-threaded).
     * Not thread-safe. This is an instance getter, not a setter.
     * @return Singleton instance
     */
    public static DBConn getInstanceSingleThreaded(){
        if(INSTANCE == null){
            INSTANCE = new DBConn();
        }
        return INSTANCE;
    }

    /**
     * Synchronized method:
     * Returns the Singleton instance using synchronized method.
     * Thread-safe: ensures only one thread can create the instance at a time.
     * This is an instance getter, not a setter.
     * @return Singleton instance
     */
    public synchronized static DBConn getInstanceSynchronized(){
        if(INSTANCE == null){
            INSTANCE = new DBConn();
        }
        return INSTANCE;
    }

    /**
     * Double-checked locking:
     * Returns the Singleton instance using double-checked locking.
     * Thread-safe and efficient: locks only when instance is null.
     * This is an instance getter, not a setter.
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
     * Synchronized block:
     * -  For better performance in multi-threaded environments.
     * Returns the Singleton instance using a synchronized block.
     * Thread-safe: uses class-level lock to ensure only one thread creates the instance.
     * This is an instance getter, not a setter.
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