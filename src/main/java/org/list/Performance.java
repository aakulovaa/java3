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

    public long arrayAdd(){
        long startAdd = System.nanoTime();
        for(int i=0;i<5000;i++) {
            arrayList.add(i);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }
    public long linkedAdd(){
        long startAdd = System.nanoTime();
        for(int i=0;i<5000;i++) {
            linkedList.add(i);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }

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
    public long linkedGet(){
        for(int i=0;i<5000;i++) {
            linkedList.add(i);
        }
        long startAdd = System.nanoTime();
        for(int index=0;index<5000;index++) {
            linkedList.get(index);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }
}
