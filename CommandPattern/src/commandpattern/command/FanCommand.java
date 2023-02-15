/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.command;

import commandpattern.object.Fan;
import commandpattern.object.Light;

/**
 *
 * @author Administrator
 */
public class FanCommand implements Command{
    Fan fan = new Fan();

    @Override
    public void excuteOn() {
        fan.turnOn();
    }

    @Override
    public void excuteOff() {
        fan.turnOff();
    }

}