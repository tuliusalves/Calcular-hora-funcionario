public class Cargo {
    private String nomeCargo;
    private double salarioBase;
    private String Beneficios;

    public Cargo(){}

    public Cargo(String nomeCargo, double salarioBase, String beneficios) {
        this.nomeCargo = nomeCargo;
        this.salarioBase = salarioBase;
        Beneficios = beneficios;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getBeneficios() {
        return Beneficios;
    }

    public void setBeneficios(String beneficios) {
        Beneficios = beneficios;
    }

    @Override
    public String toString() {
        return "" +
                "Nome do cargo='" + nomeCargo + '\'' +
                ", SalarioBase=" + salarioBase +
                ", Beneficios='" + Beneficios + '\'' +
                '}';
    }
}
