package com.MyProject;

import java.util.Iterator;

public class MyLinkedList<T> implements ILinkedList<T> {
    Node<T> head = null;
    Node<T> tail = null;

    public MyLinkedList () {}

    @Override
    public Iterator iterator() {
        return new MyIterator(head, this);
    }


    @Override
    public void add (T element) {
        if (head == null) {
            head = new Node<T>(element);
            tail = head;
        } else {
            tail.setNext(new Node<T>(element));
            tail = tail.getNext();
        }
    }

    @Override
    public void add(int index, T element) {
        int size = size();
        if (index >= 0 && index <= size) {
            Node<T> prev = head;
            if (index == 0) {
                head = new Node<T>(element);
                head.setNext(prev);
            } else {
                for (int i = 1; i < index; i++) {
                    prev = prev.getNext();
                }
                Node<T> temp = prev.getNext();
                prev.setNext(new Node<T>(element));
                prev.getNext().setNext(temp);
                if (index == size) {
                    tail = prev.getNext();
                }
            }
        } else {
            System.out.println("invalid index");
        }
    }

    @Override
    public void clear() {
        Node<T> temp = head;
        Node<T> next;
        int size = size();
        for (int i = 0; i < size; i++) {
            next = temp.getNext();
            temp.setNext(null);
            temp.setElement(null);
            temp = next;
        }
        head = null;
        tail = head;
    }

    @Override
    public T get(int index) {
        Node<T> temp = head;
        T result = null;
        int size = size();
        if (index >= 0 && index < size) {
            if (index == size - 1) {
                result = tail.getElement();
            } else {
                for (int i = 0; i <= index; i++) {
                    temp = temp.getNext();
                }
                result = temp.getElement();
            }
        } else {
            System.out.println("invalid index");
        }
        return result;
    }

    @Override
    public int indexOf(T element) {
        int index = -1;
        Node<T> temp = head;
        int size = size();
        for (int i = 0; i < size; i++) {
            if (temp.getElement() == element) {
                index = i;
                break;
            }
            temp = temp.getNext();
        }
        return index;
    }

    @Override
    public T remove(int index) {
        Node<T> temp = head;
        Node<T> prev = head;
        int size = size();
        T element = null;
        if (index >= 0 && index < size) {
            if (index == 0) {
                head = head.getNext();
                temp.setNext(null);
                element = temp.getElement();
                temp.setElement(null);
            } else {
                for (int i = 0; i < index-1 ; i++) {
                    prev = prev.getNext();
                }
                temp = prev.getNext();
                prev.setNext(temp.getNext());
                temp.setNext(null);
                element = temp.getElement();
                temp.setElement(null);
                if (index == size - 1) {
                    tail = prev;
                }
            }
        } else {
            System.out.println("invalid index");
        }
        return element;
    }

    @Override
    public T set(int index, T element) {
        Node<T> temp = head;
        T oldElement = null;
        int size = size();
        if (index >= 0 && index < size) {
            if (index == size - 1) {
                oldElement = tail.getElement();
                tail.setElement(element);
            } else {
                for (int i = 0; i < index; i++) {
                    temp = temp.getNext();
                }
                oldElement = temp.getElement();
                temp.setElement(element);
            }
        } else {
            System.out.println("invalid index");
        }
        return oldElement;
    }

    @Override
    public int size() {
        Node<T> temp = head;
        int size = 1;
        if (head == null) {
            size = 0;
        } else {
            while (temp.getNext() != null) {
                size++;
                temp = temp.getNext();
            }
        }
        return size;
    }

    @Override
    public <E> E[] toArray(E[] arr) {
        // массив значений узлов
        if (arr.length < size()) {
            arr = (E[])java.lang.reflect.Array.newInstance(
                    arr.getClass().getComponentType(), size());
        }

        int i = 0;
        Node<T> temp = head;
        Object[] a = arr;
        while (temp != null) {
            a[i] = temp.getElement();
            temp = temp.getNext();
            i++;
        }

        if (arr.length > size()) {
            for (i = size(); i < arr.length; i++) {
                arr[i] = null;
            }
        }

        return arr;
    }

    @Override
    public String toString() {
        String result = "";
        int size = size();
        if (head == null) {
            result = "null";
        } else {
            Node<T> temp = head;
            for (int i = 0; i < size-1; i++) {
                result = result + "( " + i + " : " + temp.getElement() + " ) ";
                temp = temp.getNext();
            }
            result = result + "( " + (size-1) + " : " + temp.getElement() + " ) ";
        }
        return result;
    }
}
