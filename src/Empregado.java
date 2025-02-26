
class Empregado {
    private String nome;
    private double salario;
    private Empresa empresa;

    public void setNome(String n) {
        this.nome = n;
    }

    public void setSalario(double sal) {
        this.salario = sal;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
}
