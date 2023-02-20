import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> backpack = new ArrayList<>();
        Person person = new Person(1500, backpack);

        List<Product> pyaterochkaAssortiment = new ArrayList<>();
        Product product1 = new Product("Moloko", 50);
        Product product2 = new Product("Chips", 150);
        Product product3 = new Product("Sosiski", 120);
        Product product4 = new Product("Doshik", 25);
        Product product5 = new Product("Viski", 900);
        pyaterochkaAssortiment.add(product1);
        pyaterochkaAssortiment.add(product2);
        pyaterochkaAssortiment.add(product3);
        pyaterochkaAssortiment.add(product4);
        pyaterochkaAssortiment.add(product5);


        List<Product> magnitAssortiment = new ArrayList<>();
        Product product11 = new Product("Moloko", 75);
        Product product22 = new Product("Chips", 100);
        Product product33 = new Product("Sosiski", 75);
        Product product44 = new Product("Doshik", 45);
        Product product55 = new Product("Viski", 500);
        magnitAssortiment.add(product11);
        magnitAssortiment.add(product22);
        magnitAssortiment.add(product33);
        magnitAssortiment.add(product44);
        magnitAssortiment.add(product55);

        Store pyaterochka = new Store(pyaterochkaAssortiment);
        Store magnit = new Store(magnitAssortiment);

        for(int i = 0; i < pyaterochka.assortiment.size(); i++) {
            System.out.println(pyaterochka.assortiment.get(i).name);
        }
        System.out.println();

        System.out.println("Денег было: " + person.cash);

        person.checkAssortiment(pyaterochka.assortiment);
        person.checkAssortiment(magnit.assortiment);

        pyaterochka.sellProduct(product1, person);
        pyaterochka.sellProduct(product4, person);
        pyaterochka.sellProduct(product2, person);
        pyaterochka.sellProduct(product5, person);
        pyaterochka.sellProduct(product5, person);

        System.out.println("Что купил человек: ");
        for (int i = 0; i < person.korzina.size(); i++) {
            System.out.println(person.korzina.get(i).name + " : " + person.korzina.get(i).cost);
        }
        System.out.println("Денег осталось: " + person.cash);

        System.out.println("Что осталось в пятерочке: ");
        for(Product product : pyaterochka.assortiment) {
            System.out.println(product.name);
        }

        System.out.println("Что осталось в магните: ");
        for(Product product : magnit.assortiment) {
            System.out.println(product.name);
        }

        person.checkAssortiment(magnit.assortiment);






    }
}
