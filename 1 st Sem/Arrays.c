#include<stdio.h>
int main() {

    int numbers [ 10 ] ; // n is an array of 10 integers
    int i,j;

    //initialize element of array numbers
    for ( i=0; i<10; i++ ) {
            numbers [ i ] = i + 10;
    }
    //output each array element's value
    for ( j=0; j< 10; j++) {
        printf( " Elements [%d] = %d\n" , j , numbers [j]);
    }
    return 0;
}
