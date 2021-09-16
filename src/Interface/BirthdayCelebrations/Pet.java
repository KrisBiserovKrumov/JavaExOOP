package Interface.BirthdayCelebrations;

public class Pet implements Birthable,Nameble{
    private String name;
    private String birthdate;

    public Pet(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }


    @Override
    public String getBirthDate() {
        return this.birthdate;
    }


    @Override
    public String getName() {
        return this.name;
    }
}
