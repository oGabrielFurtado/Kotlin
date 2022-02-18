class Produto(
    var nomeProduto: String,
    var preco: Float,
    var tamanho: Float,
    var peso: Float,
    var categoria: String
) {
    override fun toString(): String {
        return "Nome do produto: $nomeProduto  Preço: $preco"
    }
}
