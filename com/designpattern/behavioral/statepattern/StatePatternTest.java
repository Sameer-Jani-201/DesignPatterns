package com.designpattern.behavioral.statepattern;

public class StatePatternTest {
    public static void main(String[] args) {
        SeasonContext seasonContext =new SeasonContext();
        seasonContext.nextSeason();
        seasonContext.nextSeason();
        seasonContext.nextSeason();

        System.out.println();
        System.out.println("Current season now start from Winter");
        seasonContext.setSeason(new Winter());
        seasonContext.nextSeason();
        seasonContext.nextSeason();
    }
}
