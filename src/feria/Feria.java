
package feria;

import java.util.Date;


public class Feria {
    
   private String nombre;
   private int numerodeTrabajadores; 
   private Date fechaDeFundacion;
   private String especialidad;
   private Boolean nacional;

    public Feria(
            String nombre, 
            int numerodeTrabajadores, 
            Date fechaDeFundacion, 
            String especialidad, 
            Boolean nacional) {
        this.nombre = nombre;
        this.numerodeTrabajadores = numerodeTrabajadores;
        this.fechaDeFundacion = fechaDeFundacion;
        this.especialidad = especialidad;
        this.nacional = nacional;
    }
   
    /**
    *El metodo aumenta la cantidad de trabajadores de la feria en 100
    *y la conviente en nacional
    */
    public void ampliarFeria(){
        this.numerodeTrabajadores +=100;
        this.nacional =true;  
    }
    
    /**
     * Este metodo permite cambiar el nombre de la feria y su especialidad
     */
    public void reinaguracion(
            String nuevoNombre,
            String numeroEspecialidad){
        this.nombre = nuevoNombre;
        this.especialidad = numeroEspecialidad;
        this.numerodeTrabajadores +=1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int setNumerodeTrabajadores() {
        return numerodeTrabajadores;
    }

    public void setNumerodeTrabajadores(int numerodeTrabajadores) {
        this.numerodeTrabajadores = numerodeTrabajadores;
    }

    public Date getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    public void setFechaDeFundacion(Date fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getNacional() {
        return nacional;
    }

    public void setNacional(Boolean nacional) {
        this.nacional = nacional;
    }
   
   
   
    
    public static void main(String[] args) {
        Feria feriaUno = new Feria(
                "Peaceful taste",
                280,
                new Date(),
                "Comida tipica paisa",
                false);
        Feria feriaDos = new Feria(
                "Makeup and cares",
                15,
                new Date(),
                "Maquiilaje y jabones",
                true);
        System.out.println(feriaUno.getNombre());
        System.out.println(feriaUno.setNumeroDeTrabajadores());
        System.out.println(feriaUno.getNacional());
        
        feriaUno.ampliarFeria();
        
        System.out.println(feriaUno.getNombre());
        System.out.println(feriaUno.setNumeroDeTrabajadores());
        System.out.println(feriaUno.getNacional());
    }
    
}
