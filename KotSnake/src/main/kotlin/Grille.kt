/**
 * Classe Grille
 * @param largeur
 * @param hauteur
 * @property grille
 * @property plaine
 * @constructor
 */
data class Grille (
    var largeur: Int,
    var hauteur: Int) {

    var grille: Array<Case>
    var plaine = largeur * hauteur;
    init {
        var i = 1
        var index = 0
        grille = Array(largeur * hauteur + 1) { Case(0, 0) }
        while (i <= largeur) {
            var j = 1
            while(j <= hauteur){
                grille[index] = Case(i,j)
                index++
                j++
            }
            i++
        }
    }
}