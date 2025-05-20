
package employee2;

public class AbstractDemo {
    public static void main(String[] args) {
        Employee2 salary = new Salary("George W." , "Houston, TX",43,1235.56);
        System.out.println("\n Call mailCheck using Employee reference--");
        salary.mailCheck();
        salary.computerPay();
        salary.getAddress();
        salary.getName();
        salary.getNumber();
        

    }
    
}
