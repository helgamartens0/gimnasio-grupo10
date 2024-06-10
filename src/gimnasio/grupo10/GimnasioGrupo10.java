/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.grupo10;

import GimnasioGrupo10.ACCESO_A_DATOS.AsistenciaData;
import GimnasioGrupo10.ACCESO_A_DATOS.ClaseData;
import GimnasioGrupo10.ACCESO_A_DATOS.EntrenadorData;
import GimnasioGrupo10.ACCESO_A_DATOS.SocioData;
import GimnasioGrupo10.ENTIDADES.Clase;
import GimnasioGrupo10.ENTIDADES.Entrenador;
import GimnasioGrupo10.ENTIDADES.Socio;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author helga
 */
public class GimnasioGrupo10 {

    public static void main(String[] args) {
  
//        SocioData soc = new SocioData();
//        EntrenadorData ent = new EntrenadorData();
//        AsistenciaData asist = new AsistenciaData();
//        MembresiaData memb = new MembresiaData();
        ClaseData clase = new ClaseData();
        /*----------------------------------------------------------------------------------------------------------------------------*/
//        Socio socio2 = new Socio("41000222", "Pedro", "Gomez", 30, "pedro.gomez@example.com", "555444", true);
//        Socio socio3 = new Socio("41000333", "Maria", "Lopez", 22, "maria.lopez@example.com", "666777", false);
//        Socio socio4 = new Socio("41000444", "Juan", "Perez", 28, "juan.perez@example.com", "888999", true);
//        Socio socio5 = new Socio("41000555", "Ana", "Martinez", 35, "ana.martinez@example.com", "333222", false);
//        Socio socio6 = new Socio("41000666", "Juan", "Romero", 25, "juan.romero@example.com", "345222", true);
//        Socio socio7 = new Socio("41000113", "María", "Gómez", 35, "maria@example.com", "777888", true);

        //  public Socio(String dni_socio, String nombre_socio, String apellido_socio, int edad_socio, String correo_socio, String telefono_socio, boolean estado_socio) {
//        soc.cargarSocio(socio1);
//        soc.cargarSocio(socio2);
//        soc.cargarSocio(socio3);
//        soc.cargarSocio(socio4);
//        soc.cargarSocio(socio5);
//        soc.cargarSocio(socio6);
//        soc.cargarSocio(socio7);
//        Socio busca1 = new Socio();
//        Socio busca2 = new Socio();
//
//        busca1 = soc.buscarSocioId(5);
//        if (busca1 != null) {
//            System.out.println(busca1.toString());
//        }
//        busca2 = soc.buscarSocioId(11);
//        if (busca2 != null) {
//            System.out.println(busca2.toString());
//        }
//
//        ArrayList<Socio> sociosporNombre = new ArrayList<>();
//        sociosporNombre = soc.buscarSocioNombre("juan");
//        System.out.println("cantida de socios con el nombre indicado: " + sociosporNombre.size() + "\n");
//        if (!sociosporNombre.isEmpty()) {
//            for (Socio socio : sociosporNombre) {
//                System.out.println(socio.toString());
//                System.out.println("-----------------------------------------");
//            }
//        }
        /*----------------------------------------------------------------------------------------------------------------------------*/
//
        Entrenador entrenador1 = new Entrenador(8, "123456789", "John", "Smith", "Fútbol", true);
        Entrenador entrenador2 = new Entrenador(9, "987654321", "Emily", "Johnson", "Baloncesto", true);
        Entrenador entrenador3 = new Entrenador(10, "112233445", "Michael", "Williams", "Natación", true);
        Entrenador entrenador4 = new Entrenador(11, "334455667", "Jessica", "Brown", "Atletismo", true);
        Entrenador entrenador5 = new Entrenador(12, "556677889", "Christopher", "Davis", "Tenis", true);
        Entrenador entrenador6 = new Entrenador(13, "222333222", "Juan", "González", "Tenis", true);
        Entrenador entrenador7 = new Entrenador(14, "555444333", "María", "López", "Tenis", true);
//        ent.cargarEntrenador(entrenador1);
//        ent.cargarEntrenador(entrenador2);
//        ent.cargarEntrenador(entrenador3);
//        ent.cargarEntrenador(entrenador4);
//        ent.cargarEntrenador(entrenador5);
//        ent.cargarEntrenador(entrenador7);
//        ent.cargarEntrenador(entrenador6);
//        ArrayList<Entrenador> entrenadorApellido = new ArrayList<>();
//        entrenadorApellido = ent.buscarEntrenadorApellido("John");
//        System.out.println("cantida de entrenadores con el apellido indicado: " + entrenadorApellido.size() + "\n");
//        if (!entrenadorApellido.isEmpty()) {
//            for (Entrenador entrenador : entrenadorApellido) {
//                System.out.println(entrenador.toString());
//            }
//
//        }
//        ArrayList<Entrenador> entrenadorEspecialidad = new ArrayList<>();
//        entrenadorEspecialidad = ent.buscarEntrenadorEspecialidad("tenis");
//        System.out.println("cantida de entrenadores en la especialidad indicada: " + entrenadorEspecialidad.size() + "\n");
//        if (!entrenadorEspecialidad.isEmpty()) {
//            for (Entrenador entrenador : entrenadorEspecialidad) {
//                System.out.println(entrenador.toString());
//            }
//        }
//        ArrayList<Entrenador> entrenadorNombreApellido = new ArrayList<>();
//        entrenadorNombreApellido = ent.buscarEntrenadorNombreApellido("williams", "miCHael");
//        System.out.println("cantida de entrenadores con el nombre y apellido indicado: " + entrenadorNombreApellido.size() + "\n");
//        if(!entrenadorNombreApellido.isEmpty()){
//            for(Entrenador entrenador : entrenadorNombreApellido){
//                System.out.println(entrenador.toString());
//            }
//        }
//        ArrayList<Entrenador> entrenadorNombre = new ArrayList<>();
//        entrenadorNombre = ent.buscarEntrenadorNombre("maria");
//        System.out.println("cantidad de entrenadores con el nombre indicado: "+entrenadorNombre.size());
//        if(!entrenadorNombre.isEmpty()){
//            for(Entrenador entrenador : entrenadorNombre){
//                System.out.println(entrenador.toString());
//            }
//        }
//        ArrayList<Entrenador> entrenadoresActivos = new ArrayList<>();
//        entrenadoresActivos = ent.listarEntrenadoresActivos();
//        System.out.println("cantidad de entrenadores activos: "+entrenadoresActivos.size());
//        if(!entrenadoresActivos.isEmpty()){
//            for(Entrenador entrenador : entrenadoresActivos){
//                System.out.println(entrenador.toString());
//            }
//        }
//          Entrenador entrenador = new Entrenador();
//          entrenador = ent.buscarEntrenadorPorId(13);
//          if(entrenador != null){
//              System.out.println(entrenador.toString());
//          }
//         
// Creación de las clases con especialidades específicas
        Clase clase1 = new Clase("Entrenamiento de Tenis de Dobles", entrenador7, LocalTime.parse("08:00"), 15, true);
        Clase clase2 = new Clase("Entrenamiento de Baloncesto de Tiro", entrenador2, LocalTime.parse("09:00"), 20, true);
        Clase clase3 = new Clase("Clase de Natación Estilo Libre", entrenador3, LocalTime.parse("10:00"), 18, true);
        Clase clase4 = new Clase("Entrenamiento de Atletismo de Carrera", entrenador4, LocalTime.parse("11:00"), 15, true);
        Clase clase5 = new Clase("Entrenamiento de Tenis de Servicio", entrenador5, LocalTime.parse("12:00"), 20, true);
        Clase clase6 = new Clase("Entrenamiento de Fútbol de Pases", entrenador1, LocalTime.parse("13:00"), 18, true);
        Clase clase7 = new Clase("Entrenamiento de Tenis de Golpes de Fondo", entrenador7, LocalTime.parse("14:00"), 15, true);
        Clase clase8 = new Clase("Entrenamiento de Tenis de Volea", entrenador6, LocalTime.parse("15:00"), 15, true);
        Clase clase9 = new Clase("Entrenamiento de Baloncesto de Defensa", entrenador2, LocalTime.parse("16:00"), 20, true);
        Clase clase10 = new Clase("Entrenamiento de Fútbol de Remates", entrenador1, LocalTime.parse("17:00"), 18, true);

        clase.cargarClase(clase1);
        clase.cargarClase(clase2);
        clase.cargarClase(clase3);
        clase.cargarClase(clase4);
        clase.cargarClase(clase5);
        clase.cargarClase(clase6);
        clase.cargarClase(clase7);
        clase.cargarClase(clase8);
        clase.cargarClase(clase9);
        clase.cargarClase(clase10);

        ArrayList<Clase> clasesActivas = new ArrayList<>();
        clasesActivas = clase.listarClasesActivas();

        if (!clasesActivas.isEmpty()) {
            for(Clase clases : clasesActivas){
                System.out.println(clases.toString());
            }
        }
    }
        
    }

