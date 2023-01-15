package jp.ac.uryukyu.ie.e225749;

import java.util.ArrayList;
import java.util.Random;
//import java.util.function.Consumer;

public class Enemy extends Character {
    public static String actionValue;

    Enemy(String name, int hp, int stamina, int str) {
        super(name, hp, stamina, str);
    }

    @Override
    void showStatus() {
        System.out.printf("%s:Stamina %d\n", name, stamina);
    }

    @Override
    void act(ArrayList<Character> targets) {

        addAction(new EnemyActions("必死に泳いだ", 15, 10));
        addAction(new EnemyActions("超必死に泳いだ", 25, 20));
        addAction(new EnemyActions("疲れている", 0, -30));

        if (stamina > 0){
            var rand = new Random();
            int index = rand.nextInt(actions.size()); //ランダムに選択されたインデクス
            var selected_action = actions.get(index);
            selected_action.execute(this, targets.get(0));
        }else{
            var selected_action = actions.get(2);
            selected_action.execute(this, targets.get(0));
        }
    }
 }
