
package Builder;

/**
 *
 * @author Ingeniero Rey
 */
public class Pizza {
    // en la clase pizza se define sus atributos los encapsulamos para solo poder acceder a ellos 
    // por medio de sus metodos analizadores y modificadores
    private String Salsa;
    private String Tamano;
    private String Sabor;
    
    // se define el metodo constructor sin parametros de la clase
    Pizza(){
       Sabor = "";
       Salsa = "";
       Tamano = "";
    }
     
    // metodos modificadores
    void setSabor(String Sabor){this.Sabor = Sabor;}
    void setSalsa(String Salsa){this.Salsa = Salsa;}
    void setTamano(String Tamano){this.Tamano = Tamano;}
    // metodos analizadores
    String getSabor(){return Sabor;}
    String getSalsa(){return Salsa;}
    String getTamano(){return Tamano;}
    
}
