fun main() {
    var heroName: String = ""
    var heroXP : Int = 0;
    var heroTitle : String = "";

    println("Qual é o nome do Heroi ?")
    heroName = readln()
    println("Qual a quantidade de Experiência do Heroi ?")
    heroXP = readln().toInt()

    heroTitle = when {
        heroXP >= 1001 && heroXP <= 2000  -> "Bronze"
        heroXP >= 2001 && heroXP <= 5000  -> "Prata"
        heroXP >= 5001 && heroXP <= 7000  -> "Ouro"
        heroXP >= 7001 && heroXP <= 8000  -> "Platina"
        heroXP >= 8001 && heroXP <= 9000  -> "Ascendente"
        heroXP >= 9001 && heroXP <= 10000 -> "Imortal"
        heroXP >= 10001                   -> "Radiante"
        else -> "Ferro"
    }
    println("O Herói de nome $heroName está no nível de $heroTitle")
}