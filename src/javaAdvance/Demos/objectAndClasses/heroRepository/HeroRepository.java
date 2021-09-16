package javaAdvance.Demos.objectAndClasses.heroRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class HeroRepository {

    private List<Hero> data;

    public HeroRepository() {
        this.data = new ArrayList<>() {
        };
    }



    public void add(Hero hero){
        this.data.add(hero);
    }
    public void remove(String name) {
        for (int i = 0; i <this.data.size() ; i++) {
            String current = this.data.get(i).getName();
            if (current.equals(name)){
                this.data.remove(i);

            }


        }
    }
    public int getCount(){
        return this.data.size();
    }
    public Hero getHeroWithHighestStrength(){
        return data.stream()
                .sorted((a,b)-> Integer.compare(b.getItem().getStrength(),a.getItem().getStrength()))
                .collect(Collectors.toList()).get(0);
    }
    public Hero getHeroWithHighestAgility(){
        return data.stream()
                .sorted((a,b)-> Integer.compare(b.getItem().getAgility(),a.getItem().getAgility()))
                .collect(Collectors.toList()).get(0);
    }
    public Hero getHeroWithHighestIntelligence(){
        return data.stream()
                .sorted((a,b)-> Integer.compare(b.getItem().getIntelligence(),a.getItem().getIntelligence()))
                .collect(Collectors.toList()).get(0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Hero heros : data) {
            sb.append(heros.toString())
                    .append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
