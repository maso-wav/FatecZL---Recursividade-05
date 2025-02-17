package View;

import Controller.SerieController;

public class SeriePrincipal {
    
    public static void main (String args[]){
        
        SerieController sc = new SerieController();
        
        int numero = 2;
        
        double soma = sc.somaSerie(numero);
        
        System.out.println("A SOMA DA SÉRIE É " + String.format("%.2f", soma) + ".");
    }
    
}
