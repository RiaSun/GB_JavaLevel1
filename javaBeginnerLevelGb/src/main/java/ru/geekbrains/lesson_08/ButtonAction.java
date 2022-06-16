package ru.geekbrains.lesson_08;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {
//        класс устанавливает, действия возможные с кнопкой

    private JButton button;

    public ButtonAction(JButton button) {
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        метод определяет, что будет, если нажать на кнопку; если нажать на кнопку, изменится текст на ней
        button.setText("I have been pressed");

    }


}
