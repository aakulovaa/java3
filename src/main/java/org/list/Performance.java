package org.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Performance {
    private final ArrayList<Integer> arrayList = new ArrayList<>();
    private final LinkedList<Integer> linkedList = new LinkedList<>();

    public LinkedList<Integer> getLinkedList() {
        return linkedList;
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    /**
     * Метод определения времени выполнения метода add() для ArrayList
     * @return - возвращает время выполнения метода add() для ArrayList
     */
    public long arrayAdd(){
        long startAdd = System.nanoTime();
        for(int element=0;element<5000;element++) {
            arrayList.add(element);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }
    /**
     * Метод определения времени выполнения метода add() для LinkedList
     * @return - возвращает время выполнения метода add() для LinkedList
     */
    public long linkedAdd(){
        long startAdd = System.nanoTime();
        for(int element=0;element<5000;element++) {
            linkedList.add(element);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }

    /**
     * Метод определения времени выполнения метода remove() для ArrayList
     * @return - возвращает время выполнения метода remove() для ArrayList
     */
    public long arrayRemove(){
        for(int i=0;i<5000;i++) {
            arrayList.add(i);
        }
        long startAdd = System.nanoTime();
        for(int index=0;index<5000;index++) {
            arrayList.remove(index);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }
    /**
     * Метод определения времени выполнения метода remove() для LinkedList
     * @return - возвращает время выполнения метода remove() для LinkedList
     */
    public long linkedRemove(){
        for(int i=0;i<5000;i++) {
            linkedList.add(i);
        }
        long startAdd = System.nanoTime();
        for(int index=0;index<5000;index++) {
            linkedList.remove(index);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }

    /**
     * Метод определения времени выполнения метода get() для ArrayList
     * @return - возвращает время выполнения метода get() для ArrayList
     */
    public long arrayGet(){
        for(int i=0;i<5000;i++) {
            arrayList.add(i);
        }
        long startAdd = System.nanoTime();
        for(int index=0;index<5000;index++) {
            arrayList.get(index);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }

    /**
     * Метод определения времени выполнения метода get() для LinkedList
     * @return - возвращает время выполнения метода get() для LinkedList
     */
    public long linkedGet(){
        for(int element=0;element<5000;element++) {
            linkedList.add(element);
        }
        long startAdd = System.nanoTime();
        for(int index=0;index<5000;index++) {
            linkedList.get(index);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }
}
