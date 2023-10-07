package test;

import model.Libro;
import service.EntityManagerAdmin;
import service.IDAO;
import service.ImplDAO;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IDAO idao = new ImplDAO();
        List<Libro> lista= idao
                .getAll("Libro.all", Libro.class);
        System.out.println(lista);
    }

}
