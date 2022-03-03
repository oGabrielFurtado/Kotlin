fun main() {
    val crime = Crime()

    println("Sobre o crime...")

    print("Você telefonou para a vítima? [S/N] ")
    crime.answer(readLine().toString())

    print("Você esteve no local do crime? [S/N] ")
    crime.answer(readLine().toString())

    print("Você mora perto da vítima? [S/N] ")
    crime.answer(readLine().toString())

    print("Devia para a vítima? [S/N] ")
    crime.answer(readLine().toString())

    print("E você já trabalhou com a vítima? [S/N] ")
    crime.answer(readLine().toString())

    println(crime.aboutCrime())
}