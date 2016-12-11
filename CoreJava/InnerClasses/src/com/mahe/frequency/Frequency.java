package com.mahe.frequency;

import java.util.Map;
import java.util.TreeMap;

public class Frequency 
{
	public static void main(String args[])
	{
		String str = "Alive is awesome";
		getFrequencyOfEachCharacter(str.toLowerCase());
	}

	private static void getFrequencyOfEachCharacter(String str) 
	{
		Map<Character,Integer> frequencyMap = new TreeMap<>();
		if(null == str || str.trim().isEmpty())
		{
			System.out.println("Null String not permitted...");
		}
		else
		{
			
			for (int i = 0 ; i < str.length(); i++)
			{
				if(frequencyMap.isEmpty() || !frequencyMap.containsKey(str.charAt(i)) )
				{
					frequencyMap.put(str.charAt(i), 1);
				}
				else if(!frequencyMap.isEmpty() && frequencyMap.containsKey(str.charAt(i)))
				{
					int count = frequencyMap.get(str.charAt(i));
					count++;
					frequencyMap.put(str.charAt(i),count);
				}
			}
			/*char[] charRepOfString = str.toCharArray();

			for(char c : charRepOfString)
			{
				if(frequencyMap.isEmpty() || !frequencyMap.containsKey(c) )
				{
					frequencyMap.put(c, 1);
				}
				else if(!frequencyMap.isEmpty() && frequencyMap.containsKey(c))
				{
					int count = frequencyMap.get(c);
					count++;
					frequencyMap.put(c,count);
				}
			}*/
		}

		if(frequencyMap != null && !frequencyMap.isEmpty())
			displayFrequency(frequencyMap,str);
	}

	public static void displayFrequency(Map<Character,Integer> frequencyMap,String str)
	{
		System.out.println("Generated Frequency List on each character for: "+"'"+str+"'");
		for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) 
		{
			if(entry.getKey() == ' ')
				continue;
			System.out.println("Character : " + entry.getKey() + " Frequncy : " + entry.getValue());
		}
	}
}
