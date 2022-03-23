package FungsidanLambdas

fun main(args: Array<String>) {
    var (x, y) = bigSmall(5,3)
    println("Nilai x = $x")
    println("Nilai x = $y")
}
fun bigSmall(a: Int, b:Int) : Pair<Int, Int> {
    if(a > b) return Pair(a,b)
    else {
        return Pair(b,a)
    }
}
/*
Pair digunakan jika memerlukan 2 return value.
Fungsi ini mengembalikan 2 nilai dalam Pair yakni String dan Int.
 */