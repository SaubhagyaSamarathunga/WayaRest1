#include<stdio.h>
int main() {

    int i,j,n,m;

    printf( "Enter Array Size ;");
    scanf( "%d" , &n);
    int numbers [n] ;

    for( i=0; i<n; i++) {
        printf( "Enter value [] : ");
        scanf( "%d" , &m);
        numbers [i] = m;
    }
    printf( " Elements in array are :");
    for ( j=n-1; j>=0; j--){
        printf( " %d" , numbers [j]);
    }
}
