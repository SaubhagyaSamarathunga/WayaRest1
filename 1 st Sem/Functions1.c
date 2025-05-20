#include<stdio.h>

//function declaration
int multiply(int num1,int num2);

int main()
{
    int a=100;
    int b=25;
    int ret,dev,add,sub;
    //calling a function to get a multiplication value
    ret= multiply(a,b);
    printf("Multiplication value is : %d\n",ret);

    dev=devide(a,b);
    printf("Devision value is : %d\n",dev);

    add=addition(a,b);
    printf("Addition value is : %d\n",add);

    sub=subtraction(a,b);
    printf("Subtraction value is : %d\n",sub);


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

int devide(int num1,int num2)
{
    int result;
    result=num1/num2;
    return result;
}

int addition(int num1,int num2)
{
    int result;
    result=num1+num2;
    return result;
}

int subtraction(int num1, int num2)
{
    int result;
    result=num1-num2;
    return result;
}




