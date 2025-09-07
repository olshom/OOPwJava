import java.io.BufferedWriter;
   import java.io.FileWriter;
   import java.io.IOException;
   import java.io.Writer;

public class WritingCSV {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("file.csv");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("Fibonacci");
            bufferedWriter.newLine();
            long a = 0, b = 1;
            for(int i=0; i<61; i++){
                String fibonacciS = String.valueOf(a);
                long next = a + b;
                a=b;
                b=next;
                bufferedWriter.write(fibonacciS);
                bufferedWriter.newLine();
            }
            // Write some rows
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}