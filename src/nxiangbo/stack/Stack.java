package nxiangbo.stack;

import java.util.LinkedList;

public class Stack<T> {
	private LinkedList<T>  storge = new LinkedList<>();
	
	public void push(T element){
		storge.addFirst(element);
	}
	
	public T pop(){
		return storge.removeFirst();
	}
	
	public T peek(){
		return storge.getFirst();
	}
	
	public boolean isEmpty(){
		return storge.isEmpty();
	}
	
	public String toString(){
		return storge.toString();
	}
}
