#include <stdio.h>
int main() {
    char Str1[100];
    char Str2[50];
    printf("Enter string 1 \n");
    gets(Str1); //Read string
    printf("The string you entered:");
    puts(Str1);
    printf("\n");
    //Another way
    printf("Enter String 2 \n");
    scanf("%s", & Str2); //Read string
    printf("The string you entered:");
    puts(Str2);
    printf("\n");
return 0;
}

