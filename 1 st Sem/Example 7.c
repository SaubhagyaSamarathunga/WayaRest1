#include <stdio.h>
int main() {
    float num1;
    double num2;
    printf("Enter a float number:");
    scanf("%f", &num1);
    printf("Enter another Double (Float) number:");
    scanf("%if", &num2);
    printf("The Float Number you entered = %f\n", num1);
    printf("The Double Number you entered = %if \n", num2);
return 0;
}
