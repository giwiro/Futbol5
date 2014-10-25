
package pe.edu.ulima.model.beans;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;
import java.util.Date;
import java.util.List;

/**
 *
 * @author iEnzo
 */
@Entity(value="Partido")
public class Partido{
    @Id 
    private String _id;
    private String name;
    private Date fecha;//solo acceder cuando estado es diferente de 'en espera'
    private int hora; //solo acceder cuando estado es diferente de 'en espera'
    private String estado;
    @Reference Cancha cancha;
    private Usuario creator;
    private List<Usuario> players;

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public Usuario getCreator() {
        return creator;
    }

    public void setCreator(Usuario creator) {
        this.creator = creator;
    }

    public List<Usuario> getPlayers() {
        return players;
    }

    public void setPlayers(List<Usuario> players) {
        this.players = players;
    }
    
    



    
    
    
}
