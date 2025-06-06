public class Persistencia {
    

    private String clase, codigo, nombre;
    private int cantidad;


    public Persistencia(String clase, String codigo, String nombre, int cantidad) {
        this.clase = clase;
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }


    public String getClase() {
        return clase;
    }


    public void setClase(String clase) {
        this.clase = clase;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

}
