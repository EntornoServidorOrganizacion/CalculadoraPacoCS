/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.exceptions;

/**
 *
 * @author paco
 */
public class ExcepcionDividirPorCero extends Exception{
    public ExcepcionDividirPorCero(String mensajeError) {
        super(mensajeError);
    }
}
