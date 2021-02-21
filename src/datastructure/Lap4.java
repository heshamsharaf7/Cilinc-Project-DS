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
public class Lap4<T> {
    
    public void revers(T[] x)
    {
        
        
        for(int i=x.length-1;i>=0;i--)
        {
            
            System.out.println(x[i]);
        }
    }
    
     public <T> void merg(T[] arr1,T[] arr2)
    {
        int size=arr1.length+arr2.length;
        T[] arr3;
        arr3=(T[])new Object[size];
        
        for(int i=0;i<arr1.length;i++)
        {
            arr3[i]=arr1[i];
            arr3[i+arr1.length]=arr2[i];
            
        }
       
        for(int i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]);
        }
    }
    public static void main(String[] args)
    {
        Lap4<String> z=new Lap4();
        String[] v1={"fdf","fdf"};
         String[] v2={"hh","fdjhjf"};
        
       // z.revers(v1);
        z.merg(v1, v2);
    }

   
    
}
