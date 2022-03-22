@file:Suppress("UNREACHABLE_CODE")

package `Null-Safety`

/**
    fun main(args: Array<String>) {
        var maybeNumber: Int? = 15
        maybeNumber = null
        println(maybeNumber * 2)
        var s1 = "Hello"
        var s2: String? = "World"
        println(s1.length)
        println(s2.length)
    }
 */
/*
Pada kode diatas terdapat kesalahan karena kita tidak dapat bekerja
dengan variabel maybeNumber dan s2 karena kemungkinan memiliki nilai null
 */

fun main(args: Array<String>) {
    //Null safety
    //The !! operator
    var maybeNumber: Int? = 15
    println(maybeNumber!! * 2)

    maybeNumber = null
    println(maybeNumber!! * 2)
}


