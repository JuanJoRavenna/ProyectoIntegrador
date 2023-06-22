package examen.DAWII_CL2_JaymeAguirre.service;

import examen.DAWII_CL2_JaymeAguirre.model.bd.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UsuarioDetalleService implements UserDetailsService {

    @Autowired
    private UsuarioService usuarioService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.buscarUsuarioPorNomusuario(username);
        return usuarioPorAutenticacion(usuario);
    }

    private UserDetails usuarioPorAutenticacion(Usuario usuario){
        return new User(usuario.getNomusuario(), usuario.getPassusuario(), Collections.emptyList());
    }
}

