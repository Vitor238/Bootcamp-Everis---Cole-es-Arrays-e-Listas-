package one.digitainnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)
    map1.forEach { s, d -> println("Chave: $s , Valor: $d") }


    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )

    map2.forEach { s, d -> println("Chave: $s , Valor: $d") }
}