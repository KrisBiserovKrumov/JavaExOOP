package javaAdvance.Demos.objectAndClasses.arena;


public class Gladiator {
   private String name;
   private Stat stat;
   private Weapon weapon;

    public Gladiator(String name, Stat stat, Weapon weapon) {
        this.name = name;
        this.stat = stat;
        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }

    public Stat getStat() {
        return this.stat;
    }


    public Weapon getWeapon() {
        return this.weapon;
    }

    public int getStatPower() {
        return this.getStat().getAgility() + this.getStat().getFlexibility()
                + this.getStat().getIntelligence() + this.getStat().getSkills()+ this.getStat().getStrength();
    }
    public int getWeaponPower() {
        return this.getWeapon().getSize() + this.getWeapon().getSolidity()
                + this.getWeapon().getSharpness();
    }
    public int getTotalPower(){
        return this.getStatPower() + this.getWeaponPower();
    }

    @Override
    public String toString() {
        return String.format("%s – %d%n"+
                "  Weapon Power: %d%n"+
                "  Stat Power: %d",this.name,this.getTotalPower(),this.getWeaponPower(),this.getStatPower()
        );

    }

}
