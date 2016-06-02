package Frames.Cadastro;

import BancoDeDados.BancoDeDados;
import Frames.EditarTimes;
import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import src.Jogador;
import src.Time;
import src.enumeracao.EnumHabilidade;
import src.enumeracao.EnumPosicao;

/**
 *
 * @author bruno.souza
 */
public class CadastrarJogador extends javax.swing.JDialog {

    private BancoDeDados bd;
    private Border b;
    private Time t;
    private ImageIcon img16;
    private ImageIcon img24;
    private ImageIcon img128;
    private EditarTimes et;
    
    public CadastrarJogador(java.awt.Frame parent, BancoDeDados bd, Time t, EditarTimes et) {
        super(parent, true);
        initComponents();
        this.t = t;
        this.et = et;
        
        lblNomeTime.setText(t.getNome());
        lblEscudoTime32.setIcon(t.getEscudo32());
        lblFotoJogador128.setIcon(new ImageIcon(getClass().getResource("/resources/rostos/jogador/128/default.png")));
        setBd(bd);        
        campoId.setText(nextId() + "");
        popularComboPosicao();
        popularCombosHabilidade();
        this.b = campoNome.getBorder();
        this.lblOk.setVisible(false);
        this.lblNok.setVisible(false);
    }

    public ImageIcon getImg16() {
        return img16;
    }

    public void setImg16(ImageIcon img16) {
        this.img16 = img16;
    }

    public ImageIcon getImg24() {
        return img24;
    }

    public void setImg24(ImageIcon img24) {
        this.img24 = img24;
    }

    public ImageIcon getImg128() {
        return img128;
    }

    public void setImg128(ImageIcon img128) {
        this.img128 = img128;
    }
    
    private int nextId(){
        return (getBd().getJogadores().get(getBd().getJogadores().size()-1).getId()+1);
    }
    
    private void popularComboPosicao(){
     
        EnumPosicao [] enumPosi = EnumPosicao.values();
        
        for(int i=0; i < enumPosi.length; i++){
            comboPosicao.addItem(enumPosi[i]);
        }
    }
    
    private void popularCombosHabilidade(){
        
        EnumHabilidade [] enumHab = EnumHabilidade.values();
        
        for(int i=0; i < enumHab.length; i++){
            comboHabilidade1.addItem(enumHab[i]);
            comboHabilidade2.addItem(enumHab[i]);
        }
        
    }

    public JLabel getLblFotoJogador128() {
        return lblFotoJogador128;
    }

    public void setLblFotoJogador128(JLabel lblFotoJogador128) {
        this.lblFotoJogador128 = lblFotoJogador128;
    }
        
    public BancoDeDados getBd() {
        return bd;
    }

    public void setBd(BancoDeDados bd) {
        this.bd = bd;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboPosicao = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboHabilidade1 = new javax.swing.JComboBox();
        comboHabilidade2 = new javax.swing.JComboBox();
        checkCraque = new javax.swing.JCheckBox();
        slider = new javax.swing.JSlider();
        campoNome = new javax.swing.JTextField();
        campoId = new javax.swing.JTextField();
        lblValue = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        lblOk = new javax.swing.JLabel();
        lblNok = new javax.swing.JLabel();
        lblFotoJogador128 = new javax.swing.JLabel();
        lblNomeTime = new javax.swing.JLabel();
        lblEscudoTime32 = new javax.swing.JLabel();
        btnFotoJogador = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        checkTitular = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Jogador");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel4.setText("Posição:");

        jLabel5.setText("Idade:");

        jLabel3.setText("Habilidade 1:");

        jLabel7.setText("Habilidade 2:");

        checkCraque.setBackground(new java.awt.Color(255, 255, 255));
        checkCraque.setText("Craque:");
        checkCraque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        checkCraque.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        slider.setBackground(new java.awt.Color(255, 255, 255));
        slider.setMaximum(40);
        slider.setMinimum(17);
        slider.setPaintLabels(true);
        slider.setToolTipText("");
        slider.setValue(20);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        campoId.setEditable(false);
        campoId.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        campoId.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblValue.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValue.setText("20");

        btnCadastrar.setText("Adicionar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblOk.setBackground(new java.awt.Color(255, 255, 255));
        lblOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/16/success.png"))); // NOI18N

        lblNok.setBackground(new java.awt.Color(255, 255, 255));
        lblNok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diversos/16/fail.png"))); // NOI18N

        lblFotoJogador128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNomeTime.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNomeTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblEscudoTime32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEscudoTime32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnFotoJogador.setText("Foto");
        btnFotoJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoJogadorActionPerformed(evt);
            }
        });

        checkTitular.setBackground(new java.awt.Color(255, 255, 255));
        checkTitular.setText("Titular:");
        checkTitular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkTitular.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEscudoTime32, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeTime, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblFotoJogador128, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(btnFotoJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboHabilidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboPosicao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboHabilidade1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoNome)
                                    .addComponent(campoId)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(checkTitular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkCraque))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNok)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOk)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEscudoTime32, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lblNomeTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFotoJogador128, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comboPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboHabilidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(comboHabilidade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFotoJogador)
                            .addComponent(checkCraque)
                            .addComponent(checkTitular))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        lblValue.setText(slider.getValue() + "");        
    }//GEN-LAST:event_sliderStateChanged

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        if(campoNome.getText().isEmpty()){            
            this.lblOk.setVisible(false);
            this.lblNok.setVisible(true);
            this.lblNok.setToolTipText("Campo 'Nome' não pode ser vazio!");
        } else {
            if(getImg16() == null){
                setImg16(new ImageIcon(getClass().getResource("/resources/rostos/jogador/16/default.png")));
            }

            if(getImg24() == null){
                setImg24(new ImageIcon(getClass().getResource("/resources/rostos/jogador/24/default.png")));
            }

            if(getImg128() == null){
                setImg128(new ImageIcon(getClass().getResource("/resources/rostos/jogador/128/default.png")));
            }

            Jogador j = new Jogador(Integer.parseInt(campoId.getText()), getImg16(), getImg24(), getImg128(), campoNome.getText(), (EnumPosicao) comboPosicao.getSelectedItem(), 
                slider.getValue(), (EnumHabilidade) comboHabilidade1.getSelectedItem(), (EnumHabilidade) comboHabilidade2.getSelectedItem(),
                checkCraque.isSelected(), this.t, getBd(), checkTitular.isSelected());

            this.t.getJogadores().add(j);

            if(checkTitular.isSelected()){
                this.t.getJogadoresTitular().add(j);    
            } else {
                this.t.getJogadoresReserva().add(j);
            }

            getBd().getJogadores().add(j);
            this.lblOk.setVisible(true);
            this.lblOk.setToolTipText("Jogador \"" + j.getNome() + "\" cadastrado com sucesso!");
            this.lblNok.setVisible(false);
            campoId.setText(nextId() + "");
            campoNome.setText("");                
            slider.setValue(20); 
            this.et.carregarPainelReserva(this.t);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnFotoJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoJogadorActionPerformed

        FotoJogador fj = new FotoJogador(null, this);
        fj.setVisible(true);
        
    }//GEN-LAST:event_btnFotoJogadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnFotoJogador;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNome;
    private javax.swing.JCheckBox checkCraque;
    private javax.swing.JCheckBox checkTitular;
    private javax.swing.JComboBox comboHabilidade1;
    private javax.swing.JComboBox comboHabilidade2;
    private javax.swing.JComboBox comboPosicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEscudoTime32;
    private javax.swing.JLabel lblFotoJogador128;
    private javax.swing.JLabel lblNok;
    private javax.swing.JLabel lblNomeTime;
    private javax.swing.JLabel lblOk;
    private javax.swing.JLabel lblValue;
    private javax.swing.JSlider slider;
    // End of variables declaration//GEN-END:variables
}
