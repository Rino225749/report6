package jp.ac.uryukyu.ie.e225749;
import java.util.ArrayList;

public class Player extends Character {
    Player(String name, int kyori, int stamina, int str) {
        super(name, kyori, stamina, str);
    }
 
    @Override
    void act(ArrayList<Character> targets) {
        var command_selector = new Command();
        
       //選択肢を用意する
        for(var action: actions) {
            command_selector.addCommand(action.name());
        }
       //ユーザの選択を待つ
        var command_number = command_selector.waitForUsersCommand("コマンド？");


        actions.get(command_number).execute(this, targets.get(0));
    }
 
}
