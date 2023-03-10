package jp.ac.uryukyu.ie.e225749;
import java.util.ArrayList;
import java.util.Scanner;

public class Command {
    ArrayList<String> commands;
    Scanner scanner;

    Command() {
        scanner = new Scanner(System.in);
        commands = new ArrayList<>();
    }

    void addCommand(String command_name) {
        commands.add(command_name);
    }

    void clearCommands() {
        commands.clear();
    }

    //promptを表示した上で，ユーザの選択を待つ
    int waitForUsersCommand(String prompt) {
        var index = 0;
        System.out.println(prompt);
        for(var command : commands) { //選択肢をprint
            System.out.println(index + ":" + command);
            index += 1;
        }

        //標準入力から数値を入力
        while(true) {
            int target_index = scanner.nextInt();

            if (target_index >= 0 && target_index < commands.size()) {
                return target_index;
            }
        }        
    }
}