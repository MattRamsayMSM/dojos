package com.dojos.football.model;

/**
 * Created with IntelliJ IDEA.
 * User: sully.rafiq
 * Date: 19/09/2013
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */
public class FootballTeam {

    private String team;
    private int goalsFor;
    private int goalsAgainst;

    public FootballTeam(String team, int goalsFor, int goalsAgainst) {
        this.team = team;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public String getTeam() {
        return team;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getGoalsDifference() {
        return goalsFor - goalsAgainst;
    }
}
