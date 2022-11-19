/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sayma.uyari;

/**
 *
 * @author Kerem
 */
public class saymaGUI extends javax.swing.JFrame {

    /**
     * Creates new form saymaGUI
     */
    public saymaGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numberAddLbl = new javax.swing.JLabel();
        numberAddTxt = new javax.swing.JTextField();
        forwardBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        numberLbl1 = new javax.swing.JLabel();
        numberTxt1 = new javax.swing.JTextField();
        welcomeLbl = new javax.swing.JLabel();
        flagLbl = new javax.swing.JLabel();
        incNumberTxt1 = new javax.swing.JTextField();
        incNumberLbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numberAddLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        numberAddLbl.setText("Artış ve Azalış Miktarını Giriniz");

        numberAddTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        numberAddTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        forwardBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        forwardBtn.setText("İLERİ");
        forwardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        backBtn.setText("GERİ");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        numberLbl1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        numberLbl1.setText("Sayımız");

        numberTxt1.setEditable(false);
        numberTxt1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        numberTxt1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        welcomeLbl.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        welcomeLbl.setText("SAYILARIN ARTIŞ VE AZALIŞ MİKTARINI ÖĞRETEN PROGRAMIMIZA HOŞGELDİNİZ");

        flagLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flagLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/280318.jpg"))); // NOI18N

        incNumberTxt1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        incNumberTxt1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        incNumberLbl2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        incNumberLbl2.setText("Sayı Giriniz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(flagLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(numberLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numberTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numberAddLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numberAddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(incNumberLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(welcomeLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(182, 182, 182)
                                .addComponent(forwardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(71, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(272, 272, 272)
                    .addComponent(incNumberTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(299, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(flagLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(welcomeLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberAddLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberAddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(incNumberLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forwardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(325, Short.MAX_VALUE)
                    .addComponent(incNumberTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(189, 189, 189)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void forwardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardBtnActionPerformed

        sayac1++;

        if (incNumberTxt1.getText().equals("") || numberAddTxt.getText().equals("")) {
            uyari.uyari("bosluk");
        } else {
               sayi1 = Integer.parseInt(incNumberTxt1.getText());
                 sayi2 = Integer.parseInt(numberAddTxt.getText());
            if (sayac1 == 1&&numberTxt1.getText().equals("")) {
                numberTxt1.setText(incNumberTxt1.getText());
                //incNumberTxt1.setText(Integer.toString(toplam));
            }
              
            if (sayac1 > 1) {
               if(numberTxt1.getText().equals("")){
                    numberTxt1.setText(incNumberTxt1.getText());
               }else{
                forwardBtn.addActionListener(new ActionListener() {
                    

                    @Override
                    public void actionPerformed(ActionEvent e) {
                      answer = (sayi1) + (sayi2);
                        incNumberTxt1.setText(Integer.toString(answer));
                    }

                });
            }
            }
        }
    }//GEN-LAST:event_forwardBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        sayac2++;
        if (incNumberTxt1.getText().equals("") || numberAddTxt.getText().equals("")) {
            uyari.uyari("bosluk");
        } else {
             sayi1 = Integer.parseInt(incNumberTxt1.getText());
             sayi2 = Integer.parseInt(numberAddTxt.getText());
           
            if (sayac2 == 1&&numberTxt1.getText().equals("")) {
               numberTxt1.setText(incNumberTxt1.getText());
            }
            if (sayac2 > 1) {
                 if(numberTxt1.getText().equals("")){
                    numberTxt1.setText(incNumberTxt1.getText());
               }else{
                backBtn.addActionListener(new ActionListener() {
                     
                    @Override
                    public void actionPerformed(ActionEvent e) {
                      answer = (sayi1) - (sayi2);
                        incNumberTxt1.setText(Integer.toString(answer));
                    }
                });
            }
            }
        }

    }//GEN-LAST:event_backBtnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(saymaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(saymaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(saymaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(saymaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new saymaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel flagLbl;
    private javax.swing.JButton forwardBtn;
    private javax.swing.JLabel incNumberLbl2;
    private javax.swing.JTextField incNumberTxt1;
    private javax.swing.JLabel numberAddLbl;
    private javax.swing.JTextField numberAddTxt;
    private javax.swing.JLabel numberLbl1;
    private javax.swing.JTextField numberTxt1;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
private int answer = 0;
private int sayi1,sayi2;
    private int sayac1 ;
    private int sayac2 ;
}
