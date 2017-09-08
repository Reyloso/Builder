
package Builder;

/**
 *
 * @author Ingeniero REY
 */

// se crea la clase concreta PizzaCalzone que hereda de la abstracta PizzaBuilder
public class PizzaCalzone extends PizzaBuilder {
    // el @override es un decorador, y su uso no es mas que una forma de decir que se van volver a escribir
    // los metodos de una clase y no creando uno nuevo
    @Override
    // en esta clase concreta se escriben todos los metodos concretos definidos en la clase abstracta
    // con la diferencia que estos si tien un cuerpo definido
    // se definen los metodos set que instaciaran los atributos de la clase Pizza con los ingredientes de la pizza Calzone
    public void setSabor() {
         Pizza.setSabor("Jamon");
        }
    @Override
    public void setSalsa() {
        Pizza.setSalsa("Tartara");
    }

    @Override
    public void setTamano() {
        Pizza.setTamano("Mediano");
    }
    
 
}
