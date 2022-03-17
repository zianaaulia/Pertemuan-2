package Percabangan
/*
When merupakan pengganti switch pada pemrorgaman java,
fungsi when hampir sama dengan if, yaitu untuk meimlih
suatu pernyataan yang akan dieksekusi dengan kondisi tertentu, hanya saja penulisan syntaxnya yang berbeda.
 */
fun main(args: Array<String>) {
//Penggunaan When
    var x:Int = 5
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // Perhatikan blok
            println("x is neither 1 nor 2")
        }
    }
    x = 2
    when (x) {
    1,2 -> println("Value of X either 1,2")
    else -> { // Perhatikan blok
        println("x is neither 1 nor 2")
    }
    }
}
