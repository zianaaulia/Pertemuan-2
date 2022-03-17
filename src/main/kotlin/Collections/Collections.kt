package Collections

fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}
fun main(args: Array<String>) {
    val stringList = listOf("one", "two", "one")
    printAll(stringList)
    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)
}
/*
Collection adalah konsep umum untuk sebagian besar bahasa pemrograman,
jadi jika Anda terbiasa dengan, misalnya, koleksi Java atau Python,
Kita dapat melewati pengantar ini dan melanjutkan ke bagian detail.
 */