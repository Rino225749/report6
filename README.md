#概要

名称：魚釣りゲーム

ルール
１：プレイヤーは魚と駆け引きをして、釣り上げたら成功、逃げられると失敗。
２：プレイヤーはスタミナがなくなると休憩しかできなくなる。
３：魚はスタミナがなくなると１ターン疲労で動けない。


各クラスの説明

Action class
Rest,EnemyActions,PlayerActions classの継承もと（ポリモーフィズム）。Actionを実行するキャラクターと、影響を受けるキャラクターを決める。

EnemyActions class
魚の行動の選択肢の設計。

PlayerActions class
プレイヤーの行動の選択肢の設計。

Command class
プレイヤーの行動の選択肢をプロンプトに表示し、決定させる。

Character class
プレイヤーと魚のステータスと、挙動を決める。

Enemy class
魚のとる挙動を決める。また、魚の取れる行動を追加する。

Player class
プレイヤーのとる挙動を決める。

Rest class
プレイヤーの行動の一つ、休憩を追加する。

Game class
ゲームの1ターンごとの進み方を決める。また、プレイヤーと魚を追加し、プレイヤーの行動の選択肢を追加する。

Main class
ゲームを開始し、終了条件を設定する。

