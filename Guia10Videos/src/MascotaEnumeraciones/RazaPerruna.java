/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MascotaEnumeraciones;

/**
 *
 * @author Rafael
 */
public enum RazaPerruna {
    //DE ESTA MANERA TENEMOS LA ENUMERACION RAZA,
    //BEAGLE va ocupar la posicion cero, COCKER va ocupar la posicion 1 y asi susesivamente
    //Se le pueden agregar caracterisiticas a los elementos de la siguiente manera despues del nombre del enum
    //por ejemplo BEAGLE SE LE AGREGAN PARENTESIS y se le agrregan dos campos pueden ser un id entero y un valot por ejemplo 
    //tipo String quedaria BEAGLE(1234, "Beagle");
    
    //Recordar que la convencion de escritura  de los elementos es en mayusculas y la palabras separadas por guion bajo.
    BEAGLE(1234, "Beagle"), COCKER(1235, "Cocker"), PITBULL(1236, "Pitbull"), BORDER_COLLIE(1237, "Border collie");
    
    //A tener en cuenta para que funcione correctamente las caracteristicas hay que declararlas como atributos y generar el constructor parametrizado
    
    private Integer codigo;
    private String valor;
    
    private RazaPerruna(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }
    
    public Integer getCodigo() {
        return codigo;
    }
    
    public String getValor() {
        return valor;
    }
    
    
    
}
