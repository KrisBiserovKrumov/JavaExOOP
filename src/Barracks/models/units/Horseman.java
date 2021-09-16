package Barracks.models.units;

public class Horseman extends AbstractUnit{
    private static final int GORSEMAN_HEALTH = 50;
    private static final int GORSEMAN_DAMAGE = 10;

    protected Horseman() {

        super(Horseman.GORSEMAN_HEALTH, Horseman.GORSEMAN_DAMAGE);
    }
}
