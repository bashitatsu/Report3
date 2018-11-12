package jp.ac.uryukyu.ie.e185714;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    private int exp;


    public LivingThing (String name, int maximumHP, int attack, int exp) {
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        this.exp = exp;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    //name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //hitPoint
    public int getHitPoint(){
        return hitPoint;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    //attack
    public int getAttack(){
        return attack;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    //exp
    public int getExp(){
        return exp;
    }

    public void setExp(int exp){
        this.exp = exp;
    }

    //dead
    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead){
        this.dead = dead;
    }

    public void attack(LivingThing opponent){
        if ( !isDead() ) {
            int damage = (int) (Math.random() * attack);
            if ( damage == (attack - 1) ){
                System.out.printf("%sの攻撃がクリティカルヒット！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            }else{
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            }
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
