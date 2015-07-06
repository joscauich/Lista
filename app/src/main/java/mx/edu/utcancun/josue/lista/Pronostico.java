package mx.edu.utcancun.josue.lista;

import java.io.Serializable;
import java.security.PrivateKey;

/**
 * Created by Josue on 05/07/2015.
 */
public class Pronostico implements Serializable{
    private String dia;
    private String estado;
    private String temperatura;
    private int icono;

    public Pronostico(String dia, String estado, String temperatura,int icono ){
        this.dia=dia;
        this.estado=estado;
        this.temperatura=temperatura;
        this.icono=icono;

    }

    @Override
    public String toString() {
        return this.getDia()+" "+this.getEstado()+" "+this.getTemperatura();
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }
}
