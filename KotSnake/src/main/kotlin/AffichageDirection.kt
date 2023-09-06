class AffichageDirection {
    fun afficherDirection() {
        print("> Entrez votre direction: ")
        var directionEntree = readln();
        if (directionEntree.length > 1) {
            println("Erreur, veuillez entrer une direction valide.");
            return;
        }

        /** Instruction qui va prendre l'entrée et va comparer avec les touches de l'enum pour voir si cette touche
         * existe ou si c'est une mauvaise entrée. */
        Direction.entries.firstOrNull { it.touche == directionEntree.first() }?.let {
            println("OK, déplacement vers ${it.name}.");
        } ?: println("Direction invalide.");
    }
}