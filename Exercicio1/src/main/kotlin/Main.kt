fun main() {
    val triangle = Triangle()

    println("Informe três segmentos para saber se eles podem formar um triângulo ou não.")

    print("Digite o primeiro segmento (cm): ")
    val a: Float = readLine()!!.toFloat()

    print("Digite o segundo segmento (cm): ")
    val b: Float = readLine()!!.toFloat()

    print("Digite o terceiro segmento (cm): ")
    val c: Float = readLine()!!.toFloat()

    println(triangle.calculateTriangle(a, b, c))
}