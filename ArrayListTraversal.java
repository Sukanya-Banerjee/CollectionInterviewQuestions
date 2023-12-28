package org.anudip.mavenApplication.collectioninterviewquestion;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraversal {
	 public static void main(String[] args) {
	        ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");
	        arrayList.add("Grapes");
	        System.out.println("\nUsing Iterator:");
	        Iterator<String> iterator = arrayList.iterator();
	        while (iterator.hasNext()) 
	        {
	            String fruit = iterator.next();
	            System.out.println(fruit);
	        }
}
}