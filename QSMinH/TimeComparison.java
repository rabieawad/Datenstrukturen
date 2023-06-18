package QSMinH;

import java.util.*;
import java.util.Stack;

public class TimeComparison {
    public static void main(String...args){
        long a,b,c,a2,b2,c2;
        java.util.Stack<String> stack_collection = new Stack<String>();
        a = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            stack_collection.push("Test String");
        }
        b = System.currentTimeMillis();
        c = b-a;
        QSMinH.Stack<String> stack_custom = new QSMinH.Stack<>();
        a2 = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            stack_custom.push("Test String");
        }
        b2 = System.currentTimeMillis();
        c2 = b2-a2;
        System.out.println("\n \nthe collection stack took "+(c)+"mil to add 1000000 elements. ("+((c)/(long)1000)+" seconds)");
        System.out.println("\n \nthe custom stack took "+(c2)+"mil to add 1000000 elements. ("+((c2)/(long)1000)+" seconds)");


        a = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            stack_collection.pop();
        }
        b = System.currentTimeMillis();
        c = b-a;
        a2 = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            stack_custom.pop();
        }
        b2 = System.currentTimeMillis();
        c2 = b2-a2;
        System.out.println("\n \nthe collection stack took "+(c)+"mil to pop 1000000 elements. ("+((c)/(long)1000)+" seconds)");
        System.out.println("\n \nthe custom stack took "+(c2)+"mil to pop 1000000 elements. ("+((c2)/(long)1000)+" seconds)");

        java.util.Queue<String> queue_collection = new java.util.LinkedList<>();
        a = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            queue_collection.add("Test String");
        }
        b = System.currentTimeMillis();
        c = b-a;
        QSMinH.Queue<String> queue_custom = new QSMinH.Queue<>();
        a2 = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            queue_custom.enqueue("Test String");
        }
        b2 = System.currentTimeMillis();
        c2 = b2-a2;
        System.out.println("\n \nthe collection queue took "+(c)+"mil to enqueue 1000000 elements. ("+((c)/(long)1000)+" seconds)");
        System.out.println("\n \nthe custom queue took "+(c2)+"mil to enqueue 1000000 elements. ("+((c2)/(long)1000)+" seconds)");


        a = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            queue_collection.remove();
        }
        b = System.currentTimeMillis();
        c = b-a;
        a2 = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            queue_custom.dequeue();
        }
        b2 = System.currentTimeMillis();
        c2 = b2-a2;
        System.out.println("\n \nthe collection queue took "+(c)+"mil to dequeue 1000000 elements. ("+((c)/(long)1000)+" seconds)");
        System.out.println("\n \nthe custom queue took "+(c2)+"mil to dequeue 1000000 elements. ("+((c2)/(long)1000)+" seconds)");
    }
}
