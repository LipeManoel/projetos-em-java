class Pessoa {
    private float rendaSalario;
    private float rendaServico;
    private float rendaCapital;
    private float gastoMedico;
    private float gastoEducacional;

    // Métodos para definir os valores:
    public void setRendaSalario(float renda) {
        this.rendaSalario = renda;
    }
    public void setRendaServico(float renda) {
        this.rendaServico = renda;
    }
    public void setRendaCapital(float renda) {
        this.rendaCapital = renda;
    }
    public void setGastoMedico(float gasto) {
        this.gastoMedico = gasto;
    }
    public void setGastoEducacional(float gasto) {
        this.gastoEducacional = gasto;
    }

    // Métodos para mostrar os valores:
    public float getRendaSalario() {
        return rendaSalario;
    }
    public float getRendaServico() {
        return rendaServico;
    }
    public float getRendaCapital() {
        return rendaCapital;
    }
    public float getGastoMedico() {
        return gastoMedico;
    }
    public float getGastoEducacional() {
        return gastoEducacional;
    }
}