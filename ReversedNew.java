import java.util.Scanner;
class ReversedNew
{
String s;
int i;
Scanner sc=new Scanner(System.in);

void task()
{
System.out.println("Enter any String");
s=sc.next();
StringBuilder sb=new StringBuilder();

for(i=s.length()-1;i>=0;i--){
sb.append(s.charAt(i));
}
System.out.println(sb);

}
public static void main(String...args)
{
ReversedNew r=new ReversedNew();
r.task();

}

}