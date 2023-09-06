fun main(args: Array<String>) {
    val jeuSnake = JeuSnake(Grille(5,5))
    val affichageDirection = AffichageDirection();
    var score = Score(10);
    var i = 0;
    while (true) {
        affichageDirection.afficherDirection();
        score.afficherScore(i);
        i++;
    }
}