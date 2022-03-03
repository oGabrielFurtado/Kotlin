import java.text.DecimalFormat

class Taxas {
    val dec = DecimalFormat("#,###.00")

    fun calcularTaxas(answer: String) {
        when (answer) {
            "N" -> {calcularTaxaDeNatalidade()}
            "M" -> {calcularTaxaDeMortalidade()}
            else -> {println("Opção inválida")}
        }
    }

    fun calcularTaxaDeNatalidade() {
        print("Digite o número de nascimentos: ")
        var nCriancasNascidas = readLine()!!.toFloat()

        print("Digite o número de habitantes: ")
        var nHabitantes = readLine()!!.toFloat()

        var taxaDeNatalidade = nCriancasNascidas * 1000 / nHabitantes

        return println("A taxa de natalidade é ${dec.format(taxaDeNatalidade)}%")
    }

    fun calcularTaxaDeMortalidade() {
        print("Digite o número de óbitos: ")
        var nObitos = readLine()!!.toFloat()

        print("Digite o número de habitantes: ")
        var nHabitantes = readLine()!!.toFloat()

        var taxaDeMortalidade = nObitos * 1000 / nHabitantes

        println("A taxa de mortalidade é ${dec.format(taxaDeMortalidade)}%")
    }
}