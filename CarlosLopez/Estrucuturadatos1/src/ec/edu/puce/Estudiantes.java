package ec.edu.puce;

public class Pacientes {
    private String nombre;
    private String identificacion;
    private String peso;
    private String altura;

    public Pacientes(String n, String i, String p, String a) {
        this.nombre = n;
        this.identificacion = i;
        this.peso = p;
        this.altura = a;
    }

    public void mostrarDatos(){
        IO.println(String.format("El Paciente es: %s con identificación: %s\n" +
                "Peso: %s con altura: %s", nombre, identificacion, peso, altura));


    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}