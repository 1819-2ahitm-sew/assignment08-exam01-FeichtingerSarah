package at.htl.exam01.compress;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringCompress {

    private static final String FILE_NAME = "sample.txt";

    /**
     * Main-Methode, hier wird das StringCompress-Objekt erstellt
     * und die Methoden des Objekts werden aufgerufen
     *
     * @param args
     */

    public static void main(String[] args) {
        StringCompress sc = new StringCompress();
        String[] text = sc.readFromFile(FILE_NAME);
        //sc.print(text);
    }


    /**
     *
     * Sämtliche Zeilen werden aus der Textdatei eingelesen
     * zB 5A
     * Nun wird in das String-Array AAAAA geschrieben
     *
     * Bsp Testdatei
     * 5A
     * 3B
     * 4C
     *
     * ergibt eine String-Array mit 3 Elementen
     * AAAAA
     * BBB
     * CCCC
     *
     * @param fileName
     * @return String-Array mit dem entpacktem Text
     */
    public String[] readFromFile(String fileName) {
        char zeichen;
        String zeichenkette;
        String ziffern = "";
        int zahl;
        int counter = 0;
        String zeichenUmwandlung = "";
        String [] liste = new String[getNoOfLines(fileName)];

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while(scanner.hasNextLine())
            {
                zeichenkette = scanner.next();

                zeichen = zeichenkette.charAt(0);
                ziffern = zeichenkette.substring(1);

               zahl = Integer.parseInt(ziffern);

                /*liste[counter] = zeichen + "";

                for (int i = 1; i < zahl; i++) {
                    liste[counter] = liste[counter] + zeichen;
                }

                System.out.println(liste[counter]);
                */

                print(liste, counter, zahl, zeichen);

                counter++;


            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


        return liste;
    }


    /**
     * Der Inhalt des String-Arrays wird zeilenweise auf der Console ausgegeben
     *
     *
     * @param lines String-Array
     */
    public void print(String[] liste, int counter, int zahl, char zeichen) {

        liste[counter] = zeichen + "";
            for (int j = 1; j < zahl; j++) {
                liste[counter] = liste[counter] + zeichen;
            }


        System.out.println(liste[counter]);
    }


    /**
     * Die Anzahl der Zeilen der übergebenen Textdatei wird bestimmt
     *
     * @param fileName
     * @return Anzahl der Zeilen in der Textdatei
     */
    public int getNoOfLines(String fileName) {
        int countLines = 0;

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while(scanner.hasNextLine())
            {
               scanner.nextLine();
               countLines++;
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return countLines;
    }
}
