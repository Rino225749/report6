package jp.ac.uryukyu.ie.e225749;

import java.util.ArrayList;

public class Game {
   ArrayList<Character> order = new ArrayList<>();

   Game() {
       var you = new Player("あなた", 100,20,20);
       you.addAction(new Rest());
          //インスタンスのパラメータを変えることで攻撃魔法のバリエーションを作る
        you.addAction(new PlayerActions("強く引っ張る", 20, 10));

       var dan = new Enemy("お魚さん", 40,40,10);

       //アクションの順序を決める
       order.add(you);
       order.add(dan);
   }

   void showStatus() { //全キャラクタのステータスを表示（テスト用）
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
