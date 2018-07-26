
package Operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author jpmazate
 */
public class OperacionesBasicas {
    
    public double operacionSuma(double valores[],int numeroSumas){
        double resultado=0;
        try{
            for(int i=0;i<numeroSumas;i++){
                resultado+=valores[i];
            }
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
