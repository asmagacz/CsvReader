import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class CsvReader implements CsvReport {
    private String csvFile = "";

    public CsvReader(String csv_file) {
        this.csvFile = csv_file;
    }

    public List<String> csvToListOfString() {
        List<String> stringsLine = new ArrayList<String>();
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use semicolon as separator
                stringsLine.add(line+"\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //System.out.println(stringsLine+"\n");
        stringsLine.remove(0);
        return stringsLine;
    }
// klasa CsvReader powinna implementowac interfejs CsvReport
// prosze utworzyc odpowiedni konstruktor
// oraz wlasna implementacje metody csvToListOfString
// przed implementacja prosze przeanalizowac klase Main
}
