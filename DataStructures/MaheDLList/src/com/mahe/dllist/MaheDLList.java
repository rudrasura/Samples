package com.mahe.dllist;

public class MaheDLList<T>
{
	private DLListNode<T> head;
	
	private DLListNode<T> tail;
	
	private int size;

	public DLListNode<T> getHead() 
	{
		return head;
	}

	public void setHead(DLListNode<T> head) 
	{
		this.head = head;
	}

	public DLListNode<T> getTail() 
	{
		return tail;
	}

	public void setTail(DLListNode<T> tail)
	{
		this.tail = tail;
	}

	public int getSize() 
	{
		return size;
	}

	public void setSize(int size) 
	{
		this.size = size;
	}
}
