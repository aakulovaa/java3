package org.list;
import java.util.Scanner;
/**
 * <a href="https://github.com/aakulovaa/java3.git">...</a>
 */
public class App
{
    public static void main( String[] args )
    {
        Performance performance = new Performance();
        System.out.println("Введите количество опрераций");
        Scanner in = new Scanner(System.in);
        int operationCount = in.nextInt();
        System.out.println("ArrayList\t.add()\t" + operationCount +"\t"+ performance.arrayAdd(operationCount)+"ns\n" +
                "LinkedList\t.add()\t" + operationCount +"\t"+ performance.linkedAdd(operationCount)+" ns\n" +
                "ArrayList\t.remove()\t" + operationCount +"\t"+ performance.arrayRemove(operationCount)+" ns\n" +
                "LinkedList\t.remove()\t" + operationCount +"\t"+ performance.linkedRemove(operationCount)+" ns\n" +
                "ArrayList\t.get()\t" + operationCount +"\t"+ performance.arrayGet(operationCount)+" ns\n" +
                "LinkedList\t.get()\t" + operationCount +"\t"+ performance.linkedGet(operationCount)+" ns");
    }
}
