import java.util.ArrayList;
import java.util.List;

public class Person {

    int cash;

    List<Product> korzina;

    Person(int cash, List<Product> korzina) {
        this.cash = cash;
        this.korzina = new ArrayList<>();
    }

    public void checkAssortiment(List<Product> assortiment) {
         for(Product product : assortiment) {
             if(product.cost <= cash) {
                 System.out.println("Денег хватает на: "
                         + product.name + ":" + product.cost);
             }
         }
        System.out.println();
    }




}
