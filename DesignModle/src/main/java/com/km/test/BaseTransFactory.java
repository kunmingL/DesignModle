package com.km.test;

public interface BaseTransFactory<K,V> {
    K outTransFactory(V param);
}
