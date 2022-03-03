import java.text.DecimalFormat

class GasStation {
    private val dec = DecimalFormat("#,###.00")
    private val gasoline: Float = 6.66f
    private val alcohol: Float = 6.06f
    private var price: Float? = null

    fun calculateGasolinePrice(liters: Float) {
        price = if (liters <= 20) {
            (gasoline - (gasoline * 4 / 100)) * liters
        } else {
            (gasoline - (gasoline * 6 / 100)) * liters
        }

         println("Valor a ser pago: R$${dec.format(price)}")
    }

    fun calculateAlcoholPrice(liters: Float) {
        price = if (liters <= 20) {
            (alcohol - (alcohol * 3 / 100)) * liters
        } else {
            (alcohol - (alcohol * 5 / 100)) * liters
        }

        println("Valor a ser pago: R$${dec.format(price)}")
    }
}