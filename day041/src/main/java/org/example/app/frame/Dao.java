package org.example.app.frame;

import java.util.List;

public interface Dao<K, V> {
    //default class 소유의 함수가 된다
    int add(V v);
    int del(K k);
    int modify(V v);
    V get(K k);
    List<V> getAll();
}
