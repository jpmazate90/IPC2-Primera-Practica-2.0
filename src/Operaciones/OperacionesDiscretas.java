
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
    
}
