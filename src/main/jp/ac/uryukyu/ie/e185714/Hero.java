package jp.ac.uryukyu.ie.e185714;


public class Hero extends LivingThing {

    public Hero (String name, int maximumHP, int attack, int exp) {
        super(name, maximumHP, attack, exp);
    }

    //@override
    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}
