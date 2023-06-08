package com.designpattern.structuralpattern.flyweightpattern;

import java.util.Random;

public class Engineering {
    private static String employeeType[] = {"Developer","Tester"};
    private static String skills[] = {"Java","C++",".NET","Python"};

    public static void main(String args[]){
        for(int i=0;i<10;i++){
            Employee e = EmployeeFactory.getEmployee(getRandomEmployee());
            e.assignSkill(getRandomSkill());

            e.task();
        }
    }

    private static String getRandomEmployee(){
        Random r = new Random();
        int randInt = r.nextInt(employeeType.length);
        return employeeType[randInt];
    }

    private static String getRandomSkill(){
        Random r = new Random();
        int randInt = r.nextInt(skills.length);
        return skills[randInt];
    }
}
