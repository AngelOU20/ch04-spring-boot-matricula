package edu.cibertec.capitulo04matricula.service.impl;

import edu.cibertec.capitulo04matricula.dao.entity.CursoEntity;
import edu.cibertec.capitulo04matricula.dao.repository.CursoRepository;
import edu.cibertec.capitulo04matricula.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<CursoEntity> listarTodos() {
        return cursoRepository.findAll();
    }

    @Override
    public void insertar(CursoEntity curso) {
        cursoRepository.save(curso);
    }

    @Override
    public void eliminar(int codigo) {
        cursoRepository.deleteById(codigo);
    }
}
