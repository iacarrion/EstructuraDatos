package ec.edu.puce;

public class Pcientes {
    private String nombre;
    private String identificacion;
    private String carrera;

    public Estudiantes(String n, String i, String c) {
        this.nombre = n;
        this.identificacion = i;
        this.carrera = c;
    }

    public void mostrarDatos() {
        IO.println(String.format("El estidiante es: %s con identificaacion: %s\n" +
                "Pertenece a la carrera: %s", nombre, identificacion, carrera));
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", carrera='" + carrera + '\'' +
                '}';
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

}

