/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.node1;

public class Node1 {

    public int iData; // data items
    public Node1 next;  //next node in the list(~adress)
    
    public Node1(int data) { //constructor
        iData = data; //initialze the data
        next = null; //'next' is set to null
    }
    public void displayNode(){ // display node
        System.out.println("{" + iData + "}");
        
    }
}

