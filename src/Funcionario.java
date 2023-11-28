public class Funcionario {
    private String nome;
    private Cargo cargo;
    private double salario;

    public Funcionario(){}

    public Funcionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }


    @Override
    public String toString() {
        String salarioFormatado= String.format("%.2f",salario);
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", " + cargo +
                ", salario=" + salarioFormatado +
                '}';
    }

    public void atribuirCargo(Cargo cargo){

        this.cargo=cargo;
    }
    public int registrarHorasTrabalho(int hora){

        return hora;
    }
    public double calcularSalario(Cargo cargo, int horas){
        this.salario= (cargo.getSalarioBase()/60)* registrarHorasTrabalho(horas);
        return salario;
    }
}
