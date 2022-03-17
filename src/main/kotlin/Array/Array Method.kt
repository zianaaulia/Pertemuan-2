package Array
/*
    Metode Array adalah metode yang digunakan dalam proses mengolah data array
    yang sesuai dengan kebutuhan aplikasi yang sedang dibuat agar menjadi
    efisien atau lebih singkat.
 */
fun main(args: Array<String>) {
    //Array methods
    //sort() adalah mengurutkan array di tempat menurut urutan alami elemen-elemennya.
    val simpsonsA = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsA.sort()
    for (simpson in simpsonsA) {
        print(simpson + ' ')
    }
    print('\n')
    //sorted() adalah mengembalikan daftar semua elemen yang diurutkan menurut urutan alaminya.
    val simpsonsB: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpson in simpsons_sorted) {
        print(simpson + ' ')
    }
    print('\n')
    //reverse() membalikkan elemen larik dalam rentang yang ditentukan di tempat.
    //reversedArray() Mengembalikan urutan karakter dengan karakter dalam urutan terbalik.
    val simpsonsC: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC) {
        print(simpson + ' ')
    }
    print('\n')
    /*
    indexOf() adalah Mengembalikan indeks kemunculan pertama
    dari elemen yang ditentukan dalam daftar, atau -1 jika elemen yang
    ditentukan tidak terdapat dalam daftar.
     */
    val simpsonsD = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} Simpson!")
    } else {
        println("Hey that's not Simpson!")
    }
    val simpsonsE = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    println("simpsons size: " + simpsonsE.size)
    if(!simpsonsE.isEmpty())
        println("Array tidak kosong!")
        println("Min = "+ simpsonsE.minOrNull())
        println("Max = "+ simpsonsE.maxOrNull())
        println("First = " + simpsonsE.first())
        println("Last = " + simpsonsE.last())
        println(simpsonsE.contains("Marge"))
}