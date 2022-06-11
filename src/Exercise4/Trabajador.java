package Exercise4;

public class Trabajador extends Persona{

    private float salario;

    public Trabajador(float salario){
        super();
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
