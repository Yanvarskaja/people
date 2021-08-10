fun main() {
    val likes = 11
    if (likes == 1) {
        println("Понравилось $likes человеку")
    } else if (likes >20 && likes % 10 == 1) {
        println("Понравилось $likes человеку")
    } else {
    println("Понравилось $likes людям")
    }
}