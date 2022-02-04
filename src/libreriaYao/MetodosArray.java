
package libreriaYao;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class MetodosArray {

    public MetodosArray() {
    }
    
    public static float[] crearArray(float[]lista){
        for(int i=0;i< lista.length ; i++){
            lista [i]=Float.parseFloat(JOptionPane.showInputDialog("Nota"));
       
        }
        return lista;
    }



    
    public static void amosarArray(float[]lista){
        int op;
        op=Integer.parseInt(JOptionPane.showInputDialog("MENU \n1.for \n2.for each \n 3.clase Arrays"));
        switch(op){
            
            case 1:for(int i=0;i< lista.length ; i++)
                    System.out.println("posicion " + i + "--> " + lista[i]);
                     break;
            case 2:for(float elemento: lista)
                    System.out.println(elemento);
                    break;
                    
            case 3:  Arrays.toString(lista);
                    break;
                   
         }
        
    }
    public static int buscarElemento(float[]lista){
   
        float elemento=Float.parseFloat(JOptionPane.showInputDialog("Que elemento desea buscar?"));
        int posicion=0;
        boolean buscar=false ;
        for(int i=0;i<lista.length;i++){
            if(lista[i]==elemento){
                System.out.println("El elemento " + elemento + "se encuentra en la posicion " + i);
                posicion=i;
                buscar=true;
            }
            
        }
        if(buscar==false){
            JOptionPane.showMessageDialog(null, "El elemento no se encuentra en la matriz");
        }
        return posicion;
    
    }
    
    public static void ordenarArray(float[]lista){
        /*float[] lista1=new float[lista.length];
        float aux;
        for(int i=0; i<lista.length ;i++){
            for(int j=i+1 ;j<lista.length; j++){
                if(lista[i]>lista[j]){
                    aux=  lista[i];
                    lista[i]=lista[j];
                    lista[j]=aux;
                } 
                    
                }
            }
            return lista;
        }*/
       Arrays.sort(lista);
    }
    public static float[] copiarLista(float[]lista){
        return Arrays.copyOf(lista, 3);
    }
    
    public static float[] borrarElemento(float[]lista){
        
        int posicion= MetodosArray.buscarElemento(lista);
         if(posicion<0){
             JOptionPane.showMessageDialog(null, "O elemento non esta na lista");
        }else{
          
         for(int i=posicion ;i<lista.length; i++){
             lista[i]=lista[posicion+1];   
         }
             lista=Arrays.copyOf(lista, lista.length-1);
        
        }
        return lista;
    }    
    
    public static float[] engadir(float[]lista){
        int elemento=Integer.parseInt(JOptionPane.showInputDialog("ELEMENTO A ENGADIR:"));
        lista=Arrays.copyOf(lista,lista.length+1);
        lista[lista.length-1]=elemento;
        return lista;
        
    }
    
    public float[] sair(float[]lista){
        System.exit(0);
        return lista;
    }

}
