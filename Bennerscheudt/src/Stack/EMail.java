package Stack;

public class EMail
{

    private String absender;
    private String betreff;
    private String text;

    public EMail(String absender, String betreff, String text)
    {

        this.absender=absender;
        this.betreff=betreff;
        this.text=text;

    }

    public void drucke()
    {
        System.out.println("Absender : --> "+absender);
        System.out.println("Betreff : --> "+betreff);
        System.out.println("Text: --> "+text);
    }

    public String getAbsender() {
        return absender;
    }

    public String getBetreff() {
        return betreff;
    }

    public String getText() {
        return text;
    }




}
