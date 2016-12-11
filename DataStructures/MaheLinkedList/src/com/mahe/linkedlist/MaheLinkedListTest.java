package com.mahe.linkedlist;

public class MaheLinkedListTest 
{
	public static void main(String args[])
	{
		MaheLinkedList<String> nameList = new MaheLinkedList<>();
		nameList.insertAtBeginning(new ListNode<String>("Mahesh"));
		nameList.insertAtEnd(new ListNode<String>("Suresh"));
		nameList.insertAtEnd(new ListNode<String>("Ramesh"));
		nameList.insertAtPosition("Jayesh", 1);
		System.out.println("After Insertion:");
		System.out.println(nameList);
		/*
		System.out.println("After deleting from beginning Node: "
				+nameList.removeFromBeginning());
		System.out.println(nameList);
		System.out.println("After deleting from end Node: "+nameList.removeFromEnd());
		System.out.println(nameList);
		
		nameList.removeMatched(new ListNode<String>("Jayesh"));
		*/
		/*nameList.reverse(nameList.getHead());*/
		System.out.println("List in Reverse Order::");
		nameList.printInReverseOrder(nameList.getHead());
		System.out.println("\nActual List\n"+nameList);
		
	}
}
