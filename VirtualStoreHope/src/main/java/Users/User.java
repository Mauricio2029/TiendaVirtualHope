package Users;

public class User {
    //Creamos atributos, encapsulamos con el modificador Private
    private int id;
   private String name;
    private String lastname;
    private String phone;
    private String email;
    private String password;
    //contructor de la clase, contructor vacio

    public User(){
    }
    //Get and Setter

    public int getid(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }



}
