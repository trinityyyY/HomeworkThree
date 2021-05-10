package com.MyProject;

class Node<T> {
    private T element = null;
    private Node<T> nextNode = null;

    public Node (T element) {
        this.element = element;
    }

    public Node<T> getNext() {
        return nextNode;
    }

    public void setNext(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

}
