
package figurageometrica;


public class Rectangulo extends FiguraGeometrica {
    private final double base;
    private final double altura;
    
     
   Rectangulo (double Altura,double Base){
        this.altura=Altura;
        this.base=Base;
    }
    
    

    
    public double Area(){
        return this.base*this.altura;
         
    }
    public double Perimetro(){
        return 2*this.altura*2*this.base;
    }
}
