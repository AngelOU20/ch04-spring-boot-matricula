package edu.cibertec.capitulo04matricula.controller;

import edu.cibertec.capitulo04matricula.dao.entity.CursoEntity;
import edu.cibertec.capitulo04matricula.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @RequestMapping("cursoListar")
    public ModelAndView cursoMostrar() {
        return new ModelAndView("curso", "lista", cursoService.listarTodos());
    }

    @RequestMapping("cursoGrabar")
    public ModelAndView cursoGrabar(CursoEntity curso) {
        cursoService.insertar(curso);
        return new ModelAndView("redirect:cursoListar");
    }

    @RequestMapping("cursoEliminar")
    public ModelAndView cursoEliminar(@RequestParam("codigo") int codigo) {
        cursoService.eliminar(codigo);
        return new ModelAndView("redirect:cursoListar");
    }
}
