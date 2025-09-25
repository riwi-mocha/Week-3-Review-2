public class User implements Storable {
    String id;
    String name;

    public User(String id,String name){
    this.id= id;
    this.name= name;
    }

    @Override
    public String key() {   
        return id;
    }
}
