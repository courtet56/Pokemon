public class PokemonFeu extends Pokemon{
    public PokemonFeu(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    public void attaquer(Pokemon p) {
        if(p instanceof PokemonPlante) {
            p.hp -= 2 * this.atk;
        } else if (p instanceof PokemonEau || p instanceof PokemonFeu) {
            p.hp = (int) (0.5 * this.atk);
        } else {
            super.attaquer(p);
        }

    }
}
