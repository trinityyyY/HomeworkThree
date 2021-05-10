package com.MyProject;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T> {
    private final MyLinkedList<T> list;
    private Node<T> prev;
    private Node<T> current = null;
    private Node<T> next;
    private boolean flag = false;

    MyIterator(Node<T> current, MyLinkedList<T> list) {
        this.prev = null;
        this.current = null;
        this.next = current;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (flag) {
            prev = current;
        }
        current = next;
        next = next.getNext();
        flag = true;
        return current.getElement();
    }

    @Override
    public void remove() {
        if (flag) {
            current.setElement(null);
            current.setNext(null);
            current = null;

            if (prev == null) {
                list.head = next;
            } else {
                prev.setNext(next);
            }

            flag = false;
        } else {
            throw new IllegalStateException();
        }
    }
}
