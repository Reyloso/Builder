
package Builder;

/**
 *
 * @author Ingeniero REY
 */

// se crea la clase concreta PizzaTurca que hereda de la abstracta PizzaBuilder
public class PizzaTurca extends PizzaBuilder {
    // el @override es un decorador, y su uso no es mas que una forma de decir que se van volver a escribir
    // los metodos de una clase y no creando uno nuevo
    @Override
    // en esta clase concreta se escriben todos los metodos concretos definidos en la clase abstracta
    // con la diferencia que estos si tien un cuerpo definido
    // se definen los metodos set que instaciaran los atributos de la clase Pizza con los ingredientes de la pizza Turca
    public void setSabor() {
         Pizza.setSabor("Carne");
        }
    @Override
    public void setSalsa() {
        Pizza.setSalsa("de yogur");
    }

    @Override
    public void setTamano() {
        Pizza.setTamano("Mediano");
    }

    

}
