import java.io.*;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path to the file");
        String path = scanner.next();

        try (LineNumberReader reader = new LineNumberReader(new FileReader(path));
             Writer writer1 = new FileWriter("/Java/text2.txt");
             Writer writer2 = new FileWriter("/Java/text3.txt")) {
             String readLine = reader.readLine();

             while (readLine != null) {
                 if (readLine.length() !=15 || ! readLine.startsWith("docnum") & ! readLine.startsWith("contract")){
                     writer1.write(readLine);
                     writer1.write("Number without necessary information");
                      try {
                          throw new NumbersException();
                      } catch (NumbersException exc) {
                          System.out.println("Wrong number : " + readLine);
                      }

                 } else {
                     writer2.write(readLine);
                     System.out.println( readLine);
                 }
                 readLine = reader.readLine();
             }


        } catch (IOException exc) {

        }

    }
}
