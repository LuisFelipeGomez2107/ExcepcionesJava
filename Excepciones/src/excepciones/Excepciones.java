package excepciones;

import javax.swing.JOptionPane;

public class Excepciones {
      
    public static void main(String[] args) {
          Metodos mt = new Metodos();
        
        Object [] subMenu = {"Leer","Imprime Pares","Imprime Impares","Suma de Pares","Suma de Impares",
            "Conteo de  Pares","Conteo de  Impares","Total de repeticiones","Salir"};
        String aux;
        do{
            Object seleccion = JOptionPane.showInputDialog(null,"Seleccion: ","Datos", 
                    JOptionPane.PLAIN_MESSAGE,null,
                    subMenu,subMenu[0]);
            aux = seleccion.toString();
            switch (aux) {
                case "Leer":
                    mt.leer();
                    break;
                    case "Imprime Pares":
                    mt.ImprimiridentificaPares();
                    break;
                    case "Imprime Impares":
                    mt.Imprimiridentificaimpares();
                    break;
                case "Suma de Pares":
                    mt.ImprimirsumaPar();
                    break;
                    case "Suma de Impares":
                    mt.Imprimirsumaimpar();
                    break;
                    case "Conteo de  Pares":
                    mt.ImprimeCuentaPares();
                    break;
                    case "Conteo de  Impares":
                    mt.ImprimeCuentaImpares();
                    break;
                    case "Total de repeticiones":
                    mt.arrays();
                    break;
           
                default:
                    break;
            }
        }
        while(!"Salir".equals(aux));
    }
    
}
