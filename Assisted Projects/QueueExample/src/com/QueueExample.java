package com;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) 
	{
		Queue <String> locationsQueue = new LinkedList<>();
		locationsQueue.add("Chennai");
	    locationsQueue.add("Bihar");
	    locationsQueue.add("Delhi");
	    locationsQueue.add("Kerala");
	    locationsQueue.add("Rajasthan");
	    System.out.println("Queue is : " + locationsQueue);
	    System.out.println("Head of Queue : " + locationsQueue.peek());
	    locationsQueue.remove();
	    System.out.println("After removing Head of Queue : " + locationsQueue);
	    System.out.println("Size of Queue : " + locationsQueue.size());
	 }
	

}
