public class Employee {
    String name;
    double GrossSalary, Tax;

    //Salário líquido
    public double NetSalary() {
        return GrossSalary - Tax;
    }
    //Salário com base em uma porcentagem
    public void IncreaseSalary(double percentage) {
        GrossSalary += GrossSalary * (percentage / 100);
    }
    //Representar o funcionário como string
    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f", NetSalary());
    }
}