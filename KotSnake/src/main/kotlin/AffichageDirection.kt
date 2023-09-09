/**
 * Classe permettant l'affichage de la direction entrée par l'utilisateur.
 */
class AffichageDirection {
    /**
     * Fonction qui va afficher la direction entrée par l'utilisateur.
     * @return Char
     */
    fun afficherDirection():Char {
        print("> Entrez votre direction: ")
        var directionEntree = readln()
        if (directionEntree.length > 1) {
            println("Direction invalide.")
            return 'X'
        }

        /** Instruction qui va prendre l'entrée et va comparer avec les touches de l'enum pour voir si cette touche
         * existe ou si c'est une mauvaise entrée. */
        Direction.entries.firstOrNull { it.touche == directionEntree.first() }?.let {
            return directionEntree.first()
        } ?: println("Direction invalide.")
        return 'X'
    }
}