package at.htl.exam01.document;

public class Buch extends Document {

    public Buch()
    {
        super();
    }

    public Buch(String autor, String titel)
    {
        super(autor, titel);
    }

    public String toString()
    {
        return toSting();
    }
}
