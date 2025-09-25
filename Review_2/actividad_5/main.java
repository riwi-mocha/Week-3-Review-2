import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product("1", "Reloj", 50.000);
        Product product2 = new Product("2", "TV", 1.200);
        Product product3 = new Product("3", "Phone", 500.000);
        Product product4 = new Product("4", "Monitor", 350.000);
        Product product5 = new Product("5", "Mouse", 30.000);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        products.remove(product5);
        product1.setName("Teclado");
        for (Product product : products) {
            System.out.println(product.id + " - " + product.name + " - " + product.price);
        }

    }
}
