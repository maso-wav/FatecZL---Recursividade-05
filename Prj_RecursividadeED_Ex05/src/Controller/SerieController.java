/*
    Ponto de parada: subtrair o número recebido até chegar a zero.
    A função é chamada e vai efetuando a operação de soma da série conforme o número é subtraído, até chegar a zero.
 
 */

package Controller;

public class SerieController {
    
    public SerieController(){
        
        super();
    }
    
    public double somaSerie(int num){
        
        
        if(num == 0){
            
            return 0;
            
        } else {                        
            
            return (1.0/num) + somaSerie(num - 1);
        }
    }
}
