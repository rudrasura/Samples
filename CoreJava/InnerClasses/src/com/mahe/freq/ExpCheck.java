package com.mahe.freq;
import java.util.*;


class ExpCheck 
{
    public static void main(String args[] ) throws Exception 
    {
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
        int M = s.nextInt();
		int N = s.nextInt();
		int arr[][] = new int[3][5];
        for (int i = 0; i < M; i++) 
        {
            for(int j = 0; j < N; j++)
            {
            	arr[i][j] = s.nextInt();
            }
        }
        
        for (int i = 0; i < M; i++) 
        {
            for(int j = 0; j < N; j++)
            {
            	System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
