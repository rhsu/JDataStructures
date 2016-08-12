package jdatastructures;

import jdatastructures.lists.JTailessSingleLinkedList;

public class JDataStructures 
{
	public static void print(Object o)
	{
		System.out.println(o);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
	{
		JTailessSingleLinkedList<Integer> list = new JTailessSingleLinkedList<>();
		
		for (int i = 0; i < 100; i++)
			list.addNode(i);
		
		
		print("Dumping list...");
		print(list.getSize());
	}
	
}
