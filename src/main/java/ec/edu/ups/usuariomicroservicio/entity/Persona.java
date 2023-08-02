package ec.edu.ups.usuariomicroservicio.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Persona")
public class Persona {

    @Id
    String correo;
    String contrasena;
    String name;


    public Persona() {
    }

    public Persona(String correo, String contrasena, String name) {
        this.correo = correo;
        this.contrasena = contrasena;
        this.name = name;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
