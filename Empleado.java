public class Empleado {

    
    private String nombre;
    private String apellidos;
    private int edad;
    private int salario_base;
    private int irpf;
    private int antiguedad = 0;
    private Empleado jefe;

    //CONSTRUCTORES
    public Empleado(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario_base = 1000;
        this.antiguedad = 0;
    }

    public Empleado(String nombre, String apellidos, int edad) {
        this.salario_base = salario_base;
        this.antiguedad = antiguedad;
    }

    public Empleado(String nombre, String apellidos, int edad, int salario, int antiguedad, int irpf, Empleado jefe) {
        this.nombre = nombre;

        this.jefe = jefe;
    }


    //METODOS GETTER
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public int getSalario_base() {
        return salario_base;
    }

    public int getIrpf() {
        return irpf;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    //Clonación o emulación del metodo clone en el Get
    public Empleado getJefe() {
        return new Empleado(jefe.nombre, jefe.apellidos);
    }

    //METODOS SETTER
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario_base(int salario_base) {
        this.salario_base = salario_base;
    }

    public void setIrpf(int irpf) {
        this.irpf = irpf;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

    //OTROS METODOS
    private double salarioNeto() {

        double salario = salario_base;

        if (antiguedad <= 5) {
            salario = salario + 50;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            salario = salario + 100;
        } else if (antiguedad > 10) {
            salario = salario + 200;
        }
        if (antiguedad >= 40) {
            salario = salario + (10 * salario_base / 100);
        }
        return salario;
    }
}

enum Grupo {A1, A2, B, C1, C2, E}

enum Destino {MURCIA, MADRID, VALENCIA, ANDALUCIA}

class EmpleadoPublico extends Empleado {

    //ATRIBUTOS
    private String grupo;
    private String destino;

    //CONSTRUCTORES
    public EmpleadoPublico(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    public EmpleadoPublico(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
    }

    public EmpleadoPublico(String nombre, String apellidos, int edad, int salario_base, int irpf, int antiguedad, Empleado jefe, String grupo, String destino) {
        super(nombre, apellidos, edad, salario_base, irpf, antiguedad, jefe);
    }

    //METODOS GETTER
    public String getGrupo() {
        return grupo;
    }
    public String getDestino() {
        return destino;
    }

    //OTROS METODOS
    private String comprobarGrupo(){

    }
}
