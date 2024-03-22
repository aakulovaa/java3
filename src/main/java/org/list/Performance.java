package org.list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Класс с методами для сравнения времени работы свойств <b>arrayList</b> и <b>linkedList</b>
 * @author Анна Акулова
 */
public class Performance {

    private final ArrayList<Integer> arrayList = new ArrayList<>();

    private final LinkedList<Integer> linkedList = new LinkedList<>();

    /**
     * Метод определения времени выполнения метода add() для ArrayList
     * @return - возвращает время выполнения метода add() для ArrayList
     */
    public long arrayAdd(int operationCount){
        long startAdd = System.nanoTime();
        for(int element=0;element<operationCount;element++) {
            arrayList.add(element);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }
    /**
     * Метод определения времени выполнения метода add() для LinkedList
     * @return - возвращает время выполнения метода add() для LinkedList
     */
    public long linkedAdd(int operationCount){
        long startAdd = System.nanoTime();
        for(int element=0;element<operationCount;element++) {
            linkedList.add(element);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }

    /**
     * Метод определения времени выполнения метода remove() для ArrayList
     * @return - возвращает время выполнения метода remove() для ArrayList
     */
    public long arrayRemove(int operationCount){
        for(int i=0;i<operationCount;i++) {
            arrayList.add(i);
        }
        long startAdd = System.nanoTime();
        for(int index=0;index<operationCount;index++) {
            arrayList.remove(index);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }
    /**
     * Метод определения времени выполнения метода remove() для LinkedList
     * @return - возвращает время выполнения метода remove() для LinkedList
     */
    public long linkedRemove(int operationCount){
        for(int i=0;i<operationCount;i++) {
            linkedList.add(i);
        }
        long startAdd = System.nanoTime();
        for(int index=0;index<operationCount;index++) {
            linkedList.remove(index);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }

    /**
     * Метод определения времени выполнения метода get() для ArrayList
     * @return - возвращает время выполнения метода get() для ArrayList
     */
    public long arrayGet(int operationCount){
        for(int i=0;i<operationCount;i++) {
            arrayList.add(i);
        }
        long startAdd = System.nanoTime();
        for(int index=0;index<operationCount;index++) {
            arrayList.get(index);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }

    /**
     * Метод определения времени выполнения метода get() для LinkedList
     * @return - возвращает время выполнения метода get() для LinkedList
     */
    public long linkedGet(int operationCount){
        for(int element=0;element<operationCount;element++) {
            linkedList.add(element);
        }
        long startAdd = System.nanoTime();
        for(int index=0;index<operationCount;index++) {
            linkedList.get(index);
        }
        long endAdd = System.nanoTime();
        return endAdd - startAdd;
    }
}
