package com.dojos.football.model;

import java.util.ArrayList;
import java.util.List;

public class FootballResults {

    private List<FootballTeam> teams = new ArrayList<FootballTeam>();

    public int getNumberOfTeams() {
        return teams.size();
    }

    public void addTeam(String[] resultColumns) {
        FootballTeam team = new FootballTeam(resultColumns[1], Integer.parseInt(resultColumns[6]), Integer.parseInt(resultColumns[7]));
        teams.add(team);
    }

    public String getTeamWithLowestGoalDifference() {

        FootballTeam team = null;
        int currentLowestGoalDifference = 10000;

        for (FootballTeam footballTeam : teams) {
            if (footballTeam.getGoalsDifference() < currentLowestGoalDifference) {
                team = footballTeam;
                currentLowestGoalDifference = footballTeam.getGoalsDifference();
            }

        }
        return team.getTeam();
    }
}
