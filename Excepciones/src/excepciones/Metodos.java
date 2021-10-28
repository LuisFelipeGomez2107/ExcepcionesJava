package excepciones;
import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

public class Metodos {
    
    File archivo;
    FileReader fr;
    BufferedReader br;
    public int sumaPar = 0;
    int sumaImpar = 0;
    int cuentaPar = 0;
    int cuentaImpar = 0;
    int i = 0;
    String pares = "";
    String impares = "";
    String linea;
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    ArrayList<Integer> numeros2 = new ArrayList<Integer>();
    public void leer() {
        try {
            archivo = new File("C:\\Users\\Dell\\Downloads\\archivo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                identificaPares(linea);
                SumaPar(linea);
                identificaImpares(linea);
                SumaImpar(linea);
                CuentaPares(linea);
                CuentaImpares(linea);
                almacenaNumeros(linea);
            }

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Ruta no encontrada");
        } catch (IOException e) {

        } catch (Exception e) {

        }
    }

    public void identificaPares(String Num) {
        int a = Integer.parseInt(Num);
        if (a % 2 == 0) {
            pares = pares + " " + a + "\n";
        }
    }

    public void ImprimiridentificaPares() {
        JOptionPane.showMessageDialog(null, pares);
    }

    public void identificaImpares(String Num) {
        int a = Integer.parseInt(Num);
        if (a % 2 == 0) {

        } else {
            impares = impares + " " + a + "\n";
        }

    }

    public void Imprimiridentificaimpares() {
        JOptionPane.showMessageDialog(null, impares);
    }

    public void SumaPar(String Num) {
        int a = Integer.parseInt(Num);
        if (a % 2 == 0) {
            sumaPar += a;
        }
        //JOptionPane.showMessageDialog(null,"La sumatoria de pares es: "+sumaPar);
    }

    public void ImprimirsumaPar() {
        JOptionPane.showMessageDialog(null, "La suma de los pares es: " + sumaPar);

        //JOptionPane.showMessageDialog(null,"La sumatoria de pares es: "+sumaPar);
    }

    public void SumaImpar(String Num) {
        int a = Integer.parseInt(Num);
        if (a % 2 == 0) {

        } else {
            sumaImpar += a;
        }
    }

    public void Imprimirsumaimpar() {
        JOptionPane.showMessageDialog(null, "La suma de los impares es: " + sumaImpar);

        //JOptionPane.showMessageDialog(null,"La sumatoria de pares es: "+sumaPar);
    }

    public void CuentaPares(String Num) {
        int a = Integer.parseInt(Num);
        if (a % 2 == 0) {
            cuentaPar++;
        }
    }

    public void ImprimeCuentaPares() {
        JOptionPane.showMessageDialog(null, cuentaPar);
    }

    public void CuentaImpares(String Num) {
        int a = Integer.parseInt(Num);
        if (a % 2 == 0) {

        } else {
            cuentaImpar++;
        }
    } 

    public void ImprimeCuentaImpares() {
        JOptionPane.showMessageDialog(null, cuentaImpar);
    }

    public void almacenaNumeros(String aux) {

        int a = Integer.parseInt(aux);

        numeros.add(i, a);
            
        i++;
    } 
    static  int hh [];
   
    
    public void arrays() {
        int num=0;
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        int num5=0;
        int num6=0;
        int num7=0;
        int num8=0;
        int num9=0;
        int num10=0;
        for(int j  = 0 ;j<numeros.size();j++){
            switch(numeros.get(j)){
                case 0:
                    num++;
                break;
                case 1:
                    num1++;
                break;
                case 2:
                    num2++;
                break;
                case 3:
                    num3++;
                break;
                case 4:
                    num4++;
                break;
                case 5:
                    num5++;
                break;
                case 6:
                    num6++;
                break;
                case 7:
                    num7++;
                break;
                case 8:
                    num8++;
                break;
                case 9:
                    num9++;
                break;
                case 10:
                    num10++;
                break;
            }  
        }
        
        JOptionPane.showMessageDialog(null,"0 se repite:"+num+"\n"
                                            +"1 se repite:"+num1+"\n"
                                            +"2 se repite:"+num2+"\n"
                                            +"3 se repite:"+num3+"\n"
                                            +"4 se repite:"+num4+"\n"
                                            +"5 se repite:"+num5+"\n"
                                            +"6 se repite:"+num6+"\n"
                                            +"7 se repite:"+num7+"\n"
                                            +"8 se repite:"+num8+"\n"
                                            +"9 se repite:"+num9+"\n"
                                            +"10 se repite:"+num10+"\n");
             
        
            //System.out.println(gg);

}
}
