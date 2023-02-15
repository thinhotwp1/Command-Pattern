/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.command;

/**
 *
 * @author ThinhLd
 */
public class NoCommand implements Command{
    // Lớp noCommand này được tạo ra để thay thế cho null command để không làm hành động gì và tránh lỗi null exception xảy ra

    @Override
    public void excuteOn() {
    }

    @Override
    public void excuteOff() {
    }

    @Override
    public void undo() {
    }

}
