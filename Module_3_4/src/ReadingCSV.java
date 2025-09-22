import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.net.*;

public class ReadingCSV {
    public static void main(String[] args) {

        double sum = 0.0;
        int count = 0;
        int indexTime = -1;
        int indexUlkoTalo = -1;
        URL myUrl;
        String line;
        String[] columnNames;
        boolean header = false;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }
        System.out.println("Reading data from " + myUrl+" ...");
        try (

                InputStream istream = myUrl.openStream();
                InputStreamReader istreamreader = new InputStreamReader(istream);
                BufferedReader bufferedstream = new BufferedReader(istreamreader);
        ) {
            System.out.println("Opened the stream, reading data ...");
            do {
                System.out.println("Reading line ...");
                line = bufferedstream.readLine();
                System.out.println(line);
                if (line != null) {
                    if (!header) {
                        // first row of the file contains names of columns
                        columnNames = line.split(";");
                        header = true;
                        for (int i = 0; i < columnNames.length; i++) {
                            if (columnNames[i].equals("UlkoTalo")) {
                                indexUlkoTalo = i;
                                System.out.println("Index of UlkoTalo: " + indexUlkoTalo);
                            }
                            if (columnNames[i].equals("Aika")) {
                                indexTime = i;
                                System.out.println("Index of Aika: " + indexTime);
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
