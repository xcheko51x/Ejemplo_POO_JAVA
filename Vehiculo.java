/**
 *
 * @author xcheko51x
 */
package poo;

// TODO LO QUE ESTA DENTRO DE LA CLASS VEHICULO ES EL OBJETO
public class Vehiculo {

    /* SECCION ATRIBUTOS:
        SON LAS CARACTERISTICAS GENERALES DE TODOS LOS OBJETOS DE TIPO VEHICULO */
    
    String tipo;
    String marca;
    String modelo;
    int anio;
    double precio;
    String color;
    int puertas;
    
    /*FIN SECCION ATRIBUTOS*/
    
    /* SECCION DE CONSTRUCTORES:
        SON LAS FORMAS DE CREAR EL OBJETO INICIAL
        PUEDEN SER VARIOS YA QUE SE PUEDEN CREAR OBJETOS SIN ATRIBUTOS, O CON ALGUNOS ATRIBUTOS O TODOS
        SELE SUELE DECIR POLIMORFISMO
    */

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String marca, String modelo, int anio) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Vehiculo(String tipo, String marca, String modelo, int anio, double precio, String color, int puertas) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.color = color;
        this.puertas = puertas;
    }
    
    /* FIN SECCION DE CONSTRUCTORES */
    
    /* SECCION PARA OBTENER LOS DATOS DEL OBJETO TAMBIEN CONOCIDO COMO GETTER */

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public int getPuertas() {
        return puertas;
    }
    
    /* FIN SECCION PARA OBTENER LOS DATOS DEL OBJETO */
    
    /* SECCION PARA ASIGNAR LOS DATOS AL OBJETO TAMBIEN CONOCIDO COMO SETTER */

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    /* FIN SECCION PARA ASIGNAR LOS DATOS AL OBJETO */
    
    /* SECCION DE METODOS:
        SON LAS ACCIONES QUE PUEDE REALIZAR EL OBJETO COMO ASIGNACIONES O CAMBIOS A LOS VALORES YA EXISTENTES
    */
    
    public void cambiarColor(String color) {
        this.color = color;
    }
    
    public void acelerar() {
        System.out.println("El vehiculo "+ this.modelo +" esta avanzando");
    }
    
    public void frenar() {
        System.out.println("El vehiculo "+ this.modelo +" esta detenido");
    }
    
    public void mostrarVehiculo() {
        System.out.println(
                "TIPO: "+this.tipo+
                "\nTIPO: "+this.marca+
                "\nMODELO: "+this.modelo+
                "\nAÑO: "+this.anio+
                "\nPRECIO: "+this.precio+
                "\nCOLOR: "+this.color+
                "\nPUERTAS: "+this.puertas+
                "\n\n"
        );
    }
    
    /* FIN SECCION DE METODOS */
}
