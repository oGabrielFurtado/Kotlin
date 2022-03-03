fun main() {
    val leapYear = LeapYear()

    print("Digite um ano para saber se ele é ou não bissexto: ")
    val year: Int = readLine()!!.toInt()

    println(leapYear.leapYear(year))
}