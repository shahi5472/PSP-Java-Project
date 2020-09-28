
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Calculator extends javax.swing.JFrame {

    private double firstnum;
    private double secondnum;
    private double result;
    private String oparetors;
    private JFrame frame;
    
    public Calculator() {
        initComponents();
        setIcon();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        JiroButton = new javax.swing.JButton();
        OneButton = new javax.swing.JButton();
        TwoButton = new javax.swing.JButton();
        ThreeButton = new javax.swing.JButton();
        SevenButton = new javax.swing.JButton();
        EightButton = new javax.swing.JButton();
        NineButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        PointButton = new javax.swing.JButton();
        FourButton = new javax.swing.JButton();
        FiveButton = new javax.swing.JButton();
        MainajButton = new javax.swing.JButton();
        GunButton = new javax.swing.JButton();
        BagButton = new javax.swing.JButton();
        OneDeleteButton = new javax.swing.JButton();
        PlusButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        SixButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        JiroButton.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        JiroButton.setForeground(new java.awt.Color(240, 240, 240));
        JiroButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0.png"))); // NOI18N
        JiroButton.setText("0");
        JiroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JiroButtonActionPerformed(evt);
            }
        });

        OneButton.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        OneButton.setForeground(new java.awt.Color(240, 240, 240));
        OneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        OneButton.setText("1");
        OneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneButtonActionPerformed(evt);
            }
        });

        TwoButton.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        TwoButton.setForeground(new java.awt.Color(240, 240, 240));
        TwoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.png"))); // NOI18N
        TwoButton.setText("2");
        TwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoButtonActionPerformed(evt);
            }
        });

        ThreeButton.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        ThreeButton.setForeground(new java.awt.Color(240, 240, 240));
        ThreeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.png"))); // NOI18N
        ThreeButton.setText("3");
        ThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeButtonActionPerformed(evt);
            }
        });

        SevenButton.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        SevenButton.setForeground(new java.awt.Color(240, 240, 240));
        SevenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7.png"))); // NOI18N
        SevenButton.setText("7");
        SevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenButtonActionPerformed(evt);
            }
        });

        EightButton.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        EightButton.setForeground(new java.awt.Color(240, 240, 240));
        EightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8.png"))); // NOI18N
        EightButton.setText("8");
        EightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightButtonActionPerformed(evt);
            }
        });

        NineButton.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        NineButton.setForeground(new java.awt.Color(240, 240, 240));
        NineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/9.png"))); // NOI18N
        NineButton.setText("9");
        NineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineButtonActionPerformed(evt);
            }
        });

        equalsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equals.png"))); // NOI18N
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });

        PointButton.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        PointButton.setForeground(new java.awt.Color(240, 240, 240));
        PointButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/..png"))); // NOI18N
        PointButton.setText(".");
        PointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointButtonActionPerformed(evt);
            }
        });

        FourButton.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        FourButton.setForeground(new java.awt.Color(240, 240, 240));
        FourButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.png"))); // NOI18N
        FourButton.setText("4");
        FourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourButtonActionPerformed(evt);
            }
        });

        FiveButton.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        FiveButton.setForeground(new java.awt.Color(240, 240, 240));
        FiveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.png"))); // NOI18N
        FiveButton.setText("5");
        FiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveButtonActionPerformed(evt);
            }
        });

        MainajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sub.png"))); // NOI18N
        MainajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainajButtonActionPerformed(evt);
            }
        });

        GunButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multiplication.png"))); // NOI18N
        GunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GunButtonActionPerformed(evt);
            }
        });

        BagButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/divided.png"))); // NOI18N
        BagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagButtonActionPerformed(evt);
            }
        });

        OneDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow-.png"))); // NOI18N
        OneDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneDeleteButtonActionPerformed(evt);
            }
        });

        PlusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/+.png"))); // NOI18N
        PlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusButtonActionPerformed(evt);
            }
        });

        ClearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c.png"))); // NOI18N
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/+-.png"))); // NOI18N
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        SixButton.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        SixButton.setForeground(new java.awt.Color(240, 240, 240));
        SixButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6.png"))); // NOI18N
        SixButton.setText("6");
        SixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Californian FB", 1, 36)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JiroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OneDeleteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SevenButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FourButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PointButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FiveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TwoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ThreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PlusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(NineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BagButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SixButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MainajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(equalsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OneDeleteButton)
                            .addComponent(ClearButton)
                            .addComponent(jButton31)
                            .addComponent(BagButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NineButton)
                            .addComponent(GunButton)
                            .addComponent(EightButton)
                            .addComponent(SevenButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FourButton)
                            .addComponent(FiveButton)
                            .addComponent(MainajButton)
                            .addComponent(SixButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PlusButton)
                                .addComponent(TwoButton, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(OneButton)))
                    .addComponent(ThreeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JiroButton)
                        .addComponent(PointButton))
                    .addComponent(equalsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OneDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneDeleteButtonActionPerformed
        String backspace = null;
        
        if(jTextField2.getText().length()>0)
        {
            StringBuilder strb = new StringBuilder(jTextField2.getText());
            strb.deleteCharAt(jTextField2.getText().length()-1);
            backspace = strb.toString();
            jTextField2.setText(backspace);
            
        }
    }//GEN-LAST:event_OneDeleteButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        jTextField2.setText(null);
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void PlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusButtonActionPerformed
        firstnum = Double.parseDouble(jTextField2.getText());
        jTextField2.setText("");
        oparetors = "+";
    }//GEN-LAST:event_PlusButtonActionPerformed

    private void MainajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainajButtonActionPerformed
        firstnum = Double.parseDouble(jTextField2.getText());
        jTextField2.setText("");
        oparetors = "-";
    }//GEN-LAST:event_MainajButtonActionPerformed

    private void GunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GunButtonActionPerformed
        firstnum = Double.parseDouble(jTextField2.getText());
        jTextField2.setText("");
        oparetors = "*";
    }//GEN-LAST:event_GunButtonActionPerformed

    private void BagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagButtonActionPerformed
        firstnum = Double.parseDouble(jTextField2.getText());
        jTextField2.setText("");
        oparetors = "/";
    }//GEN-LAST:event_BagButtonActionPerformed

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed
        
        secondnum = Double.parseDouble(jTextField2.getText());
       
        if(oparetors == "+")
        {
            result = firstnum + secondnum;
        }
        else if(oparetors == "-")
        {
            result = firstnum - secondnum;
        }
        else if(oparetors == "*")
        {
            result = firstnum * secondnum;
        }
        else if (oparetors == "/") 
        {
            result = firstnum/secondnum;
        }
        
        if ((result == Math.floor(result )) && !Double.isInfinite(result )) 
        {
            jTextField2.setText((int)(result) + " ");
        } 
        else 
            jTextField2.setText(result + " ");
    }//GEN-LAST:event_equalsButtonActionPerformed

    private void PointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointButtonActionPerformed
        String EnterNumber = jTextField2.getText()+PointButton.getText();
       jTextField2.setText(EnterNumber);
    }//GEN-LAST:event_PointButtonActionPerformed

    private void JiroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JiroButtonActionPerformed
        String EnterNumber = jTextField2.getText()+JiroButton.getText();
       jTextField2.setText(EnterNumber);
    }//GEN-LAST:event_JiroButtonActionPerformed

    private void OneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneButtonActionPerformed
       String EnterNumber = jTextField2.getText()+OneButton.getText();
       jTextField2.setText(EnterNumber);
    }//GEN-LAST:event_OneButtonActionPerformed

    private void TwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoButtonActionPerformed
       String EnterNumber = jTextField2.getText()+TwoButton.getText();
       jTextField2.setText(EnterNumber);
    }//GEN-LAST:event_TwoButtonActionPerformed

    private void ThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeButtonActionPerformed
        String EnterNumber = jTextField2.getText()+ThreeButton.getText();
       jTextField2.setText(EnterNumber);
    }//GEN-LAST:event_ThreeButtonActionPerformed

    private void FourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourButtonActionPerformed
        String EnterNumber = jTextField2.getText()+FourButton.getText();
       jTextField2.setText(EnterNumber);
    }//GEN-LAST:event_FourButtonActionPerformed

    private void FiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveButtonActionPerformed
        String EnterNumber = jTextField2.getText()+FiveButton.getText();
       jTextField2.setText(EnterNumber);
    }//GEN-LAST:event_FiveButtonActionPerformed

    private void SixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixButtonActionPerformed
        String EnterNumber = jTextField2.getText()+SixButton.getText();
       jTextField2.setText(EnterNumber);
    }//GEN-LAST:event_SixButtonActionPerformed

    private void SevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenButtonActionPerformed
        String EnterNumber = jTextField2.getText()+SevenButton.getText();
       jTextField2.setText(EnterNumber);
    }//GEN-LAST:event_SevenButtonActionPerformed

    private void EightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EightButtonActionPerformed
        String EnterNumber = jTextField2.getText()+EightButton.getText();
       jTextField2.setText(EnterNumber);
    }//GEN-LAST:event_EightButtonActionPerformed

    private void NineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NineButtonActionPerformed
        String EnterNumber = jTextField2.getText()+NineButton.getText();
       jTextField2.setText(EnterNumber);
    }//GEN-LAST:event_NineButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
         if(JOptionPane.showConfirmDialog(frame, "Are You Sure Want To Exit", "Calculator", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {Calculator c = new Calculator();
        c.setVisible(false);
        dispose();
        
        AppWindow aw = new AppWindow();
        aw.setVisible(true);}
        
        
        
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        double op = Double.parseDouble(String.valueOf(jTextField2.getText()));
        op = op * (-1);
        jTextField2.setText(String.valueOf(op));
    }//GEN-LAST:event_jButton31ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BagButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton EightButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton FiveButton;
    private javax.swing.JButton FourButton;
    private javax.swing.JButton GunButton;
    private javax.swing.JButton JiroButton;
    private javax.swing.JButton MainajButton;
    private javax.swing.JButton NineButton;
    private javax.swing.JButton OneButton;
    private javax.swing.JButton OneDeleteButton;
    private javax.swing.JButton PlusButton;
    private javax.swing.JButton PointButton;
    private javax.swing.JButton SevenButton;
    private javax.swing.JButton SixButton;
    private javax.swing.JButton ThreeButton;
    private javax.swing.JButton TwoButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JButton jButton31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("calculator.png")));
    }
}
