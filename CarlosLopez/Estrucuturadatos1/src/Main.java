import ec.edu.puce.Estudiantes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Stack<Estudiantes> pilaEstudiantes = new Stack<>();

    Estudiantes estudiantes =

            new Estudiantes( "pablo", "1234567890", "Desarrollo de Software");

    Estudiantes estudiantes1 =
            new Estudiantes ( "Isacc", "987463210", "Desarrollo de Software");

    pilaEstudiantes.push(estudiantes);
    pilaEstudiantes.push(estudiantes1);

    System.out.println(pilaEstudiantes.size());
    Queue colaEstuduiantes = new LinkedList();


    IO.println(estudiantes.toString());
    IO.println(estudiantes1.toString());

    System.out.println(colaEstuduiantes.size());

}
