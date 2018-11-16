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
        document [1] = buch2;
        document [2] = email;
    }


    public static void ausgabe(Document [] document)
    {
        for (int i = 0; i < document.length; i++) {
            if (document [i] instanceof Buch)
            {
                System.out.println("Buch: " + );
            }
        }
    }


}
