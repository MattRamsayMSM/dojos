package com.dojos.football.league;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.dojos.football.model.FootballResults;


public class LeagueResultsParser {
	
	public FootballResults parseLeagueResults(String leagueResults) throws IOException {
		
		BufferedReader resultsReader = new BufferedReader(new FileReader(new File(leagueResults)));
        FootballResults results = new FootballResults();

		String result;
		while ((result = resultsReader.readLine()) != null) {
			String[] tokens = result.split("\\t+");
            String position = tokens[0];

            if (isLineAResultOfInterest(position))  {
                results.addTeam(tokens);
            }

		}
		resultsReader.close();
		
		return results;
	}

    private boolean isLineAResultOfInterest(String position) {
        try {
            Integer.parseInt(position);
            return true;
        } catch (NumberFormatException npe) {
            return false;
        }
    }

}
