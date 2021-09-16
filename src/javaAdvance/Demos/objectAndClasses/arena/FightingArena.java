package javaAdvance.Demos.objectAndClasses.arena;


import java.util.*;
import java.util.stream.Collectors;

public class FightingArena {
    private List<Gladiator> gladiators ;
    private  String name;

    public FightingArena(String name) {
        this.gladiators = new ArrayList<>();
        this.name = name;
    }

    public void add(Gladiator gladiator){
        gladiators.add(gladiator);
    }

    public int getCount(){
       return gladiators.size();
    }
    public void remove (String name){
        for (Gladiator gladiator : this.gladiators) {
            if (gladiator.getName().equals(name)) {
                this.gladiators.remove(gladiator);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s – %d gladiators are participating.",this.name,this.gladiators.size());
    }
    public Gladiator getGladiatorWithHighestStatPower(){
        return this.gladiators.stream().sorted((f,s)->Integer.compare(s.getStatPower(),f.getStatPower())).collect(Collectors.toList()).get(0);
    }
    public Gladiator getGladiatorWithHighestWeaponPower(){
        return this.gladiators.stream().sorted((f,s) ->
                s.getWeaponPower() - f.getWeaponPower())
                .collect(Collectors.toList()).get(0);
    }
    public Gladiator getGladiatorWithHighestTotalPower(){
        return this.gladiators.stream().sorted((f,s) ->
                s.getTotalPower() - f.getTotalPower())
                .collect(Collectors.toList()).get(0);
    }


}
