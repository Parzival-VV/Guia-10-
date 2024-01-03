
package Enum;

/**
 *
 * @author Rafael
 */
public enum CPE {
    
    ATP(0, "Apto para todo publico"), PG(1, "Con supervision de los padres"), PG13(13, "Mayores de 13 años"),
        NC16(16, "Mayores de 16 años"), M18(18, "MAyores de 18 años");
        
        private Integer codigo;
        private String valor;
        
        private CPE(Integer codigo, String valor){
            this.codigo = codigo;
            this.valor = valor;
        }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
        
        
        
    
}
