/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author u212137
 */
abstract class Shape {
    public abstract void draw();
    
    public void resize(){
        System.out.println("Resizing the shape");
    }
    
}
