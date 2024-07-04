
package projeto;

import javax.swing.JOptionPane;
import java.io.*;

public class JanelaPedidos extends javax.swing.JFrame {
  //Variaveis
  String pedidos="",comentario,enderecoCliet,tamanho;
  Pilha pilha =new Pilha();
  Pedidos pedido;
  Pizza pizzaCliet=null;
  Borda bordaClit=null;
  Acompanhamento acompanhamento=null;
  
  boolean metadeClit;
  
    public JanelaPedidos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        pequena = new javax.swing.JCheckBox();
        media = new javax.swing.JCheckBox();
        grande = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        areadopedido = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sabor2 = new javax.swing.JComboBox<>();
        metade = new javax.swing.JCheckBox();
        borda1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        entrega = new javax.swing.JRadioButton();
        local = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        endereco = new javax.swing.JTextArea();
        acompanha = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        qtd = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textComentarios = new javax.swing.JTextArea();
        btnAdicionarAoPedido = new javax.swing.JButton();
        Enviar = new javax.swing.JButton();
        sabor1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizzaria Paneleiras");
        setBackground(java.awt.Color.yellow);

        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1100, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipos de pizza: ");
        jLabel1.setName("Tipos de Pizza"); // NOI18N

        buttonGroup1.add(pequena);
        pequena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pequena.setForeground(new java.awt.Color(255, 255, 255));
        pequena.setText("Pequena");

        buttonGroup1.add(media);
        media.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        media.setForeground(new java.awt.Color(255, 255, 255));
        media.setText("Média");
        media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaActionPerformed(evt);
            }
        });

        buttonGroup1.add(grande);
        grande.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        grande.setForeground(new java.awt.Color(255, 255, 255));
        grande.setText("Grande");

        jScrollPane3.setViewportView(areadopedido);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sabor1:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sabor2:");

        sabor2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sabor2.setForeground(new java.awt.Color(255, 255, 255));
        sabor2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhuma", "Mussarela", "Escarola", "Marguerita", "Atum", "Romana", "Calabresa ", "Napolitana ", "Brócolis ", "Portuguesa ", "Bacon ", "Frango com Catupiry", "Chocolate ", "Prestígio", "Beijinho ", "M&M ", "Nutella com Morango" }));
        sabor2.setEnabled(false);
        sabor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabor2ActionPerformed(evt);
            }
        });

        metade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        metade.setForeground(new java.awt.Color(255, 255, 255));
        metade.setText("Metade");
        metade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metadeActionPerformed(evt);
            }
        });

        borda1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        borda1.setForeground(new java.awt.Color(255, 255, 255));
        borda1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem borda", "Catupiry", "Cheddar", "Mussarela", "Chocolate", "Nutella" }));
        borda1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        borda1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        borda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borda1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Borda:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Forma de envio");
        jLabel2.setToolTipText("");

        buttonGroup2.add(entrega);
        entrega.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        entrega.setForeground(new java.awt.Color(255, 255, 255));
        entrega.setText("Entrega");
        entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entregaActionPerformed(evt);
            }
        });

        buttonGroup2.add(local);
        local.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        local.setForeground(new java.awt.Color(255, 255, 255));
        local.setText("Local");
        local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localActionPerformed(evt);
            }
        });

        endereco.setColumns(20);
        endereco.setRows(5);
        endereco.setEnabled(false);
        jScrollPane1.setViewportView(endereco);

        acompanha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        acompanha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem acompanhamento", "Guaraná ", "Coca cola ", "Coca cola zero", "Fanta laranja", "Fanta uva", "Água", "Suco de laranja" }));
        acompanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acompanhaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Acompanhamento:");

        qtd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        qtd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 Litros", "Lata" }));
        qtd.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Comentarios");

        textComentarios.setColumns(20);
        textComentarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textComentarios.setRows(5);
        jScrollPane2.setViewportView(textComentarios);

        btnAdicionarAoPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdicionarAoPedido.setText("Adicionar ao pedido");
        btnAdicionarAoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarAoPedidoActionPerformed(evt);
            }
        });

        Enviar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Enviar.setText("Enviar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        sabor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mussarela", "Escarola", "Marguerita", "Atum", "Romana", "Calabresa", "Napolitana", "Brócolis", "Portuguesa", "Bacon", "Frango com Catupiry", "Chocolate", "Prestígio", "Beijinho", "M&M", "Nutella com Morango" }));

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(pequena, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(media, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(grande, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(sabor2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(metade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(borda1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(entrega, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(local, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(acompanha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(qtd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnAdicionarAoPedido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Enviar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(sabor1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(acompanha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(entrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(local))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borda1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(grande)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(media)
                    .addComponent(pequena)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sabor1, 0, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(sabor2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(metade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(btnAdicionarAoPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionarAoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(grande)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(media)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pequena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sabor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sabor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(metade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(borda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(entrega)
                            .addComponent(local))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acompanha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void metadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metadeActionPerformed
        //Metade:
        if(metade.isSelected()){
            sabor2.setEnabled(true);

        }else{
            sabor2.setEnabled(false);
        }
    }//GEN-LAST:event_metadeActionPerformed

    private void btnAdicionarAoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAoPedidoActionPerformed
        //Adcionar pedido(Metodo principal):
        
        //Variaveis do metodo
        String pizzaSabor = (String)sabor1.getSelectedItem();
        String bordaSabor = (String)borda1.getSelectedItem();
        String pizzaSabor2=(String)sabor2.getSelectedItem();
        String bebida=(String)acompanha.getSelectedItem();
        String tamanhoBebida=(String)qtd.getSelectedItem();
        comentario=textComentarios.getText();
        
        //Ifs e elses
            //Acompanhamento
        if(bebida.equals("Sem acompanhamento")){
            tamanhoBebida="";
        }
        
            // Tamanho da pizza
        if(pequena.isSelected()){
            tamanho="Pequena";
        }else if(media.isSelected()){
            tamanho="Media";
        }else{
            tamanho="Grande";
        }
        
        //Verificar se vai se metade ou não
        if(metade.isSelected()){
            metadeClit=true;        
        }else{
            metadeClit=false;
            pizzaSabor2="Nenhuma";
        } 
        
        //Objetos
        acompanhamento=new Acompanhamento(bebida, tamanhoBebida);
        bordaClit= new Borda(bordaSabor);
        pizzaCliet=new Pizza(pizzaSabor,tamanho,metadeClit,pizzaSabor2);
        
        
        //Adicionar a Pilha
        pilha.push(pedido=new Pedidos(pizzaCliet,acompanhamento,bordaClit,comentario));
        
        //Finalizações
        pedidos+=pedido.toString()+"\n";   
        areadopedido.setText(pedidos);
        
    }//GEN-LAST:event_btnAdicionarAoPedidoActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
    //Finalizar
    
    //Variaveis
    String pedidoTotal;
    
    //If e else para sabe se vai ser entregar ou não
    if(entrega.isSelected()){
        enderecoCliet=endereco.getText();
        
        pedidoTotal=pilha.toString(enderecoCliet,true);
    }else{
       enderecoCliet="";
        pedidoTotal=pilha.toString(enderecoCliet,false);
    }
        
        //Imprimir nota
        try {
            FileWriter writer = new FileWriter("Nota.txt");
            writer.write(pedidoTotal);
            writer.close();
		}catch (IOException e){
			e.printStackTrace();
		}
        //Finalizar programa
        JOptionPane.showMessageDialog(null,"Seu pedido foi finalizado");
        
    }//GEN-LAST:event_EnviarActionPerformed

    private void sabor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabor2ActionPerformed
        //Sabor2:
    }//GEN-LAST:event_sabor2ActionPerformed

    private void borda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borda1ActionPerformed
        // Borda:
    }//GEN-LAST:event_borda1ActionPerformed

    private void entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entregaActionPerformed
        //Entrega:
         if(entrega.isSelected()){
            endereco.setEnabled(true);
            
        }else{
            endereco.setEnabled(false);
           
        }
        
    }//GEN-LAST:event_entregaActionPerformed

    private void localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localActionPerformed
        // Local:
        if(local.isSelected()){
            endereco.setEnabled(false);
        }else{
            endereco.setEnabled(true);
        }
    }//GEN-LAST:event_localActionPerformed

    private void acompanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acompanhaActionPerformed
        //Acompanhamento:
        String ac = acompanha.getSelectedItem().toString();
        if(ac.equals("Sem acompanhamento")){
            qtd.setEnabled(false);
        }else{
            qtd.setEnabled(true);
        }
    }//GEN-LAST:event_acompanhaActionPerformed

    private void mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediaActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar;
    private javax.swing.JComboBox<String> acompanha;
    private javax.swing.JTextPane areadopedido;
    public javax.swing.JComboBox<String> borda1;
    private javax.swing.JButton btnAdicionarAoPedido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    public javax.swing.JTextArea endereco;
    public javax.swing.JRadioButton entrega;
    public javax.swing.JCheckBox grande;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JRadioButton local;
    public javax.swing.JCheckBox media;
    public javax.swing.JCheckBox metade;
    public javax.swing.JCheckBox pequena;
    private javax.swing.JComboBox<String> qtd;
    private javax.swing.JComboBox<String> sabor1;
    public javax.swing.JComboBox<String> sabor2;
    private javax.swing.JTextArea textComentarios;
    // End of variables declaration//GEN-END:variables
}
