package org.anudip.mavenApplication.collectioninterviewquestion;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDescendingSort {
	 public static void main(String[] args) {
	        
	        ArrayList<Integer> arrayList = new ArrayList<>();

	       
	        arrayList.add(25);
	        arrayList.add(10);
	        arrayList.add(40);
	        arrayList.add(5);
	        arrayList.add(30);

	        Collections.sort(arrayList, Collections.reverseOrder());
	        System.out.println("ArrayList after descending sort: " + arrayList);
	    }
}
