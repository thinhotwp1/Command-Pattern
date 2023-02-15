package commandpattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import commandpattern.command.Command;
import commandpattern.command.FanCommand;
import commandpattern.command.GarageDoorCommand;
import commandpattern.command.LightCommand;
import commandpattern.object.Fan;
import commandpattern.remote.RemoteControl;

/**
 *
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
        
        // Bật tắt đèn, set command = lightcommand 
        remote.setObject(0, lightCommand);
        remote.setObject(1, garageDoorCommand);
        remote.setObject(2, fanCommand);
                
        remote.buttonWasPress();
        remote.buttonWasPress();
        
        // Đóng mở cửa g tắt đèn, set command = lightcommand 
        remote.setObject(garageDoor);
        remote.buttonWasPress();
        remote.buttonWasPress();
        System.out.println("======= End =======");
    }

}
