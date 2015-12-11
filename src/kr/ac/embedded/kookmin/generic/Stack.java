package kr.ac.embedded.kookmin.generic;

public class Stack<T> { 
    private int top;
    
     Node<T> node; 
      
     public Stack() { 
        top = 0; 
         node = new Node<T>(top); 
     } 
      
    public T pop() { 
         T temp = (T) node.getData(); 
         top = node.getNext(); 
         return temp; 
     } 
      
     public void push(T t) { 
         node.setNext(t); 
         top = node.getNext(); 
     }
}