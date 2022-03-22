package NullSafety

fun main(args: Array<String>) {
//Safe calling
//?.let
    var maybeNumber: Int? = 15
    maybeNumber?.let { println(it) }
//The ?. chaining
//student?.teacher?.supervisor?.name = "Seymour Skinner"
}
/*
Kotlin memiliki operator panggilan aman (?.) untuk menangani referensi nol.
Operator ini menjalankan tindakan apa pun hanya ketika referensi memiliki nilai bukan nol.
Jika tidak, ia mengembalikan nilai nol. Operator panggilan aman
menggabungkan pemeriksaan nol bersama dengan panggilan metode dalam satu ekspresi.
 */