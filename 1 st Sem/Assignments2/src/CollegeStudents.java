/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u212137
 */
class CollegeStudents extends Student {
    private String major;
    CollegeStudents(String name, int age, String major){
        super(name,age);
    }
    void research(){
        System.out.println("College student is conducting research.");
    }
    void study(){
        System.out.println("College student is preparing for lectures.");
    }
    
}
