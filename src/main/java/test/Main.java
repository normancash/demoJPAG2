package test;

import model.Autor;
import model.Libro;
import model.Rol;
import model.Usuario;
import service.EntityManagerAdmin;
import service.IDAO;
import service.ImplDAO;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*public static void main(String[] args) {
        IDAO idao = new ImplDAO();
        List<Libro> lista = new ArrayList<>();

        Autor autor  = new Autor(3,"Rodrigo","Paniagua");
        Libro libro = new Libro(3,"Fiestas en Masaya","Fiestas en Masaya",autor);
        List<Libro> libros = new ArrayList<>();
        libros.add(libro);
        autor.setLibros(libros);
        idao.create(autor);
    }*/

    public static void main(String[] args) {
        IDAO idao = new ImplDAO();
        List<Rol> roles = new ArrayList<>();
        Rol rol = new Rol();
        rol.setId(1);
        rol.setRol("Bibliotecario");
        roles.add(rol);
        Rol rol1 = new Rol();
        rol1.setId(2);
        rol1.setRol("Administrador");
        roles.add(rol1);

        idao.create(rol);
        idao.create(rol1);

        Usuario u = new Usuario();
        u.setId(4);
        u.setNombre("Brayan");
        u.setListRol(roles);
        idao.create(u);

    }

}
