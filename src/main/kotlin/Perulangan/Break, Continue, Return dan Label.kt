package Perulangan
/*
Kotlin mendukung tradisional break dan continue, sama seperti bahasa pemrograman Java.
Kegunaan dari break dan continue adalah :
break : untuk menghentikan proses perulangan ke penutup terdekat dalam suatu blok program.
continue : proses untuk melanjutkan perulangan ke penutup terdekat dalam suatu blok program.
 */
fun main(args: Array<String>) {
    var x:Int
    println("Example of Break and Continue in For-Loop")
    for(x in 1..10) {
        if(x == 7) break
        if(x == 3) continue
        print("$x ")
    }
    print('\n')
}