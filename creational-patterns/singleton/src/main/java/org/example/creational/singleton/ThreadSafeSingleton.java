package org.example.creational.singleton;

/**
 * The synchronized block is inside if condition to make sure that only one instance
 * of a singleton class is created.
 */
public class ThreadSafeSingleton {

  private static ThreadSafeSingleton instance;

  private ThreadSafeSingleton() {
  }

  public static ThreadSafeSingleton getInstance() {
    if (instance == null) {
      synchronized (ThreadSafeSingleton.class) {
        if (instance == null) {
          instance = new ThreadSafeSingleton();
        }
      }
    }
    return instance;
  }
}
