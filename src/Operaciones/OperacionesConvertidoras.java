
package Operaciones;

/**
 *
 * @author jpmazate
 */
public class OperacionesConvertidoras {
    public int opcionDecimalABinario(int numero){
        String resultadoEnString;
        int resultado;
        try{
            resultadoEnString = Integer.toBinaryString(numero);
            resultado = Integer.parseInt(resultadoEnString);
        return resultado;
        }catch(Exception e){
            OperacionesBasicas.mostrarMensaje("Decimal a Binario");
            return 0;
        }
        
    }
    
}
