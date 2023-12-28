package org.anudip.mavenApplication.collectioninterviewquestion;

import java.util.ArrayList;

public class ArrayListRemoveElement 
{
	public static void main(String[] args) 
	{
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");   
        System.out.println("Original ArrayList: " + arrayList);
        int indexToRemove = 1;
        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) 
        {
            String removedElement = arrayList.remove(indexToRemove);
            System.out.println("Element removed at index " + indexToRemove + ": " + removedElement);

            
            System.out.println("ArrayList after removal: " + arrayList);
        } 
        else 
        {
            System.out.println("Invalid index. Please provide a valid index to remove an element.");
        }
    }
}
