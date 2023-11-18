package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {
        print("Input bilangan bulat: ")
        val inputUser = readLine()
        val angka = inputUser?.toInt()

        println("Anda memasukkan angka: $angka")

    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan input: ${e.message}")
        }
}
