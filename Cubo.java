package modelo;

public class Cubo extends Cuadrado{

    public Cubo(int lado) {
        super(lado);
    }
    
    public int calcularPerimetro(){
        return getLado()*12;
    }
    
    public double calcularVolumen(){
        return Math.pow(getLado(), 3);
    }
    
}
