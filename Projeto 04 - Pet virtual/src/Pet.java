public class Pet{
    String nome;
    String classe;
    String familia;
    int forca;
    int caloria;
    int idade;
    boolean estado;

    public void Nascer(){
        this.forca = 10;
        this.caloria = 10;
        this.estado = true;
    } 

    public String Morrer(){
        this.forca = 0;
        this.estado = false;
        return this.nome+" morreu.";
    }

    public String Comer(){
        if(this.caloria < 100 && this.estado == true){
            this.caloria += 10;
            this.forca -=2;
            return this.nome+" comeu e agora sua força é "+this.forca+". Suas calorias valem "+this.caloria+".";
        }
        return this.nome+" não comeu, pois está de barriga cheia ou morto.";
    }

    public String Correr(){
        if(this.estado == true && this.caloria > 0){
            this.caloria -=5;
            this.forca -=5;
            return this.nome+" correu e agora sua força é de "+this.forca+". Suas calorias valem "+this.caloria;
        }
        return this.nome+" não conseguiu correr, pois está de barriga cheia ou morto.";
    }

    public String Dormir(){
        if(this.estado == true){
            this.caloria -= 2;

            if(this.forca < 100){
                this.forca +=10;
            }
            return this.nome+" dormiu. Sua força aumentou para "+this.forca+" e suas calorias diminuíram para "+this.caloria+".";
        }
        return this.nome+" não conseguiu dormir, pois está morto.";
    }
}