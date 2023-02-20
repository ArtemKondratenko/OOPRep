import java.util.List;

public class AssortimentInitializr {

    Store store;

    public void initAssortiment(Store store, List<Product> products) {
        store.assortiment = products;
    }



}
