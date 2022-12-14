/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Clases.ClsCandidato;
import Clases.ClsResultado;
import Controladores.CtlResultado;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leine
 */
public class FrameControlVotacion extends javax.swing.JFrame {

    JFrame FrameMenu;
    CtlResultado controladorResultado;
    LinkedList<ClsResultado> listaResultadoVoto;

    /**
     * Creates new form FrameControlVotacion
     */
    public FrameControlVotacion(JFrame FrameMenu) {
        initComponents();
        this.FrameMenu = FrameMenu;
        this.controladorResultado = new CtlResultado();
        llamarResultado();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        img_registraduria = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConteoVotos = new javax.swing.JTable();
        cerrarVotaciones = new javax.swing.JButton();
        SalirVotos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        img_registraduria.setIcon(new javax.swing.ImageIcon("C:\\Users\\leine\\Documents\\NetBeansProjects\\Elecciones_mintic\\src\\main\\java\\img\\Reeeeee.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Administrador de elecciones");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        tablaConteoVotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Partido", "Total de votos"
            }
        ));
        jScrollPane1.setViewportView(tablaConteoVotos);

        jTabbedPane1.addTab("Conteo de votos", jScrollPane1);

        cerrarVotaciones.setText("Cerrar votaciones");
        cerrarVotaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarVotacionesActionPerformed(evt);
            }
        });

        SalirVotos.setText("Salir");
        SalirVotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirVotosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(img_registraduria)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cerrarVotaciones)
                                .addGap(18, 18, 18)
                                .addComponent(SalirVotos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(img_registraduria)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cerrarVotaciones)
                    .addComponent(SalirVotos))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirVotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirVotosActionPerformed
        this.dispose();
        this.FrameMenu.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_SalirVotosActionPerformed

    private void cerrarVotacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarVotacionesActionPerformed

        String nombre="";
        String partido="";
        int voto = 0;
        int secuencia = 0;

        for (ClsResultado i : this.listaResultadoVoto) {
            if (secuencia == 0 ) {
                nombre = i.getNombre();
                partido = i.getPartido();
                voto = i.getVotos();
                secuencia = secuencia + 1;
            }

            if ( i.getVotos()>voto) {
                nombre = i.getNombre();
                partido = i.getPartido();
                voto = i.getVotos();

            }

        }
        JOptionPane.showMessageDialog(null, "El ganado es: "+nombre+" del partido: "+partido+" con un total de: "+voto+" votos");

// TODO add your handling code here:
    }//GEN-LAST:event_cerrarVotacionesActionPerformed

    public void llamarResultado() {
        this.listaResultadoVoto = this.controladorResultado.llamarResultado();
        this.actualizar_tabla_candidato(listaResultadoVoto);
    }

    private void actualizar_tabla_candidato(LinkedList<ClsResultado> resultado) {
        DefaultTableModel modelo = (DefaultTableModel) this.tablaConteoVotos.getModel();
        modelo.setRowCount(0);
        for (ClsResultado i : resultado) {
            Object[] fila = {i.getNombre(), i.getPartido(), i.getVotos()};//esto es paras tener la info organizada
            modelo.addRow(fila); //agregar la  informacion a la tabla    
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameControlVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameControlVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameControlVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameControlVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameControlVotacion(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalirVotos;
    private javax.swing.JButton cerrarVotaciones;
    private javax.swing.JLabel img_registraduria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaConteoVotos;
    // End of variables declaration//GEN-END:variables
}
