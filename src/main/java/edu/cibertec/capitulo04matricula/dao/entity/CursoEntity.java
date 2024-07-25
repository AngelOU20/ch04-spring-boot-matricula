package edu.cibertec.capitulo04matricula.dao.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "curso")
@Data
public class CursoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcurso")
    private int idCurso;

    @Column(name="nomcurso")
    private String nomCurso;

    @Column(name="fechainicio")
    private Date fechaInicio;

    @Column(name="alumnosmin")
    private int alumnosMin;

    @Column(name="alumnosact")
    private int alumnosAct;

    private int estado;
}
