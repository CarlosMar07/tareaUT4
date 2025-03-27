package org.example;

import java.util.ArrayList;
import java.util.List;
/**
 * La clase Agenda gestiona una lista de contactos.
 * Permite añadir, eliminar y modificar contactos y sus números de teléfono.
 *
 * @author TuNombre
 * @version 1.0
 * @since 2025
 */
class Contacto {
    /**
     * Constructor que inicializa la lista de contactos.
     */
    private String name;
    private List<String> phones;
    /** Añade un contacto a la agenda. Si el contacto ya existe, añade el número de teléfono al contacto existente. */


    public Contacto(String name, String phone) {
        /**
         * @param name el nombre del contacto
         * @param phone el número de teléfono del contacto
         */
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
        /**
         * Modifica el número de teléfono de un contacto existente.
         *
         * @param name el nombre del contacto
         * @param oldPhone el número de teléfono antiguo
         * @param newPhone el nuevo número de teléfono
         */
    }

    public String getName() {
        return this.name;
    }
    /**
     * Obtiene la lista de contactos.
     *
     * @return la lista de contactos
     */
    public List<String> getPhones() {
        return this.phones;
    }
}