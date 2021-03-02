
package figurageometrica;


public class Cuadrado extends FiguraGeometrica {
    private final double lado;
   
    
    Cuadrado (double Lado){
        this.lado=Lado;
       
    }
    public double Area(){
        return this.lado*this.lado;
         
    }
    public double Perimetro(){
        return 4*this.lado;
    }
}    

