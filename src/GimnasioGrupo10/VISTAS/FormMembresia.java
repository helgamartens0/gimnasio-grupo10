/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.VISTAS;

import GimnasioGrupo10.ACCESO_A_DATOS.MembresiaData;
import GimnasioGrupo10.ENTIDADES.Membresia;
import GimnasioGrupo10.ENTIDADES.Socio;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesica
 */
public class FormMembresia extends javax.swing.JInternalFrame {

    private Membresia membresia;
    private MembresiaData memData;
    /**
     * Creates new form FormMembresia
     */
    public FormMembresia() {
        this.memData = new MembresiaData();
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

        jlFechaInicio = new javax.swing.JLabel();
        jlFechaFin = new javax.swing.JLabel();
        jtCosto = new javax.swing.JTextField();
        jlCantPases = new javax.swing.JLabel();
        jlCosto = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jtCantPases = new javax.swing.JTextField();
        jlFormulario = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jlSocio = new javax.swing.JLabel();
        jcbSocio = new javax.swing.JComboBox<>();
        jdcFechaInc = new com.toedter.calendar.JDateChooser();
        jdcFechaFin = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setTitle("NUEVA MEMBRESIA");
        setToolTipText("");

        jlFechaInicio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlFechaInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFechaInicio.setText("Fecha de Inicio");

        jlFechaFin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlFechaFin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFechaFin.setText("Fecha de Fin");

        jlCantPases.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlCantPases.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCantPases.setText("Cant. de pases");

        jlCosto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlCosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCosto.setText("Costo ");

        jbSalir.setText("Salir");
        jbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSalirMouseClicked(evt);
            }
        });

        jlFormulario.setFont(new java.awt.Font("Dubai Medium", 3, 18)); // NOI18N
        jlFormulario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFormulario.setText("Nueva Membresia");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jlSocio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jlSocio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlSocio.setText("Seleccione el Socio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jlSocio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jlCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jtCosto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                .addComponent(jlFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jdcFechaInc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCantPases, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jcbSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtCantPases, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCantPases)
                    .addComponent(jtCantPases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFechaInicio)
                    .addComponent(jdcFechaInc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFechaFin)
                    .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCosto)
                    .addComponent(jtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirMouseClicked

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        
        try {
            Socio socio = (Socio) jcbSocio.getSelectedItem();
            Integer cantPas = Integer.parseInt(jtCantPases.getText());
            LocalDate fechaInc = jdcFechaInc.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFin = jdcFechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Double valor = Double.parseDouble(jtCosto.getText());
            
            if (cantPas==null || fechaInc ==  null || fechaFin ==  null || valor ==  null || socio ==  null) {
                JOptionPane.showMessageDialog(null, "NO puede haber campos vacios");
            } else {
                membresia = new Membresia(socio, cantPas, fechaInc, fechaFin, valor,true);
                memData.cargarMembresia(membresia);
            }               
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Socio> jcbSocio;
    private com.toedter.calendar.JDateChooser jdcFechaFin;
    private com.toedter.calendar.JDateChooser jdcFechaInc;
    private javax.swing.JLabel jlCantPases;
    private javax.swing.JLabel jlCosto;
    private javax.swing.JLabel jlFechaFin;
    private javax.swing.JLabel jlFechaInicio;
    private javax.swing.JLabel jlFormulario;
    private javax.swing.JLabel jlSocio;
    private javax.swing.JTextField jtCantPases;
    private javax.swing.JTextField jtCosto;
    // End of variables declaration//GEN-END:variables
}
