package edu.cibertec.capitulo04matricula.dao.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "curso")
@Data
public class CursoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcurso")
    @NotNull
    private int idCurso;

    @NotNull
    @NotBlank(message = "Curso es obligatorio")
    @Size(min=3, max=40)
    @Column(name="nomcurso")
    private String nomCurso;

    @DateTimeFormat(pattern = "yyyy-MM-dd") //Solo para validación
    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name="fechainicio")
    private Date fechaInicio;

    @NotNull(message = "{curso.alumnosmin.vacio}")
    @Min(value=1, message = "{curso.alumnosmin.vacio}")
    @Column(name="alumnosmin")
    private int alumnosMin;

    @Column(name="alumnosact")
    private int alumnosAct;

    private int estado;
}
