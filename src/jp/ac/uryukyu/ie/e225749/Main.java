package jp.ac.uryukyu.ie.e225749;
public class Main {
    public static void main(String[] args) {
        var master = new Game();
   
        int n = 1;
        while(n<5) {
             master.showStatus();
             master.battle();
         }
    } 
}
