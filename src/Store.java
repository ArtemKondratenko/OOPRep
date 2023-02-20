import java.util.List;

public class Store {

    List<Product> assortiment;

    public Store(List<Product> products) {
        this.assortiment = products;
    }

    public void sellProduct(Product product, Person person) {
        if(product.cost <= person.cash) {
            person.korzina.add(product);
            person.cash -= product.cost;
            for(int i = 0; i < assortiment.size(); i++) {
                if(assortiment.get(i).name == product.name) {
                    assortiment.remove(assortiment.get(i));
                }
            }
        } else {
            System.out.println("У вас не хватает денег");
        }
    }

    //Из ассортимента store убираем тот продукт который купили
    //Посмотреть корзину person и убрать из ассортимента
    //продукт которые лежит у персоны

    //При продаже убирать товар из ассортимента

    //2.как нам понять что именно купил пользователь?
    //обращаться к ассортименту по имени продукта



    //3.Смотрим сколько бабла осталось у персона
    // и пробегаемся по ассортименту и смотрим на что еще хватит денег

    //4.Рефакторинг
    //Нужно как то инициализировать ассортимент и отдавать его магазину




}
