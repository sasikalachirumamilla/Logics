//4..Java String Program to Check Anagram
//step1--enter 2 strings
//step2--remove spaces inbetween strings and convert them into lowercase
//step3--check the length of 2 strings
//step4--if lenth of 2 strings are not same then return false. else, Sort the strings
//step5--compare sorted strings

import java.util.Arrays;
class AnagramLogic
{
java.util.Scanner sc=new java.util.Scanner(System.in);
String str1;
String str2;

boolean task()
{
System.out.println("Enter 2 strings");
str1=sc.next();
str2=sc.next();
str1=str1.replaceAll("\\s","").toLowerCase();
str2=str2.replaceAll("\\s","").toLowerCase();

if((str1.length())!=(str2.length()))
{
return false;
}
else
{
char[] array1=str1.toCharArray();//convert a String into an array of characters (char[]).
char[] array2=str2.toCharArray();//convert a String into an array of characters (char[]).
Arrays.sort(array1);
Arrays.sort(array2);
return Arrays.equals(array1, array2);//It compares two arrays (array1 and array2) with same length and same order
}

}
public static void main(String[]args)
{
AnagramLogic a=new AnagramLogic();

if (a.task()){
System.out.println("The 2 strings are Anagrams");
}
else{
System.out.println("The 2 strings are not a Anagram");
}
}
}
