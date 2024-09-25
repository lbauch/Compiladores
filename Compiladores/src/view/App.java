package view;

import controller.LexicalError;
import controller.Lexico;
import controller.Token;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.*;

public class App extends javax.swing.JFrame {

    private JTextArea messageArea;
    private File currentFile;
    private String txtSaida = "linha\tclasse\t\tlexema\n";
    
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
        messageArea = new JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(910, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        pn_ferramentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn_ferramentas.setMinimumSize(new java.awt.Dimension(900, 70));
        pn_ferramentas.setPreferredSize(new java.awt.Dimension(900, 70));
        pn_ferramentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pn_ferramentasKeyPressed(evt);
            }
        });

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
        bt_open.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_openKeyPressed(evt);
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
        bt_save.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_saveKeyPressed(evt);
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
        bt_copy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_copyKeyPressed(evt);
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
        bt_paste.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_pasteKeyPressed(evt);
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
        bt_cut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_cutKeyPressed(evt);
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
        bt_compile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_compileKeyPressed(evt);
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
        bt_team.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_teamKeyPressed(evt);
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
        lb_status.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lb_statusKeyPressed(evt);
            }
        });

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
        splitp_msgs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                splitp_msgsKeyPressed(evt);
            }
        });

        scrollp_editor.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollp_editor.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollp_editor.setMinimumSize(new java.awt.Dimension(80, 100));
        scrollp_editor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                scrollp_editorKeyPressed(evt);
            }
        });

        ta_editor.setColumns(10);
        ta_editor.setRows(5);
        ta_editor.setBorder(new NumberedBorder());
        ta_editor.setMinimumSize(new java.awt.Dimension(80, 100));
        ta_editor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ta_editorKeyPressed(evt);
            }
        });
        scrollp_editor.setViewportView(ta_editor);

        splitp_msgs.setLeftComponent(scrollp_editor);

        scrollp_console.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollp_console.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollp_console.setMinimumSize(new java.awt.Dimension(80, 100));
        scrollp_console.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                scrollp_consoleKeyPressed(evt);
            }
        });

        ta_console.setEditable(false);
        ta_console.setColumns(10);
        ta_console.setRows(5);
        ta_console.setText("console log");
        ta_console.setEnabled(false);
        ta_console.setMinimumSize(new java.awt.Dimension(80, 100));
        ta_console.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ta_consoleKeyPressed(evt);
            }
        });
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
        lb_status.setText(System.getProperty("user.dir") + "\\src\\" + this.
                getClass().getName() + ".java");
    }//GEN-LAST:event_formWindowOpened

    private void bt_teamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_teamActionPerformed
        ta_console.setText(
                "\nGabriel Ramos dos Santos\nLucas Bauchspiess\nThiago Bodnar");
    }//GEN-LAST:event_bt_teamActionPerformed

    private void bt_compileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_compileActionPerformed
        Lexico lexico = new Lexico();
        StringReader stReader = new StringReader(ta_editor.getText());
        BufferedReader bfReader = new BufferedReader(stReader);
        Token t = null;
        lexico.
                setInput(bfReader);
        try {
            while ((t = lexico.nextToken()) != null) {
                txtSaida += lexico.getLinha() + "\t" + pegarClasse(t) + "\t\t" + t.getLexeme() + "\n";   
            }
        } catch (LexicalError e) {  // tratamento de erros
            if( t != null){
                txtSaida = "linha " + lexico.getLinha() + ": " + t.getLexeme() + " " + e.getMessage();  
            }
            else{
                txtSaida = "Entrada de dados inválida";
            }
        }
        ta_console.setText(txtSaida);
    }//GEN-LAST:event_bt_compileActionPerformed

    private String pegarClasse(Token token){
        if(token.getId() >= 2 && token.getId() <= 15){
            return "palavra reservada";
        }
        if(token.getId() >= 16 && token.getId() <= 31){
            return "símbolo especial";
        }
        if(token.getId() == 32){
            return "identificador";
        }
        if(token.getId() == 33){
            return "constante_int";
        }
        if(token.getId() == 34){
            return "constante_float";
        }
        if(token.getId() == 35){
            return "constante_string";
        }
        return null;
    }
    
    private void bt_cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cutActionPerformed

    }//GEN-LAST:event_bt_cutActionPerformed

    private void bt_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pasteActionPerformed

    }//GEN-LAST:event_bt_pasteActionPerformed

    private void bt_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_copyActionPerformed

    }//GEN-LAST:event_bt_copyActionPerformed

    private void bt_saveActionPerformed(java.awt.event.ActionEvent evt) {
        if (currentFile == null) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int returnValue = fileChooser.showSaveDialog(this);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                currentFile = fileChooser.getSelectedFile();
                if (!currentFile.getName().endsWith(".txt")) {
                    currentFile = new File(currentFile.getAbsolutePath()
                            + ".txt");
                }
            } else {
                return;
            }
        }
        try (FileWriter writer = new FileWriter(currentFile)) {
            writer.write(ta_editor.getText());
            messageArea.setText("");
            lb_status.setText("Arquivo salvo: " + currentFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void bt_openActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = fileChooser.showOpenDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            currentFile = fileChooser.getSelectedFile();
            if (currentFile != null && currentFile.getName().endsWith(".txt")) {
                try (BufferedReader reader = new BufferedReader(new FileReader(
                        currentFile))) {
                    StringBuilder content = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                    ta_editor.setText(content.toString());
                    messageArea.setText("");
                    lb_status.setText("Arquivo aberto: " + currentFile.
                            getAbsolutePath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void bt_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_newActionPerformed
        ta_console.setText(null);
        ta_editor.setText(null);
        lb_status.setText(null);
        currentFile = null;
    }//GEN-LAST:event_bt_newActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_formKeyPressed

    private void bt_newKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_newKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_bt_newKeyPressed

    private void bt_openKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_openKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_bt_openKeyPressed

    private void bt_saveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_saveKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_bt_saveKeyPressed

    private void bt_copyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_copyKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_bt_copyKeyPressed

    private void bt_pasteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_pasteKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_bt_pasteKeyPressed

    private void bt_cutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_cutKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_bt_cutKeyPressed

    private void bt_compileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_compileKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_bt_compileKeyPressed

    private void bt_teamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_teamKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_bt_teamKeyPressed

    private void pn_ferramentasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pn_ferramentasKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_pn_ferramentasKeyPressed

    private void ta_editorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ta_editorKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_ta_editorKeyPressed

    private void ta_consoleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ta_consoleKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_ta_consoleKeyPressed

    private void lb_statusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lb_statusKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_lb_statusKeyPressed

    private void splitp_msgsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_splitp_msgsKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_splitp_msgsKeyPressed

    private void scrollp_editorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scrollp_editorKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_scrollp_editorKeyPressed

    private void scrollp_consoleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scrollp_consoleKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_scrollp_consoleKeyPressed

    private void keyPressed(java.awt.event.KeyEvent evt) {
        if (evt.isControlDown()) {
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_N:
                    bt_newActionPerformed(null);
                    break;
                case KeyEvent.VK_O:
                    bt_openActionPerformed(null);
                    break;
                case KeyEvent.VK_S:
                    bt_saveActionPerformed(null);
                    break;
                case KeyEvent.VK_C:
                    bt_copyActionPerformed(null);
                    break;
                case KeyEvent.VK_V:
                    bt_pasteActionPerformed(null);
                    break;
                case KeyEvent.VK_X:
                    bt_cutActionPerformed(null);
                    break;
            }
        } else {
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_F7:
                    bt_compileActionPerformed(null);
                    break;
                case KeyEvent.VK_F1:
                    bt_teamActionPerformed(null);
                    break;
            }
        }
    }

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
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
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
