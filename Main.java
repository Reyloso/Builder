
package Builder;
//se importan las librerias
import javax.swing.JOptionPane;

/**
 *
 * @author Ingeniero REY
 */
public class Main {
      public static void main(String[] args) {
          //se crea el objeto de tipo director
          Cocina Picola = new Cocina();
          // se crean dos objetos de cada una de las dos pizzas
          PizzaBuilder Turca = new PizzaTurca();
          PizzaBuilder Calzone = new PizzaCalzone();
          //se crea una variable de tipo pizza para almacernar la pizza construida y acceder mas facilmente a sus atributos
          Pizza PizzaHecha;
          
          //se crea un pequeño menu con la libreria Swing
          int op= 0;
          do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "\t MENU PRINCIPAL \n"
                    + "\t ESCOJA UNA PIZZA\n"
                    + "\t 1. TURCA \n"
                    + "\t 2. CALZONE \n"
                    + "\t 3. Salir \n"
                    + "\t Entre su opción: ?"
            ));
            switch (op) {
                case 1:
                    // se llama al metodo setpizza y se le pasa como parametro el objeto pizza que se desea crear
                    // en este caso el parametro es la pizza Turca para instanciar el atributo pizza de la clase PizzaBuilder 
                    // por medio del metodo de la misma clase llamado setPizza()
                    Picola.setPizza(Turca);
                    // se llama al metodo ConstruirPizza() el cual se encargara de llamar a todos lo metodos necesarios 
                    // para construir la pizza que fue pasada como parametro en el setPizza()
                    Picola.ConstruirPizza();
                    // una vez construida la pizza almacenamos la pizza construida en la variable definida al principio llamada PizzaHecha
                    PizzaHecha =Picola.getPizza();
                    // y por medio la libreria swing se muestra un mensaje por pantalla que indique la pizza hecha y acceda a sus atributos
                    // como lo son el sabor, el tamaño y la salsa con la que fue hecha 
                    JOptionPane.showMessageDialog(null,"La Pizza Hecha Es Turca \n" + " Sabor: " + PizzaHecha.getSabor() + 
                            "\n" + "Tamaño: " + PizzaHecha.getTamano() + "\n" + "Salsa: " + PizzaHecha.getSalsa() );
                    break;
                    
                // para la opcion 2 del menu se realiza el mismo proceso que en el caso 1 pero esta vez el parametro será la pizza de tipo Calzone   
                case 2:
                   Picola.setPizza(Calzone);
                    Picola.ConstruirPizza();
                    PizzaHecha =Picola.getPizza();
                    JOptionPane.showMessageDialog(null,"La Pizza Hecha Es calzone \n" + " Sabor: " + PizzaHecha.getSabor() + 
                            "\n" + "Tamaño: " + PizzaHecha.getTamano() + "\n" + "Salsa: " + PizzaHecha.getSalsa() );
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Adios!");
                    break;   
                default:
                    JOptionPane.showMessageDialog(null, "Opción Invalida!!!");
            }
        } while (op != 3);
            System.exit(0);  
      }
}
