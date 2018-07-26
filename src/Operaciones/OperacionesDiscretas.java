
package Operaciones;

/**
 *
 * @author jpmazate
 */
public class OperacionesDiscretas {
    
    public int opcionFactorial(int numero){
        try {
            if (numero==0){
                return 1;
            }
            else{
                return numero * opcionFactorial(numero-1);
            }
        } catch (Exception e) {
            OperacionesBasicas.mostrarMensaje("Factorial");
            return 0;
        }
    }
    
    public int opcionPermutacion(int numeroN, int numeroR){
        int resultado;
        try {
            resultado = (opcionFactorial(numeroN))/(opcionFactorial(numeroN-numeroR));
            return resultado;
        } catch (Exception e) {
            OperacionesBasicas.mostrarMensaje("Permutacion, el valor N no puede ser menor que R,");
            return 0;
        }
        
    }
    
    public int opcionCombinacion(int numeroN, int numeroR){
        int resultado;
        try {
            resultado = (opcionFactorial(numeroN))/((opcionFactorial(numeroN-numeroR)*opcionFactorial(numeroR)));
            return resultado;
        } catch (Exception e) {
            OperacionesBasicas.mostrarMensaje("Combinacion, el valor N no puede ser menor que R,");
            return 0;
        }
    }
}
