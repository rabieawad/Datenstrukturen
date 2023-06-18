package Listen;
import java.util.*;

public class TimeAnalysis {
    public static void main(String...args){


        // Collection Linked list
        LinkedList<String> ll = new LinkedList<String>();

        double a,b;
        a = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            ll.add("A");
         }
        b = System.currentTimeMillis();
        System.out.println("\n \n the Collection LinkedList took "+(b-a)+"mil to add million elements. ("+((b-a)/1000)+" seconds)");
        a = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            ll.remove("A");
        }

        b = System.currentTimeMillis();
        System.out.println("the Collection LinkedList took "+(b-a)+"mil to delete million elements. ("+((b-a)/1000)+" seconds)\n \n");


        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");




        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Doubly linked list

        DLinkedList<String> ll1 = new DLinkedList<>();
        a = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            ll1.add("A");
        }
        b = System.currentTimeMillis();
        System.out.println("\n \nthe custom doubly LinkedList took "+(b-a)+"mil to add 1000000 elements. ("+((b-a)/1000)+" seconds)");

 a = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            ll1.remove("A");
        }

        b = System.currentTimeMillis();
        System.out.println("the custom doubly LinkedList took "+(b-a)+"mil to remove 1000000 elements. ("+((b-a)/1000)+" seconds)\n \n");


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Singly Linked List




        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");


        LinkedList<String> ll2 = new LinkedList<>();
        a = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            ll2.add("A");
        }
        b = System.currentTimeMillis();
        System.out.println("\n \nthe custom singly LinkedList took "+(b-a)+"mil to add 1000000 elements. ("+((b-a)/1000)+" seconds)");

 a = System.currentTimeMillis();
        for(int i = 0; i < 1000000;i++){
            ll2.remove("A");
        }
        b = System.currentTimeMillis();
        System.out.println("the custom singly LinkedList took "+(b-a)+"mil to remove 1000000 elements. ("+((b-a)/1000)+" seconds)");



    }



}
