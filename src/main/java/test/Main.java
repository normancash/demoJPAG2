package test;

import model.Autor;
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

        Autor autor  = new Autor(1,"Ruben","Dario");
        idao.create(autor);
        Libro libro = new Libro(1,"Prosas profanas","Prosas profanas",autor);
        idao.create(libro);

    }

}
