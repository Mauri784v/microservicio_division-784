package mx.edu.uteq.idgs13.microservicio_division.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.*;


@Entity
@Data
public class ProgramaEducativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;
}
