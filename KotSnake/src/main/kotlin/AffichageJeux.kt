/**
 * Classe qui permet d'afficher le jeu
 * @param jeu le jeu en cours
 */
data class AffichageJeux(val jeu: JeuSnake){
    companion object fun afficher(pomme:Coordonnee,serpent:ArrayList<Corps>){
        for (j in 1..jeu.terrain.hauteur){
            for(i in 1..jeu.terrain.largeur){
                if(pomme.x == i && pomme.y == j){
                    print("🍎")
                }else if (serpent.contains(Corps(i,j))){
                    if (serpent.indexOf(Corps(i,j)) == 0) {
                        print("\uD83D\uDFE6")
                    }else{
                        print("🟩")
                    }
                }else{
                    print("⬛")
                }
            }
            print("\n")
        }

    }
}