/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.command;

import commandpattern.object.Light;

/**
 * @author ThinhLd
 */
public class LightCommand implements Command {

    Light light = new Light();

    @Override
    public void excuteOn() {
        light.turnOn();
    }

    @Override
    public void excuteOff() {
        light.turnOff();
    }

    @Override
    public void undo() {
        if (light.on) {
            light.turnOff();
        } else {
            light.turnOn();
        }
    }

}
