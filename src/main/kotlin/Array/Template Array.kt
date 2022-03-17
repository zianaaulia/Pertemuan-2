package Array
/*
Opsi lainnya adalah menggunakan Arraykonstruktor yang mengambil ukuran array
dan fungsi yang mengembalikan nilai elemen array berdasarkan indeksnya
 */
fun main(args: Array<String>) {
// Membuat sebuah Array<String> dengan nilai ["0", "1", "4", "9", "16"]
    val asc = Array(5) {
            i -> (i * i).toString()
    }
    asc.forEach { println(it) }
}