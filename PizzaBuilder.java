
package Builder;

/**
 *
 * @author Ingeniero REY
 */
// se crea una clase Abstracta 
public abstract class PizzaBuilder {
    // en esta clase abstracta sus atributos son encapsulados con el tipo protected
    // y el atributo sera de tipo pizza
    // quiere decir que dentro de este atributo se almacenara  objeto de tipo pizza(una pizza)
    protected Pizza Pizza;
    
    // se define un metodo que retornara el objeto pizza una vez creado
    Pizza getPizza(){return Pizza; }
    
    // se define un metodo llamado CrearPizza() que sera el encargado de crear objeto pizza 
    void CrearPizza(){Pizza = new Pizza();}
    
    // se definen los metodos concretos que como se puede notar son metodos sin un cuerpo definido
    public abstract void setSabor();
    public abstract void setSalsa();
    public abstract void setTamano();
    
    
    
}
