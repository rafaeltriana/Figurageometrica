
package figurageometrica;


public class Triangulo extends FiguraGeometrica {
    private final double base;
    private final double altura;
    private final double lado1;
    private final double lado2;
    
    Triangulo (double Altura,double Base,double Lado1,double Lado2){
        this.altura=Altura;
        this.base=Base;
        this.lado1=Lado1;
        this.lado2=Lado2;
    }

   
    public double Area(){
       return (this.base*this.altura)/2;
         
    }
    public double Perimetro(){
        return this.base+this.lado1+this.lado2;
    }
}
