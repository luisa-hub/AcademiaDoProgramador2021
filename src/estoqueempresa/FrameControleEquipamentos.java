
package estoqueempresa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/* Registro, edição, visualização e exclusão de equipamentos */

public class FrameControleEquipamentos extends javax.swing.JFrame {


    public FrameControleEquipamentos() {
        initComponents();
    }

    public ArrayList<Equipamentos> listaEquipamentos = new ArrayList();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bt_excluir = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        bt_visualizar = new javax.swing.JButton();
        bt_registrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        tf_nome = new javax.swing.JTextField();
        tf_preco = new javax.swing.JTextField();
        tf_nroserie = new javax.swing.JTextField();
        tf_dtfabricacao = new javax.swing.JTextField();
        tf_fabricante = new javax.swing.JTextField();
        lbl_nome = new javax.swing.JLabel();
        lbl_preco = new javax.swing.JLabel();
        lbl_preco1 = new javax.swing.JLabel();
        lbl_preco2 = new javax.swing.JLabel();
        lbl_preco3 = new javax.swing.JLabel();
        lbl_nome1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_visualizar = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        bt_excluir.setBackground(new java.awt.Color(0, 0, 0));
        bt_excluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_excluir.setForeground(new java.awt.Color(255, 255, 255));
        bt_excluir.setText("Excluir");
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        bt_editar.setBackground(new java.awt.Color(0, 0, 0));
        bt_editar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_editar.setForeground(new java.awt.Color(255, 255, 255));
        bt_editar.setText("Editar");
        bt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editarActionPerformed(evt);
            }
        });

        bt_visualizar.setBackground(new java.awt.Color(0, 0, 0));
        bt_visualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_visualizar.setForeground(new java.awt.Color(255, 255, 255));
        bt_visualizar.setText("Visualizar");
        bt_visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_visualizarActionPerformed(evt);
            }
        });

        bt_registrar.setBackground(new java.awt.Color(0, 0, 0));
        bt_registrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_registrar.setForeground(new java.awt.Color(255, 255, 255));
        bt_registrar.setText("Registrar");
        bt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_visualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(bt_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_excluir)
                    .addComponent(bt_registrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_editar)
                    .addComponent(bt_visualizar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTROLE DE ESTOQUES");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jButton1.setText("Controle de Chamados>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeActionPerformed(evt);
            }
        });

        tf_nroserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nroserieActionPerformed(evt);
            }
        });

        tf_fabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fabricanteActionPerformed(evt);
            }
        });

        lbl_nome.setText("Nome do Equipamento");

        lbl_preco.setText("Preço ");

        lbl_preco1.setText("Número da Série ");

        lbl_preco2.setText("Fabricante");

        lbl_preco3.setText("Data de Fabricação");

        jLabel2.setText("Gerenciameno do Estoque ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lbl_nome1)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_nome)
                        .addComponent(tf_nome)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_preco))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_preco1)
                                .addComponent(tf_nroserie, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_fabricante)
                                .addComponent(lbl_preco2))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_preco3)
                                .addComponent(tf_dtfabricacao)))))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_preco)
                    .addComponent(lbl_preco1))
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nroserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_preco2)
                    .addComponent(lbl_preco3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_dtfabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Visualização do Estoque");

        tb_visualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Equipamento", "Série", "Fabricante"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_visualizar);

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jButton2)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
    }// </editor-fold>//GEN-END:initComponents

    private void tf_fabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fabricanteActionPerformed

    private void tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameControleChamado fl = new FrameControleChamado();
        fl.pack();
        fl.setLocationRelativeTo(null);
        fl.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
        /* Não finalizado! 
        
                for(int i=0; i<listaEquipamentos.size(); i++){
                    if(this.tb_visualizar.getValueAt((tb_visualizar.getSelectedRow()), tb_visualizar.getSelectedColumn()).equals(this.listaEquipamentos.get(i).getNro_serie())){
                        tf_nome.setText(this.listaEquipamentos.get(i).getNome());
                        tf_preco.setText(String.valueOf(this.listaEquipamentos.get(i).getPreco()));
                        tf_nroserie.setText();
        
                        
                        JOptionPane.showConfirmDialog(this, "Clique em Registrar para Atualizar!");
                    }

        
        //Janela é fechada se a lista está vazia
        if(this.listaEquipamentos.isEmpty()){
           JOptionPane.showMessageDialog(this, "Não há produtos cadastrados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }  */
    }//GEN-LAST:event_bt_editarActionPerformed

    private void bt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarActionPerformed
        
        String nome = ""; 
        String fabricante = "";
        String precoS = "";
        Integer nro_serie = 0;
        Double preco = 0.0;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dt_fabricacao = new Date();
        
        if (this.tf_nome.getText().isEmpty() || this.tf_nroserie.getText().isEmpty() || this.tf_preco.getText().isEmpty() 
                || this.tf_dtfabricacao.getText().isEmpty() || this.tf_fabricante.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
       }
        
        else  {
            
            
            precoS = (this.tf_preco.getText());
            precoS = precoS.replaceAll(",", ".");
            
            fabricante = this.tf_fabricante.getText();
            
            String data = this.tf_dtfabricacao.getText();
            try {
                dt_fabricacao =  formato.parse(data);
            } catch (ParseException ex) {
                Logger.getLogger(FrameControleEquipamentos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (MinString(this.tf_nome.getText()) && isInteger(this.tf_nroserie.getText()) && isDouble(precoS)) {
                 nome = this.tf_nome.getText();
                 nro_serie = Integer.parseInt(this.tf_nroserie.getText());
                 preco = Double.parseDouble(precoS);
                 
                Equipamentos e = new Equipamentos(nome,  preco,  nro_serie, dt_fabricacao, fabricante);
                listaEquipamentos.add(e);
                //serializar(listaprodutos);
                JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");
                limparCampos();
                 
            
            } 
            
            else {
                  if (!isDouble(precoS)){
                      JOptionPane.showMessageDialog(this, "O preço deve ser um número!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
                  if (!MinString(this.tf_nome.getText())){
                      JOptionPane.showMessageDialog(this, "O nome deve ter no mínimo 6 caracteres!", "Erro", JOptionPane.ERROR_MESSAGE);
               
               }
           
           // Confere se o número da série é inteiro, senao mostra mensagem de erro
                  if (!isInteger(this.tf_nroserie.getText())) {
                        JOptionPane.showMessageDialog(this, "O número da série deve ser um número inteiro", "Erro", JOptionPane.ERROR_MESSAGE);
                        }
           
           
                    

            
           
               
        } }
        
    }//GEN-LAST:event_bt_registrarActionPerformed

    private void bt_visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_visualizarActionPerformed
       
        if(!listaEquipamentos.isEmpty()) {
           
        DefaultTableModel model = (DefaultTableModel) tb_visualizar.getModel();
        
        Object rowData[] = new Object[3];
            
     
       
        
        for(int i = 0; i < listaEquipamentos.size(); i++)
        {
            rowData[0] = listaEquipamentos.get(i).getNome();
            rowData[1] = listaEquipamentos.get(i).getNro_serie();
            rowData[2] = listaEquipamentos.get(i).getFabricante();
            model.addRow(rowData);
        }
        
        }
           
      else {
      
      JOptionPane.showMessageDialog(this, "Não há produtos cadastrados", "Erro", JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_bt_visualizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tb_visualizar.getModel();
                
        for(int i = 0; i < listaEquipamentos.size(); i++) {
       model.removeRow(i);        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
         {switch(JOptionPane.showConfirmDialog(this, "Quer mesmo remover o produto?")){
            case 0: 
                for(int i=0; i<listaEquipamentos.size(); i++){
                    if(this.tb_visualizar.getValueAt((tb_visualizar.getSelectedRow()), 1).equals(this.listaEquipamentos.get(i).getNro_serie())){
                        this.listaEquipamentos.remove(i);
                        //serializar(listaEquipamentos);
                        JOptionPane.showConfirmDialog(this, "Removido!");
                    }
                    
                }
                break;
            case 1: 
                break;
            case 2: 
                break;
        }
        
        //Janela é fechada se a lista está vazia
        if(this.listaEquipamentos.isEmpty()){
           JOptionPane.showMessageDialog(this, "Não há produtos cadastrados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }  

    }//GEN-LAST:event_bt_excluirActionPerformed

    private void tf_nroserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nroserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nroserieActionPerformed

   
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
            java.util.logging.Logger.getLogger(FrameControleEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameControleEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameControleEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameControleEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameControleEquipamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_registrar;
    private javax.swing.JButton bt_visualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_nome1;
    private javax.swing.JLabel lbl_preco;
    private javax.swing.JLabel lbl_preco1;
    private javax.swing.JLabel lbl_preco2;
    private javax.swing.JLabel lbl_preco3;
    private javax.swing.JTable tb_visualizar;
    private javax.swing.JTextField tf_dtfabricacao;
    private javax.swing.JTextField tf_fabricante;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_nroserie;
    private javax.swing.JTextField tf_preco;
    // End of variables declaration//GEN-END:variables

 private boolean isDouble(String d) {
        try {
            Double.valueOf(d);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
 
 private boolean MinString(String g) {
     if (g.length() >= 6) {
     return true;
     }
     else {
     return false;
     }
 
 }
 
  private boolean isInteger(String d) {
        try {
            Integer.valueOf(d);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

  public void limparCampos() {
            this.tf_nome.setText("");
            this.tf_nroserie.setText("");
            this.tf_preco.setText("");
            this.tf_fabricante.setText("");
            this.tf_dtfabricacao.setText("");
   }

}

