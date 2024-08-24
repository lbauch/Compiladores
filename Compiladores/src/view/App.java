package view;

import java.awt.event.KeyEvent;

public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_ferramentas = new javax.swing.JPanel();
        bt_new = new javax.swing.JButton();
        bt_open = new javax.swing.JButton();
        bt_save = new javax.swing.JButton();
        bt_copy = new javax.swing.JButton();
        bt_paste = new javax.swing.JButton();
        bt_cut = new javax.swing.JButton();
        bt_compile = new javax.swing.JButton();
        bt_team = new javax.swing.JButton();
        pn_status = new javax.swing.JPanel();
        lb_status = new javax.swing.JLabel();
        splitp_msgs = new javax.swing.JSplitPane();
        scrollp_editor = new javax.swing.JScrollPane();
        ta_editor = new javax.swing.JTextArea();
        scrollp_console = new javax.swing.JScrollPane();
        ta_console = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(910, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_ferramentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn_ferramentas.setMinimumSize(new java.awt.Dimension(900, 70));
        pn_ferramentas.setPreferredSize(new java.awt.Dimension(900, 70));

        bt_new.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        bt_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/novo 01.png"))); // NOI18N
        bt_new.setText("novo [ctrl-n]");
        bt_new.setToolTipText("Novo");
        bt_new.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_new.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_new.setName("novo"); // NOI18N
        bt_new.setPreferredSize(new java.awt.Dimension(100, 53));
        bt_new.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_newActionPerformed(evt);
            }
        });
        bt_new.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_newKeyPressed(evt);
            }
        });

        bt_open.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        bt_open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abrir 01.png"))); // NOI18N
        bt_open.setText("abrir [crtl-o]");
        bt_open.setToolTipText("Abrir");
        bt_open.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_open.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_open.setName("abrir"); // NOI18N
        bt_open.setPreferredSize(new java.awt.Dimension(100, 53));
        bt_open.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_openActionPerformed(evt);
            }
        });

        bt_save.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        bt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/salvar 01.png"))); // NOI18N
        bt_save.setText("salvar [crtl-s]");
        bt_save.setToolTipText("Salvar");
        bt_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_save.setName("salvar"); // NOI18N
        bt_save.setPreferredSize(new java.awt.Dimension(100, 53));
        bt_save.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveActionPerformed(evt);
            }
        });

        bt_copy.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        bt_copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/copiar 01.png"))); // NOI18N
        bt_copy.setText("copiar [ctrl-c]");
        bt_copy.setToolTipText("Copiar");
        bt_copy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_copy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_copy.setName("copiar"); // NOI18N
        bt_copy.setPreferredSize(new java.awt.Dimension(100, 53));
        bt_copy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_copyActionPerformed(evt);
            }
        });

        bt_paste.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        bt_paste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/colar 01.png"))); // NOI18N
        bt_paste.setText("colar [ctrl-v]");
        bt_paste.setToolTipText("Colar");
        bt_paste.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_paste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_paste.setName("colar"); // NOI18N
        bt_paste.setPreferredSize(new java.awt.Dimension(108, 53));
        bt_paste.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pasteActionPerformed(evt);
            }
        });

        bt_cut.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        bt_cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/recortar 01.png"))); // NOI18N
        bt_cut.setText("recortar [ctrl-x]");
        bt_cut.setToolTipText("Recortar");
        bt_cut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_cut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_cut.setName("recortar"); // NOI18N
        bt_cut.setPreferredSize(new java.awt.Dimension(100, 53));
        bt_cut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cutActionPerformed(evt);
            }
        });

        bt_compile.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        bt_compile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/compilar 01.png"))); // NOI18N
        bt_compile.setText("compilar [F7]");
        bt_compile.setToolTipText("Compilar");
        bt_compile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_compile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_compile.setName("compilar"); // NOI18N
        bt_compile.setPreferredSize(new java.awt.Dimension(100, 53));
        bt_compile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_compile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_compileActionPerformed(evt);
            }
        });

        bt_team.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        bt_team.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/equipe 01.png"))); // NOI18N
        bt_team.setText("equipe [F1]");
        bt_team.setToolTipText("Equipe");
        bt_team.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_team.setName("equipe"); // NOI18N
        bt_team.setPreferredSize(new java.awt.Dimension(100, 53));
        bt_team.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_teamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_ferramentasLayout = new javax.swing.GroupLayout(pn_ferramentas);
        pn_ferramentas.setLayout(pn_ferramentasLayout);
        pn_ferramentasLayout.setHorizontalGroup(
            pn_ferramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ferramentasLayout.createSequentialGroup()
                .addComponent(bt_new, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_open, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_copy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_paste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_cut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_compile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_team, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_ferramentasLayout.setVerticalGroup(
            pn_ferramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_new, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
            .addComponent(bt_open, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_copy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_paste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_cut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_compile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_team, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pn_status.setPreferredSize(new java.awt.Dimension(900, 25));

        lb_status.setText("status");
        lb_status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_status.setEnabled(false);
        lb_status.setMinimumSize(new java.awt.Dimension(900, 25));
        lb_status.setPreferredSize(new java.awt.Dimension(900, 25));

        javax.swing.GroupLayout pn_statusLayout = new javax.swing.GroupLayout(pn_status);
        pn_status.setLayout(pn_statusLayout);
        pn_statusLayout.setHorizontalGroup(
            pn_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_status, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        pn_statusLayout.setVerticalGroup(
            pn_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        splitp_msgs.setDividerLocation(250);
        splitp_msgs.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        scrollp_editor.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollp_editor.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollp_editor.setMinimumSize(new java.awt.Dimension(80, 100));

        ta_editor.setColumns(10);
        ta_editor.setRows(5);
        ta_editor.setBorder(new NumberedBorder());
        ta_editor.setMinimumSize(new java.awt.Dimension(80, 100));
        scrollp_editor.setViewportView(ta_editor);

        splitp_msgs.setLeftComponent(scrollp_editor);

        scrollp_console.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollp_console.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollp_console.setMinimumSize(new java.awt.Dimension(80, 100));

        ta_console.setEditable(false);
        ta_console.setColumns(10);
        ta_console.setRows(5);
        ta_console.setText("console log");
        ta_console.setEnabled(false);
        ta_console.setMinimumSize(new java.awt.Dimension(80, 100));
        scrollp_console.setViewportView(ta_console);

        splitp_msgs.setRightComponent(scrollp_console);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_ferramentas, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
            .addComponent(pn_status, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
            .addComponent(splitp_msgs, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(splitp_msgs, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lb_status.setText(System.getProperty("user.dir") + "\\src\\" + this.getClass().getName() + ".java");
    }//GEN-LAST:event_formWindowOpened

    private void bt_teamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_teamActionPerformed
        System.out.println("OK TEAM AC");
    }//GEN-LAST:event_bt_teamActionPerformed

    private void bt_compileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_compileActionPerformed
        System.out.println("OK COMPILE AC");
    }//GEN-LAST:event_bt_compileActionPerformed

    private void bt_cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cutActionPerformed
        System.out.println("OK CUT AC");
    }//GEN-LAST:event_bt_cutActionPerformed

    private void bt_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pasteActionPerformed
        System.out.println("OK PASTE AC");
    }//GEN-LAST:event_bt_pasteActionPerformed

    private void bt_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_copyActionPerformed
        System.out.println("OK COPY AC");
    }//GEN-LAST:event_bt_copyActionPerformed

    private void bt_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveActionPerformed
        System.out.println("OK SAVE AC");
    }//GEN-LAST:event_bt_saveActionPerformed

    private void bt_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_openActionPerformed
        System.out.println("OK OPEN AC");
    }//GEN-LAST:event_bt_openActionPerformed

    private void bt_newKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_newKeyPressed
        if (evt.isControlDown()) {
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_N:
                bt_newActionPerformed(null);
                System.out.println("OK NEW KEY");
                break;
                case KeyEvent.VK_O:
                bt_openActionPerformed(null);
                System.out.println("OK OPEN KEY");
                break;
                case KeyEvent.VK_S:
                bt_saveActionPerformed(null);
                System.out.println("OK SAVE KEY");
                break;
                case KeyEvent.VK_C:
                bt_copyActionPerformed(null);
                System.out.println("OK COPY KEY");
                break;
                case KeyEvent.VK_V:
                bt_pasteActionPerformed(null);
                System.out.println("OK PASTE KEY");
                break;
                case KeyEvent.VK_X:
                bt_cutActionPerformed(null);
                System.out.println("OK CUT KEY");
                break;
            }
        } else {
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_F7:
                bt_compileActionPerformed(null);
                System.out.println("OK COMPILE KEY");
                break;
                case KeyEvent.VK_F1:
                bt_teamActionPerformed(null);
                System.out.println("OK TEAM KEY");
                break;
            }
        }
    }//GEN-LAST:event_bt_newKeyPressed

    private void bt_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_newActionPerformed
        System.out.println("OK NEW AC");
    }//GEN-LAST:event_bt_newActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_compile;
    private javax.swing.JButton bt_copy;
    private javax.swing.JButton bt_cut;
    private javax.swing.JButton bt_new;
    private javax.swing.JButton bt_open;
    private javax.swing.JButton bt_paste;
    private javax.swing.JButton bt_save;
    private javax.swing.JButton bt_team;
    private javax.swing.JLabel lb_status;
    private javax.swing.JPanel pn_ferramentas;
    private javax.swing.JPanel pn_status;
    private javax.swing.JScrollPane scrollp_console;
    private javax.swing.JScrollPane scrollp_editor;
    private javax.swing.JSplitPane splitp_msgs;
    private javax.swing.JTextArea ta_console;
    private javax.swing.JTextArea ta_editor;
    // End of variables declaration//GEN-END:variables
}
