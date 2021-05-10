package com.MyProject;

import java.util.LinkedList;

public interface ILinkedList<T> extends Iterable<T>{
    void add (T element);
    void add (int index, T element);
    void clear ();
    T get (int index);
    int indexOf (T element);
    T remove (int index);
    T set (int index, T element);
    int size ();
    <E> E[] toArray(E[] arr);
    String toString();
}
