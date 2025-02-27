import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ProcesorCautare implements Procesor {
    private String cautat;

    public ProcesorCautare(String cautat) {
        this.cautat = cautat;
    }

    @Override
    public int proceseaza(List<Document> documents) {
        AtomicInteger tot = new AtomicInteger(0);
        documents.forEach(d -> {

            for(String s : d.analyze().getContinut()) {
                if(cautat.equals(s)) {
                    tot.incrementAndGet();
                }
            }
        });
        return tot.get();
    }
}
