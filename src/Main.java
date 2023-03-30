import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        //transforma cada carácter a su código ASCII
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String texto = sc.next();

        for(int i=0;i<texto.length();i++){
            //convirtiendo a codigo ASCII
            //System.out.println((int)texto.charAt(i)+" ");
           // System.out.println("codigo "+codigo);
            int codigo = ((int)texto.charAt(i));
            System.out.println("codigo ASCII es: "+codigo);
        }
    }
}