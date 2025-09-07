import java.io.*;
import java.net.*;

public class ReadingCSV {
    public static void main(String[] args) {
        // first, create the url

        double sum = 0.0;
        int count = 0;
        int indexTime = -1;
        int indexUlkoTalo = -1;
        URL myUrl;
        String line;
        String[] columnNames = new String[0];
        boolean header = true;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try (
                InputStream istream = myUrl.openStream();
                InputStreamReader istreamreader = new InputStreamReader(istream);
                BufferedReader bufferedstream = new BufferedReader(istreamreader);
        ) {
            do {
                line = bufferedstream.readLine();
                if (line != null) {
                    if (header) {
                        // first row of the file contains names of columns
                        columnNames = line.split(";");
                        header = false;
                        for (int i = 0; i < columnNames.length; i++) {
                            if (columnNames[i].equals("UlkoTalo")) {
                                indexUlkoTalo = i;
                            }
                            if (columnNames[i].equals("Aika")) {
                                indexTime = i;
                            }
                        }
                    } else if (indexTime != -1 && indexUlkoTalo != -1){
                        // just print data lines with column names
                        String[] columns = line.split(";");
                        if (columns[indexTime].startsWith("01.01.2023")) {
                            count++;
                            double temp = Double.parseDouble(columns[indexUlkoTalo].replace(",", "."));
                            sum += temp;
                        }
                    }
                }
            }
            while (line != null) ;
            if (count > 0) {
                double average = sum / count;
                System.out.printf("Average UlkoTalo temperature on 2023-01-01: %.2f °C%n", average);
            } else {
                System.out.println("No data found for 2023-01-01.");
            }

        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
