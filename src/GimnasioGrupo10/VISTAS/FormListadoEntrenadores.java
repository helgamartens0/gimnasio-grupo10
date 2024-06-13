/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.VISTAS;

import GimnasioGrupo10.ACCESO_A_DATOS.EntrenadorData;
import GimnasioGrupo10.ENTIDADES.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bustos
 */
public class FormListadoEntrenadores extends javax.swing.JInternalFrame {
    
    private List<Entrenador> listEntrenadores;
    private List<Entrenador> listEntrenadoresNombres;
    private List<Entrenador> listEntrenadoresEspecialidad;
    private List<Entrenador> listEntrenadoresTabla;
    private EntrenadorData entData = new EntrenadorData();
    private DefaultTableModel modelo;
    private Map<String, Entrenador> mapEntrenadores = new HashMap<>();
    /**
     * Creates new form FormListadoEntrenadores
     */
    public FormListadoEntrenadores() {
        initComponents();
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
        listEntrenadoresTabla = entData.listarEntrenadoresActivos();
        listEntrenadores= entData.listarEntrenadoresActivos();
        listEntrenadoresNombres= entData.listarEntrenadoresActivos();
        listEntrenadoresEspecialidad= entData.listarEntrenadoresActivos();
        cargaEntrenadores();      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jcbNombre = new javax.swing.JComboBox<String>();
        jcbEspecialidad = new javax.swing.JComboBox<>();
        jlNombre = new javax.swing.JLabel();
        jlEspecialidad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbEntrenadores = new javax.swing.JButton();

        setClosable(true);
        setTitle("LISTADO ENTRENADORES");

        jlTitulo.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Listado de entrenadores");

        jcbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNombreActionPerformed(evt);
            }
        });

        jcbEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEspecialidadActionPerformed(evt);
            }
        });

        jlNombre.setText("Nombre");

        jlEspecialidad.setText("Especialidad");

        jtLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellido", "Especialidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtLista);

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbEntrenadores.setText("Todos los Entrenadores");
        jbEntrenadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrenadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jbEntrenadores, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlEspecialidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre)
                    .addComponent(jlEspecialidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbEntrenadores))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNombreActionPerformed
        // TODO add your handling code here:
//        
        borrarFilaTabla();
        cargaPorNombre(); 
    }//GEN-LAST:event_jcbNombreActionPerformed

    private void jcbEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEspecialidadActionPerformed
        // TODO add your handling code here:
//        
        borrarFilaTabla();
//        cargaPorEspecialidad();
    }//GEN-LAST:event_jcbEspecialidadActionPerformed

    private void jbEntrenadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrenadoresActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        listEntrenadoresTabla = entData.listarEntrenadoresActivos();
        
        for (Entrenador ent : listEntrenadoresTabla) {
         modelo.addRow(new Object[]{ent.getDni_entrenador(), ent.getNombre_entrenador(),
                ent.getApellido_entrenador(),ent.getEspecialidad_entrenador()});
        }
        
    }//GEN-LAST:event_jbEntrenadoresActionPerformed

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("DNI");
        filaCabecera.add("Nombre");
        filaCabecera.add("Apellido");
        filaCabecera.add("Especialidad");
        
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtLista.setModel(modelo);
    }
    
    private void cargaEntrenadores() {
        for (Entrenador item : listEntrenadores) {
            String name = item.getNombre_entrenador() + " " + item.getApellido_entrenador();
            jcbNombre.addItem(name);
            jcbEspecialidad.addItem(item.getEspecialidad_entrenador());
            mapEntrenadores.put(name, item);
        }
        
    }
    
    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void cargaPorNombre(){
//        String nombreSeleccionado = (String) jcbNombre.getSelectedItem();
//        Entrenador ent = mapEntrenadores.get(nombreSeleccionado);
//       
         
            String nombreSeleccionado = (String) jcbNombre.getSelectedItem();
            Entrenador ent = mapEntrenadores.get(nombreSeleccionado);
            if(ent != null){
                Entrenador entrenadorEncontrado = entData.buscarEntrenadorPorId(ent.getId_entrenador());
                if(entrenadorEncontrado != null){
                    borrarFilaTabla();
                    modelo.addRow(new Object[]{ent.getDni_entrenador(), ent.getNombre_entrenador(),
                    ent.getApellido_entrenador(),ent.getEspecialidad_entrenador()});
                }
            }
            
           
    }
    
//    private void cargaPorEspecialidad(){
//        String nombreSeleccionado = (String) jcbNombre.getSelectedItem();
//        Entrenador ent = mapEntrenadores.get(nombreSeleccionado);
//        entData.buscarEntrenadorEspecialidad(ent.getEspecialidad_entrenador());
//         
//            modelo.addRow(new Object[]{ent.getDni_entrenador(), ent.getNombre_entrenador(),
//                ent.getApellido_entrenador(),ent.getEspecialidad_entrenador()});     
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEntrenadores;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbEspecialidad;
    private javax.swing.JComboBox<String> jcbNombre;
    private javax.swing.JLabel jlEspecialidad;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable jtLista;
    // End of variables declaration//GEN-END:variables
}
