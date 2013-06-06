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
public class EntradaHistorial {
    
    private int identificacion;
    private String acronimoMuestra;
    private int consecutivoMuestra;
    private Date fecha;
    private String familia;
    private String genero;
    private String especie;
    private String autor;

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getAcronimoMuestra() {
        return acronimoMuestra;
    }

    public void setAcronimoMuestra(String acronimoMuestra) {
        this.acronimoMuestra = acronimoMuestra;
    }

    public int getConsecutivoMuestra() {
        return consecutivoMuestra;
    }

    public void setConsecutivoMuestra(int consecutivoMuestra) {
        this.consecutivoMuestra = consecutivoMuestra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
