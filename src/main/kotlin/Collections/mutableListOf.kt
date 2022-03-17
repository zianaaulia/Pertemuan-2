package Collections
/*
Mutable list adalah tipe list yang nilai suatu elemen didalam list
dapat kita rubah, tambah dan hapus.
Immutable list adalah tipe list yang nilai suatu elemen didalam list tersebut
tidak dapat kita rubah, tidak dapat dihapus dan tidak dapat ditambah.
 */
fun main(args: Array<String>) {
    //MutableList adalah Daftar dengan operasi penulisan khusus daftar
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)
    val numbersStr = mutableListOf("one", "two", "three", "four")
    numbersStr.add("five") // this is OK
    //numberStr = mutableListOf("enam", "tujuh") // kesalahan kompilasi
    println(numbersStr)
}