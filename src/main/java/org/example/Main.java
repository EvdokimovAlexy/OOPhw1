package org.example;
public class Main {
    public static void main(String[] args) {
        WendingMachine store = new WendingMachine();
        store.addProduct(new Product("Lays" , 123.45))
                .addProduct(new Product("fanta" , 98.76))
                .addProduct(new Beer("alcoholfree" , 67.89))
                .addProduct(new Beer("notbeer" , 67.89, 99))
                .addProduct(new CursedProducts("milk" , 56.65, 7))
                .addProduct(new Chocolate("Milka" , 95.54, "White" ));
        System.out.println(store);
//        System.out.println("searching for ay's");
//        System.out.println(store.findProduct("ys"));
        System.out.println("buying Lay's" );
        store.buy("Lays", 123.45);
        System.out.println(store);
//        System.out.println(store);
    }
}