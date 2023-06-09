package com.designpattern.structural.flyweightpattern;

public class Tester implements Employee{
    private final String JOB;
    private String skill;

    public Tester(){
        JOB = "Test the issue";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Tester with skill: "+this.skill+" with job: "+JOB);
    }
}
