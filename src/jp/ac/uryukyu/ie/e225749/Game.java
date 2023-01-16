package jp.ac.uryukyu.ie.e225749;
import java.util.ArrayList;
import java.util.Random;

public class Game {
   ArrayList<Character> order = new ArrayList<>();
   ArrayList<Character> enemy = new ArrayList<>();

   Game() {
        var randKyori = new Random();
        int kyoriIndex = randKyori.nextInt(100)+100;
       var you = new Player("あなた", kyoriIndex,100,15);
       you.addAction(new Rest());
        you.addAction(new PlayerActions("引っ張る", 30, 10));
        you.addAction(new PlayerActions("強く引っ張る",50,20));
        you.addAction(new Lose());

       enemy.add(new Enemy("お魚さん", 40,40,10));
       enemy.add(new Enemy("でかいお魚さん", 60, 50, 20));
       enemy.add(new Enemy("巨大なお魚さん", 100,80,30));
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
