package jp.ac.uryukyu.ie.e225749;
import java.util.ArrayList;

public class Player extends Character {
    Player(String name, int hp, int stamina, int str) {
        super(name, hp, stamina, str);
    }

    @Override
    void act(ArrayList<Character> targets) {
        var command_selector = new Command();
        if(hp<=0){
            hp = 0;
            System.out.println("魚を捕まえました！");
            System.out.println("ゲームクリア");
            System.exit(0);
        }
        if(hp>=500){
            System.out.println(name + "は魚を逃した。");
            System.out.println("ゲームオーバー");
            System.exit(0);
        }
 
       //選択肢を用意する
        for(var action: actions) {
            command_selector.addCommand(action.name());
        }
       //ユーザの選択を待つ
       if(stamina>0){
        var command_number = command_selector.waitForUsersCommand("コマンド？");
        actions.get(command_number).execute(this, targets.get(0));
       }else{
        actions.get(2).execute(this, targets.get(0));
       }
       if(stamina >= 100){
        stamina = 100;
    }

    }
 
}
