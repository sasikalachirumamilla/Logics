//14.Java String Program to Replace a Character at a Specific Index

class ReplaceCharacter
{
java.util.Scanner sc=new java.util.Scanner(System.in);
String str;
int index;
String letter;

void task()
{
System.out.println("Enter any String");
str=sc.nextLine();

System.out.println("enter index value and character you want to replace");
int index1=sc.nextInt();
index=sc.nextInt();
letter=sc.next();

StringBuilder sb=new StringBuilder(str);
sb.replace(index1, index, letter);
System.out.println(sb);

/*
if (index >= 0 && index < sb.length()) 
{
sb.setCharAt(index1,index ,letter);
str = sb.toString();
System.out.println("Updated String: " + str);
} else {
System.out.println("Index out of bounds");
}*/

}
public static void main(String...args)
{
ReplaceCharacter rc=new ReplaceCharacter();
rc.task();
}
}