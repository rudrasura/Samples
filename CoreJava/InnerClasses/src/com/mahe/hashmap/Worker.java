package com.mahe.hashmap;

public class Worker extends Thread 
{
	public void run() 
	{
		System.out.print("|work|");
	}
	public static void main(String[] args) 
	{
		Worker worker = new Worker();
		worker.start();
		worker.run();
		worker.start();
	}
}