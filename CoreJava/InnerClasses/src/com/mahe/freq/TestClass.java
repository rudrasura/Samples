package com.mahe.freq;

import java.util.*;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int i = 0; i < T ; i++) 
        {
        	Map<Character,Integer> freqMap = null;
            String inputString = s.next();
            freqMap = getFrequencyOfLettersFromInputString(inputString);
            displayAllLetters(inputString,freqMap);
        }
    }
    
	public static Map<Character,Integer> getFrequencyOfLettersFromInputString(String inputString)
    {
		Map<Character,Integer> frequencyMap = new HashMap<>();
    	String trimmedInputString =inputString.trim();
    	if(trimmedInputString != null && !trimmedInputString.isEmpty())
    	{
    		for (int i = 0 ; i < trimmedInputString.length(); i++)
			{
				if(frequencyMap.isEmpty() || !frequencyMap.containsKey(trimmedInputString.charAt(i)) )
				{
					frequencyMap.put(trimmedInputString.charAt(i),1);
				}
				else if(!frequencyMap.isEmpty() && frequencyMap.containsKey(trimmedInputString.charAt(i)))
				{
					int count = frequencyMap.get(trimmedInputString.charAt(i));
					count++;
					frequencyMap.put(trimmedInputString.charAt(i),count);
				}
			}
    	}
    	return frequencyMap;
    }
    

	public static void displayAllLetters(String inputString, Map<Character,Integer> frequencyMap)
    {
    	for (char i = 'z'; i >= 'a' ; i--)
    	{
    		if(!frequencyMap.containsKey(i))
    			System.out.print(i+" ");
    	}
    	 List<Map.Entry<Character,Integer>> list = new LinkedList<Map.Entry<Character,Integer>>(frequencyMap.entrySet());
    	 Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>() 
    			 {
             public int compare(Map.Entry<Character,Integer> o1,
                                Map.Entry<Character,Integer> o2) 
             {
            	 if(o1.getValue() == o2.getValue())
            	 {
            		 if(o1.getKey() < o2.getKey())
            			 return 1;
            		 else if(o1.getKey() > o2.getKey())
            			 return -1;
            		 else
            			 return 0;
            	 }
            	 else if(o1.getValue() < o2.getValue())
            	 {
            		 return -1;
            	 }
            	 else
         		{
         			return 1;
         		}
             }
         });
    	if(list != null)
    	{
    		for (Map.Entry<Character,Integer> entry : list) 
    		{
    			System.out.print(entry.getKey() + " ");
    		}
    	}
    }
    
}

