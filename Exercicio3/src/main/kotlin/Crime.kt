class Crime {
    private var count = 0

    fun answer(answer: String) {
        if (answer.trim().substring(0,1).equals("s",true)) {
            count ++
        }
    }

    fun aboutCrime(): String {
        return if (count == 2) {
            "Você é supostamente SUSPEITO(A)"
        } else if (count == 3 || count == 4) {
            "Você é supostamente CÚMPLICE"
        } else if (count == 5) {
            "Você é supostamente o(a) ASSASSINO(A)"
        } else {
            "Você é supostamente INOCENTE"
        }
    }
}