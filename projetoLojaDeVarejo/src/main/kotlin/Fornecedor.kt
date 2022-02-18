class Fornecedor(
    var nome: String,
    var cnpj: String,
    var endereco: String,
    var telefoneComercial: String
) {
    override fun toString(): String {
        return "Nome do fornecedor: $nome  Telefone: $telefoneComercial"
    }
}
