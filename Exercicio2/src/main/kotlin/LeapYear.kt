class LeapYear {
    fun leapYear(year: Int): String {
        return if (year % 4 == 0 && year % 100 != 0 || year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            "O ano $year é BISSEXTO."
        } else {
            "O ano $year NÃO É BISSEXTO!"
        }
    }
}