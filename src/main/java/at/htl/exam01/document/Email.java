package at.htl.exam01.document;

public class Email extends Document {
    String emailname;
    String empfeanger;

    public Email()
    {
        super();
    }

    public Email(String autor, String titel, String empfeanger)
    {
        super(autor, titel);
        this.empfeanger = empfeanger;
    }

    public String toString()
    {
        return toSting() + " an '" + empfeanger + "'";
    }
}
