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
public class Failcount {
    private int failcount = 0;

    public void Fail5(int number) {
        if(number != 3){
            return;
        }
        failcount++;
        JOptionPane.showMessageDialog(null, failcount + "번 틀렸습니다. 5번 이상 틀릴시 강제 종료됩니다.", "경고", JOptionPane.INFORMATION_MESSAGE);
        if(failcount >= 5){
            JOptionPane.showMessageDialog(null, "5번 틀렸습니다. 시스템을 종료합니다.", "경고", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}

