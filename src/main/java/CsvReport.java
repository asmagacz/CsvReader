import java.util.List;

interface CsvReport {
    /**
     * funkcja zwraca liste stringow - lista linii z pliku CSV
     */
    List<String> csvToListOfString();
}
