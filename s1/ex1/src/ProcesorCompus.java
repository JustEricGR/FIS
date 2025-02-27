import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ProcesorCompus implements Procesor {
    List<Procesor> procesoare = new ArrayList<>();

    public ProcesorCompus(List<Procesor> procesoare) {
        this.procesoare = procesoare;
    }

    @Override
    public int proceseaza(List<Document> documents) {
        AtomicInteger tot = new AtomicInteger(0);
        procesoare.forEach(p -> {
            if(p instanceof ProcesorCautare) {
                tot.addAndGet(p.proceseaza(documents));
            } else {
                for(Procesor p1 : ((ProcesorCompus) p).procesoare) {
                    tot.addAndGet(p1.proceseaza(documents));
                }
            }
        });
        return tot.get();
    }
}
