import java.text.SimpleDateFormat
import java.util.Date

fun main() {
    val formatDate = SimpleDateFormat("dd/MM/yyyy")
    var date = Date()
    val taxas = Taxas()

    print("""MENU:
        |Digite N -> para calcular a TAXA DE NATALIDADE;
        |Digite M -> para calcular a TAXA DE MORTALIDADE.
        |--> 
    """.trimMargin())

    taxas.calcularTaxas(readLine()!!.toString().trim().substring(0,1).uppercase())
    println("")
    println("Data: ${formatDate.format(date)}")
}