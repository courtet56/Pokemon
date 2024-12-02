public class PokemonEau extends Pokemon{
    public PokemonEau(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    /**
     * Méthode attaquer : surcharge
     * @param p
     */
    @Override
    public void attaquer(Pokemon p) {
        if(p instanceof PokemonFeu) {
            p.hp -= 2 * this.atk;
        } else if (p instanceof PokemonEau || p instanceof PokemonPlante) {
            p.hp = (int) (0.5 * this.atk);
        } else {
            super.attaquer(p);
        }

    }

}
