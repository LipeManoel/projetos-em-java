class Imposto {
    // Métodos para calcular os impostos:
    public float calcImpostoSalario(float rendaSalario) {
        float imposto = 0;
        float salarioMensal = rendaSalario / 12;
        
        if (salarioMensal < 3000) {
            return 0; // Isento
        } else if (salarioMensal < 5000) {
            imposto = (10 * rendaSalario) / 100; // 10%
        } else {
            imposto = (20 * rendaSalario) / 100; // 20%
        }
        return imposto;
    }

    public float calcImpostoServicos(float rendaServico) {
        return (rendaServico * 15) / 100; // 15%
    }

    public float calcImpostoCapital(float rendaCapital) {
        return (rendaCapital * 20) / 100; // 20%
    }

    // Método para calcular o máximo abatível:
    public float calcMaxAbatimento(float impostoBruto) {
        return impostoBruto * 0.30f; // 30% do imposto bruto
    }
    // Método para calcular imposto devido:
    public float calcImpostoDevido(float impostoBruto, float gastosDedutiveis) {
        float maxAbatimento = calcMaxAbatimento(impostoBruto);
        float abatimentoFinal = Math.min(gastosDedutiveis, maxAbatimento);
        return impostoBruto - abatimentoFinal;
    }
}