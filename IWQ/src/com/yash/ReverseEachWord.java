package com.yash;
public class ReverseEachWord
{
    static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
            System.out.println("first for loop :"+word);
            
            String reverseWord = "";
            System.out.println("first for loop :"+reverseWord);
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
                System.out.println("second for loop : "+ reverseWord);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println("input is :"+inputString);
        System.out.println("reverse is :"+reverseString);
        System.out.println("-------------------------");
    }
     
    public static void main(String[] args) 
    {
        reverseEachWordOfString("Java Concept Of The Day");
         
        reverseEachWordOfString("Reverse Me");
    }
}