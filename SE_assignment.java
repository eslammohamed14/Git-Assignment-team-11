/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_ass;

import java.io.*; 
import java.util.*; 

/**
 *
 * @author Team 11.
 */
public class SE_ass {

    /**
     * @param args the command line arguments
     */
    /********************************/
    public void getMedian()
    {
        int arrSize,Numbers;
        double median;
        System.out.println("How many nambers you want to count it's medium? ");
        Scanner input = new Scanner(System.in);
        arrSize= input.nextInt();
        int Arr[] = new int[arrSize];
        System.out.println("Please enter your numbers:");
        for(int i=0;i<arrSize;i++)
        {
            Numbers=input.nextInt();
            Arr[i]=Numbers;
        }
        for(int i=0;i<Arr.length;i++)
        {
            int temp;
            for (int j = i; j > 0; j--)
            {
                if (Arr[j] < Arr[j - 1])
                {
                    temp = Arr[j];
                    Arr[j] = Arr[j - 1];
                    Arr[j - 1] = temp;
                }
            }
        }

        if (Arr.length % 2 == 0)
            median = ((double)Arr[Arr.length/2] + (double)Arr[Arr.length/2 - 1])/2;
        else
            median =  Arr[Arr.length/2];
        System.out.println("the median is : " + median);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int choice =0;
        do
            {
            
            System.out.println("Please Enter size of arr: ");
            int sz;
            Scanner in = new Scanner(System.in);
            sz = in.nextInt();
            char arr [] = new char[sz];
            System.out.println("Enter array elements");
        for (int i = 0 ; i<sz; ++i){
            char c = in.next().charAt(0);
            arr[i] = c;
        }
            System.out.println("1  - most repeated value");
            System.out.println("2  - sort");
            System.out.println("3  - shuffle");
            System.out.println("4  - Find the Largest Prime");
            System.out.println("5  - Find ths smallest Prime");
            System.out.println("6  - Check Palindrome");
            System.out.println("7  - Check sorted");
            System.out.println("8  - Count Primes");
            System.out.println("9  - Reverse array");
            System.out.println("10 - Shift array");
            System.out.println("11 - Distinct array");
            System.out.println("12 - Get the maximum 3 numbers");
            System.out.println("13 - Get the minimum 3 numbers");
            System.out.println("14 - Get average");
            System.out.println("15 - Get median");
            System.out.println("16 - Return only primes");
            System.out.println("17 - Zero if less than zero");
            System.out.println("18 - Execute all functions");
            System.out.println("0  - to exit");
            System.out.println("Enter your choice");
        choice = in.nextInt();
        
        switch(choice)
            {
                case 0:
                    break;
                case 1:
                {
                    // call your func. here
                    break;
                }case 2:
                {
                    // call your func. here
                    break;
                }case 3:
                {
                    // call your func. here
                    break;
                }case 4:
                {
                    // call your func. here
                    break;
                }
                case 15:
                {
                    getMedian();
                    break;
                }
                
            }
            
        }while(choice != 0);
        
    
    }
}
