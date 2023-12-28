package org.anudip.mavenApplication.collectioninterviewquestion;

import java.util.ArrayList;

public class ArrayListContain {
	 public static void main(String[] args) {
	        
	        ArrayList<String> arrayList = new ArrayList<>();

	        
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");
	        arrayList.add("Grapes");

	        
	        String elementToCheck = "Banana";

	        boolean exists = arrayList.contains(elementToCheck);

	        if (exists) {
	            System.out.println(elementToCheck + " exists in the ArrayList.");
	        } else {
	            System.out.println(elementToCheck + " does not exist in the ArrayList.");
	        }
	    }
}
