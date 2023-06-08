package com.designpattern.behavioral.statepattern;

public class Summer implements Season{
    
    @Override
    public void nextSeason(SeasonContext SeasonContext) {
        System.out.println("Summer season is running...");
        // Based on condition season (state) changes...
        SeasonContext.setSeason(new Monsoon());
    }
}
