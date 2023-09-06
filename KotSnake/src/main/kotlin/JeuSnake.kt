data class JeuSnake(var terrain: Grille) {
    fun jouer(){

        val positionSerpentDepart = (0..terrain.plaine).random()
        var positionPomme = (0..terrain.plaine).random()
        var serpents = Array(terrain.plaine,{Serpent(terrain.grille[positionSerpentDepart].X,terrain.grille[positionSerpentDepart].Y)})
        terrain.grille[positionPomme].Pomme = true
        while(true){

            if(!terrain.grille[positionPomme].Pomme){
                positionPomme = (0..terrain.plaine).random()
                terrain.grille[positionPomme].Pomme = true
            }
            for(serpent in serpents){
                if(serpent.coordonner == serpents[0].coordonner){
                    break;
                }
            }

            println("Entrez votre direction:")
            val direction =  readln()
            println(direction)

            if(direction == "x")
                break
        }
    }
}