
package Operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author jpmazate
 */
public class OperacionesBasicas {
    
    public double operacionSuma(double valorInicial, double valorFinal){
        double resultado=0;
        try{
            resultado=valorInicial+valorFinal;
            
        }catch(Exception e){
            mostrarMensaje("Suma");
        }
        return resultado;
    }
    
    public double operacionResta(double primerValor, double segundoValor){
        double resultado;
        try{
            resultado= primerValor-segundoValor;
            return resultado;
        }catch(Exception e){
            mostrarMensaje("Resta");
            return 0;
        }
    }
    
    public double operacionMultiplicacion(double primerValor, double segundoValor){
        double resultado;
        try{
            resultado=primerValor*segundoValor;
            return resultado;
        }catch(Exception e){
            mostrarMensaje("Multiplicacion");
            return 0;
        }
    }
    
    public double operacionDivision(double primeroValor, double segundoValor){
        double resultado;
        try {
            resultado=primeroValor/segundoValor;
            return resultado;
        } catch (Exception e) {
            mostrarMensaje("Division");
            return 0;
        }
    }
    
    public static double operacionResiduo(double primerValor, double segundoValor){
        double resultado;
        try {
            resultado=primerValor%segundoValor;
            return resultado;
        } catch (Exception e) {
            mostrarMensaje("Residuo");
            return 0;
        }
    }
    
    public double operacionPotencia(double valorIndice, double valorAplicado){
        double resultado;
        try{
            resultado= Math.pow(valorAplicado, valorIndice);
            return resultado;
        }catch(Exception e){
            mostrarMensaje("Potencia");
            return 0;
        }
    }
    
    public double operacionRaiz(double valorExponente, double valorAplicado){
        double resultado;
        double comodinRaiz=1;
        try {
            resultado= Math.pow(valorAplicado,comodinRaiz/valorExponente);
            return resultado;
        } catch (Exception e) {
            mostrarMensaje("Raiz");
            return 0;
        }
    }
    
    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null,"Hubo un error al procesar tu operacion "+mensaje+" mostraremos un 0");
    }
}
