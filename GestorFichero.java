package mislibros;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


class GestorFichero {

    public static final long serialVersionUID = 1L;
    static List<Libro> listado = new ArrayList<>();
    static GestorIO gestor = new GestorIO();
    static final String NOMBRE_ARCHIVO = "data.dat";
    static File f = new File(NOMBRE_ARCHIVO);

    public static void addBook() {

        Libro book = new Libro();

        System.out.println("Título:");
        book.setTitulo(gestor.inString());

        System.out.println("Autor:");
        book.setAutor(gestor.inString());

        System.out.println("Sinopsis:");
        book.setSinopsis(gestor.inString());

        System.out.println("Año de edición:");
        book.setEdicion(gestor.inInt());

        System.out.println("ISBN:");
        book.setIsbn(gestor.inString());

        System.out.println("Introduzca bibliografía:");
        book.setBibliografia(gestor.inString());

        listado.add(new Libro(book.getTitulo(), book.getAutor(), book.getSinopsis(), book.getEdicion(), book.getIsbn(), book.getBibliografia()));

        try {
            if (!f.exists()) {
                f = new File(NOMBRE_ARCHIVO);
            }
            try (FileOutputStream fos = new FileOutputStream(f); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(listado);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void deleteBook() {
    }

    public static void searchBook() {
    }

    public static void listBooks() {
        
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            listado = (ArrayList<Libro>)ois.readObject();
	} catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(GestorFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Iterator<Libro> iter = listado.iterator();
        while (iter.hasNext())
        System.out.println(iter.next());
    }

    public static void filterBooks() {
    }

}
