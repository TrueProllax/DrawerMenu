
package ru.llax.main;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import ru.llax.GUI.MainFrame;


public class MainClass {


    public static void main(String[] args) {
                try {
            UIManager.setLookAndFeel(new FlatArcDarkIJTheme());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
}
