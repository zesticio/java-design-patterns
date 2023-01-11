package org.example.creational.singleton;

/**
 * The instance of singleton class is loaded at the time of class loading.
 * The disadvantage is that the instance is created even if the client
 * application is not using the instance.
 */
public class InitializedSingleton {

  private static final InitializedSingleton instance = new InitializedSingleton();

  // private constructor to avoid client applications using the constructor
  private InitializedSingleton() {
  }

  public static InitializedSingleton getInstance() {
    return instance;
  }
}
