package DieLieste;

public class Email {
    private String absender;
    private String betreff;
    private String text;

    public static void drucke(Email maill){
        System.out.println("Absender" +maill.absender);
        System.out.println(" Betreff "+maill.betreff);
        System.out.println(" text "+maill.text);


    }

    public Email(String absender, String betreff, String text) {
        this.absender = absender;
        this.betreff = betreff;
        this.text = text;
    }

    public String getAbsender() {
        return absender;
    }

    public void setAbsender(String absender) {
        this.absender = absender;
    }

    public String getBetreff() {
        return betreff;
    }

    public void setBetreff(String betreff) {
        this.betreff = betreff;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
