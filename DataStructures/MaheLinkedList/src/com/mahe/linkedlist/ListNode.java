package com.mahe.linkedlist;

public class ListNode<T>
{
	private T data;

	private ListNode<T> next;

	public ListNode(T data)
	{
		this.setData(data);
	}

	public T getData() 
	{
		return data;
	}

	public void setData(T data) 
	{
		this.data = data;
	}

	public ListNode<T> getNext() 
	{
		return next;
	}

	public void setNext(ListNode<T> next) 
	{
		this.next = next;
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListNode<T> other = (ListNode<T>) obj;
		if (data == null) 
		{
			if (other.data != null)
				return false;
		} 
		else if (!data.equals(other.data))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ListNode [data=" + data + ", next=" + next + "]";
	}
}
