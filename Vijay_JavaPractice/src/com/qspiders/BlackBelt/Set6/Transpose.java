package com.qspiders.BlackBelt.Set6;

import java.util.Scanner;

public class Transpose
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		int row = sc.nextInt();
		int col=sc.nextInt();
		
		int arr[][] = new int[row][col];
		int trnsps[][] = new int[row][col];
		
		System.out.println("Enter the matrix no's");
		
		for(int i = 0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j] = sc.nextInt();
			}
			
			System.out.println();
		}
		
		for(int i = 0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(arr[i][j]);
			}
			
			System.out.println();
		}
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				trnsps[j][i] = arr[i][j];
			}
		}
		
		System.out.println();
		
		System.out.println("-------The transpose of a matrix--------");
		
		System.out.println();
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(trnsps[i][j]);
			}
			System.out.println();
		}		
		
	}
}