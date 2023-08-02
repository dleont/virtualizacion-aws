package ec.edu.ups.usuariomicroservicio.controller;

import ec.edu.ups.usuariomicroservicio.Repository.PersonaRepository;
import ec.edu.ups.usuariomicroservicio.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/persona")
public class PersonaController {

    @Autowired
    private PersonaRepository repo;

    @PostMapping("/add")
    public Persona add(@RequestBody Persona val) {
        return repo.save(val);
    }

    @GetMapping("/list")
    public List<Persona> views() {
        return repo.findAll();
    }

    @GetMapping("/list/{val}")
    public Optional<Persona> views(@PathVariable String val) {
        return repo.findById(val);
    }

    /*
    @PutMapping("/update/{id}")
    public Persona views(@PathVariable Integer id, @RequestBody Persona val) {
        return repo.findById(id)
                .map(p -> {
                    p.setName(val.getName());
                    p.setContrasena(val.getContrasena());
                    p.setCorreo(val.getCorreo());
                    return repo.save(p);
                }).orElse(null);
    }

    @DeleteMapping("/delete/{val}")
    public String delete(@PathVariable Integer val) {
        repo.deleteById(val);
        return "Id : " + val + " delete";
    }
*/
}
