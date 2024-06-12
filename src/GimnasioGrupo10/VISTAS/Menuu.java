/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.VISTAS;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesica
 */
public class Menuu extends javax.swing.JFrame {

    /**
     * Creates new form Menuu
     */
    public Menuu() {
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmSocio = new javax.swing.JMenu();
        jmiFormSocio = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        jmiMembresia = new javax.swing.JMenuItem();
        jmiClase = new javax.swing.JMenuItem();
        jmiEntrenador = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiListClase = new javax.swing.JMenuItem();
        jmiListEntrenador = new javax.swing.JMenuItem();
        jmiListSocios = new javax.swing.JMenuItem();
        jmiListasDisp = new javax.swing.JCheckBoxMenuItem();
        jmiBusquedaClases = new javax.swing.JCheckBoxMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setFocusable(false);
        setResizable(false);

        escritorio.setPreferredSize(new java.awt.Dimension(480, 471));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        jmSocio.setText("SOCIO");
        jmSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSocioActionPerformed(evt);
            }
        });

        jmiFormSocio.setText("Formulario Socio");
        jmiFormSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormSocioActionPerformed(evt);
            }
        });
        jmSocio.add(jmiFormSocio);

        jMenuBar1.add(jmSocio);

        jmAdministracion.setText("ADMINISTRACION");

        jmiMembresia.setText("Membresia");
        jmiMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMembresiaActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiMembresia);

        jmiClase.setText("Clase");
        jmiClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClaseActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiClase);

        jmiEntrenador.setText("Entrenador");
        jmiEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEntrenadorActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiEntrenador);

        jMenuBar1.add(jmAdministracion);

        jmConsultas.setText("CONSULTAS");

        jmiListClase.setText("Listado por Clase");
        jmiListClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListClaseActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiListClase);

        jmiListEntrenador.setText("Listado de Entrenadores");
        jmiListEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListEntrenadorActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiListEntrenador);

        jmiListSocios.setText("Listado de Socios");
        jmiListSocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListSociosActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiListSocios);

        jmiListasDisp.setSelected(true);
        jmiListasDisp.setText("Lista Clases Disponibles");
        jmiListasDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListasDispActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiListasDisp);

        jmiBusquedaClases.setSelected(true);
        jmiBusquedaClases.setText("Busqueda Clases");
        jmiBusquedaClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBusquedaClasesActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiBusquedaClases);

        jMenuBar1.add(jmConsultas);

        jmSalir.setText("SALIR");
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFormSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormSocioActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormSocio fSocio = new FormSocio();
        fSocio.setVisible(true);
        escritorio.add(fSocio);
    }//GEN-LAST:event_jmiFormSocioActionPerformed

    private void jmiClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClaseActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormClase fClase = new FormClase();
        fClase.setVisible(true);
        escritorio.add(fClase);
    }//GEN-LAST:event_jmiClaseActionPerformed

    private void jmiEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEntrenadorActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormEntrenador fEntrenador = new FormEntrenador();
        fEntrenador.setVisible(true);
        escritorio.add(fEntrenador);
    }//GEN-LAST:event_jmiEntrenadorActionPerformed

    private void jmSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSocioActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jmSocioActionPerformed

    private void jmiMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMembresiaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormListadoMembresia fLMembresia = new FormListadoMembresia();
        fLMembresia.setVisible(true);
        escritorio.add(fLMembresia);
    }//GEN-LAST:event_jmiMembresiaActionPerformed

    private void jmiListClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListClaseActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormListadoPorClase fLClase = new FormListadoPorClase();
        fLClase.setVisible(true);
        escritorio.add(fLClase);
    }//GEN-LAST:event_jmiListClaseActionPerformed

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        // TODO add your handling code here:

        int confirm = JOptionPane.showConfirmDialog(null, "Desea salir del menu ?", "MENU", JOptionPane.YES_NO_OPTION);

        if (confirm == 0) {
            dispose();
        }
    }//GEN-LAST:event_jmSalirMouseClicked

    private void jmiListEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListEntrenadorActionPerformed
        // TODO add your handling code here:

        escritorio.removeAll();
        escritorio.repaint();
        FormListadoEntrenadores fLEntrenador = new FormListadoEntrenadores();
        fLEntrenador.setVisible(true);
        escritorio.add(fLEntrenador);
    }//GEN-LAST:event_jmiListEntrenadorActionPerformed

    private void jmiListSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListSociosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormListSocio fLSocio = new FormListSocio();
        fLSocio.setVisible(true);
        escritorio.add(fLSocio);
    }//GEN-LAST:event_jmiListSociosActionPerformed

    private void jmiListasDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListasDispActionPerformed
        // TODO add your handling code here:

        escritorio.removeAll();
        escritorio.repaint();
        ListadoClasesDisp cd = new ListadoClasesDisp();
        cd.setVisible(true);
        escritorio.add(cd);
        escritorio.moveToFront(cd);
    }//GEN-LAST:event_jmiListasDispActionPerformed

    private void jmiBusquedaClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBusquedaClasesActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaClases bc = new BusquedaClases();
        bc.setVisible(true);
        escritorio.add(bc);
        escritorio.moveToFront(bc);

    }//GEN-LAST:event_jmiBusquedaClasesActionPerformed

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
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenu jmSocio;
    private javax.swing.JCheckBoxMenuItem jmiBusquedaClases;
    private javax.swing.JMenuItem jmiClase;
    private javax.swing.JMenuItem jmiEntrenador;
    private javax.swing.JMenuItem jmiFormSocio;
    private javax.swing.JMenuItem jmiListClase;
    private javax.swing.JMenuItem jmiListEntrenador;
    private javax.swing.JMenuItem jmiListSocios;
    private javax.swing.JCheckBoxMenuItem jmiListasDisp;
    private javax.swing.JMenuItem jmiMembresia;
    // End of variables declaration//GEN-END:variables
}
