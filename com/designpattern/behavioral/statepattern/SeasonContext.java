package com.designpattern.behavioral.statepattern;

public class SeasonContext {
    private Season season;

    public SeasonContext(){
        this.season = new Summer();
    }

    public void setSeason(Season season){
        this.season = season;
    }

    public void nextSeason(){
        this.season.nextSeason(this);
    }
}
