/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package commandpattern.command;

/**
 *
 * @author ThinhLd
 */
public interface Command {
    public void excuteOn();
    public void excuteOff();
    public void undo();
}
