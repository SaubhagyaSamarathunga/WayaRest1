/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

public class Example {

    int a[] = {10,12,14,15,16};
    int n=5;
    public void insert (int value){
        int j;
        for(j=0; j<=n; j++){
            if(a[j]>value){
                break;
            }
        }
        for(int k=5; k>j; k--){
            a[k]=a[k-1];
        }
        a[j] = value;
        n++;
    }
    
}
