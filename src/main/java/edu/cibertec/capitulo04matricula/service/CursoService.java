package edu.cibertec.capitulo04matricula.service;

import edu.cibertec.capitulo04matricula.dao.entity.CursoEntity;

import java.util.List;

public interface CursoService {
    List<CursoEntity> listarTodos();
    void insertar(CursoEntity curso);
    void eliminar(int codigo);
}
