/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herbariotec;

import java.util.Date;
/**
 *
 * @author anairinac
 */
public class Gira {
    
    private int identificacion;
    private Date fecha;
    private String motivo;

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    
}
