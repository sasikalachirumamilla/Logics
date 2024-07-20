//7..Java String Program to  Add Characters to a String

class AddCharactersToAString
{
java.util.Scanner s= new java.util.Scanner(System.in);
String str;
int index;
String ch;

void task()
{
System.out.println("Enter any String");
str=s.next();
System.out.println("Enter your index and string/character");
index=s.nextInt();
ch=s.next();
StringBuilder sb=new StringBuilder(str);
sb.insert(index, ch);
System.out.println(sb);
}

public static void main(String...args)
{
AddCharactersToAString a=new AddCharactersToAString();
a.task();
}
}