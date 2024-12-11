package lab3

class TorresdeHanoi {
    var counter = 1

    fun process() {
        print("Ingrese el numero de discos: ")
        val numero = readln().toInt()
        hanoi(numero, "Torre A", "Torre B", "Torre C")
    }

    fun hanoi(n: Int, source: String, target: String, auxiliary: String) {
        if (n == 1) {
            println("Paso $counter: Mover disco 1 de $source a $target")
            counter++
            return
        }
        hanoi(n - 1, source, auxiliary, target)
        println("Paso $counter: Mover disco $n de $source a $target")
        counter++
        hanoi(n - 1, auxiliary, target, source)
    }
}
