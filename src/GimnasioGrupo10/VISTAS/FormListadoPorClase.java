/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.VISTAS;

import java.util.HashSet;
import GimnasioGrupo10.ACCESO_A_DATOS.AsistenciaData;
import GimnasioGrupo10.ACCESO_A_DATOS.ClaseData;
import GimnasioGrupo10.ACCESO_A_DATOS.SocioData;
import GimnasioGrupo10.ENTIDADES.Clase;
import GimnasioGrupo10.ENTIDADES.Socio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesica
 */
public class FormListadoPorClase extends javax.swing.JInternalFrame {

    private List<Socio> listaSocios;
    private ArrayList<Clase> listaClases;

    private DefaultTableModel modelo;
    private SocioData socioD;
    private ClaseData claseD;
    private AsistenciaData asistenciaD;
    

    public FormListadoPorClase() {
        initComponents();
        
        listaSocios = new ArrayList<>();
        socioD = new SocioData();
        claseD= new ClaseData();
        asistenciaD= new AsistenciaData();
        modelo = new DefaultTableModel();
      
        listaSocios = socioD.listarSociosActivos();
        listaClases = claseD.listarClasesActivas();
        cargarClases();
        armarCabeceraTabla();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlClase = new javax.swing.JLabel();
        jcbClase = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jlSocio = new javax.swing.JLabel();

        setClosable(true);
        setTitle("CLASES");
        setPreferredSize(new java.awt.Dimension(480, 471));

        jlClase.setText("CLASE");

        jcbClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClaseActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTabla);

        jbSalir.setText("Salir");
        jbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSalirMouseClicked(evt);
            }
        });

        jlSocio.setFont(new java.awt.Font("Dubai Medium", 3, 18)); // NOI18N
        jlSocio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSocio.setText("Listado de Socio por Clase");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlClase)
                                .addGap(40, 40, 40)
                                .addComponent(jcbClase, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlClase)
                    .addComponent(jcbClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jbSalirMouseClicked

    private void jcbClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClaseActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        cargarDatos();
    }//GEN-LAST:event_jcbClaseActionPerformed

    private void cargarClases() {

        for (Clase clase : listaClases) {
            
            jcbClase.addItem(clase);
        }
    }
 

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("DNI");
        filaCabecera.add("Nombre");
        filaCabecera.add("Apellido");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtTabla.setModel(modelo);
    }
    private void cargarDatos(){
        Clase selec= (Clase)jcbClase.getSelectedItem();
//        listaSocios=(ArrayList) asistenciaD.obtenerSociosXClase(selec.getId_clase());
        listaSocios = asistenciaD.obtenerSociosXClase(selec.getId_clase());
        HashSet<Socio> sociosUnicos = new HashSet<>(listaSocios);

            // Limpiar el modelo de la tabla antes de agregar nuevos datos
        modelo.setRowCount(0);
        for(Socio s: sociosUnicos){
           
            modelo.addRow(new Object[] {s.getId_socio(),s.getDni_socio(),s.getApellido_socio(),s.getNombre_socio()});
        }
    }
    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Clase> jcbClase;
    private javax.swing.JLabel jlClase;
    private javax.swing.JLabel jlSocio;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}
