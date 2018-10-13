/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import es.albarregas.exceptions.ExcepcionDividirPorCero;
import java.io.Serializable;

/**
 *
 * @author paco
 */
public class CalculadoraDatos implements Serializable{
    private int operando1;
    private int operando2;
    private int resultado;
    private String signoOperacion;

    /**
     * @return the operando1
     */
    public int getOperando1() {
        return operando1;
    }

    /**
     * @param operando1 the operando1 to set
     */
    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    /**
     * @return the operando2
     */
    public int getOperando2() {
        return operando2;
    }

    /**
     * @param operando2 the operando2 to set
     */
    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    /**
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(int resultado) throws ExcepcionDividirPorCero{
        if(getSignoOperacion() == "/" && getOperando2() == 0){
            throw new ExcepcionDividirPorCero("No puedes dividir entre 0");
        }
        this.resultado = resultado;
    }

    /**
     * @return the signoOperacion
     */
    public String getSignoOperacion() {
        return signoOperacion;
    }

    /**
     * @param signoOperacion the signoOperacion to set
     */
    public void setSignoOperacion(String signoOperacion) {
        this.signoOperacion = signoOperacion;
    }
    
    
}
