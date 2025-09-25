import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<String, User> users = new HashMap();
        User user1= new User("123", "Adrian");
        User user2 = new User("456", "Alesis");
        User user3 = new User("789", "Peepe");
        users.put(user1.key(),user1);
        users.put(user2.key(), user2);
        users.put(user3.key(), user3);

        System.out.println("Id: "+users.get(user1.key()).id+" Nombre: "+users.get(user1.key()).name);
        users.get(user2.key()).name = "Adrian Arboleda";
        System.out.println("Id: " + users.get(user2.key()).id + " Nombre: " + users.get(user2.key()).name);
        users.remove(user3.key());
        users.forEach((key, value)-> System.out.println("Id: " + value.id + " Nombre: " + value.name));
    }
}
