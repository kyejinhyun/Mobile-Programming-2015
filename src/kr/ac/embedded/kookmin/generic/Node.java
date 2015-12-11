package kr.ac.embedded.kookmin.generic;

public class Node<T> { 
     private int next; 
     private Object data[] = new Object[5]; 
      
     public Node(int top) { 
         next = top + 1; 
     } 
      
     public Object getData() { 
         Object temp = data[next]; 
         next--; 
         return temp; 
     } 
      
     public int getNext() { 
         return next; 
     } 
  
     public void setNext(T t) { 
         next++; 
         this.data[next] = t; 
     }
}