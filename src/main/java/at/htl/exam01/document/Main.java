package at.htl.exam01.document;


public class Main {

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {

        Document [] document = new Document[3];

        Buch buch1 = new Buch ("Rowlings", "Harry Potter und der Stein der Weisen");
        Buch buch2 = new Buch("Tolkien", "LordOfRings");
        Email email = new Email("Susi", "Bewerbung", "Cool Company");

        document [0] = buch1;
        document [1] = email;
        document [2] = buch2;

        ausgabe(document);
    }


    public static void ausgabe(Document [] document)
    {
        int buechercounter = 0;
        int emailcounter = 0;

        for (int i = 0; i < document.length; i++) {
            if (document [i] instanceof Buch)
            {
                System.out.println("Book: " + document[i]);
                buechercounter++;
            }
            else
            {
                System.out.println("E-Mail: " + document[i]);
                emailcounter++;
            }
        }

        System.out.println();
        System.out.println("Anzahl Books: " + buechercounter);
        System.out.println("Anzahl E-Mails: " + emailcounter);
    }


}
