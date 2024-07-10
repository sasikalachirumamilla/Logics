class PallindromeLogic
{
int num;
int revNum = 0;
int originalNum = num;
java.util.Scanner sc=new java.util.Scanner(System.in);


void task()
{
System.out.println("Enter any Number:");
num=sc.nextInt();
while (num != 0) {
int remainder = num % 10;
revNum = revNum * 10 + remainder;
num /= 10;
}//while closing

if (originalNum == revNum) {
System.out.println(originalNum + " is Palindrome.");
} else {
System.out.println(originalNum + " is not Palindrome.");
}
}//closing method


public static void main(String[]args)
{
PallindromeLogic pl=new PallindromeLogic();
pl.task();
}
}