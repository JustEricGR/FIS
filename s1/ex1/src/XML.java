import java.util.ArrayList;
import java.util.List;

public class XML extends Document {
    public XML(List<String> continut) {
        super(continut);
    }

    @Override
    public XML analyze() {
        XML aux = new XML(new ArrayList<>());
        for(String s : getContinut()) {
            String[] aux1 = s.split(" ");
            for(String s1 : aux1) {
                if (!s1.contains("<")) {
                    aux.setAtIndex(s1);
                }
            }
        }
        return aux;
    }
}
