fun main() {
    val likes = 131
    if (likes == 1) {
        println("Понравилось $likes человеку")
    } else if (likes > 20 && likes < 100 && likes % 10 == 1) {
        println("Понравилось $likes человеку")
    } else if (likes > 100 && likes % 100 !== 11) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}
