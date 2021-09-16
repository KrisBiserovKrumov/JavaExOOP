package inheritance.animals;

public class Tomcat extends Cat {

    public static final String  GENDER = "Male";

    public Tomcat(String name, int age) {
        super(name, age,GENDER);
    }
    public String produceSound(){
        return "MEOW";
    }
}
