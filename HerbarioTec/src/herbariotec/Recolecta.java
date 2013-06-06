/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herbariotec;

/**
 *
 * @author anairinac
 */
public class Recolecta {
    private int identificacion;
    private int gira;
    //wgs84 es "grados,minutos,segundos,puntoCardinal" = "60.54,32,01.90,N"
    private String latitud;
    private String longitud;
    private float coordX;
    private float coordY;
    private float elevacion;
    private String provincia;
    private String canton;
    private String distrito;
    private String areaConservacion;
    private String areaProtegida;
    private String zonaVida;
    private String coberturaTierra;

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getGira() {
        return gira;
    }

    public void setGira(int gira) {
        this.gira = gira;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public float getCoordX() {
        return coordX;
    }

    public void setCoordX(float coordX) {
        this.coordX = coordX;
    }

    public float getCoordY() {
        return coordY;
    }

    public void setCoordY(float coordY) {
        this.coordY = coordY;
    }

    public float getElevacion() {
        return elevacion;
    }

    public void setElevacion(float elevacion) {
        this.elevacion = elevacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getAreaConservacion() {
        return areaConservacion;
    }

    public void setAreaConservacion(String areaConservacion) {
        this.areaConservacion = areaConservacion;
    }

    public String getAreaProtegida() {
        return areaProtegida;
    }

    public void setAreaProtegida(String areaProtegida) {
        this.areaProtegida = areaProtegida;
    }

    public String getZonaVida() {
        return zonaVida;
    }

    public void setZonaVida(String zonaVida) {
        this.zonaVida = zonaVida;
    }

    public String getCoberturaTierra() {
        return coberturaTierra;
    }

    public void setCoberturaTierra(String coberturaTierra) {
        this.coberturaTierra = coberturaTierra;
    }
    
    
}
