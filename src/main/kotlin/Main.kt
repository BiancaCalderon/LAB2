fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
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


