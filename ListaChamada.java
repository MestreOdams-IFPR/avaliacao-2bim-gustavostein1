import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaChamada {

    final static Scanner tecladoScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int n = tecladoScanner.nextInt();
        int k = tecladoScanner.nextInt();
        String resultado = listaChamada(n, k);
        System.out.println(resultado);

    }
    
    public static String listaChamada(int n, int k){

        ArrayList<String> chamada = new ArrayList<String>();

        chamada.add("maria");
        chamada.add("joão");
        chamada.add("carlos");
        chamada.add("vanessa");
        chamada.add("josé");
        
        Collections.sort(chamada);

        String m = chamada.get(k);
        return m;
    }
    
}
