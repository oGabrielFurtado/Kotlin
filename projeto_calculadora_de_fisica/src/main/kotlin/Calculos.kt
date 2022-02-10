import kotlin.math.pow
class Calculos {
    fun forcaPeso (peso: Float, gravidade: Float): Float = peso * gravidade

    fun forcaCentripeta (massa: Float, velocidade: Float, raio: Float): Float {
        return massa * (velocidade.pow(2) / raio)
    }

    fun impulso (forcaResultante: Float, intervaloTempo: Float): Float = forcaResultante * intervaloTempo

    fun forcaElastica (constanteElasticaMola: Float, deformacaoMola: Float): Float {
        return constanteElasticaMola * deformacaoMola
    }

    fun velocidadeMedia (posicaoFinal: Float, posicaoInicial: Float, tempoFinal: Float, tempoInicial: Float): Float {
        return (posicaoFinal - posicaoInicial) / (tempoFinal - tempoInicial)
    }

    fun mru (posicaoInicial: Float, velocidade: Float, tempoDeslocamento: Float): Float {
        return posicaoInicial + (velocidade * tempoDeslocamento)
    }

    fun mruv(posicaoInicial: Float, velocidadeInicial: Float, tempo: Float, aceleracao: Float): Float {
        return posicaoInicial + (velocidadeInicial * tempo) + ((1 / 2) * aceleracao * tempo.pow(2))
    }
}
