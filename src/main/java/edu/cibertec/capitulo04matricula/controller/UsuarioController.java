package edu.cibertec.capitulo04matricula.controller;

import ch.qos.logback.core.model.Model;
import edu.cibertec.capitulo04matricula.dao.entity.UsuarioEntity;
import edu.cibertec.capitulo04matricula.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping("/")
    public String loginMostrar(Model model) {
        return "login";
    }

    @RequestMapping("loginAccion")
    public ModelAndView loginAccion(UsuarioEntity usuarioValida) {
        ModelAndView mv = null;
        UsuarioEntity ue = usuarioService.validarLogin(usuarioValida);
        if (ue == null) {
            mv = new ModelAndView("login",
                    "msgError",
                    "Usuario y clave no existen. Vuelva a intentar!");
        } else {
            mv = new ModelAndView("principal", "usuario", ue);
        }
        return mv;
    }
}
