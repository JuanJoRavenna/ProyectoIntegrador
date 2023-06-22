package examen.DAWII_CL2_JaymeAguirre.service;

import examen.DAWII_CL2_JaymeAguirre.model.bd.Usuario;
import examen.DAWII_CL2_JaymeAguirre.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.HashSet;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder
            = new BCryptPasswordEncoder();

    public Usuario buscarUsuarioPorNomusuario(String nomusuario){
        return usuarioRepository.findByNomusuario(nomusuario);

    }

    public Usuario guardarUsuario(Usuario usuario){
        usuario.setPassusuario(bCryptPasswordEncoder.encode(usuario.getPassusuario()));
        return usuarioRepository.save(usuario);
    }

}
