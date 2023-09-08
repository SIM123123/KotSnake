data class Serpent (var X: Int, var Y: Int) {
    var parties  = ArrayList<Corps>()
    private var historiqueDeplacement:Coordonnee = Coordonnee(1, 0)
    init{
        parties.add(Corps(X,Y))
    }
    fun ajouter (){
        parties.add(Corps(parties[0].x + 1  ,parties[0].y))
    }

    fun toDirection(touche: Char) : Coordonnee {
        for(d in Direction.entries){
            if(d.touche == touche){
                return d.coordonnee
            }
        }
        return Coordonnee(0,0)
    }
    fun deplacer( direction: Coordonnee){
        val tete = parties[0]
        val nouvelleTete = Corps(tete.x + direction.x, tete.y + direction.y)
        parties.add(0,nouvelleTete)

        if(parties.size > 1){
            parties.removeAt(parties.size - 1)
        }
    }
}