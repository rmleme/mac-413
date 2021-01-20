/*
 * TelaBalanco.java
 *
 * Created on 27 de Novembro de 2002, 16:26
 */

package telas;

import negocios.*;
import dialogos.*;
import java.util.*;

/**
 *
 * @author  leme
 */
public class TelaBalanco extends javax.swing.JDialog {
    
    /** Creates new form TelaBalanco */
    public TelaBalanco(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cmbPeriodoMes.addItem(new String("Janeiro"));
        cmbPeriodoMes.addItem(new String("Fevereiro"));
        cmbPeriodoMes.addItem(new String("Mar�o"));
        cmbPeriodoMes.addItem(new String("Abril"));
        cmbPeriodoMes.addItem(new String("Maio"));
        cmbPeriodoMes.addItem(new String("Junho"));
        cmbPeriodoMes.addItem(new String("Julho"));
        cmbPeriodoMes.addItem(new String("Agosto"));
        cmbPeriodoMes.addItem(new String("Setembro"));
        cmbPeriodoMes.addItem(new String("Outubro"));
        cmbPeriodoMes.addItem(new String("Novembro"));
        cmbPeriodoMes.addItem(new String("Dezembro"));
        setLocationRelativeTo(parent);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        painel = new javax.swing.JPanel();
        lblPeriodo = new javax.swing.JLabel();
        txtPeriodoAno = new javax.swing.JTextField();
        lblPeriodoAno = new javax.swing.JLabel();
        lblPeriodoMes = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnLimpa = new javax.swing.JButton();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        lblMes = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        lblReceita = new javax.swing.JLabel();
        txtReceita = new javax.swing.JTextField();
        lblDespesa = new javax.swing.JLabel();
        txtDespesa = new javax.swing.JTextField();
        lblSaldo = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        lblLancamentos = new javax.swing.JLabel();
        scrLancamentos = new javax.swing.JScrollPane();
        lstLancamentos = new javax.swing.JList();
        cmbPeriodoMes = new javax.swing.JComboBox();

        setTitle("Balan\u00e7o mensal");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("telaBalanco");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        painel.setLayout(null);

        painel.setPreferredSize(new java.awt.Dimension(423, 360));
        lblPeriodo.setText("Per\u00edodo de abrang\u00eancia:");
        lblPeriodo.setForeground(new java.awt.Color(0, 0, 153));
        lblPeriodo.setName("lblPeriodo");
        painel.add(lblPeriodo);
        lblPeriodo.setBounds(10, 10, 180, 23);

        txtPeriodoAno.setName("txtPeriodoAno");
        painel.add(txtPeriodoAno);
        txtPeriodoAno.setBounds(70, 40, 40, 27);

        lblPeriodoAno.setText("Ano:");
        lblPeriodoAno.setForeground(new java.awt.Color(0, 0, 153));
        lblPeriodoAno.setName("lblPeriodoAno");
        painel.add(lblPeriodoAno);
        lblPeriodoAno.setBounds(30, 40, 40, 23);

        lblPeriodoMes.setText("M\u00eas:");
        lblPeriodoMes.setForeground(new java.awt.Color(0, 0, 153));
        lblPeriodoMes.setName("lblPeriodoMes");
        painel.add(lblPeriodoMes);
        lblPeriodoMes.setBounds(30, 70, 40, 23);

        btnOk.setMnemonic('O');
        btnOk.setText("Ok");
        btnOk.setName("btnLimpa");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        painel.add(btnOk);
        btnOk.setBounds(90, 120, 90, 33);

        btnLimpa.setMnemonic('L');
        btnLimpa.setText("Limpa");
        btnLimpa.setName("btnLimpa");
        btnLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaActionPerformed(evt);
            }
        });

        painel.add(btnLimpa);
        btnLimpa.setBounds(250, 120, 90, 33);

        lblAno.setText("Ano:");
        lblAno.setForeground(new java.awt.Color(0, 0, 153));
        lblAno.setName("lblAno");
        painel.add(lblAno);
        lblAno.setBounds(10, 180, 32, 23);

        txtAno.setName("txtAno");
        txtAno.setEnabled(false);
        painel.add(txtAno);
        txtAno.setBounds(50, 180, 40, 27);

        lblMes.setText("M\u00eas:");
        lblMes.setForeground(new java.awt.Color(0, 0, 153));
        lblMes.setName("lblMes");
        painel.add(lblMes);
        lblMes.setBounds(140, 180, 32, 23);

        txtMes.setName("txtMes");
        txtMes.setEnabled(false);
        painel.add(txtMes);
        txtMes.setBounds(180, 180, 80, 27);

        lblReceita.setText("Receita:");
        lblReceita.setForeground(new java.awt.Color(0, 0, 153));
        lblReceita.setName("lblReceita");
        painel.add(lblReceita);
        lblReceita.setBounds(10, 210, 60, 23);

        txtReceita.setName("txtReceita");
        txtReceita.setEnabled(false);
        painel.add(txtReceita);
        txtReceita.setBounds(70, 210, 60, 27);

        lblDespesa.setText("Despesa:");
        lblDespesa.setForeground(new java.awt.Color(0, 0, 153));
        lblDespesa.setName("lblDespesa");
        painel.add(lblDespesa);
        lblDespesa.setBounds(150, 210, 63, 23);

        txtDespesa.setName("txtDespesa");
        txtDespesa.setEnabled(false);
        painel.add(txtDespesa);
        txtDespesa.setBounds(220, 210, 60, 27);

        lblSaldo.setText("Saldo:");
        lblSaldo.setForeground(new java.awt.Color(0, 0, 153));
        lblSaldo.setName("lblSaldo");
        painel.add(lblSaldo);
        lblSaldo.setBounds(300, 210, 43, 23);

        txtSaldo.setName("txtSaldo");
        txtSaldo.setEnabled(false);
        painel.add(txtSaldo);
        txtSaldo.setBounds(350, 210, 60, 27);

        lblLancamentos.setText("Lan\u00e7amentos:");
        lblLancamentos.setForeground(new java.awt.Color(0, 0, 153));
        lblLancamentos.setName("lblLancamentos");
        painel.add(lblLancamentos);
        lblLancamentos.setBounds(10, 240, 100, 23);

        scrLancamentos.setName("scrLancamentos");
        scrLancamentos.setEnabled(false);
        lstLancamentos.setName("lstLancamentos");
        lstLancamentos.setEnabled(false);
        scrLancamentos.setViewportView(lstLancamentos);

        painel.add(scrLancamentos);
        scrLancamentos.setBounds(110, 250, 180, 100);

        cmbPeriodoMes.setName("cmbPeriodoMes");
        painel.add(cmbPeriodoMes);
        cmbPeriodoMes.setBounds(70, 70, 100, 32);

        getContentPane().add(painel, java.awt.BorderLayout.CENTER);

        pack();
    }//GEN-END:initComponents

    private void limpaCampos()
    {
        txtPeriodoAno.setText(null);
        cmbPeriodoMes.setSelectedIndex(-1);
        txtAno.setText(null);
        txtMes.setText(null);
        txtReceita.setText(null);
        txtDespesa.setText(null);
        txtSaldo.setText(null);
        Object[] vazio = {};
        lstLancamentos.setListData(vazio);
    }

    private void mostraDados(HistoricoContabil hc)
    {
        txtAno.setText(Integer.toString(hc.getAno()));
        txtMes.setText(hc.getMes());
        txtReceita.setText(Double.toString(hc.getReceita().getValor()));
        txtDespesa.setText(Double.toString(hc.getDespesa().getValor()));
        txtSaldo.setText(Double.toString(hc.obtemSaldo().getValor()));        
        lstLancamentos.setListData(hc.getLancamentos().toArray());
    }
    
    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        int ano = 0;
        String mes = null;
        boolean dadosValidos = true;
        
        try {
            ano = Integer.parseInt(txtPeriodoAno.getText());
        }
        catch (NumberFormatException nfe) {
            new DialogoConfirmacao(new javax.swing.JFrame(), true , "Erro: digite um ano",
                                   "Ano em branco.").show();
            dadosValidos = false;
        }
        
        if (cmbPeriodoMes.getSelectedIndex() != -1)
            mes = new String((String) cmbPeriodoMes.getSelectedItem());
        else
        {
            new DialogoConfirmacao(new javax.swing.JFrame(), true, "Erro: selecione um m\u00eas",
                                   "M\u00eas em branco.").show();
            dadosValidos = false;
        }
        
        if (dadosValidos) {
            Consultorio consultorio = Consultorio.Instance();
            HistoricoContabil hc = consultorio.buscaHistorico(ano,mes);
            if (hc != null)
                mostraDados(hc);
            else
                limpaCampos();
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btnLimpaActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new TelaBalanco(new javax.swing.JFrame(), true).show();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbPeriodoMes;
    private javax.swing.JScrollPane scrLancamentos;
    private javax.swing.JLabel lblMes;
    private javax.swing.JList lstLancamentos;
    private javax.swing.JLabel lblReceita;
    private javax.swing.JTextField txtMes;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JTextField txtDespesa;
    private javax.swing.JLabel lblAno;
    private javax.swing.JTextField txtPeriodoAno;
    private javax.swing.JTextField txtAno;
    private javax.swing.JButton btnOk;
    private javax.swing.JTextField txtReceita;
    private javax.swing.JButton btnLimpa;
    private javax.swing.JLabel lblPeriodoMes;
    private javax.swing.JLabel lblLancamentos;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JPanel painel;
    private javax.swing.JLabel lblPeriodoAno;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblDespesa;
    // End of variables declaration//GEN-END:variables
    
}
