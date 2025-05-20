/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.node1;

/**
 *
 * @author u212137
 */
public class linkedList {
    private Node1 first; // ref to first node on list
    
    public void linkedList(){ //constructor
        first = null; // no items in list yet
    }
    
    public void insertFirst(int data){
        Node1 newNode1 = new Node1(data);  //make new node
        newNode1.next = first; //newNode --> old first
        first = newNode1; // first --> newNode1
    }
    
    public void displayList(){
        System.out.println("List (First --> Last");
        Node1 currentNode1 = first; // start at beginning of list
        
        while(currentNode1 !=null){  //until end of list
            currentNode1.displayNode(); //print node
            currentNode1 = currentNode1.next; //move to next node
        }
    
}
}
