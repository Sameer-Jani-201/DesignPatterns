package com.designpattern.behavioral.strategypattern;

public class StrategyPatternTest {
    public static void main(String[] args) {
        Team teamGermany = new TeamGermany();
        Team teamArgentina = new TeamArgentina();
        teamGermany.setTeamName("Germany");
        teamArgentina.setTeamName("Argentina");

        // Strategies
        TeamStrategy attackStrategy = new AttackStrategy();
        TeamStrategy defendStrategy = new DefendStrategy();

        // Germany starts game with defensive mode.
        // Argentina starts game with attacking mode.
        teamGermany.setTeamStrategy(defendStrategy);
        teamArgentina.setTeamStrategy(attackStrategy);

        teamGermany.teamInfo();
        teamGermany.playGame();

        teamArgentina.teamInfo();
        teamArgentina.playGame();

        System.out.println();
        System.out.println("After half time");
        System.out.println();

        System.out.println("Team Changes their strategies");

        teamArgentina.setTeamStrategy(defendStrategy);
        teamGermany.setTeamStrategy(attackStrategy);

        teamGermany.teamInfo();
        teamGermany.playGame();

        teamArgentina.teamInfo();
        teamArgentina.playGame();
    }
}
