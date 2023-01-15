package jp.ac.uryukyu.ie.e225749;
import java.util.ArrayList;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int stamina;
    private int str;
    String getName(){return name;}
    int getHp(){return hp;}
    int getSt(){return stamina;}
    int getAttack(){return str;}
    ArrayList<Action> actions = new ArrayList<>();
 
    Character(String name, int hp, int stamina, int str) {
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.str = str;
    }

    void addAction(Action action) {
        actions.add(action);
    }
    void showStatus() {
        if(stamina<=0){
            stamina=0;
        }
        System.out.printf("%s:距離 %d  Stamina %d\n", name, hp, stamina);
    }
    void pull(int damage) {
        hp -= damage;
     }
     void comsumeSt(int comsumemp) {
        stamina -= comsumemp;
     }
     void recover(int recoverd){
        stamina += recoverd;
     }
     void kyoriRecover(int kyorirecover){
        hp += kyorirecover;
     }

    //影響を与える可能性のあるオブジェクトの参照を引数として受け取る
    abstract void act(ArrayList<Character> targets); //サブクラスで定義する
}