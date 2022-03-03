import java.text.DecimalFormat

class Payment {
    val dec = DecimalFormat("#,##0.00")
    private var priceProduct: Float = 0f
    private var newPrice: Float = 0f

    fun showPriceProduct(price: Float) {
        priceProduct = price
    }

    fun chooseFormOfPayment(x: Int) {
        when (x) {
            1 -> {newPrice = (priceProduct - (priceProduct * 10 / 100))
                println("""O valor original do produto é R${'$'}${dec.format(priceProduct)}.
                    |Pagando à vista você tem 10% de desconto no produto, 
                    |ficando com o total a pagar de R$${dec.format(newPrice)}""".trimMargin())
            }
            2 -> {newPrice = (priceProduct + (priceProduct * 3 / 100))
                println("""O valor original do produto é R${'$'}${dec.format(priceProduct)}.
                    |Pagando à prazo você tem um acréscimo de 3% de juros no valor do produto, 
                    |ficando com o total a pagar de R$${dec.format(newPrice)}""".trimMargin())
            }
            3 -> {
                print("Em quantas parcelas você gostaria de fazer? ")
                val times = readLine()!!.toInt()

                val valuePerMonth = ((priceProduct / times) + (priceProduct * 1.5 / 100))
                val finalValue = valuePerMonth * times

                println("""O valor original do produto é R${'$'}${dec.format(priceProduct)}.
                    |Pagando parcelado em $times vezes, você tem um acréscimo de 1,5% de juros ao mês no valor do produto, 
                    |ficando com o valor a pagar por mês de R$${dec.format(valuePerMonth)}. Juros de R$${dec.format(priceProduct * 1.5 /100)} por mês.
                    |Valor final do produto: R$${dec.format(finalValue)}
                    """.trimMargin())
            }
            else -> {
                println("""Erro: Forma de pagamento inválida. As opções são:
                    |1 -> à vista
                    |2 -> à prazo (30 dias)
                    |3 -> parcelado
                """.trimMargin())
            }
        }
    }
}