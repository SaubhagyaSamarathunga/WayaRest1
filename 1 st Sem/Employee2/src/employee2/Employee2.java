
package employee2;


public abstract class Employee2 {
    
    private String name;
    private String address;
    private int number;
   

public Employee2(String name, String address, int numbers){
    System.out.println("Constructing as Employee");
    this.name = name;
    this.address = address;
    this.number = number;
}
public double computerPay(){
    System.out.println("Inside Employee computerPay");
    return 0.0;
    
}
public void mailCheck(){
    System.out.println("Mailling a check to" + this.name+ ""+this.address);
}
public String toString(){
    return name + " " + address + " " + number;
}
public String getName(){
    return name;
}
public String getAddress(){
    return address;
}
public void setAddress(String newAddress){
    address = newAddress;
}
public int getNumber(){
    return number;
}
}




