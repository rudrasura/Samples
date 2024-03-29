package com.mahe.innerclass;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility  classes
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);

        //Scanner
         */
        Scanner s = new Scanner(System.in);
        int Q = s.nextInt();
		int D = s.nextInt();
		int ques[] = new int[Q];
		int sum = 0;
        for (int i = 0; i < Q; i++) 
        {
           ques[i] = s.nextInt();
        }
        for(int i = 0; i< Q-1; i++)
        {
        	if(ques[i] < D)
        		sum++;
        }
        System.out.println(sum);
    }
}
