/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.command;

import commandpattern.object.GarageDoor;

/**
 * @author ThinhLd
 */
public class GarageDoorCommand implements Command {

    GarageDoor garaDoor = new GarageDoor();

    @Override
    public void excuteOn() {
        garaDoor.up();
    }

    @Override
    public void excuteOff() {
        garaDoor.down();
    }

    @Override
    public void undo() {
        if (garaDoor.up) {
            garaDoor.down();
        } else {
            garaDoor.up();
        }
    }
}
