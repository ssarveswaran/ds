import java.util.*;
class queue {
    public static void main(String args[]){
        //offer--->adding element in the list called as enqueue
        //poll--->removing the first element in the list called as dequeue
        //search--->getting index no of the element
        //peak--->it refers to get a top element in the list
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(9);
        q.offer(8);
        System.out.println(q);
        q.poll();
        System.out.println(q);
       
        System.out.println(q.contains(8));
        System.out.println(q.peek());


    }
    
}
