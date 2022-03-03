fun main() {
    val payment = Payment()

    print("Informe o preço do produto: R$")
    payment.showPriceProduct(readLine()!!.toFloat())

    print("""Formas de pagamento: 
        |Digite [1] para pagamento à vista;
        |Digite [2] para pagamento à prazo (30 dias);
        |Digite [3] para pagamento parcelado.
        |---> 
    """.trimMargin())
    payment.chooseFormOfPayment(readLine()!!.toInt())
}