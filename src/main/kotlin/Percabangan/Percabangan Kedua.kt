package Percabangan
/*
Percabangan atau control Flow adalah sebuah istilah untuk menyebut alur program yang bercabang.
Alur program tersebut mengalir dari atas ke bawah dan tidak ada percabangan.
 */
fun main(args: Array<String>) {
    println("Enter a number between 10-20:")
    val a = readLine()!!.toInt()
    if (a >= 10 && a <= 20) {
        println("The condition has been met.")
    } else {
        println("You did it wrong.")
    }
    println("\nEnter a number between 10-20 or 30-40:")
    val b = readLine()!!.toInt()
    if (((b >= 10) && (b <= 20)) || ((b >=30) && (b <= 40))) {
        println("The condition has been met.")
    } else {
        println("You did it wrong.")
    }
}