fun main() {
    val cliente = Cliente(
        nome = "Gabriel Furtado",
        idade = 24,
        cpf = "00000000000",
        enderecoResidencial = "Rua A, 154 - Porto Alegre/RS",
        telefoneCelular = "(51)333333333"
    )
    println(cliente)

    val fornecedor = Fornecedor(
        nome = "FURTADO",
        cnpj = "11111111111",
        endereco = "Rua B, 170 - Porto Alegre/RS",
        telefoneComercial = "(51)00000000"
    )
    println(fornecedor)

    val produto = Produto(
        nomeProduto = "Notebook ASUS",
        preco = 2500.99f,
        categoria = "Eletrônicos",
        peso = 4f,
        tamanho = "17 Polegadas"
    )
    println(produto)

    val transportadora = Transportadora(
        nome = "GF Transportadora",
        cnpj = "22222222222",
        endereco = "Rua C, 65 - Porto Alegre/RS",
        telefoneComercial = "(51)777777777"
    )
    println(transportadora)

    val venda = Venda(
        modoPagamento = "Débito",
        numeroCartao = "1234123412341234",
        nomeTitularCartao = "Gabriel Furtado"
    )
    println(venda)

    val vendedor = Vendedor(
        nome = "Lucas Furtado",
        sexo = "Masculino",
        cpf = "55555555555",
        idade = 25,
        enderecoResidencial = "Rua F, 658 - Porto Alegre/RS",
        telefoneCelular = "(51)666666666",
        salario = 1500.66f
    )
    println(vendedor)
}
