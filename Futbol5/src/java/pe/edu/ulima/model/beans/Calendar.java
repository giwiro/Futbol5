/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.model.beans;

import com.google.code.morphia.annotations.Embedded;
import java.util.Date;

/**
 *
 * @author iEnzo
 */
@Embedded
public class Calendar {
    private Date fecha;
    private int hora;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    
}
