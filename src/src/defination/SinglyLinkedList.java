package defination;

import adt.SinglyADT;

public class SinglyLinkedList<E>implements SinglyADT<E>{
    @Override
    public void add(E item) {

    }

    @Override
    public void remove() {

    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public void print() {

    }
    private static class Node<E> implements Comparable<E>{
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }


        public E getData(){
            return data;
        }
        public  Node<E> getNext(){
            return next;
        }

        @Override
        public int compareTo(E o) {
            return 0;
        }
    }
}
