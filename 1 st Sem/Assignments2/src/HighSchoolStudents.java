/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u212137
 */
class HighSchoolStudents extends Student {
    private int gradelevel;
    HighSchoolStudents(String name, int age,int gradelevel){
        super(name,age);
    }
    void attendProm(){
        System.out.println("High school student is attending the prom.");
    }
    void study(){
        System.out.println("High school student is preparing for exams.");
    }
}
