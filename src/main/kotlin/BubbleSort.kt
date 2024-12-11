package lab3

import kotlin.time.measureTime

class BubbleSort {
    fun process() {
        print("Ingrese una lista de numeros separados por comas: ")
        val numeros = readln().split(",").map{ it.toInt() }.toIntArray()
        val tiempo = measureTime { sort(numeros) }
        val ejecucion: Double = (tiempo.inWholeMicroseconds)/1000000.0
        println("Lista ordenada usando Bubble Sort: [${numeros.joinToString()}]")
        println("Tiempo de ejecucion: $ejecucion segundos")
        println()
    }

    fun sort(arr: IntArray) {
       val  n = arr.size
       var swapped: Boolean
       for (i in 0 until n - 1) {
           swapped = false
           for (j in 0 until n - 1 - i) {
               if (arr[j] > arr[j + 1]) {
                   val temp = arr[j]
                   arr[j] = arr[j + 1]
                   arr[j + 1] = temp
                   swapped = true
               }
           }
           if (!swapped) break
       }
    }
}
