package lab3

import kotlin.time.measureTime

class QuickSort {
    fun process() {
        print("Ingrese una lista de numeros separados por comas: ")
        val numeros = readln().split(",").map{ it.toInt() }.toIntArray()
        val tiempo = measureTime { sort(numeros, 0, numeros.size -1) }
        val ejecucion: Double = (tiempo.inWholeMicroseconds)/1000000.0
        println("Lista ordenada usando Quick Sort: [${numeros.joinToString()}]")
        println("Tiempo de ejecucion: $ejecucion segundos")
        println()
    }

    fun sort(arr: IntArray, low: Int, high: Int) {
        if (low < high) {
            val pi = partition(arr,low, high)
            sort(arr, low, pi - 1)
            sort(arr, pi + 1, high)
        }
    }

    fun partition(arr: IntArray, low: Int, high: Int): Int {
        val pivot = arr[high]
        var i = low - 1
        for (j in low until high) {
            if (arr[j] <= pivot) {
                i++
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
        val temp = arr[i + 1]
        arr[i + 1] = arr[high]
        arr[high] = temp
        return i + 1
    }
}
