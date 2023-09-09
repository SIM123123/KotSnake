/**
 * Classe Serpent
 * @param X
 * @param Y
 * @property parties
 * @property ajouterB
 * @property historiqueDeplacement
 * @constructor
 */
data class Serpent (var X: Int, var Y: Int) {
    var parties  = ArrayList<Corps>()
    var dernierePositionQueue = Coordonnee(0,0)
    private var ajouterB:Boolean = false;
    private var historiqueDeplacement:Coordonnee = Coordonnee(1, 0)
    init{
        parties.add(Corps(X,Y))
    }
    fun ajouter (direction: Coordonnee){
        parties.add(Corps(dernierePositionQueue.x, dernierePositionQueue.y))
        //ajouterB = true
    }

    fun toDirection(touche: Char) : Coordonnee {
        for(d in Direction.entries){
            if(d.touche == touche){
                return d.coordonnee
            }
        }
        return Coordonnee(0,0)
    }
    fun deplacer(direction: Coordonnee) : ArrayList<Corps>{
        val tete = parties[0]
        val nouvelleTete = Corps(tete.x + direction.x, tete.y + direction.y)
        parties.add(0,nouvelleTete)
        dernierePositionQueue = Coordonnee(parties.last().x, parties.last().y)

        if(parties.size > 0 ){
            if(ajouterB){
                ajouterB = false
            } else {
                parties.removeAt(parties.size - 1)
            }
        }
        return parties
    }
}