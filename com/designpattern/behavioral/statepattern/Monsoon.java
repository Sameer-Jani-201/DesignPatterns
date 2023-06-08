package com.designpattern.behavioral.statepattern;

public class Monsoon implements Season{
    @Override
    public void nextSeason(SeasonContext SeasonContext) {
        System.out.println("Monsoon season is running...");
        // Based on condition season (state) changes...
        SeasonContext.setSeason(new Winter());
    }
}
