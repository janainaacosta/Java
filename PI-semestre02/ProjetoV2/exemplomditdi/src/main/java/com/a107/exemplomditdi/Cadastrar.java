/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.a107.exemplomditdi;

import com.a107.exemplomditdi.utils.Validador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.border.LineBorder;

/**
 *
 * @author janaina costa
 *
 */
public class Cadastrar extends javax.swing.JFrame {

    public String nCPF;
    public String nNome;
    public String nSexo;
    public String nEstadoCivil;
    public String nDataNasc;

    public String nLogradouro;
    public String nNumero;
    public String nBairro;
    public String nCidade;
    public String nCEP;
    public String nEndereco;

    public String nTelefone;
    public String nEmail;
    public String nUF;

    // n de novo
    /**
     * Creates new form TelaCadastroCliente que
     */
    public Cadastrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlGuias = new javax.swing.JTabbedPane();
        pnlDadosBasicos = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        btnProximo = new javax.swing.JButton();
        slcSexo = new javax.swing.JComboBox<>();
        estadocivil = new javax.swing.JLabel();
        slcEstadoCivil = new javax.swing.JComboBox<>();
        datanasc = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JFormattedTextField();
        pnlEndereco = new javax.swing.JPanel();
        logradouro = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        numero = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        btnConfirmar1 = new javax.swing.JButton();
        btnVoltar1 = new javax.swing.JButton();
        bairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        cidade = new javax.swing.JLabel();
        txtNumeroEndereco = new javax.swing.JTextField();
        uf = new javax.swing.JLabel();
        slcUf = new javax.swing.JComboBox<>();
        cep = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        telefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        email = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnVoltar2 = new javax.swing.JButton();
        btnConfirmar2 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nome.setText("Nome:");

        cpf.setText("CPF:");

        sexo.setText("Sexo ");

        txtNome.setName("Nome"); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setName("CPF"); // NOI18N
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        slcSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Feminino", "Masculino", "Prefiro não informar", " " }));
        slcSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slcSexoActionPerformed(evt);
            }
        });

        estadocivil.setText("Estado civil");

        slcEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Solteiro(a)", "Casado(a)", "Separado(a)", "Divorciado(a)", "Viúvo(a)" }));

        datanasc.setText("Data de nascimento");

        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlDadosBasicosLayout = new javax.swing.GroupLayout(pnlDadosBasicos);
        pnlDadosBasicos.setLayout(pnlDadosBasicosLayout);
        pnlDadosBasicosLayout.setHorizontalGroup(
            pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosBasicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDadosBasicosLayout.createSequentialGroup()
                        .addComponent(nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(pnlDadosBasicosLayout.createSequentialGroup()
                        .addComponent(sexo)
                        .addGap(2, 2, 2)
                        .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnProximo)
                            .addGroup(pnlDadosBasicosLayout.createSequentialGroup()
                                .addComponent(slcSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estadocivil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slcEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlDadosBasicosLayout.createSequentialGroup()
                        .addComponent(cpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(datanasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        pnlDadosBasicosLayout.setVerticalGroup(
            pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosBasicosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datanasc)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadocivil)
                    .addComponent(slcSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo)
                    .addComponent(slcEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnProximo)
                .addGap(20, 20, 20))
        );

        pnlGuias.addTab("Dados Básicos", pnlDadosBasicos);

        logradouro.setText("Logradouro:");

        txtLogradouro.setName("Logradouro"); // NOI18N

        numero.setText("Número:");

        txtCidade.setName("Número"); // NOI18N
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        btnConfirmar1.setText("Confirmar");
        btnConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmar1ActionPerformed(evt);
            }
        });

        btnVoltar1.setText("<< Voltar");
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });

        bairro.setText("Bairro");

        cidade.setText("Cidade ");

        txtNumeroEndereco.setName("Número"); // NOI18N

        uf.setText("UF");

        slcUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        slcUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slcUfActionPerformed(evt);
            }
        });

        cep.setText("CEP");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(logradouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero)
                            .addComponent(cidade)
                            .addComponent(cep))
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(uf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(slcUf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                        .addComponent(txtNumeroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBairro))
                                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(btnVoltar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmar1)))
                .addContainerGap())
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logradouro)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero)
                    .addComponent(bairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uf)
                    .addComponent(slcUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cep)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar1)
                    .addComponent(btnConfirmar1))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pnlGuias.addTab("Endereço", pnlEndereco);

        telefone.setText("Telefone");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("55 (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        email.setText("E-mail");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnVoltar2.setText("Voltar");
        btnVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar2ActionPerformed(evt);
            }
        });

        btnConfirmar2.setText("Confirmar");
        btnConfirmar2.setActionCommand("");
        btnConfirmar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(email)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(telefone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnConfirmar2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfirmar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlGuias.addTab("Contato", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGuias)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGuias)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void criar() {
        Clientes tabela = new Clientes();

        tabela.setVisible(false);// fecha a tabela antiga pra dps mostrar os novos dados
        tabela.criar_pessoa(
                nCPF,
                nNome,
                nSexo,
                nEstadoCivil,
                nDataNasc,
                nLogradouro,
                nNumero,
                nBairro,
                nCidade,
                nUF,
                nCEP,
                nTelefone,
                nEmail); //envia os dados gerados neste arquivo para o arquivo "Cliente"

        tabela.setVisible(true); //abre o arquivo cliente(tabela) atualizado 
    }

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        // TODO add your handling code here:
        pnlGuias.setSelectedIndex(0);
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmar1ActionPerformed
        // TODO add your handling code here:
        LineBorder redBorder = new LineBorder(Color.RED);
        LineBorder blackBorder = new LineBorder(Color.BLACK);
        boolean flag = true;

        String CEPDigitado = txtCEP.getText();
        String logradouroDigitado = txtLogradouro.getText();
        String numeroDigitado = txtNumeroEndereco.getText();
        String bairroDigitado = txtBairro.getText();
        String cidadeDigitado = txtCidade.getText();
        String UFDigitado = "";

        if (logradouroDigitado.isEmpty()) {
            txtLogradouro.setForeground(Color.RED);
            txtLogradouro.setBorder(redBorder);
            flag = false;
        } else {
            txtLogradouro.setForeground(Color.BLACK);
            txtLogradouro.setBorder(blackBorder);
        }

        if (numeroDigitado.isEmpty()) {
            txtNumeroEndereco.setForeground(Color.RED);
            txtNumeroEndereco.setBorder(redBorder);
            flag = false;
        } else {
            txtNumeroEndereco.setForeground(Color.BLACK);
            txtNumeroEndereco.setBorder(blackBorder);
        }

        if (bairroDigitado.isEmpty()) {
            txtBairro.setForeground(Color.RED);
            txtBairro.setBorder(redBorder);
            flag = false;
        } else {
            txtBairro.setForeground(Color.BLACK);
            txtBairro.setBorder(blackBorder);
        }

        if (cidadeDigitado.isEmpty()) {
            txtCidade.setForeground(Color.RED);
            txtCidade.setBorder(redBorder);
            flag = false;
        } else {
            txtCidade.setForeground(Color.BLACK);
            txtCidade.setBorder(blackBorder);
        }

        Object selectedItem = slcUf.getSelectedItem();

        if (selectedItem
                == null || selectedItem.toString()
                        .equals("Selecione...")) {
            JOptionPane.showMessageDialog(null,
                    "Selecione o UF", "Alerta",
                    JOptionPane.WARNING_MESSAGE);
            flag = false;
        } else {
            UFDigitado = selectedItem.toString();
        }

        String cpfWithoutFormatting = txtCEP.getText()
                .replace("-", "")
                .trim();

        if (cpfWithoutFormatting.equals(
                "")) {
            txtCEP.setBorder(redBorder);
            flag = false;
        } else {
            txtCEP.setBorder(blackBorder);
        }

        //atribiu as variaveis globais g_(dados que sao enviados para o arquivo cliente) os valores gerados na tela endereco
        nLogradouro = logradouroDigitado;
        nNumero = numeroDigitado;
        nBairro = bairroDigitado;
        nCidade = cidadeDigitado;
        nUF = UFDigitado;
        nCEP = CEPDigitado;
        nEndereco = nEndereco + nLogradouro + nNumero + nBairro + nCidade + nUF + nCEP;

        if (flag) {
            pnlGuias.setSelectedIndex(2); 
        }

    }//GEN-LAST:event_btnConfirmar1ActionPerformed

    private void slcSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slcSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slcSexoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        LineBorder redBorder = new LineBorder(Color.RED);
        LineBorder blackBorder = new LineBorder(Color.BLACK);
        boolean flag = true;

        String nomeDigitado = txtNome.getText();
        String cpfDigitado = txtCPF.getText();
        String dataDigitada = txtDataNasc.getText();
        String sexo = "";
        String civil = "";

        if (nomeDigitado.isEmpty()) {
            txtNome.setForeground(Color.RED);
            txtNome.setBorder(redBorder);
            flag = false;
        } else {
            txtNome.setForeground(Color.BLACK);
            txtNome.setBorder(blackBorder);
        }

        String cpfWithoutFormatting = txtCPF.getText()
                .replace(".", "")
                .replace("-", "")
                .trim();

        if (cpfWithoutFormatting.equals("")) {
            txtCPF.setBorder(redBorder);
            flag = false;
        } else {
            txtCPF.setBorder(blackBorder);
        }

        String dataWithoutFormatting = dataDigitada
                .replace("/", "")
                .trim();
        if (dataWithoutFormatting.equals("")) {
            txtDataNasc.setBorder(redBorder);
            flag = false;
        } else {
            txtDataNasc.setBorder(blackBorder);
        }

        Object selectedItemSexo = slcSexo.getSelectedItem();

        if (selectedItemSexo == null || selectedItemSexo.toString().equals("Selecione...")) {
            JOptionPane.showMessageDialog(null,
                    "Selecione o Sexo", "Alerta",
                    JOptionPane.WARNING_MESSAGE);
            flag = false;
        } else {
            sexo = selectedItemSexo.toString();
        }

        Object selectedItemCivil = slcEstadoCivil.getSelectedItem();

        if (selectedItemCivil == null || selectedItemCivil.toString()
                .equals("Selecione...")) {
            JOptionPane.showMessageDialog(null,
                    "Selecione o Estado Civil", "Alerta",
                    JOptionPane.WARNING_MESSAGE);
            flag = false;
        } else {
            civil = selectedItemCivil.toString();
        }

        //atribiu as variaveis globais g_(dados que sao enviados para o arquivo cliente) os valores gerados na tela dados basicos
        nNome = nomeDigitado;
        nCPF = cpfDigitado;
        nSexo = sexo;
        nDataNasc = dataDigitada;
        nEstadoCivil = civil;

        if (flag) {
            pnlGuias.setSelectedIndex(1);

        }


    }//GEN-LAST:event_btnProximoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void slcUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slcUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slcUfActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar2ActionPerformed
        // TODO add your handling code here:
        pnlGuias.setSelectedIndex(1);
    }//GEN-LAST:event_btnVoltar2ActionPerformed

    private void btnConfirmar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmar2ActionPerformed
        LineBorder redBorder = new LineBorder(Color.RED);
        LineBorder blackBorder = new LineBorder(Color.BLACK);
        boolean flag = true;

        String telefoneDigitado = txtTelefone.getText();
        String emailDigitado = txtEmail.getText();

        //atribiu as variaveis globais g_(dados que sao enviados para o arquivo cliente) os valores gerados na tela contato
        nTelefone = telefoneDigitado;
        nEmail = emailDigitado;

        if (emailDigitado.isEmpty()) {
            txtEmail.setForeground(Color.RED);
            txtEmail.setBorder(redBorder);
            flag = false;
        } else {
            txtEmail.setForeground(Color.BLACK);
            txtEmail.setBorder(blackBorder);
            JOptionPane.showMessageDialog(null,
                    "Dados inseridos", "Alerta",
                    JOptionPane.WARNING_MESSAGE);
            criar();
            this.dispose();
        }
    }//GEN-LAST:event_btnConfirmar2ActionPerformed

    /**
     * @param args the command line arguments as
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
            java.util.logging.Logger.getLogger(Cadastrar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairro;
    private javax.swing.JButton btnConfirmar1;
    private javax.swing.JButton btnConfirmar2;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JButton btnVoltar2;
    private javax.swing.JLabel cep;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel datanasc;
    private javax.swing.JLabel email;
    private javax.swing.JLabel estadocivil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logradouro;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numero;
    private javax.swing.JPanel pnlDadosBasicos;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JTabbedPane pnlGuias;
    private javax.swing.JLabel sexo;
    private javax.swing.JComboBox<String> slcEstadoCivil;
    private javax.swing.JComboBox<String> slcSexo;
    private javax.swing.JComboBox<String> slcUf;
    private javax.swing.JLabel telefone;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroEndereco;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JLabel uf;
    // End of variables declaration//GEN-END:variables
}
