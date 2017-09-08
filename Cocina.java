
package Builder;

/**
 *
 * @author Ingeniero REY
 */

// la clase cocina hara el papel de director dentro del patron builder
public class Cocina {
    // en la clase Cocina se define un atributo y los encapsulamos para solo poder acceder a el
    // desde sus metodos analizador y modificadores
    // en este caso al atributo sera una pizza de mismo tipo de la clase abstracta
    private PizzaBuilder Pizza;
    
    // el metodo que instancia el atributo de la clase recibe como parametro un objeto del mimo tipo
    // de alguna de las clases concretas y es lo mismo decir que es de tipo PizzaBuilder por que estas 
    // herendan de la misma
    void setPizza(PizzaBuilder Pizza){
        this.Pizza = Pizza;
    }
    
    // el metodo getPizza() retorna la pizza que fue instanciada en la clase abtracta
    Pizza getPizza(){
        return Pizza.getPizza();
    }
    
    // el metodo construirPizza() no es mas que el encargado de unir todos los metodos y realizar...
    // la construccion de la pizza llamando a los metodos concretos de la clase abstracta que a su vez llama a los...
    // metodos concretos de las clases concretas para crear la pizza.
    void ConstruirPizza(){
        Pizza.CrearPizza();
        Pizza.setSabor();
        Pizza.setSalsa();
        Pizza.setTamano();
    }
    
}
