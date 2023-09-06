data class Grille (
    var largeur: Int,
    var hauteur: Int) {

    var grille: Array<Case>
    var plaine = largeur * hauteur;
    init {
        var i = 1
        var index = 0
        grille = Array(largeur * hauteur + 1,{Case(0,0)})
        while (i <= hauteur) {
            var j = 1
            while(j <= largeur){
                grille[index] = Case(i,j)
                index++
                j++
            }
            i++
        }
    }


}