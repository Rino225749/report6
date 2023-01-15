package jp.ac.uryukyu.ie.e225749;

class PlayerActions implements Action {
    private String name;
    private int str; //攻撃力
    private int consumption; //消費MP
 
    PlayerActions(String name, int str, int consumption) {
        this.name = name;
        this.str = str;
        this.consumption = consumption;
    }
 
    @Override
    public String name() {
        return name;
    }
 
    @Override
    public void execute(Character executer, Character target) {
        System.out.println(executer.getName() + "は" + name);
        target.pull(str); 
        executer.comsumeSt(consumption);
        System.out.println(str+"メートル近づいた!!");
    }
 }
