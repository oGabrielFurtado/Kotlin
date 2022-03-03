fun main() {
    val gasStation = GasStation()
    var answer: String? = null

    print(
        """GAS STATION
        |Preços: 
        |Gasolina: R$6,66/litro
        |Álcool: R$6,06/litro

        |Descontos:
        |Álcool:
        |- Até 20 litros: desconto de 3% por litro;
        |- Acima de 20 litros: Desconto de 5% por litro.
                    
        |Gasolina:
        |- Até 20 litros: desconto de 4% por litro;
        |- Acima de 20 litros, desconto de 6% por litro.
        
        |Qual o combustível escolhido?
        |Digite "G" para escolher gasolina;
        |Digite "A" para escolher álcool.
        |==> """.trimMargin()
    )
    answer = readLine()!!

    if (answer.trim().substring(0,1).equals("g", true)) {
        print("Quantos litros de gasolina você gostaria de encher? ")
        gasStation.calculateGasolinePrice(readLine()!!.toFloat())

    }else if (answer.trim().substring(0,1).equals("a", true)) {
        print("Quantos litros de álcool você gostaria de encher? ")
        gasStation.calculateAlcoholPrice(readLine()!!.toFloat())

    } else {
        println("""ERRO: Tipo de combustível não reconhecido.
            |G -> gasolina
            |A -> álcool
        """.trimMargin())
    }
}