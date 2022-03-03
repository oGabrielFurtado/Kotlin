class Triangle {
    fun triangle(a: Float, b: Float, c: Float): String {
        return if ((a + b) > c && (b + c) > a && (c + a) > b ) {
            if (a == b && b == c) {
                "Os três segmentos formam um TRIÂNGULO EQUILÁTERO."
            } else if (a == b || b == c || c == a) {
                "Os três segmentos formam um TRIÂNGULO ISÓSCELES."
            } else {
                "Os três segmentos formam um TRIÂNGULO ESCALENO."
            }
        } else {
            "Os três segmentos informados NÃO PODEM formar um triângulo!"
        }
    }
}