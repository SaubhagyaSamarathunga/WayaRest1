#include<stdio.h>
int main()
{
    char str1[20];
    int len;

    printf("Input a string :");
    scanf("%s",&str1);
    printf("Output : %s\n",str1);
    len = strlen(str1);
    printf("strlen(str1) : %d\n",len);
    return 0;
}
