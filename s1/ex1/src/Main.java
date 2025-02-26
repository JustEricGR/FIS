import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Document documente = new XML(List.of("<tag> 123gs </tag>", "456gs </tag>"));
        ArrayList<Document> documente = new ArrayList<>();
        documente.add(new XML(List.of("<tag> 123gs </tag>", "456gs </tag>")));
        documente.add(new JSON(List.of("nume1: val1", "nume2: val2", "nume3: val3", "nume4: val4")));

        documente.forEach(System.out::println);
        documente.forEach(s -> System.out.println(s.analyze()));
    }
}