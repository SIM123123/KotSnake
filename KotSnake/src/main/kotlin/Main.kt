fun main(args: Array<String>) {
    println("Bonjour, veuillez entrer les dimensions de la grille: ")
    print("Largeur (x): ")
    val x = readln().toInt()
    print("Hauteur (y): ")
    val y = readln().toInt()
    val jeuSnake = JeuSnake(Grille(x, y))
    jeuSnake.jouer()
}