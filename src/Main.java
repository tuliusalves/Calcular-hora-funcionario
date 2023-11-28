import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Departamento dep= new Departamento("Marketing");
        Cargo cargo = new Cargo("Auxiliar de marketing",1000,"Auxílio médico etc..");
        Funcionario funcionario = new Funcionario("Heitor", cargo);
        funcionario.atribuirCargo(cargo);
        funcionario.registrarHorasTrabalho(170);
        funcionario.calcularSalario(cargo, funcionario.registrarHorasTrabalho(170));

        System.out.println(funcionario.toString());
    }

}