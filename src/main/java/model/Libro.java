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

    private String autor;

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
