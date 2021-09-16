package javaAdvance.Demos.objectAndClasses.Repository;

public class Person {
   private String name;
   private int age;
   private String birthDate;

    public Person(String name, int age, String birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s%n" +
                "Age: %d%n" +
                "Birthday: %s",this.name,this.age,this.birthDate
        );
    }
}
