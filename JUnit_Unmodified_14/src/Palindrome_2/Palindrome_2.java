/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Palindrome_2;

import java.util.Scanner;

/**
 *
 * @author vanessa
 */
public class Palindrome_2{
     public String methodPalindrome_2(String original){
        String reverse = "";
        String hasil;
        Scanner in = new Scanner(System.in);
        
        int length = original.length();
        
        for(int i=length-1; i>=0; i--)
            reverse = reverse + original.charAt(i);
        if(original.equals(reverse))
            hasil = "palindrome string!";
        else
            hasil = "NOT palindrome string!";
        return hasil;
    }
}
