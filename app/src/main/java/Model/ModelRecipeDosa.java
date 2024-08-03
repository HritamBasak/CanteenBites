package Model;
public class ModelRecipeDosa
{
    int pic;
    String text;

    public ModelRecipeDosa(int pic, String text)
    {
        this.pic=pic;
        this.text=text;
    }

    public int getPic()
    {
        return pic;
    }
    public String gettext()
    {
        return text;
    }
    public void setPic()
    {
        this.pic=pic;
    }
    public void setText()
    {
        this.text=text;
    }
}
