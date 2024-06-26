/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.VISTAS;

import GimnasioGrupo10.ACCESO_A_DATOS.SocioData;
import GimnasioGrupo10.ENTIDADES.Socio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesica
 */
public class FormListSocio extends javax.swing.JInternalFrame {
    private List<Socio> listaActivos;
    private List<Socio> listaInactivos;
   
    private SocioData socioData  = new SocioData();
    private Socio socio=new Socio();

    private DefaultTableModel modelo;
    /**
     * Creates new form FormListSocio
     */
    public FormListSocio() {
        initComponents();
        modelo = new DefaultTableModel();
        listaActivos = socioData.listarSociosActivos();
        listaInactivos = socioData.listarSociosInactivos();
        armarCabeceraTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlSocio = new javax.swing.JLabel();
        jrbInactivos = new javax.swing.JRadioButton();
        jrbActivos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbAlta = new javax.swing.JButton();
        jbBaja = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(480, 471));

        jlSocio.setFont(new java.awt.Font("Dubai Medium", 3, 18)); // NOI18N
        jlSocio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSocio.setText("Listado de Socio");

        jrbInactivos.setText("Inactivos");
        jrbInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactivosActionPerformed(evt);
            }
        });

        jrbActivos.setText("Activos");
        jrbActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivosActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(jtTabla);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbAlta.setText("Alta");
        jbAlta.setEnabled(false);
        jbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaActionPerformed(evt);
            }
        });

        jbBaja.setText("Baja");
        jbBaja.setEnabled(false);
        jbBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar Lista");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jrbActivos)
                .addGap(70, 70, 70)
                .addComponent(jrbInactivos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jbAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbActivos)
                    .addComponent(jrbInactivos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbAlta)
                    .addComponent(jbBaja)
                    .addComponent(actualizar))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivosActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        jrbActivos.setSelected(false);
        cargaDatosInactivos();
        jbBaja.setEnabled(false);
        jbAlta.setEnabled(true);

    }//GEN-LAST:event_jrbInactivosActionPerformed

    private void jrbActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivosActionPerformed
        // TODO add your handling code here:

        borrarFilaTabla();
        jrbInactivos.setSelected(false);
        cargaDatosActivos();  
        jbBaja.setEnabled(true);
        jbAlta.setEnabled(false);
        
    }//GEN-LAST:event_jrbActivosActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jtTabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            
            int idSocio = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            socioData.altaSocio(idSocio);
            borrarFilaTabla();
            
        }
    }//GEN-LAST:event_jbAltaActionPerformed

    private void jbBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jtTabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            
            int idSocio = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            socioData.eliminarSocio(idSocio);
            borrarFilaTabla();
            
        
        }        
    }//GEN-LAST:event_jbBajaActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
        actualizarListas();
        borrarFilaTabla();

        if (jrbActivos.isSelected()) {
            cargaDatosActivos();
        } else if (jrbInactivos.isSelected()) {
            cargaDatosInactivos();
        }
    }//GEN-LAST:event_actualizarActionPerformed
    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Apellido");
        filaCabecera.add("Edad");
        filaCabecera.add("Correo");
        filaCabecera.add("Telefono");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtTabla.setModel(modelo);
    }
    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargaDatosActivos() {
        //borrarFilasTabla();
       
        
        for (Socio s : listaActivos) {
            modelo.addRow(new Object[]{s.getId_socio(), s.getNombre_socio(), s.getApellido_socio(), s.getEdad_socio(), s.getCorreo_socio(),s.getTelefono_socio()});
        }
    }

    private void cargaDatosInactivos() {
        //borrarFilasTabla();
        
        for (Socio s : listaInactivos) {
            modelo.addRow(new Object[]{s.getId_socio(), s.getNombre_socio(), s.getApellido_socio(), s.getEdad_socio(), s.getCorreo_socio(),s.getTelefono_socio()});
        }
    }
    private void actualizarListas() {
        listaActivos = socioData.listarSociosActivos();
        listaInactivos = socioData.listarSociosInactivos();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlta;
    private javax.swing.JButton jbBaja;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlSocio;
    private javax.swing.JRadioButton jrbActivos;
    private javax.swing.JRadioButton jrbInactivos;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}
