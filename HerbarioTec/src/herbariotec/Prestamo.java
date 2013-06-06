/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herbariotec;

/**
 *
 * @author anairinac
 */
public class Prestamo {
    
    private int identificacion;
    private String acronimoMuestra;
    private int consecutivoMuestra;
    private String destino;
    private int cantidad;

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

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
