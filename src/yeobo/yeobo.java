/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package yeobo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.sound.sampled.*;
import java.io.*;

public class yeobo extends javax.swing.JFrame {
    static yeobo Yeobo = new yeobo();
    Timer time;
    int y = 0;

    public yeobo() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cover = new javax.swing.JPanel();
        click = new javax.swing.JLabel();
        Letter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Cover.setMinimumSize(new java.awt.Dimension(419, 553));
        Cover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CoverMouseClicked(evt);
            }
        });

        click.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        click.setText("CLICK THIS PANEL --> ");

        javax.swing.GroupLayout CoverLayout = new javax.swing.GroupLayout(Cover);
        Cover.setLayout(CoverLayout);
        CoverLayout.setHorizontalGroup(
            CoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(click)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        CoverLayout.setVerticalGroup(
            CoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoverLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(click, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        getContentPane().add(Cover);
        Cover.setBounds(0, 0, 420, 580);

        Letter.setOpaque(false);

        jLabel1.setText("<html> Hello shaiii, almost a month pa lang nung magkita tayo ulit — unexpected ng mga nangyari talaga kasi akalain mo sa tagal ng panahon at sa mga taong nakakasalubong ko nagkita tayo ulit, it's so unpredictable talaga ng mga yayari — akala ko noon na after graduation wala na talaga akong makakasama na kaibigan ko like diba may mga sari-sarili na tayong pangarap at hindi na rin talaga magkakaroon ng connection since hindi ko naman talaga ganoon ka close ka but it is so so so like i'm day dreaming — sa tagal ng panahon na may hindi ako nasabi eto pala yung time na magkikita tayo ulit tapos masasabi ko na yung unsaid feelings ko noon sa'yo, i'm looking forward na makilala ka pa and i'm waiting for the right time na makasama ka. For now masaya ako na magkaibigan tayong dalawa at nasasabi natin yung mga problem natin sa bawat araw na dumaraan and i know na hindi naman sa lahat ng oras ay kaya nating alalayan yung isa't isa but i'm looking forward sa ating dalawa na kapag nangangailangan yung isa sa atin dapat ay magtulungan tayo. Palagi kang mag-iingat sa araw araw at lagi mong isipin na magpahinga sa araw na hindi mo na kaya, it's okay na ma feel mo ang kalungkutan pero wag mo kakalimutan na mag vent kapag hindi mo na kaya—Goodluck palagi shai! Aim high and pursue your dream^^. </html>");

        jLabel2.setText("Oct 23, 2024");

        jLabel3.setFont(new java.awt.Font("Rage Italic", 0, 18)); // NOI18N
        jLabel3.setText("Andrei pogi ");

        jLabel4.setText("Sincerely.");

        jLabel5.setText("Cute mong kaibigan");

        jLabel6.setText("Dear Ms. Aguado, ");

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jLabel8.setText("CLICK ME ^^");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LetterLayout = new javax.swing.GroupLayout(Letter);
        Letter.setLayout(LetterLayout);
        LetterLayout.setHorizontalGroup(
            LetterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LetterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(LetterLayout.createSequentialGroup()
                .addGroup(LetterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LetterLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(LetterLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6))
                    .addGroup(LetterLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4))
                    .addGroup(LetterLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel3))
                    .addGroup(LetterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(200, 200, 200)
                        .addComponent(jLabel5)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        LetterLayout.setVerticalGroup(
            LetterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetterLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addGroup(LetterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(Letter);
        Letter.setBounds(0, 0, 431, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoverMouseClicked
        click.setVisible(false);
        time = new Timer(10, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(y < 1000){
                    y++;
                    Cover.setLocation(Cover.getX(), y);
                }
            }
        });
        time.start();
    }//GEN-LAST:event_CoverMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
      String getMessage = JOptionPane.showInputDialog(this, "How's your day?","FIGHTING CHINGU",JOptionPane.PLAIN_MESSAGE);
      
      if(!getMessage.isEmpty()){
          JOptionPane.showMessageDialog(this, "Fighting Shaii!!");
      }else{
          JOptionPane.showMessageDialog(this, "MAG INPUTT KA PLEASE");
      }
    }//GEN-LAST:event_jLabel8MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Yeobo.setSize(435, 620);
             
                Yeobo.setLocationRelativeTo(null);
                Yeobo.setResizable(false);
                Yeobo.setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cover;
    private javax.swing.JPanel Letter;
    private javax.swing.JLabel click;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
