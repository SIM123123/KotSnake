fun main(args: Array<String>) {
    val jeuSnake = JeuSnake(Grille(5,5))
    jeuSnake.jouer();
val affichageDirection = AffichageDirection();
    affichageDirection.afficherDirection(Direction.NORD);
    affichageDirection.afficherDirection(Direction.SUD);
    affichageDirection.afficherDirection(Direction.EST);
    affichageDirection.afficherDirection(Direction.OUEST);
}