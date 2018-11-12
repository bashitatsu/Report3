package jp.ac.uryukyu.ie.e185714;


public class Enemy extends LivingThing {

    public Enemy (String name, int maximumHP, int attack, int exp) {
        super(name, maximumHP, attack, exp);
    }

    //@override
    public void wounded(int damage) {
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}
