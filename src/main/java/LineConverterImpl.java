import java.util.ArrayList;
import java.util.List;

class LineConverterImpl implements LineConverter {

    public List<Team> toTeam(List<String> lines, String splitBy){
        String[] teams;
        List<Team> teamsList = new ArrayList();
        for(String line : lines){

            for(int index = 0; index < line.length(); index++ ){
                teamsList.add(new Team(line.indexOf(index),String.valueOf(line.indexOf(index+1)),line.indexOf(index+2),line.indexOf(index+3),line.indexOf(index+4),line.indexOf(index+5)));
            }
        }
        return teamsList;
    }
// klasa LineConverterImpl powinna implementowac interfejs LineConverter
// prosze zaimplementowac metode toTeam
// przed implementacja prosze przeanalizowac klase Main
}
