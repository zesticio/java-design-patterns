package org.example.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

  public static void main(String[] args) {
    InitializedSingleton instanceOne = InitializedSingleton.getInstance();
    InitializedSingleton instanceTwo = null;
    try {
      Constructor[] constructors = InitializedSingleton.class.getDeclaredConstructors();
      for (Constructor constructor : constructors) {
        // This code will destroy the singleton pattern
        constructor.setAccessible(true);
        instanceTwo = (InitializedSingleton) constructor.newInstance();
        break;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(instanceOne.hashCode());
    System.out.println(instanceTwo.hashCode());
  }
}
