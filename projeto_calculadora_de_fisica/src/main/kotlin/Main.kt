fun main() {
    val calculadora = Calculos()

    println("Calculadora Física")
    println("Selecione uma das opções abaixo:")
    println("Digite [ 1 ] se você deseja saber a FORÇA PESO de um corpo;")
    println("Digite [ 2 ] se você deseja saber a FORÇA CENTRÍPETA;")
    println("Digite [ 3 ] se você deseja saber o IMPULSO;")
    println("Digite [ 4 ] se você deseja saber a FORÇA ELÁSTICA;")
    println("Digite [ 5 ] se você deseja saber a VELOCIDADE MÉDIA;")
    println("Digite [ 6 ] se você deseja saber o MOVIMENTO RETILÍNEO UNIFORMEMENTE (MRU);")
    println("Digite [ 7 ] se você deseja saber o MOVIMENTO RETILÍNEO UNIFORMEMENTE VARIADO (MRUV);")
    println("Ou digite [ 8 ] se você deseja sair.")
    print("Opção: ")

    val resposta: String? = readLine()

    if (resposta == "1") {
        print("Para calcurarmos a força peso de um corpo, digite, primeiro, a massa (Kg): ")
        val n1: Float = readLine()!!.toFloat()
        print("Agora, digite a gravidade desejada (m/s²): ")
        val n2: Float = readLine()!!.toFloat()
        val fp = calculadora.forcaPeso(n1, n2)
        println("A força peso do corpo é de $fp N.")

    } else if (resposta == "2") {
        print("Para calcularmos a força centrípeta de um corpo, digite, primeiro, a massa (Kg): ")
        val n1: Float = readLine()!!.toFloat()
        print("Agora, digite a velocidade do corpo (m/s): ")
        val n2: Float = readLine()!!.toFloat()
        print("E, por fim, o raio da trajetória circular (m): ")
        val n3: Float = readLine()!!.toFloat()
        val fc = calculadora.forcaCentripeta(n1, n2, n3)
        println("A força centrípeta é de $fc N.")

    } else if (resposta == "3") {
        print("Para calcularmos o impulso, digite, primeiro, a força resultante (N): ")
        val n1: Float = readLine()!!.toFloat()
        print("Agora, digite o intervalo de tempo (s): ")
        val n2: Float = readLine()!!.toFloat()
        val imp = calculadora.impulso(n1, n2)
        println("O impulso do corpo foi de $imp N.s.")

    } else if (resposta == "4") {
        print("Para calcularmos a força elástica resultante, digite, primeiro, a constante elástica da mola (N/m): ")
        val n1: Float = readLine()!!.toFloat()
        print("Agora, digite a deformação da mola (m): ")
        val n2: Float = readLine()!!.toFloat()
        val fe = calculadora.forcaElastica(n1 , n2)
        println("A intensidade da força aplicada foi de $fe N.")

    } else if (resposta == "5") {
        print("Para calcularmos a velocidade média, digite, primeiro, a posição final do objeto (Km): ")
        val n1: Float = readLine()!!.toFloat()
        print("A posição inicial (Km): ")
        val n2: Float = readLine()!!.toFloat()
        print("Agora, o tempo final do objeto (h): ")
        val n3: Float = readLine()!!.toFloat()
        print("E, por fim, o tempo inicial (h): ")
        val n4: Float = readLine()!!.toFloat()
        val veloMed = calculadora.velocidadeMedia(n1, n2, n3, n4)
        println("A velocidade média do objeto foi de $veloMed Km/h.")

    } else if (resposta == "6") {
        print("Para calcularmos o Movimento Retilíneo Uniformemente, digite, primeiro, a posição inicial do \nobjeto (m): ")
        val n1: Float = readLine()!!.toFloat()
        print("Agora, a velocidade (m/s): ")
        val n2: Float = readLine()!!.toFloat()
        print("E, por fim, o intervalo de tempo (s): ")
        val n3: Float = readLine()!!.toFloat()
        val movRetUni = calculadora.mru(n1, n2, n3)
        println("O MRU  é de $movRetUni m.")

    } else if (resposta == "7") {
        print("Para calcularmos o Movimento Retilíneo Uniformemente Variado, digite, primeiro, a posição inicial do \nobjeto (m): ")
        val n1: Float = readLine()!!.toFloat()
        print("Agora, a velocidade inicial (m/s): ")
        val n2: Float = readLine()!!.toFloat()
        print("O tempo (s): ")
        val n3: Float = readLine()!!.toFloat()
        print("E, por fim, a aceleração (m/s²): ")
        val n4: Float = readLine()!!.toFloat()
        val movRetUniV = calculadora.mruv(n1, n2, n3, n4)
        println("O MRUV é de $movRetUniV m.")

    } else if (resposta == "8") {
        println(":(")

    } else {
        println("ERRO: DIGITAÇÃO INCORRETA.")
        println("TENTE NOVAMENTE!")
    }
    println("OBRIGADO! VOLTE SEMPRE! :)")
}
