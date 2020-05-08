














//Secondary School  Computer science  5+3 pts
//Dora is so much interested in gardening and hence she plants more trees in her garden. She plants trees in a rectangular fashion with the order of rows and columns and numbers the trees in a row-wise order. She planted the mango tree only in the 1st row, 1st column and last column. So, given the tree number, your task is to find out whether the given tree is a mango tree or not? Now, write a program to check whether the given number denotes a mango tree or not.
//by Swethachowdary845 3 weeks ago
//Ask for details  Follow Report
//Answers

//Noushin99882Helping Hand
//Answer:

//Click to let others know, how helpful is 

#include<iostream>

using namespace std;

int main()

{

 int row,col,num,col2,col3,col4,col5,row2;

 std::cin>>row>>col>>num;

 col2=col*2;

 col3=col*3;

 col4=col*4;

 col5=col*5;

 row2=row*2;

 if(num>1 && num<=col)

   std::cout<<"Yes";

 else if(num==col || num==col2 || num==col3 || num==col4 || num==col5)

   std::cout<<"Yes";

 else if(num==(col+1) || num==(col2+1) || num==(col3+1) || num==(col4+1) || num==(col5+1))

   std::cout<<"Yes";

 else

   std::cout<<"No";

}