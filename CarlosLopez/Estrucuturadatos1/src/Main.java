import ec.edu.puce.Pacientes;

Queue colaPacientes = new LinkedList();
void main() {

    Pacientes paciente =
            new paciente("Carlos", "123456789", "67kg", "1.78cm");
    Pacientes paciente1 =
            new paciente1("Marco", "1214156783", "78kg", "188cm");



    colaPacientes.add(paciente);
    colaPacientes.add(paciente1);
    System.out.println(colaPacientes.size());

    IO.println(paciente.toString());
    IO.println(paciente1.toString());

}
