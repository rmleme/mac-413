package telas;
/*
 * TelaRelatorio.java
 *
 * Created on 27 de Novembro de 2002, 16:33
 */

import java.util.*;
import java.lang.*;
import dialogos.*;
import negocios.*;

/**
 *
 * @author  leme
 */
public class TelaRelatorio extends javax.swing.JDialog {
    ArrayList relatorio = new ArrayList ();
    
    /** Creates new form TelaRelatorio */
    public TelaRelatorio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        carregaPacientes ();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        painel = new javax.swing.JPanel();
        jComboBoxPacientes = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();

        setTitle("Relat\u00f3rio de tratamento");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("telaRelatorio");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        painel.setLayout(null);

        painel.setPreferredSize(new java.awt.Dimension(430, 370));
        jComboBoxPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPacientesActionPerformed(evt);
            }
        });

        painel.add(jComboBoxPacientes);
        jComboBoxPacientes.setBounds(20, 50, 390, 32);

        jLabel1.setText("Paciente");
        painel.add(jLabel1);
        jLabel1.setBounds(20, 20, 90, 23);

        jScrollPane1.setViewportView(jList1);

        painel.add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 390, 160);

        jLabel2.setText("Relat\u00f3rio");
        painel.add(jLabel2);
        jLabel2.setBounds(20, 100, 80, 23);

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        painel.add(jButtonFechar);
        jButtonFechar.setBounds(170, 320, 81, 33);

        getContentPane().add(painel, java.awt.BorderLayout.CENTER);

        pack();
    }//GEN-END:initComponents

    private void carregaPacientes () {
        Consultorio cons = Consultorio.Instance();
        ArrayList lista = cons.getPacientes();       
        for (int i = 0; i < lista.size(); i++) {
            jComboBoxPacientes.addItem(lista.get(i));
        }
    }
  
    private void Relatorio (String pre, ArrayList consultas) {        
        for (int i = 0; i < consultas.size(); i++) {
            Consulta c = (Consulta) consultas.get(i);
            relatorio.add(new String (pre + c.toString()));
            ArrayList consultas2 = c.getConsultas();
            if (consultas2 != null) {
                Relatorio (pre + " ", consultas2);            
            }                
        }        
    }
    
    private void jComboBoxPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPacientesActionPerformed
        // Add your handling code here:
        Paciente paciente = (Paciente) jComboBoxPacientes.getSelectedItem();
        String s;
        ArrayList consultas = paciente.getConsultas();        
        Relatorio ("", consultas);
    }//GEN-LAST:event_jComboBoxPacientesActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // Add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new TelaRelatorio(new javax.swing.JFrame(), true).show();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBoxPacientes;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JList jList1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
    
}
