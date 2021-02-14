/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author Hesham
 */
public class Lap3 {
    
    // method to find the repeated numbers in the array
    public static void repeatedOne(int[] arr)
    {
        
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                
                System.out.println(arr[i]);
                return;
            }
        }
    }
    
    // method to find the repeated numbers in the array
    public static void repeatedFive(int[] arr)
    {
        int counter=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                
                System.out.println(arr[i]);
                counter++;
                if(counter==5)
                    return;
            }
        }
    }
    
    //method to add element to array without using loop
    public static void add(int[] arr,int e)
    {
        System.out.println(arr.length);
        
        arr[arr.length]=e;
    }

    
    
    public static void main(String[] args)
    {
        int[] x={1,3};
       
         
        // add(x,14);
        // System.out.println(x[6]);
       // repeatedFive(x);
        //repeatedOne(x);
    }
    
    
}
