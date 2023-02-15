/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.remote;

import commandpattern.command.Command;
import commandpattern.command.NoCommand;

/**
 *
 * @author ThinhLd
 */
public class RemoteControl {

    public static int soLuong = 7;
    Command[] command = new Command[soLuong];

    public RemoteControl() {
        Command noCommand = new NoCommand();
        for (int i = 0; i < soLuong; i++) {
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
    public void buttonUndoWasPress(int slot) {
        command[slot].undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n====== Remote Control Setup ======\n");
        for(int i=0;i<soLuong;i++){
            stringBuffer.append("[Slot "+i+"] "+command[i].getClass().getSimpleName()+"\n");
        }
        stringBuffer.append("====== Remote Control Setup Sucess ======\n");
       return stringBuffer.toString();       
    }
    
}
