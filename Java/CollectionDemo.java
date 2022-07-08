import java.util.ArrayDeque;

public class CollectionDemo { public static void main(String[] args)
     { ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
         deque.push(1); deque.push(2); deque.push(3); deque.poll(); 
         System.out.println(deque); }}