fun main (){
    println("Olá, mundo!")
    var nome: String? = null
    var idade: Byte? = null
    print("Qual é o seu nome? ")
    nome = readLine()
    print("E quantos anos você tem?(apenas números) ")
    idade = readLine()!!.toByte()
    println("Olá, ${nome}, de ${idade} anos.")
    print("Prazer em te conhecer!")
}
