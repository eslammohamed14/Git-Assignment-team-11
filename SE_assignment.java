/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor.test;

import java.io.*; 
import java.util.*; 

/**
 *
 * @author Mohamed_Reda
 */
public class ForTest {

    /**
     * @param args the command line arguments
     */
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
                    
            Get_Average(arr);
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
                case 18:
                {
                    // call your func. here
                    Get_Average(arr);
                    break;
                }
                
                
            }
            
        }while(choice != 0);
        
    
    }
  public static void Get_Average(char arr[])
    {
       //Ahmed Yassin
        //20160041
       double sum=0;
      double v=0;
       for(int i=0;i<arr.length;i++)
           sum+=Character.getNumericValue(arr[i]);
          v=sum/arr.length;
       System.out.println(" Average = " +v);
    
    }
    
}
