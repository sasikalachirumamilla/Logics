//checking weather the given number is even or odd
import java.util.Scanner;
class EvenOddLogic
{
int a;
Scanner sc=new Scanner(System.in);

void condition(){
System.out.println("Eneter any Number:"+a);
a=sc.nextInt();
if (a%2==0)
System.out.println(a+" number is an Even Number");
else
System.out.println(a+" number is an Odd Number");
sc.close();
}

public static void main(String[]args)
{
EvenOddLogic eo=new EvenOddLogic();
eo.condition();
}
}