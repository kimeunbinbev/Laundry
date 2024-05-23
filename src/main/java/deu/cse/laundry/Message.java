/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.laundry;

import javax.swing.JOptionPane;

/**
 *
 * @author hesed
 */
public class Message {
    
    public void printMessage(int number) {
        switch (number) {
            case 1:
                JOptionPane.showMessageDialog(null, "관리자님, 오신 것을 환영합니다.", "안내", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "세탁방에 오신 것을 환영합니다.", "안내", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                break;
        }
    }
}

