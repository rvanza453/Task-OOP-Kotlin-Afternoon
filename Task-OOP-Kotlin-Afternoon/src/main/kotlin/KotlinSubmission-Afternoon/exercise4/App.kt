package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    try {
        println("Masukkan IPK anda: ")
        val userInput = readln()!!

        val IPK = userInput.toInt()

        if (IPK < 0){
            throw IllegalArgumentException("IPK tidak ada negatif")
        }
        println("IPK anda adalah $IPK")
    } catch (e: NumberFormatException){
        println("masukkan angka jangan huruf")
    } catch (e: IllegalArgumentException){
        println(e.message)
    } finally {
        println("Program ws mari")
    }
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini


