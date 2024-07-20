//8..Java String Program to Iterate Over Characters in String

class IterateOverCharacters
{
java.util.Scanner sc=new java.util.Scanner(System.in);
String str;

void task()
{
System.out.println("Enter any String");
str=sc.next();
for(int i=0; i<str.length(); i++)
{
System.out.println("The Index value at "+i+" is "+ str.charAt(i));
}
}

public static void main(String...args)
{
IterateOverCharacters io=new IterateOverCharacters();
io.task();
}
}