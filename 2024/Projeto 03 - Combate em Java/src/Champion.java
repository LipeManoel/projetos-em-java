public class Champion {
    String name;
    int life;
    int attack;
    int armor;

    public void takeDamage(Champion other){
        int damage = other.attack - this.armor;

        if(damage <= 0 && life > 0){
            this.life -= 1;
        }else if(life >= damage){
            this.life -= damage;
        }else{
            this.life = 0;
        }
    }

    public String status(){
        if(this.life == 0){
            return this.name+": "+this.life+" de vida(MORREU).";
        }
        return this.name+": "+this.life+" de vida.";
    }
}
