//1. Write a java program to define a class UserString and to perform the following operations using different methods.
//a) Count all the characters
//b) Count no of words
//c) Compare two strings
//d) Convert to uppercase
//e) Convert to lowercase
//f) Concatenate two strings
//g) Check a string is palindrome or not
//h) Find the position of a given character
//i) Make a substring from a desired start and end position.
//j) Search the presence of a substring.
//k) Replace a substring with a new string.
//l) Swap two substrings between two strings.


package Strings;

import java.util.Scanner;

class UserString {
    String str;
    UserString(String str){
        this.str=str;
    }
    //a) Count all the characters
    void countChars(){
        System.out.println("Total Characters are: "+str.length());
    }
    //b) Count no of words
    void countWords(){
        String word[]=str.split(" ");
        System.out.println("Total Words are: "+word.length);
    }
    //c)Compare two strings
    void compare(String s2){
        if(str.equals(s2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
    // d) Uppercase
    void toUpper(){
        System.out.println("Uppercase : " + str.toUpperCase());
    }

    // e) Lowercase
    void toLower(){
        System.out.println("Lowercase : " + str.toLowerCase());
    }

    // f) Concatenate
    void concat(String s2){
        System.out.println("Concatenation : " + str.concat(s2));
    }
    void palindrome(){
        String rev= "";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    void position(char Ch){
        System.out.println("Position : "+str.indexOf(Ch));
    }
    void Substring(int start,int end){
        System.out.println("Substring= "+str.substring(start,end));
    }
    void Search(String sub){
        if(str.contains(sub)){
            System.out.println("Substring found");
        }
        else{
            System.out.println("Substring not found");
        }
    }
    void replaceSub(String oldS, String newS){
        System.out.println("After Replace: "+str.replace(oldS,newS));
    }
    void swap(String S2){
        String temp=str;
        str=S2;
        S2=temp;
        System.out.println("String 1: "+str);
        System.out.println("String 2: "+S2);
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String: ");
        String s1=sc.nextLine();
        System.out.println("Enter Second String: ");
        String s2=sc.nextLine();

        UserString u1=new UserString(s1);
        u1.countChars();
        u1.countWords();
        u1.compare(s2);
        u1.toUpper();
        u1.toLower();
        u1.concat(s2);
        u1.palindrome();
        u1.position('a');
        u1.Substring(0,3);
        u1.Search("Java");
        u1.replaceSub("Java","Python");
        u1.swap(s2);
    }


}
