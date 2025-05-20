#include<stdio.h>

//function declaration
int multiply(int num1,int num2);

int main()
{
    int a=10;
    int b=25;
    int ret;
    //calling a function to get a multiplication value
    ret= multiply(a,b);
    printf("Multiplication value is : %d\n",ret);
    return 0;
}
//function returning the multiplication between the two numbers
int multiply(int num1, int num2)
{
    //local variable declaration
    int result;
    result=num1*num2;
    return result;

}
