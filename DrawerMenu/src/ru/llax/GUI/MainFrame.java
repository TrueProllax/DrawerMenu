
package ru.llax.GUI;

import java.awt.Color;
import java.awt.Font;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import ru.llax.swing.header;


public class MainFrame extends javax.swing.JFrame {
    
        DrawerController drawer;


    public MainFrame() {
        initComponents();
        
        drawer = Drawer.newDrawer(this)
        .background(new Color(49, 46, 114))
        .drawerBackground(Color.WHITE)
        .enableScroll(true)
        .header(new header())
        
        .separator(4, new Color(153, 153, 255))
        .addChild(new DrawerItem("Home")
                .icon(new ImageIcon(getClass().getResource("/ru/llax/res/home.png")))
                .font(new Font("Yu Gothic UI", 0, 14))
                .build())
        .addChild(new DrawerItem("Count").icon(new ImageIcon(getClass().getResource("/ru/llax/res/count.png")))
                .font(new Font("Yu Gothic UI", 0, 14))
                .build())

        .addFooter(new DrawerItem("Exit").icon(new ImageIcon(getClass().getResource("/ru/llax/res/exit.png")))
                .font(new Font("Yu Gothic UI", 0, 14))
                .build())

        .event(new EventDrawer() {
            @Override
            public void selected(int index, DrawerItem item) {
                if (drawer.isShow()) {
                    drawer.hide();
                }
                //  More code here
            }
        })
        .build();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        button.setText("+");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button)
                .addContainerGap(661, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button)
                .addContainerGap(463, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        boolean cont = drawer.isShow();
        
        if (cont == true) {
            drawer.hide();
            button.setText("-");
        } else {
            drawer.show();
            button.setText("+");
        }
    }//GEN-LAST:event_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
}
