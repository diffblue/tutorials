package org.example.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CoreUtils {

  public static <T> T createOffheap(Class<T> aClass) {
    try {
      final Constructor<T> constructor = aClass.getConstructor();
      return (T) constructor.newInstance();
    }
    catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
        throw new RuntimeException(e);
    }
  }
}