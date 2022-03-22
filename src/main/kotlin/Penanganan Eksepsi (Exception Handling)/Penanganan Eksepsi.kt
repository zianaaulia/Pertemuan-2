package `Penanganan Eksepsi (Exception Handling)`

fun main(args: Array<String>) {
    try {
        val myVar:Int = 10;
        val v:String = "Rekayasa Perangkat Lunak";
        v.toInt();
    } catch(e:Exception) {
        e.printStackTrace()
    } finally {
        println("Exception Handeling in Kotlin");
    }
}
/*
Penanganan eksepsi adalah teknik yang menangani masalah runtime dan mempertahankan aliran eksekusi program.
Di Kotlin, semua kelas pengecualian adalah turunan dari kelas Throwable.
Untuk melempar objek pengecualian, Kotlin menggunakan ekspresi lemparan.
 */