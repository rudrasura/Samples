package com.mahe.localinnerclass;


import java.util.SortedSet;
import java.util.TreeSet;

public class SortMapOnKeyAndValue 
{

	public static void main(String[] args) 
	{
		SortedSet<KeyValuePair> sortedSet = new TreeSet<KeyValuePair>();
		sortedSet.add(new KeyValuePair('o', 2));
		sortedSet.add(new KeyValuePair('m', 1));
		sortedSet.add(new KeyValuePair('a', 1));
		sortedSet.add(new KeyValuePair('r', 1));

		for (KeyValuePair keyValuePair : sortedSet) 
		{
			System.out.print(keyValuePair.key+","+keyValuePair.value+ " ");
		}
	}
}
class KeyValuePair implements Comparable<KeyValuePair>
{
	Character key;
	Integer value;

	public KeyValuePair(Character key, Integer value) 
	{
		super();
		this.key = key;
		this.value = value;
	}

	public int compareTo(KeyValuePair o) 
	{
		//return key==o.key?value-o.value:key-o.key;
		if(this.value == o.value)
		{
			if(this.key < o.key)
				return 1;
			else if(this.key > o.key)
				return -1;
			else
				return 0;
		}
		else if(this.value < o.value)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}


