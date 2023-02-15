package commandpattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import commandpattern.command.*;
import commandpattern.object.Fan;
import commandpattern.remote.RemoteControl;

import java.sql.SQLOutput;

/**
 * @author ThinhLd
 */

/* Dùng để đóng gói các yêu cầu vào một đối tượng và gửi đến một đối tượng khác để thực hiện. */
public class CommandPattern {

    public static void main(String[] args) {
        System.out.println("=======Command Pattern=======");

        // Khai báo remote và các command 
        RemoteControl remote = new RemoteControl();
        Command lightCommand = new LightCommand();
        Command garageDoorCommand = new GarageDoorCommand();
        Command fanCommand = new FanCommand();
        Command[] commands = {lightCommand, fanCommand};
        Command macroCommand = new MacroCommand(commands);


        remote.setObject(0, lightCommand);
        remote.setObject(1, garageDoorCommand);
        remote.setObject(2, fanCommand);
        remote.setObject(3, macroCommand);

        // Gán các chức năng vào các slot trong remote
        System.out.println(remote);

        // Bật tắt đèn, set command = lightcommand
        remote.buttonOnWasPress(0);
        remote.buttonOffWasPress(0);

        // Đóng mở cửa gara, set command = garageDoorCommand
        remote.buttonOnWasPress(1);
        remote.buttonOffWasPress(1);
        remote.buttonUndoWasPress(1);

        // Bật tắt quạt, set command = fanCommand
        remote.buttonOnWasPress(2);
        remote.buttonUndoWasPress(2);
        remote.buttonOnWasPress(2);

        // Cuối cùng, gán 1 nút bật hoặc tắt thì 1 chuỗi các hành động sẽ làm: ví dụ bật button thì đèn và quạt đều bật cùng lúc
        System.out.println("\n===== Button Party ====");
        remote.buttonOnWasPress(3);

        System.out.println("======= End =======");
    }

}
