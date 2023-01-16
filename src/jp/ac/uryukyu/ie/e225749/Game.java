package jp.ac.uryukyu.ie.e225749;
import java.util.ArrayList;
import java.util.Random;

public class Game {
   ArrayList<Character> order = new ArrayList<>();
   ArrayList<Character> enemy = new ArrayList<>();

   Game() {
       var you = new Player("あなた", 100,20,15);
       you.addAction(new Rest());
          //インスタンスのパラメータを変えることで攻撃魔法のバリエーションを作る
        you.addAction(new PlayerActions("強く引っ張る", 30, 10));
        you.addAction(new Lose());

        var dan = new Enemy("お魚さん", 40,40,10);
        var dan2 = new Enemy("でかいお魚さん", 60, 50, 20);
        var dan3 = new Enemy("巨大なお魚さん", 100,80,30);
       enemy.add(dan);
       enemy.add(dan2);
       enemy.add(dan3);
       var rand = new Random();
       int index = rand.nextInt(enemy.size());
       var selected_enemy = enemy.get(index);
        
       //アクションの順序を決める
       order.add(you);
       order.add(selected_enemy);
   }

   void showStatus() { //全キャラクタのステータスを表示
       for(var ch : order) {
           ch.showStatus();
       }
   }

   void battle() { //１ターン実行する
    
       for(var ch : order) {
           ch.act(order);
       }
   }
}
