package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Autor")
@NamedQueries(
      {
         @NamedQuery(name="Autor.all",query="select e from Autor e")
      }
)
public class Autor {

    @Id
    private Integer id;

    private String nombre;
    private String apellido;

    @OneToMany(mappedBy = "autor",cascade = CascadeType.ALL)
    private List<Libro> libros;

    public Autor(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Autor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
