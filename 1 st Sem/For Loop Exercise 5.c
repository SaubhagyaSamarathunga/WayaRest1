#include <stdio.h>
int main()
{
    int rows,m;
    printf("Enter the number of rows: \n");
    scanf("%d",&rows);
    m=rows;
    for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=m-1;j++)
        {
            printf(" ");

        }
        for(int k=1; k<=2*i-1; k++)
        {
            printf(" * ");
        }
        m--;

        printf("\n");
    }
    return 0;
}
