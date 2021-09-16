package javaAdvance.spaceStationRecruitment;

import java.util.ArrayList;
import java.util.List;

public class SpaceStation {

    private String name;
    private int capacity;
    private List<Astronaut>data ;

    public SpaceStation(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getCount(){
        return data.size();
    }
    public void add(Astronaut astronaut){
        if (this.getCapacity() != 0){
            this.data.add(astronaut);
            this.capacity -= 1;
        }
    }
    public boolean remove(String name){
        boolean isExist = false;
        for (int i = 0; i < this.data.size() ; i++) {
            String currentAustonaut = this.data.get(i).getName();
            if (currentAustonaut.equals(name)){
                isExist = true;
                this.data.remove(i);
                break;
            }
        }
        return isExist;
    }
    public Astronaut getOldestAstronaut(){
        Astronaut winner = null;
        int age = 0;
        for (Astronaut austonauts : data) {
            if (austonauts.getAge() > age){
                age = austonauts.getAge();
                winner = austonauts;
            }
        }
        return winner;
    }
    public Astronaut getAstronaut(String name){
        Astronaut current = null;
        for (Astronaut datum : data) {
            if (datum.getName().equals(name)){
                current = datum;
            }
        }
        return current;
    }
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Astronauts working at Space Station %s:",this.name));
        sb.append(System.lineSeparator());
        for (Astronaut austonauts : data) {
            sb.append(austonauts.toString()).append(System.lineSeparator());

        }


        return sb.toString().trim();
    }

}
