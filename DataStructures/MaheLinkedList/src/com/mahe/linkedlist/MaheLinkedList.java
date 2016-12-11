package com.mahe.linkedlist;

public class MaheLinkedList<T>
{
	private int length;
	
	ListNode<T> head;
	
	public ListNode<T> getHead()
	{
		return head;
	}
	
	public int getSize()
	{
		return length;
	}
	
	public synchronized void insertAtBeginning(ListNode<T> node)
	{
		if(null == node)
		{
			throw new NullPointerException("Node cannot be null");
		}
		else
		{
			node.setNext(head);
			head = node;
			length++;
		}
	}
	
	public synchronized void insertAtEnd(ListNode<T> node)
	{
		if(null == node)
		{
			throw new NullPointerException("Node cannot be null");
		}
		else
		{
			if(null == head)
			{
				head = node;
			}
			else
			{
				ListNode<T> p = head;
				while(p.getNext() != null)
					p = p.getNext();
				p.setNext(node);
				length++;
			}
		}
	}
	
	public synchronized void insertAtPosition(T data , int position)
	{
		if(position < 0 || position > length)
			throw new NullPointerException("Position not valid.");
		if(null == head || position == 0)
		{
			ListNode<T> node = new ListNode<T>(data);
			node.setNext(head);
			head = node;
			length++;
		}
		else
		{
			ListNode<T> temp = head;
			for(int i=1;i<position;i++)
				temp = temp.getNext();
			ListNode<T> newNode = new ListNode<T>(data);
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			length++;
		}
	}
	
	public synchronized ListNode<T> removeFromBeginning()
	{
		ListNode<T> removedNode = null;
		if(null == head)
			throw new NullPointerException("Linked List is Empty.");
		else
		{
			removedNode = head;
			head = head.getNext();
			removedNode.setNext(null);
		}
		return removedNode;
	}
	
	public synchronized ListNode<T> removeFromEnd()
	{
		ListNode<T> removedNode = null;
		if(null == head)
			throw new NullPointerException("Linked List is Empty.");
		else
		{
			ListNode<T> temp = head;
			while(temp.getNext() != null &&
					temp.getNext().getNext() != null)
				temp = temp.getNext();
			if(null == head.getNext())
			{
				removedNode = head;
				head = null;
			}
			else
			{
				removedNode = temp.getNext();
				temp.setNext(null);
			}
			length--;
		}
		return removedNode;
	}
	
	public synchronized ListNode<T> removeMatched(ListNode<T> node)
	{
		ListNode<T> removedNode = null;
		if(null == head)
			throw new NullPointerException("Linked List is Empty.");
		if(null == node)
			throw new NullPointerException("Passed Node is empty.");
		else
		{
			if(node.equals(head))
			{
				removedNode = head;
				head = head.getNext();
				removedNode.setNext(null);
			}
			else
			{
				ListNode<T> temp = head;
				while(temp.getNext() != null)
				{
					if(node.equals(temp.getNext()))
					{
						removedNode = temp.getNext();
						temp.setNext(removedNode.getNext());
						removedNode.setNext(null);
						break;
					}
				}
			}
			length--;
		}
		return removedNode;
	}
	
	 /* Function to reverse the linked list */
    void reverse(ListNode<T> node) 
    {
    	ListNode<T> prev = null;
    	ListNode<T> current = node;
    	ListNode<T> next = null;
        while (current != null) 
        {
            next = current.getNext();
            current.setNext(prev) ;
            prev = current;
            current = next;
        }
        head = prev;
    }
    
    void printInReverseOrder(ListNode<T> node)
    {
    	if(node.getNext()!=null)
    	{
    		printInReverseOrder(node.getNext());
    	}
    	if(node == head)
    		System.out.print(node.getData());
    	else
    		System.out.print(node.getData()+"-->");

    }

	@Override
	public String toString() 
	{
		if(null == head)
			return "EMPTY LIST!";
		else
		{
			ListNode<T> temp = head;
			String result = String.valueOf(temp.getData());
			while(temp.getNext() != null)
			{
				result = result +"-->"+ String.valueOf(temp.getNext().getData());
				temp = temp.getNext();
			}
			return result;
		}
	}
}
