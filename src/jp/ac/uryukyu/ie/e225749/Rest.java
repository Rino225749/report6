package jp.ac.uryukyu.ie.e225749;

class Rest implements Action {
    @Override
    public String name() {
        return "竿を緩める"; //このアクションの名称（ユーザーに提示される）
    }
 
    @Override
    /**
     * 実際に実行されるアクションの処理
     * @param executer アクションを実行するキャラクター
     * @param target アクションの実行対象（攻撃対象)が入っている
     */

    public void execute(Character executer, Character target) {
        target.recover(executer.getAttack());
        System.out.println(executer.getName() + "は竿を緩めた");
        System.out.println(executer.getName() + "はStaminaが30回復した。");
     }
     
 }
