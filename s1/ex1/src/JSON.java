import java.util.ArrayList;
import java.util.List;

public class JSON extends Document {
    public JSON(List<String> continut) {
        super(continut);
    }

    @Override
    public JSON analyze() {
        JSON aux = new JSON(new ArrayList<>());
        for(String s : getContinut()) {
            String[] aux1 = s.split(" ");
            for(String s1 : aux1) {
                if (!s1.contains(":")) {
                    aux.setAtIndex(s1);
                }
            }
        }
        return aux;
    }
}
