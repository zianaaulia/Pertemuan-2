package `Null-Safety`

fun main(args: Array<String>) {
//Elvis Operator ?:
    var maybeWelcome: String? = "Hello world"

    println(maybeWelcome?.length ?: 0)
}
/*
Operator Elvis di Kotlin adalah operator yang menerima dua input dan mengembalikan argumen pertama jika bukan null atau yang kedua sebaliknya.
Ini secara aneh disebut operator penggabungan-nol.
Ini adalah varian dari operator ternary tetapi untuk pemeriksaan keamanan nol.
 */