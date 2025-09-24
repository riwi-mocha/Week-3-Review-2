package Activity5;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("P001", "Laptop", 999.99));
        products.add(new Product("P002", "Smartphone", 499.49));
        products.add(new Product("P003", "Tablet", 299.29));
        products.add(new Product("P004", "Monitor", 199.19));
        products.add(new Product("P005", "Keyboard", 49.99));

        String removedItem = products.remove(2).getName();
        System.out.println("Removed Item: " + removedItem);

        int index = 1;
        String newName = "Smartphone Pro";
        products.get(index).setName(newName);
        System.out.println("Updated Item at index " + index + ": " + products.get(index).getName());

        System.out.println("Product List:");
        for (Product product : products) {
            System.out.println(product.getId() + " - " + product.getName() + " - $" + product.getPrice());
        }
    }
}
