package agenda.logica;

import java.util.ArrayList;

/**
 *
 * @author A. Molino
 */
public class Agenda {

    private String propietario;
    private ArrayList<Contacto> contactos;

    /**
     * Constructor
     *
     * Determina el nombre del propietariop de la agenda e inicializaer el
     * arrayList
     *
     * @param propietario
     */
    public Agenda(String propietario) {
        this.propietario = propietario;
        contactos = new ArrayList();
    }

    /**
     * Recibe los datos del contacto y los guarda
     *
     * Crea el objeto contacto y lo almacena en el ArrayList
     *
     * @param nombre
     * @param apellido
     * @param telefono
     */
    public void AgregarContacto(String nombre, String apellido, String telefono) {
        Contacto c = new Contacto(nombre, apellido, telefono);
        contactos.add(c);
    }

    /**
     * Genera String para mostrar un contacto unitario Trabaja a partir de la
     * posicion en el listado
     *
     * @param pos Posicion en el ArrayList
     * @return Contacto en forma de texto
     */
    public String MostrarContacto(int pos) {
        String contacto = "\t" + contactos.get(pos).getNombre() + "\t" + contactos.get(pos).getApellido() 
                + "\t\t" + contactos.get(pos).getTelefono() + "\n";
        return contacto;
    }

    /**
     *
     * @return String
     */
    public String mostrarAgenda() {
        String listado = "\tNombre\tApellido\tNúmero\n";
        listado += "----------------------------------------------------------------------\n";
        for (int i = 0; i < contactos.size(); i++) {
            listado += this.MostrarContacto(i);
        }
        return listado;
    }

    /**
     * A partir de un telefono devuielve la posicion en el ArraList del mismo
     *
     * @param telefono
     * @return int posicion en el arrayList
     */
    public int ObtenerPosicion(String telefono) {
        for (int i = 0; i < contactos.size(); i++) {
            if (telefono.equals(contactos.get(i).getTelefono())) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Devolvemos el objeto contacto completo
     *
     * @param pos
     * @return
     */
    public Contacto Devolver(int pos) {
        return contactos.get(pos);
    }

    /**
     * Verfificamos la existencia en el arrayList
     *
     * Nos aseguramos de si existe el contacto. En este programa se podria
     * llamar este método antes de ingresar a uno nuevo por ejemplo
     *
     * @param C
     * @return
     */
    public boolean Existe(Contacto C) {
        for (int i = 0; i < contactos.size(); i++) {
            if (C.getTelefono().equals(contactos.get(i).getTelefono())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Psamos posicion y un contacto para modificaciones
     *
     * @param pos
     * @param C
     */
    public void Modificar(int pos, Contacto C) {
        contactos.get(pos).setNombre(C.getNombre());
        contactos.get(pos).setApellido(C.getApellido());
        contactos.get(pos).setTelefono(C.getTelefono());

    }

    /**
     * Elimina un contacto a partir de la posicion
     *
     * @param pos
     */
    public void Eliminar(int pos) {
        contactos.remove(pos);
    }

}
