import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Instanciando o objeto scanner.
        Pessoa pessoa = new Pessoa(); // Instanciando o objeto pessoa.
        Imposto imposto = new Imposto();// Instanciando o objeto imposto.

        try {
        // Ler dados da pessoa:
        System.out.print("Digite sua renda anual com salário: ");
        float rendaSalario = scanner.nextFloat();
        pessoa.setRendaSalario(rendaSalario);

        System.out.print("Digite sua renda anual com prestação de serviço: ");
        float rendaServico = scanner.nextFloat();
        pessoa.setRendaServico(rendaServico);

        System.out.print("Digite sua renda anual com ganho de capital: ");
        float rendaCapital = scanner.nextFloat();
        pessoa.setRendaCapital(rendaCapital);

        System.out.print("Digite seus gastos médicos: ");
        float gastoMedico = scanner.nextFloat();
        pessoa.setGastoMedico(gastoMedico);

        System.out.print("Digite seus gastos educacionais: ");
        float gastoEducacional = scanner.nextFloat();
        pessoa.setGastoEducacional(gastoEducacional);

        // Calcular impostos.
        float impostoSalario = imposto.calcImpostoSalario(pessoa.getRendaSalario());
        float impostoServico = imposto.calcImpostoServicos(pessoa.getRendaServico());
        float impostoCapital = imposto.calcImpostoCapital(pessoa.getRendaCapital());
        // Calcular imposto bruto total.
        float impostoBruto = impostoSalario + impostoServico + impostoCapital;
        // Calcular gastos dedutíveis.
        float gastosDedutiveis = pessoa.getGastoMedico() + pessoa.getGastoEducacional();
        // Calcular imposto devido.
        float impostoDevido = imposto.calcImpostoDevido(impostoBruto, gastosDedutiveis);
        // Exibir relatório:
        System.out.println("> > RELATÓRIO DE IMPOSTO DE RENDA < <");
        System.out.printf("\n|CONSOLIDADO DE RENDA:");
        System.out.printf("\nImposto sobre salário: %.2f", impostoSalario);
        System.out.printf("\nImposto sobre serviços: %.2f", impostoServico);
        System.out.printf("\nImposto sobre ganho de capital: %.2f", impostoCapital);
        System.out.printf("\n |DEDUÇÕES:");
        System.out.printf("\nMáximo dedutível: %.2f", imposto.calcMaxAbatimento(impostoBruto));
        System.out.printf("\nGastos dedutíveis: %.2f", gastosDedutiveis);
        System.out.printf("\n |RESUMO:");
        System.out.printf("\nImposto bruto total: %.2f", impostoBruto);
        System.out.printf("\nAbatimento: %.2f", imposto.calcMaxAbatimento(impostoBruto));
        System.out.printf("\nImposto devido: %.2f", impostoDevido);
        } finally {
            scanner.close();
        }
        
    }
}