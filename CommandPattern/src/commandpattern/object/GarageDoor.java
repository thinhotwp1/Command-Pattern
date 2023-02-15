/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.object;

/**
 *
 * @author Administrator
 */
public class GarageDoor {
    
    public boolean up = false;

    public void up() {
        this.up = true;
        display();
    }

    public void down() {
        this.up = false;
        display();
    }

    public void display() {
        if (up) {
            System.out.println("Open the door");
        } else {
            System.out.println("Close the door");
        }

    }
    
}
