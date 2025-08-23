package org.LLD2.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * What is Design pattern?
 * A design pattern is a reusable solution to a common problem in software design.
 * It is a general repeatable solution that can be applied to a specific problem in a given context.
 *
 *
 * What is Singleton Design Pattern?
 * The Singleton Design Pattern is a design pattern that restricts the instantiation of a class
 * to a single instance and provides a global point of access to that instance.
 *
 *
 * Type of design patterns:
 * 1. Creational Design Patterns: Deal with object creation mechanisms, trying to create
 *    objects in a manner suitable to the situation. Examples: Singleton, Factory, Abstract
 *    Factory, Builder, Prototype.
 * 2. Structural Design Patterns: Deal with object composition or structure,
 *    simplifying the design by identifying a simple way to realize relationships
 *    between entities. Examples: Adapter, Composite, Proxy, Flyweight, Facade, Bridge,
 *    Decorator.
 * 3. Behavioral Design Patterns: Deal with object interaction and responsibility,
 *    focusing on communication between objects. Examples: Observer, Strategy, Command,
 *    Iterator, Mediator, Memento, State, Template Method, Visitor.
 */


public class DBConn {
    private static volatile DBConn INSTANCE = null;
    private static final Lock lock = new ReentrantLock();

    private DBConn() {
        // private constructor to prevent instantiation
    }

    // A1.
    // Eager initialization -> Initialized on load time
    // private static final DBConn INSTANCE_EAGER = new DBConn();



    /**
     * A2.
     * Not suitable for multi-threaded environment
     * @return
     */
    public static DBConn createInstanceSingleThreaded(){
        if(INSTANCE == null){
            INSTANCE = new DBConn();
        }
        return INSTANCE;
    }

    /**
     * A3.
     * Lazy loading with synchronized method
     * Suitable for single-threaded environment
     * @return
     */
    public synchronized static DBConn createInstanceUsingLazyLoading(){
        if(INSTANCE == null){
            INSTANCE = new DBConn();
        }
        return INSTANCE;
    }


    /**
     * A.4
     * Double checked locking
     * Best approach for multi-threaded environment
     * @return
     */
    public static DBConn createInstanceMultiThreaded(){
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
     * A5.
     * Lock using synchronized block
     * Best approach for multi-threaded environment
     */
    public static DBConn createInstanceUsingSynchronizedBlock() {
        if (INSTANCE == null) {
            synchronized (DBConn.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DBConn();
                }
            }
        }
        return INSTANCE;
    }

/**
 * A4 and A5 are similar, both are suitable for multi-threaded environment
 *
 **/


}