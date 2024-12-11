package lab3
import lab3.BubbleSort
import lab3.Factorial
import lab3.QuickSort
import lab3.TorresdeHanoi
import kotlin.system.exitProcess

fun main() {
    menu()
}

fun menu() {
    println("Seleccione una opcion")
    println("1. Ordenar una lista usando Bubble Sort")
    println("2. Ordenar una lista usando Quick Sort")
    println("3. Calcular el factorial de un numero")
    println("4. Resolver las Torres de Hanoi")
    println("5. Salir")

    val seleccion = readLine()

    if (seleccion == "1") {
        BubbleSort().process()
        menu()
    } else if (seleccion == "2") {
        QuickSort().process()
        menu()
    } else if (seleccion == "3") {
        Factorial().process()
        menu()
    } else if (seleccion == "4") {
        TorresdeHanoi().process()
        menu()
    } else if (seleccion == "5") {
        exitProcess(0)
    } else {
        throw IllegalArgumentException("Seleccione un numero entre 1 y 5")
    }
}
