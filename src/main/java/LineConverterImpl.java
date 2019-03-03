import java.util.ArrayList;
import java.util.List;

class LineConverterImpl implements LineConverter {

    public List<Team> toTeam(List<String> lines, String splitBy) {
        String[] teams = null;
        List<Team> teamsList = new ArrayList();
        //  for(int index = 0; index < lines.size(); index++ ){
        for (String line : lines) {
            teams = line.split(splitBy);
            //System.out.println(line);
            teamsList.add(new Team(Integer.parseInt(teams[0]), teams[1],
                    Integer.parseInt(teams[2].replaceAll(" ", "")),
                    Integer.parseInt(teams[3].replaceAll(" ", "")),
                    Integer.parseInt(teams[4].replaceAll(" ", "")),
                    Integer.parseInt(teams[5].replaceAll(" ", ""))));
        }
        // }
        return teamsList;
    }
// klasa LineConverterImpl powinna implementowac interfejs LineConverter
// prosze zaimplementowac metode toTeam
// przed implementacja prosze przeanalizowac klase Main
}
