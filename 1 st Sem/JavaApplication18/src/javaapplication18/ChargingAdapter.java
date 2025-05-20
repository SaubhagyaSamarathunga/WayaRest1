/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author u212137
 */
public class ChargingAdapter implements UniversalCharger {
    private DeviceCharger deviceCharger;
    
    public ChargingAdapter(DeviceCharger deviceCharger){
        this.deviceCharger = deviceCharger;
    }
    @Override
    public void charge(){
        deviceCharger.plugIntoDevice();
        deviceCharger.chargeDevice();
        
    }
    
}
