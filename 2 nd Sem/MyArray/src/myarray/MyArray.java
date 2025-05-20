/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarray;

public class MyArray {
    private double[] a; 
    private int nElems;
    public MyArray(int max) {
        a = new double[max];
        nElems = 0;
    }
    
    public void insert(double value){
        a[nElems] = value;
        nElems++;
    }
    
    public void display(){
        for (int j=0; j<nElems; j++){
            System.out.print(a[j] +" ");
        }
    }
    
    public boolean find(double searchKey){
        int j;
        for(j=0; j< nElems; j++){
            if (a[j]==searchKey){
                break;
            }
        }
        if(j== nElems){
            return false;
        }
        else {
            return true;
        }
    }
    public boolean delete(double value){
        int j;
        for (j = 0; j<nElems; j++)
            if(value == a[j])
                break;
        if(j==nElems){
            System.out.println(value+"Not deletd. Nat found..!");
            return false;
        }
        else{
            for(int k=j; k<nElems-1; k++)
                a[k]=a[k+1];
            System.out.println(value+" Deleted..!");
            nElems--;
            return true;
        }
    }

   
}
