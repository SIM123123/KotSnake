/**
 * Classe permettant de calculer et d'afficher le score du joueur
 */
data class Score(val tailleGrille: Int) {

    companion object fun afficherScore(tailleSerpent: Int) {
        println("Score : ${"%.2f".format((tailleSerpent.toDouble()/tailleGrille) * 100)} % \n");
    }
}