package lab3

class Factorial {
    fun process() {
        print("Ingrese un numero: ")
        val numero = readln().toInt()
        val result = find(numero)
        println("El factorial de $numero es: $result")
    }

    fun find(n: Int): Int {
        var result = 1
        for (i in 1..n){
            result *= i
        }
        return result
    }
}
