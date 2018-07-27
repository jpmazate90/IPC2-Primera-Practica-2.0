
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
        }catch(NumberFormatException e){
            OperacionesBasicas.mostrarMensaje("Decimal a Binario");
            return 0;
        }
        
    }
    
    public int opcionDecimalAOctal(int numero){
        int resultado;
        String resultadoEnString;
        try{
            resultadoEnString=Integer.toOctalString(numero);
            resultado= Integer.parseInt(resultadoEnString);
            return resultado;
        }catch(NumberFormatException e){
            OperacionesBasicas.mostrarMensaje("Decimal a Octal");
            return 0;
        }
    }
    
    public int opcionDecimalAHexadecimal(int numero){
        int resultado;
        String resultadoEnString;
        try{
            resultadoEnString= Integer.toHexString(numero);
            resultado = Integer.parseInt(resultadoEnString);
            return resultado;
        }catch(NumberFormatException e){
            OperacionesBasicas.mostrarMensaje("Decimal a Hexadecimal");
            return 0;
        }
    }
    
}
