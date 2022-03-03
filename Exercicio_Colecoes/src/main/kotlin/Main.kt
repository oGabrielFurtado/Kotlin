fun main() {
    val cinema = Cinema()

    println("""Cinema
        |Valores ingressos:
        |Inteira -> R$20,00
        |Estudante/Professor/Idoso -> R$10,00 
    """.trimMargin())

    while (true) {
        println("")
        println("Assentos disponíveis:")
        cinema.mostrarAssentos()

        cinema.venderIngresso()

        if (cinema.count == 10) {
            break
        }
    }
    cinema.mostrarAssentos()
    println("INGRESSOS ESGOTADOS!")
}