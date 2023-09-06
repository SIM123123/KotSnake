data class Coordonnee(val x: Int, val y: Int) {
    val estDansLimite = x >= 0 && y >= 0
}
enum class Direction(private val coordonnee: Coordonnee, val touche: Char) {
    NORD(Coordonnee(0, 1), 'w'),
    SUD(Coordonnee(0, -1), 's'),
    OUEST(Coordonnee(-1, 0), 'a'),
    EST(Coordonnee(1, 0), 'd');

    fun deplacer(coordonneeActuelle: Coordonnee) =
        Coordonnee(
            coordonneeActuelle.x + coordonnee.x,
            coordonneeActuelle.y + coordonnee.y
        )
}