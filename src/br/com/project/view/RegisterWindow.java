/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.view;

import br.com.project.model.bean.Cidade;
import br.com.project.model.bean.Endereco;
import br.com.project.model.bean.Estado;
import br.com.project.model.bean.Pais;
import br.com.project.model.bean.Pessoa;
import br.com.project.model.bean.Telefone;
import br.com.project.model.bean.Usuario;
import br.com.project.model.dao.CidadeDAO;
import br.com.project.model.dao.EnderecoDAO;
import br.com.project.model.dao.EstadoDAO;
import br.com.project.model.dao.PaisDAO;
import br.com.project.model.dao.PessoaDAO;
import br.com.project.model.dao.TelefoneDAO;
import br.com.project.model.dao.UsuarioDAO;
import br.com.project.model.dateFormat.FormatDate;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hallan
 */
public class RegisterWindow extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegisterWindow
     */
    public RegisterWindow() {
        initComponents();
    }
    
    FormatDate formatDate = new FormatDate();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerPanel = new javax.swing.JPanel();
        informacaoRegisterPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        susCardLabel = new javax.swing.JLabel();
        susCardTextField = new javax.swing.JTextField();
        cpfLabel = new javax.swing.JLabel();
        rgLabel = new javax.swing.JLabel();
        rgTextField = new javax.swing.JTextField();
        nascimentoLabel = new javax.swing.JLabel();
        nascimentoTextField = new javax.swing.JFormattedTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneDddLabel = new javax.swing.JLabel();
        phoneDddTextField = new javax.swing.JTextField();
        phoneNumeroLabel = new javax.swing.JLabel();
        phoneNumeroTextField = new javax.swing.JTextField();
        adressLabel = new javax.swing.JLabel();
        adressTextField = new javax.swing.JTextField();
        adressNumberLabel = new javax.swing.JLabel();
        adressNumberTextField = new javax.swing.JTextField();
        adressNeighborhoodLabel = new javax.swing.JLabel();
        adressNeighborhoodTextField = new javax.swing.JTextField();
        adressCityLabel = new javax.swing.JLabel();
        adressCityTextField = new javax.swing.JTextField();
        adressCepLabel = new javax.swing.JLabel();
        titleInformations = new javax.swing.JLabel();
        officeLabel = new javax.swing.JLabel();
        officeBox = new javax.swing.JComboBox<>();
        passwordTextField = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        passwordInformationLabel = new javax.swing.JLabel();
        adressStateLabel = new javax.swing.JLabel();
        adressStateTextField = new javax.swing.JTextField();
        adressCountryLabel = new javax.swing.JLabel();
        adressCountryTextField = new javax.swing.JTextField();
        adressCepTextField = new javax.swing.JTextField();
        cpfTextField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        SmallImage = new javax.swing.JLabel();

        setBorder(null);
        setTitle("CADASTRO DE FUNCIONÁRIOS");
        setPreferredSize(new java.awt.Dimension(927, 557));

        registerPanel.setBackground(new java.awt.Color(51, 51, 51));

        informacaoRegisterPanel.setBackground(new java.awt.Color(204, 204, 204));

        nameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("NOME*");

        nameTextField.setBackground(new java.awt.Color(255, 255, 255));
        nameTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(51, 51, 51));
        nameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        susCardLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        susCardLabel.setForeground(new java.awt.Color(0, 0, 0));
        susCardLabel.setText("CARTÃO SUS*");

        susCardTextField.setBackground(new java.awt.Color(255, 255, 255));
        susCardTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        susCardTextField.setForeground(new java.awt.Color(0, 0, 0));

        cpfLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cpfLabel.setForeground(new java.awt.Color(0, 0, 0));
        cpfLabel.setText("CPF*");

        rgLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rgLabel.setForeground(new java.awt.Color(0, 0, 0));
        rgLabel.setText("RG*");

        rgTextField.setBackground(new java.awt.Color(255, 255, 255));
        rgTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rgTextField.setForeground(new java.awt.Color(0, 0, 0));

        nascimentoLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nascimentoLabel.setForeground(new java.awt.Color(0, 0, 0));
        nascimentoLabel.setText("DATA DE NASCIMENTO*");

        nascimentoTextField.setBackground(new java.awt.Color(255, 255, 255));
        nascimentoTextField.setForeground(new java.awt.Color(0, 0, 0));
        try {
            nascimentoTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        nascimentoTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nascimentoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimentoTextFieldActionPerformed(evt);
            }
        });

        phoneLabel.setBackground(new java.awt.Color(255, 255, 255));
        phoneLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(0, 0, 0));
        phoneLabel.setText("TELEFONE:");

        phoneDddLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        phoneDddLabel.setForeground(new java.awt.Color(0, 0, 0));
        phoneDddLabel.setText("DDD*");

        phoneDddTextField.setBackground(new java.awt.Color(255, 255, 255));
        phoneDddTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        phoneDddTextField.setForeground(new java.awt.Color(0, 0, 0));

        phoneNumeroLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        phoneNumeroLabel.setForeground(new java.awt.Color(0, 0, 0));
        phoneNumeroLabel.setText("NÚMERO*");

        phoneNumeroTextField.setBackground(new java.awt.Color(255, 255, 255));
        phoneNumeroTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        phoneNumeroTextField.setForeground(new java.awt.Color(0, 0, 0));

        adressLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        adressLabel.setForeground(new java.awt.Color(0, 0, 0));
        adressLabel.setText("ENDEREÇO*");

        adressTextField.setBackground(new java.awt.Color(255, 255, 255));
        adressTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        adressTextField.setForeground(new java.awt.Color(0, 0, 0));
        adressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adressTextFieldActionPerformed(evt);
            }
        });

        adressNumberLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        adressNumberLabel.setForeground(new java.awt.Color(0, 0, 0));
        adressNumberLabel.setText("Nº*");

        adressNumberTextField.setBackground(new java.awt.Color(255, 255, 255));
        adressNumberTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        adressNumberTextField.setForeground(new java.awt.Color(0, 0, 0));

        adressNeighborhoodLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        adressNeighborhoodLabel.setForeground(new java.awt.Color(0, 0, 0));
        adressNeighborhoodLabel.setText("BAIRRO*");

        adressNeighborhoodTextField.setBackground(new java.awt.Color(255, 255, 255));
        adressNeighborhoodTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        adressNeighborhoodTextField.setForeground(new java.awt.Color(0, 0, 0));

        adressCityLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        adressCityLabel.setForeground(new java.awt.Color(0, 0, 0));
        adressCityLabel.setText("CIDADE*");

        adressCityTextField.setBackground(new java.awt.Color(255, 255, 255));
        adressCityTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        adressCityTextField.setForeground(new java.awt.Color(0, 0, 0));

        adressCepLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        adressCepLabel.setForeground(new java.awt.Color(0, 0, 0));
        adressCepLabel.setText("CEP*");

        titleInformations.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titleInformations.setForeground(new java.awt.Color(0, 0, 0));
        titleInformations.setText("INFORME SEUS DADOS");

        officeLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        officeLabel.setForeground(new java.awt.Color(0, 0, 0));
        officeLabel.setText("CARGO");

        officeBox.setBackground(new java.awt.Color(255, 255, 255));
        officeBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        officeBox.setForeground(new java.awt.Color(0, 0, 0));
        officeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "médico", "enfermeiro", "técnico" }));
        officeBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        officeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officeBoxActionPerformed(evt);
            }
        });

        passwordTextField.setBackground(new java.awt.Color(255, 255, 255));
        passwordTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(0, 0, 0));
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setText("SELECIONE UMA SENHA");

        passwordInformationLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordInformationLabel.setText("Esta senha permitirá o acesso ao sistema posteriormente");

        adressStateLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        adressStateLabel.setForeground(new java.awt.Color(0, 0, 0));
        adressStateLabel.setText("ESTADO*");

        adressStateTextField.setBackground(new java.awt.Color(255, 255, 255));
        adressStateTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        adressStateTextField.setForeground(new java.awt.Color(0, 0, 0));

        adressCountryLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        adressCountryLabel.setForeground(new java.awt.Color(0, 0, 0));
        adressCountryLabel.setText("PAÍS*");

        adressCountryTextField.setBackground(new java.awt.Color(255, 255, 255));
        adressCountryTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        adressCountryTextField.setForeground(new java.awt.Color(0, 0, 0));

        adressCepTextField.setBackground(new java.awt.Color(255, 255, 255));
        adressCepTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        adressCepTextField.setForeground(new java.awt.Color(0, 0, 0));

        cpfTextField.setBackground(new java.awt.Color(255, 255, 255));
        cpfTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cpfTextField.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout informacaoRegisterPanelLayout = new javax.swing.GroupLayout(informacaoRegisterPanel);
        informacaoRegisterPanel.setLayout(informacaoRegisterPanelLayout);
        informacaoRegisterPanelLayout.setHorizontalGroup(
            informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                        .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTextField))
                            .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                                .addComponent(susCardLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(susCardTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cpfLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                                .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                                        .addComponent(phoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(43, 43, 43)
                                        .addComponent(phoneDddLabel))
                                    .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                                        .addComponent(rgLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rgTextField)))
                                .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(nascimentoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nascimentoTextField))
                                    .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(phoneDddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(phoneNumeroLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(phoneNumeroTextField)))))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacaoRegisterPanelLayout.createSequentialGroup()
                        .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                                .addComponent(adressLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adressTextField)
                                .addGap(18, 18, 18)
                                .addComponent(adressNumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adressNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                                .addComponent(adressNeighborhoodLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adressNeighborhoodTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                .addGap(49, 49, 49)
                                .addComponent(adressCityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adressCityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                            .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                                .addComponent(officeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(officeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 504, Short.MAX_VALUE))
                            .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                                .addComponent(adressCepLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adressCepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adressStateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adressStateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adressCountryLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adressCountryTextField)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacaoRegisterPanelLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(titleInformations, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addGap(149, 149, 149))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacaoRegisterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passwordInformationLabel))
            .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        informacaoRegisterPanelLayout.setVerticalGroup(
            informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacaoRegisterPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titleInformations)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(susCardLabel)
                    .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(susCardTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cpfLabel)
                        .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rgLabel)
                    .addComponent(rgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nascimentoLabel)
                    .addComponent(nascimentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneDddLabel)
                    .addComponent(phoneDddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumeroLabel)
                    .addComponent(phoneNumeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(officeLabel)
                    .addComponent(officeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressLabel)
                    .addComponent(adressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adressNumberLabel)
                    .addComponent(adressNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressNeighborhoodLabel)
                    .addComponent(adressNeighborhoodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adressCityLabel)
                    .addComponent(adressCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressCepLabel)
                    .addComponent(adressStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adressStateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adressCountryLabel)
                    .addComponent(adressCountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adressCepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(informacaoRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordInformationLabel)
                .addContainerGap())
        );

        registerButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        registerButton.setText("CADASTRAR-SE");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exitButton.setText("SAIR");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        SmallImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/project/img/logoPequeno.png"))); // NOI18N

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SmallImage))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(informacaoRegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(informacaoRegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(SmallImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_exitButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        String name = nameTextField.getText();
        String susCard = susCardTextField.getText();
        String cpf = cpfTextField.getText();
        String rg = rgTextField.getText();

        String dataNascimento = nascimentoTextField.getText();
        Date date = null;
        try {
            //formatando String para Date
            date = formatDate.formatForDate(dataNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        //formatando para modelo americano
        String dateFormated = formatDate.formatForAmericanModel(date);

        String cargo = officeBox.getSelectedItem().toString();

        int ddd = Integer.parseInt(phoneDddTextField.getText());
        String numeroTelefone = phoneNumeroTextField.getText();

        String rua = adressTextField.getText();
        int numeroCasa = Integer.parseInt(adressNumberTextField.getText());
        String bairro = adressNeighborhoodTextField.getText();
        String nomeCidade = adressCityTextField.getText();
        String cep = adressCepTextField.getText();
        String nomeEstado = adressStateTextField.getText();
        String nomePais = adressCountryTextField.getText();

        String password = passwordTextField.getText();
        try {
            Telefone telefone = new Telefone(ddd,numeroTelefone);
            new TelefoneDAO().save(telefone);
            Endereco endereco = new Endereco(rua,numeroCasa,bairro,cep);
            new EnderecoDAO().save(endereco);
            Cidade cidade = new Cidade(nomeCidade,endereco.getId());
            new CidadeDAO().save(cidade);
            Estado estado = new Estado(nomeEstado, cidade.getId());
            new EstadoDAO().save(estado);
            Pais pais = new Pais(nomePais, estado.getId());
            new PaisDAO().save(pais);
            Pessoa pessoa = new  Pessoa(cpf, rg, name,dateFormated,cargo, susCard, endereco.getId(), telefone.getId());
            new PessoaDAO().save(pessoa);
            Usuario usuario = new Usuario(pessoa.getId(),pessoa.getCpf(),password);
            new UsuarioDAO().save(usuario); 
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "dados inválidos");
        }
        
//        JOptionPane.showMessageDialog(this, "salvo com sucesso");

//        this.setVisible(false);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void adressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adressTextFieldActionPerformed

    private void nascimentoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascimentoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nascimentoTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void officeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_officeBoxActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SmallImage;
    private javax.swing.JLabel adressCepLabel;
    private javax.swing.JTextField adressCepTextField;
    private javax.swing.JLabel adressCityLabel;
    private javax.swing.JTextField adressCityTextField;
    private javax.swing.JLabel adressCountryLabel;
    private javax.swing.JTextField adressCountryTextField;
    private javax.swing.JLabel adressLabel;
    private javax.swing.JLabel adressNeighborhoodLabel;
    private javax.swing.JTextField adressNeighborhoodTextField;
    private javax.swing.JLabel adressNumberLabel;
    private javax.swing.JTextField adressNumberTextField;
    private javax.swing.JLabel adressStateLabel;
    private javax.swing.JTextField adressStateTextField;
    private javax.swing.JTextField adressTextField;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel informacaoRegisterPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nascimentoLabel;
    private javax.swing.JFormattedTextField nascimentoTextField;
    private javax.swing.JComboBox<String> officeBox;
    private javax.swing.JLabel officeLabel;
    private javax.swing.JLabel passwordInformationLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel phoneDddLabel;
    private javax.swing.JTextField phoneDddTextField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel phoneNumeroLabel;
    private javax.swing.JTextField phoneNumeroTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel rgLabel;
    private javax.swing.JTextField rgTextField;
    private javax.swing.JLabel susCardLabel;
    private javax.swing.JTextField susCardTextField;
    private javax.swing.JLabel titleInformations;
    // End of variables declaration//GEN-END:variables
}
