class Cinema {
    private var assentos = mutableListOf<String>("A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10")
    var count = 0
    private var escolha: Int? = null

    fun mostrarAssentos() {
        for (n in assentos) {
            print("| " + n + " ")
        }
        println("|")
    }

    fun escolherAssento() {
        print("Escolha um assento: A")
        escolha = readLine()!!.toInt()

        if (escolha in 1..10) {

            if (assentos[escolha!! - 1].equals("X")) {
                println("Assento já ocupado! Por gentileza, escolha outro.")
                escolherAssento()

            } else {
                println("Assento reservado com sucesso!")
                assentos[escolha!! - 1] = "X"
                count++
            }

        } else {
            println("Assento inválido!")
            escolherAssento()
        }
    }

    fun venderIngresso() {
        var tipo: Int = 0
        println("Qual o tipo de ingresso?")
        println("Digite [1] -> INTEIRA")
        println("Digite [2] -> ESTUDANTE/PROFESSOR/IDOSO")
        print("==> ")

        while (true){
            tipo = readLine()!!.toInt()

            if (tipo in 1..2) {
                break
            }
            print("==> ")
        }

        when (tipo) {
            1 -> {println("Ingresso tipo INTEIRA  Valor: R$20,00")}
            2 -> {println("Ingresso tipo ESTUDANTE/PROFESSOR/IDOSO Valor: R$10,00")}
        }
        cancelarCompra()
    }

    fun cancelarCompra() {
        var opcao: Int = 0
        print("""Você confirma ou cancela a compra?
            |Digite [1] para confirmar
            |Digite [2] para cancelar
            |==> 
        """.trimMargin())
        while (opcao != 1 && opcao != 2) {
            opcao = readLine()!!.toInt()
            print("==> ")
        }
        when (opcao) {
            1 -> {escolherAssento()}
            2 -> {println("Compra CANCELADA!")}
        }
    }
}