/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio.grupo10;

import GimnasioGrupo10.ACCESO_A_DATOS.AsistenciaData;
import GimnasioGrupo10.ACCESO_A_DATOS.EntrenadorData;
import GimnasioGrupo10.ACCESO_A_DATOS.SocioData;
import GimnasioGrupo10.ENTIDADES.Entrenador;
import GimnasioGrupo10.ENTIDADES.Socio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author helga
 */
public class GimnasioGrupo10 {

    public static void main(String[] args) {
        SocioData soc = new SocioData();
        EntrenadorData ent = new EntrenadorData();
        AsistenciaData asist = new AsistenciaData();

        /*----------------------------------------------------------------------------------------------------------------------------*/
        Socio socio1 = new Socio("41000111", "hola", "chau", 26, "hola@gmail.com", "222333", true);
        Socio socio2 = new Socio("41000222", "Pedro", "Gomez", 30, "pedro.gomez@example.com", "555444", true);
        Socio socio3 = new Socio("41000333", "Maria", "Lopez", 22, "maria.lopez@example.com", "666777", false);
        Socio socio4 = new Socio("41000444", "Juan", "Perez", 28, "juan.perez@example.com", "888999", true);
        Socio socio5 = new Socio("41000555", "Ana", "Martinez", 35, "ana.martinez@example.com", "333222", false);
        Socio socio6 = new Socio("41000666", "Juan", "Romero", 25, "juan.romero@example.com", "345222", true);
        Socio socio7 = new Socio("41000113", "María", "Gómez", 35, "maria@example.com", "777888", true);

        //  public Socio(String dni_socio, String nombre_socio, String apellido_socio, int edad_socio, String correo_socio, String telefono_socio, boolean estado_socio) {
        soc.cargarSocio(socio1);
        soc.cargarSocio(socio2);
        soc.cargarSocio(socio3);
        soc.cargarSocio(socio4);
        soc.cargarSocio(socio5);
        soc.cargarSocio(socio6);
        soc.cargarSocio(socio7);
        Socio busca1 = new Socio();
        Socio busca2 = new Socio();

        busca1 = soc.buscarSocioId(5);
        if (busca1 != null) {
            System.out.println(busca1.toString());
        }
        busca2 = soc.buscarSocioId(11);
        if (busca2 != null) {
            System.out.println(busca2.toString());
        }

        ArrayList<Socio> sociosporNombre = new ArrayList<>();
        sociosporNombre = soc.buscarSocioNombre("juan");
        System.out.println("cantida de socios con el nombre indicado: " + sociosporNombre.size() + "\n");
        if (!sociosporNombre.isEmpty()) {
            for (Socio socio : sociosporNombre) {
                System.out.println(socio.toString());
                System.out.println("-----------------------------------------");
            }
        }
        /*----------------------------------------------------------------------------------------------------------------------------*/
        Entrenador entrenador1 = new Entrenador("123456789", "John", "Smith", "Fútbol", true);
        Entrenador entrenador2 = new Entrenador("987654321", "Emily", "Johnson", "Baloncesto", true);
        Entrenador entrenador3 = new Entrenador("112233445", "Michael", "Williams", "Natación", true);
        Entrenador entrenador4 = new Entrenador("334455667", "Jessica", "Brown", "Atletismo", true);
        Entrenador entrenador5 = new Entrenador("556677889", "Christopher", "Davis", "Tenis", true);

        ent.cargarEntrenador(entrenador1);
        ent.cargarEntrenador(entrenador2);
        ent.cargarEntrenador(entrenador3);
        ent.cargarEntrenador(entrenador4);
        ent.cargarEntrenador(entrenador5);

        
    }
}
