data class JeuSnake(var terrain: Grille) {
    var grille: Grille = terrain
    fun jouer(){
        val positionSerpentDepart = (0..terrain.plaine).random()
        var positionPomme = (0..terrain.plaine).random()
        val serpents = Serpent(terrain.grille[positionSerpentDepart].x,terrain.grille[positionSerpentDepart].y)
        terrain.grille[positionPomme].Pomme = true
        while(true){

            if(positionPomme == positionSerpentDepart){
                positionPomme = (0..terrain.plaine).random()
            }
            if(!terrain.grille[positionPomme].Pomme){
                positionPomme = (0..terrain.plaine).random()
                terrain.grille[positionPomme].Pomme = true
            }

            AffichageJeux(this).afficher(Coordonnee(terrain.grille[positionPomme].x,terrain.grille[positionPomme].y,),serpents.parties)

            val touche = AffichageDirection().afficherDirection()

            serpents.deplacer(serpents.toDirection(touche))

            if(serpents.parties[0].x == terrain.grille[positionPomme].x && serpents.parties[0].y == terrain.grille[positionPomme].y){
                serpents.ajouter()
                terrain.grille[positionPomme].Pomme = false
                println(serpents.parties.size)
            }


        }
    }
}