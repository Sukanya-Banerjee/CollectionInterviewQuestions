package org.anudip.mavenApplication.collectioninterviewquestion;

import java.util.ArrayList;

public class ArrayListLength {
	 public static void main(String[] args) {
	      
	        ArrayList<String> arrayList = new ArrayList<>();

	        
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");
	        arrayList.add("Grapes");

	        
	        int length = arrayList.size();
	        System.out.println("Length of the ArrayList: " + length);
	    }
}
