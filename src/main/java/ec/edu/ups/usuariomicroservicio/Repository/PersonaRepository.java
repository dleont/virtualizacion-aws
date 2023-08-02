package ec.edu.ups.usuariomicroservicio.Repository;

import ec.edu.ups.usuariomicroservicio.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaRepository extends JpaRepository<Persona, String> {
}
