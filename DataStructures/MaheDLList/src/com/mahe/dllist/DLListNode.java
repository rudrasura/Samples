package com.mahe.dllist;

public class DLListNode<T> 
{
	private T data;
	
	private DLListNode<T> prev;
	
	private DLListNode<T> next;
	
	public DLListNode(T data)
	{
		this.data = data;
	}
	
	public DLListNode(T data,DLListNode<T> prev,DLListNode<T> next)
	{
		this.data = data;
		this.prev = prev;
		this.next = prev;
	}

	public T getData() 
	{
		return data;
	}

	public void setData(T data) 
	{
		this.data = data;
	}

	public DLListNode<T> getPrev() 
	{
		return prev;
	}

	public void setPrev(DLListNode<T> prev) 
	{
		this.prev = prev;
	}

	public DLListNode<T> getNext() 
	{
		return next;
	}

	public void setNext(DLListNode<T> next) 
	{
		this.next = next;
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
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
		@SuppressWarnings("unchecked")
		DLListNode<T> other = (DLListNode<T>) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
	
	@Override
	public String toString() 
	{
		return "DLListNode [data=" + data + ", prev=" + prev + ", next=" + next
				+ "]";
	}
	
}
