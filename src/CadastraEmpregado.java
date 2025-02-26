// Classe CadastraEmpregado
import java.util.Scanner;

public class CadastraEmpregado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empregado empregado = new Empregado();
        Empresa empresa = new Empresa();

        System.out.print("Informe o nome do empregado: ");
        empregado.setNome(scanner.nextLine());

        System.out.print("Informe o salário do empregado: ");
        empregado.setSalario(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Informe a razão social da empresa: ");
        empresa.setRazaoSocial(scanner.nextLine());

        System.out.print("Informe o CNPJ da empresa: ");
        empresa.setCNPJ(scanner.nextLine());

        System.out.print("Informe o telefone da empresa: ");
        empresa.setFone(scanner.nextLine());

        empregado.setEmpresa(empresa);

        System.out.println("\nDados do Empregado:");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Salário: " + empregado.getSalario());
        System.out.println("Empresa: " + empregado.getEmpresa().getRazaoSocial());
        System.out.println("CNPJ: " + empregado.getEmpresa().getCNPJ());
        System.out.println("Telefone: " + empregado.getEmpresa().getFone());

        scanner.close();
    }
}
