/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BASE;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author VestigiumSenex
 */
public class JTextFieldDecimal extends JTextField {
    
    @Override
    public void processKeyEvent(KeyEvent ev) {
       if(this.getText().contains(".")){     
           
            if (Character.isDigit(ev.getKeyChar()) || ev.getKeyChar() == (char)KeyEvent.VK_BACK_SPACE) {
                super.processKeyEvent(ev);
            }
       }
       else{
                      
            if (Character.isDigit(ev.getKeyChar()) || ev.getKeyChar() == '.' || ev.getKeyChar()== (char)KeyEvent.VK_BACK_SPACE) {
                super.processKeyEvent(ev);
            }
       }
       
      ev.consume();
       
    }
}
    
