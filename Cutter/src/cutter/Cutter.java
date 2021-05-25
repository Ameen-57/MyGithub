/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cutter;


import java.util.Scanner;
public class Cutter {
    public static int[] cutter(String s )
        {
            int [] arr  = new int[4];
            for(int i = 0 ; i<s.split("\\.").length;i++)
            {
                arr[i] = Integer.parseInt(s.split("\\.")[i]);
            }
        return arr;
        }
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the required string: ");  
        String str= sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(cutter(str)[i]);
        }
        
    }
}
