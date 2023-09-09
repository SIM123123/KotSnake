/**
 * Classe JeuSnake s'occupe de la logique du jeu.
 * @param terrain
 */
data class JeuSnake(var terrain: Grille) {
    var grille: Grille = terrain
    fun jouer(){
        val positionSerpentDepart = (0..< terrain.plaine - 1).random()
        var positionPomme = (0..< terrain.plaine - 1).random()
        val serpents = Serpent(terrain.grille[positionSerpentDepart].x,terrain.grille[positionSerpentDepart].y)
        terrain.grille[positionPomme].Pomme = true
        while(true){
            val score = Score(terrain.plaine)
            if (terrain.plaine == serpents.parties.size){
                positionPomme = terrain.plaine
                AffichageJeux(this).afficher(Coordonnee(terrain.grille[positionPomme].x,terrain.grille[positionPomme].y,),serpents.parties)
                score.afficherScore(serpents.parties.size)
                println("Bravo vous avez gagner")
                break
            }

            AffichageJeux(this).afficher(Coordonnee(terrain.grille[positionPomme].x,terrain.grille[positionPomme].y,),serpents.parties)


            score.afficherScore(serpents.parties.size)
            val touche = AffichageDirection().afficherDirection()

            var corpsSerpent = serpents.deplacer(serpents.toDirection(touche))

            if (corpsSerpent.size > 1) {
                val tete = corpsSerpent[0]
                corpsSerpent.removeAt(0)
                if (corpsSerpent.contains(Corps(tete.x, tete.y))){
                    println("Vous venez de vous manger.")
                    AffichageJeux(this).afficher(Coordonnee(terrain.grille[positionPomme].x,terrain.grille[positionPomme].y,),serpents.parties)
                    score.afficherScore(serpents.parties.size)
                    println("PARTIE TERMINÉE")
                    break
                }
                corpsSerpent.add(0, tete)
            }

            if (serpents.parties[0].x > terrain.largeur || serpents.parties[0].x < 1 ||
                    serpents.parties[0].y > terrain.hauteur || serpents.parties[0].y < 1 ||
                        touche == 'X'){
                Direction.entries.firstOrNull { it.touche == touche }?.let {
                    println("${it.name} est hors grille.")
                }
                AffichageJeux(this).afficher(Coordonnee(terrain.grille[positionPomme].x,terrain.grille[positionPomme].y,),serpents.parties)
                score.afficherScore(serpents.parties.size)
                println("PARTIE TERMINÉE")
                break
            }

            Direction.entries.firstOrNull { it.touche == touche }?.let {
                println("OK, déplacement vers ${it.name}.")
            }

            if(serpents.parties[0].x == terrain.grille[positionPomme].x && serpents.parties[0].y == terrain.grille[positionPomme].y){
                serpents.ajouter(serpents.toDirection(touche))
                terrain.grille[positionPomme].Pomme = false
            }

            if(!terrain.grille[positionPomme].Pomme){
                positionPomme = (0..<terrain.plaine - 1).random()
                terrain.grille[positionPomme].Pomme = true
            }

            while (serpents.parties.contains(Corps(terrain.grille[positionPomme].x,terrain.grille[positionPomme].y)) &&
                terrain.plaine != serpents.parties.size){
                positionPomme = (0..<terrain.plaine - 1).random()
            }
        }
    }
}