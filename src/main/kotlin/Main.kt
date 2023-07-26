
fun main(args: Array<String>) {
// calcularPromedio
    val promedioResult = calcularPromedio(numbers)
    println("El promedio de la lista es: $promedioResult")

    // filtrarImpares
    val impares = filtrarImpares(numbers)
    println("Números impares: $impares")

    // isPalindrome
    val cadena1 = "reconocer"
    val cadena2 = "hola"
    println("$cadena1 es palíndromo: ${isPalindrome(cadena1)}")
    println("$cadena2 es palíndromo: ${isPalindrome(cadena2)}")

    // agregarSaludo
    val saludos = agregarSaludo(nombres)
    saludos.forEach { println(it) }

    // PerformOperation
    val suma = performOperation(5, 3) { x, y -> x + y }
    val resta = performOperation(10, 4) { x, y -> x - y }
    println("Suma: $suma")
    println("Resta: $resta")
}
val numbers = listOf(2, 5, 6, 8, 11, 13)
val nombres = listOf("Alicia", "Dani", "Eduardo", "Renata")

fun calcularPromedio(numbers: List<Int>): Double {
    val suma = numbers.reduce { acc, num -> acc + num }
    return suma.toDouble() / numbers.size

}
fun filtrarImpares(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 != 0 }
}
fun isPalindrome(input: String): Boolean {
    val cleanInput = input.replace("\\W".toRegex(), "").toLowerCase() //(\\s) que busca y reemplaza todos los espacios en blanco
    return cleanInput == cleanInput.reversed()
}
fun agregarSaludo(nombres: List<String>): List<String> {
    return nombres.map { "¡Hola, $it!" }
}
//PerformOperation
fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
val suma = performOperation(5, 3) { x, y -> x + y }
val resta = performOperation(10, 4) { x, y -> x - y }

