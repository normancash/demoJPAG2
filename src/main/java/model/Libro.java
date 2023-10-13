package model;

import jakarta.persistence.*;

@Entity
@Table(name="Libro")
@NamedQueries(
        {
            @NamedQuery(name="Libro.all",query="select e from Libro e")
        }
)
public class Libro {

    @Id
    private Integer id;
    private String name;

    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="autor_id",referencedColumnName = "id")
    private Autor autor;

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Libro() {
    }

    public Libro(Integer id, String name, String descripcion, Autor autor) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.autor = autor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
