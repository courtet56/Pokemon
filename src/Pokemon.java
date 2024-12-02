public class Pokemon {
    protected String nom;
    protected int hp;
    protected int atk;

    public Pokemon(String nom, int hp, int atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    public String getNom() {
        return nom;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public boolean isDead() {
        return (this.hp <= 0);
    }

    public void attaquer(Pokemon p) {
        p.hp -= this.atk;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nom='" + nom + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                '}';
    }
}
