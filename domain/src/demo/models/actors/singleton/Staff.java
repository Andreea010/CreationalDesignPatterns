package demo.models.actors.singleton;

public class Staff {

    private static Staff INSTANCE;
    private String name = "Dan";
    private String surname = "Moraru";

    public static Staff getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Staff();
        }

        return INSTANCE;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }
}
