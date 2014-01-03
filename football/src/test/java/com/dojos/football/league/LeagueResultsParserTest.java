package com.dojos.football.league;

import com.dojos.football.model.FootballResults;
import org.junit.Test;

import static com.dojos.football.util.TestConfig.getFilePath;
import static org.junit.Assert.assertEquals;

public class LeagueResultsParserTest {

    private String leagueResultsFile;
    private FootballResults results;

    @Test
    public void thereShouldBeTwentyTeamsInTheLeague() throws Exception {
        whenIHaveAFileWithLeagueResultsIn("leagueResults");
        andIParseThisFile();
        thenIShouldHaveTwentyTeams();
    }

    @Test
    public void theTeamWithTheLowestGoalDifferenceIsBolton() throws Exception {
        whenIHaveAFileWithLeagueResultsIn("leagueResults");
        andIParseThisFile();
        thenTheTeamWithTheLowestGoalDifferenceIs("Bolton");
    }

    @Test
    public void theTeamWithTheLowestGoalDifferenceIsBlackburn() throws Exception {
        whenIHaveAFileWithLeagueResultsIn("leagueResultsTwo");
        andIParseThisFile();
        thenTheTeamWithTheLowestGoalDifferenceIs("Blackburn");
    }

    private void thenTheTeamWithTheLowestGoalDifferenceIs(String team) {
        assertEquals(team, results.getTeamWithLowestGoalDifference());
    }

    private void whenIHaveAFileWithLeagueResultsIn(String leagueResults) {
        leagueResultsFile = getFilePath(leagueResults);
    }

    private void andIParseThisFile() throws Exception {
        LeagueResultsParser leagueResultsParser = new LeagueResultsParser();
        results = leagueResultsParser.parseLeagueResults(leagueResultsFile);
    }

    private void thenIShouldHaveTwentyTeams() {
        assertEquals(20, results.getNumberOfTeams());
    }


}
