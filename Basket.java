public class Basket {
    //homework done


    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double weight =0 ;





    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public  int getCount() {
        return count;
    }

    public  void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }
    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            return;
        }

        if (totalPrice + weight+  count * price >= limit) {
            return;
        }


        items = items + "\n" + name + " - " + count + " шт. - " + "цена-"+ price + ".Вес-" + weight;
        totalPrice = totalPrice +  count * price;

    }
    public void add(String name, int price, double weight) {

    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {

    }

    public void clear() {
        items = "";
        totalPrice = 0;
        weight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }
    public double ves () {
        return weight;
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}

