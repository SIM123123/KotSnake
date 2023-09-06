class AffichageDirection {
    fun afficherDirection(direction: Direction) {
        print("> Entrez votre direction: ")
        var directionEntree = readLine()

        println("OK, déplacement vers ${direction.name.lowercase().capitalize()}.");
    }
}