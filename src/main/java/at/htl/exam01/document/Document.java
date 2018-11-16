package at.htl.exam01.document;

public abstract class Document {
    String autor;
    String titel;

    Document()
    {

    }

    Document(String autor, String titel)
    {
        this.autor = autor;
        this.titel = titel;
    }


    public String toSting()
    {
        return autor + " " + titel;
    }
}
