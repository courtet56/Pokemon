public class PokemonPlante extends Pokemon{
    public PokemonPlante(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    public void attaquer(Pokemon p) {
        if(p instanceof PokemonEau) {
            p.hp -= 2 * this.atk;
        } else if (p instanceof PokemonFeu || p instanceof PokemonPlante) {
            p.hp = (int) (0.5 * this.atk);
        } else {
            super.attaquer(p);
        }

    }

}
