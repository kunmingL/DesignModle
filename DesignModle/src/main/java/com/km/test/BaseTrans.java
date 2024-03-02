package com.km.test;

public interface BaseTrans<K,V> {
    K outTrans(V param);
}
