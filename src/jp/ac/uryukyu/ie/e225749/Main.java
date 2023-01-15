package jp.ac.uryukyu.ie.e225749;
public class Main {
    public static void main(String[] args) {
        var master = new Game();
   
        for(var i=0; i<6; i++) {
             master.showStatus();
             master.battle();
         }
    } 
}
