/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;


public class ChargingClient {
    public static void main(String[] args) {
        UniversalCharger universalCharger = new ChargingAdapter(new DeviceCharger());
        universalCharger.charge();
    }
    
}
