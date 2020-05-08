
//What is your question?


//Secondary School  Computer science  5 points
//The terrorist hijacked the famous Taj hotel in Mumbai and it has many VIPs, children, and family members. The hotel manager decides to inform the police but he wants to send the message without the knowledge of terrorists. So, he sends the message in the form of an encrypted number. Unfortunately, the message is received by the terrorist. The terrorist has to enter the number if they want to read the message. If the resultant of adding the encrypted number and number entered by a terrorist is a perfect number, then they can read the message. Otherwise, they can't read the message. A perfect number is a number which is equal to the sum of its proper positive divisors, excluding the number itself. Input Format: The first input contains an integer which denotes the encrypted number The second input contains an integer which denotes the number entered by a terrorist t is a perfect numbe

#include<iostream>

int main()

{

 int a,b,num,i,div,sum=0;

 std::cin>>a>>b;

 num=a+b;

 for(i=1;i<num;i++)

 {

   div=num%i;

   if(div==0)

     sum=sum+i;

 }

 if(sum==num)

   std::cout<<"They can read the message";

 else

   std::cout<<"They can't read the message";

 return 0;

}