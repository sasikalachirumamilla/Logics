import java.util.Scanner;
class pallinNew
{
int i;
String str1,str2;
Scanner sc=new Scanner(System.in);

void task()
{
System.out.println("Enter any String");
str1=sc.next();

StringBuilder sb=new StringBuilder();

for(i=str1.length()-1;i>=0;i--)
{
sb.append(str1.charAt(i));
System.out.println(sb.toString());
}

if(str1.equals(sb))
{
System.out.println("Pallindrome");

}
else{
System.out.println("not Pallindrome");
}
}
public static void main(String...args)
{
pallinNew p=new pallinNew();
p.task();
}
}