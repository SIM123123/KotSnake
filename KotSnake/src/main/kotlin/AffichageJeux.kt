data class AffichageJeux(val jeu: JeuSnake){
    companion object fun afficher(pomme:Coordonnee,serpent:ArrayList<Corps>){
        for (i in 1..jeu.terrain.hauteur){
            for(j in 1..jeu.terrain.largeur){
                if(pomme.x == j && pomme.y == i){
                    print("🍎")
                }else if (serpent.contains(Corps(j,i))){
                    print("🟩")
                }else{
                    print("⬛")
                }
            }
            print("\n")
        }

    }
}