package PriorityQueue;

/** ****************************************
*  Author : Ali Azhari   
*  Created On : Mon Oct 10 2022
*  File : PQDemo.java
****************************************** */

public class PQDemo {


    public static void main(String[] args) {

        PriorityQueueHeap<Integer, String> pq = new PriorityQueueHeap<>(10);

        pq.insert(2, "B");
        pq.insert(10, "a");
        pq.insert(5, "c");
        pq.insert(7, "v");
        pq.insert(3, "f");
        pq.insert(20, "y");
        System.out.println(pq);
        System.out.println("The Max is " +  pq.max());
        pq.removeMax();
        System.out.println(pq);
    }
    
}
