package test;

import model.Libro;
import service.EntityManagerAdmin;
import service.IDAO;
import service.ImplDAO;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IDAO idao = new ImplDAO();
        List<Libro> lista = new ArrayList<>();

        /*List<Libro> lista = new ArrayList<>();
        IDAO idao = new ImplDAO();
        Libro libro = new Libro(3,"Crónica de una muerte anunciada","Tragedia","Gabriel");
        idao.create(libro);
        lista= idao
                .getAll("Libro.all", Libro.class);
        System.out.println("Antes:" + lista);
        libro.setAutor("Gabriel Garcia Marquez");
        idao.update(libro);
        lista= idao
                .getAll("Libro.all", Libro.class);
        System.out.println("Despues:" + lista);*/
        lista= idao
                .getAll("Libro.all", Libro.class);
        System.out.println("Antes:" + lista);
        Libro libro = idao.findById(Libro.class,2);
        idao.remove(libro);
        lista= idao
                .getAll("Libro.all", Libro.class);
        System.out.println("Despues:" + lista);
    }

}
