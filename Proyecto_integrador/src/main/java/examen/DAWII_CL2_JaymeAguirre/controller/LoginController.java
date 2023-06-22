package examen.DAWII_CL2_JaymeAguirre.controller;

import examen.DAWII_CL2_JaymeAguirre.model.bd.Usuario;
import examen.DAWII_CL2_JaymeAguirre.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("/login")
    public String login(){
        return "frmLogin";
    }
    @GetMapping("/registrar")
    public String registrar(){
        return "frmRegistroUsuario";
    }

    @PostMapping("/guardarUsuario")
    public String guardarUsuario(@ModelAttribute Usuario usuario){
        usuarioService.guardarUsuario(usuario);
        return "frmLogin";
    }
    @GetMapping("/exito")
    public String exito(){
        return "frmExito";
    }
}
