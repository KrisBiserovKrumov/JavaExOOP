package inheritance.animals;

public class Kitten  extends Cat{
    public static final String  GENDER = "Female";

    public Kitten(String name, int age) {
        super(name, age,GENDER);
    }
    public String produceSound(){
        return "Meow";
    }
}