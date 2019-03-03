import java.util.List;

interface LineConverter {
    /**
     * wykonuje konwersje linii zapisanych w odpowiednim
     * formacie do listy obiektow typu Team
     * funkcja przyjmuje liste linii z pliku CSV oraz separator rekordow
     */
    List<Team> toTeam(List<String> lines, String splitBy);
}
