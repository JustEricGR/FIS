import java.util.List;

public abstract class Document {
    private List<String> continut;

    public Document(List<String> continut) {
        this.continut = continut;
    }

    public List<String> getContinut() {
        return continut;
    }

    public void setContinut(List<String> continut) {
        this.continut = continut;
    }

    public void setAtIndex(String s) {
        this.continut.add(s);
    }

    @Override
    public String toString() {
        String rez = new String();
        rez += this.getClass() + ": ";
        for(String s1 : continut) {
            rez += s1 + " ";
        }
        return rez;
    }

    public abstract Document analyze();
}


