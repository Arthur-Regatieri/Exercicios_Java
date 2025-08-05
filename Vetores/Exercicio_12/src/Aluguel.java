public class Aluguel {
    private String name;
    private String email;
    private int room;

    public Aluguel(String name, String email, int room){
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public String toString(){
        return room + ": " + name + ", " + email;
    }
}
