data class Score(val tailleGrille: Int) {

    fun afficherScore(tailleSerpent: Int) {
        println("Score : ${(tailleSerpent.toDouble()/tailleGrille) * 100} %");
    }
}