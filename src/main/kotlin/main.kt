fun main() {
    val likes = 11
    if (likes == 1) {
        println("Понравилось $likes человеку")
    } else if (likes >20 && likes < 100 && likes % 10 == 1) {
        println("Понравилось $likes человеку")
    } else if (likes >100 && likes % 100 == 11) {
        println("Понравилось $likes людям")
    } else {
    println("Понравилось $likes людям")
    }
}
