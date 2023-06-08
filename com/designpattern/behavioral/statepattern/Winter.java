package com.designpattern.behavioral.statepattern;

public class Winter implements Season{

    @Override
    public void nextSeason(SeasonContext SeasonContext) {
        System.out.println("Winter season is running...");
        // Based on condition season (state) changes...
        SeasonContext.setSeason(new Summer());
    }
}
