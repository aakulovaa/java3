package org.list;

public class App 
{
    public static void main( String[] args )
    {
        Performance performance = new Performance();
        System.out.println(performance.linkedAdd());
        System.out.println(performance.arrayGet());
    }
}
