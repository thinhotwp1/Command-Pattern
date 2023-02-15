/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.remote;

import commandpattern.command.Command;
import commandpattern.command.NoCommand;

/**
 *
 * @author Administrator
 */
public class RemoteControl {

    public static int soLuong = 7;
    Command[] command;

    public RemoteControl() {
        Command noCommand = new NoCommand();
        for (int i = 1; i <= soLuong; i++) {
            command[i] = noCommand;
        }
    }

    public void setObject(int slot, Command command) {
        this.command[slot] = command;
    }

    public void buttonOnWasPress(int slot) {
        command[slot].excuteOn();
    }

    public void buttonOffWasPress(int slot) {
        command[slot].excuteOff();
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("====== Remote Control =======");
        for(int i=1;i<=n;i++){
            stringBuffer.append("[slot "+i+"] "+command[i].getClass().getName()+"\n");
        }
       return stringBuffer.toString();       
    }
    
}
