class PallindromeLogic
{
int num;
int revNum = 0;

java.util.Scanner sc=new java.util.Scanner(System.in);


void task()
{
System.out.println("Enter any Number:");
num=sc.nextInt();
while (num != 0) {
int remainder = num % 10; 

//10)151(15
//   150
//--------
//    1
//--------
//REMAINDER IS 1
//STORING 1ST ELEMENT 1 IN REMAINDER
//TARGET: 151------------------------(1)51

                                                                      
revNum = revNum * 10 + remainder; 


//0*10+1=1
//rev num= 1
                                                               
num = num/10; 



//151/10=  15
//Again check 3 conditions for number 15
                                                                                  
}//while closing                                                                                    
                                                                                                                                                                                          
if (num == revNum) {
System.out.println(num + " is Palindrome.");
} else {
System.out.println(num + " is not Palindrome.");
}
}//closing method


public static void main(String[]args)
{
PallindromeLogic p=new PallindromeLogic();
p.task();
}
}