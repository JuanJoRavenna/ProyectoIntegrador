package examen.DAWII_CL2_JaymeAguirre.repository;

import examen.DAWII_CL2_JaymeAguirre.model.bd.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByNomusuario(String nomusuario);

}
