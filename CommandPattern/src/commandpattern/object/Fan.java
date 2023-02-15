/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.object;

/**
 *
 * @author Administrator
 */
public class Fan{
    
    public boolean on = false;

    public void turnOn() {
        this.on = true;
        display();
    }

    public void turnOff() {
        this.on = false;
        display();
    }

    public void display() {
        if (on) {
            System.out.println("Fan is on");
        } else {
            System.out.println("Fan is off");
        }

    }
    
}
