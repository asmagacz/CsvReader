import java.util.List;

// bardzo prosze nie modyfikowac klasy Main
class Main {
    public static void main(String[] args) {
// prosze zmodyfikowac sciezke aby prawidlowo odczytac
// plik w wlasnym systemie operacyjnym
        final String CSV_FILE = "src/main/resources/ekstraklasa.csv";
        final String SPLIT_BY = ";";
        CsvReport csvReport = new CsvReader(CSV_FILE);
        LineConverter lineConverter = new LineConverterImpl();
        List<String> lines = csvReport.csvToListOfString();
        List<Team> teams = lineConverter.toTeam(lines, SPLIT_BY);
        for (Team team : teams) {
            System.out.printf("%2d: %-25s: Punkty: %2d, Zwyciestwa: %2d, Porazki: %2d, Remisy: %2d \n",
                    team.getId(), team.getName(), team.getPoints(), team.getWins(), team.getLoses(),
                    team.getDraws());
        }
    }
}