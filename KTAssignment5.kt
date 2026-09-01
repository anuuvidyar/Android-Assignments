package com.pes.lib


// TODO - add exception handling
fun getNumber(data: String): Int {
    // String.toInt()
    return data.toInt()
}

fun main() {
    getNumber("12") // string with only digits
    getNumber("a1as")
}






package com.pes.lib


fun getNumber(data: String): Int {

    return try {
        data.toInt()
    } catch (e: NumberFormatException) {
        println("Invalid number: $data")
        0
    }
}

fun main() {

    val number1 = getNumber("12")
    println("Number: $number1")

    val number2 = getNumber("a1as")
    println("Number: $number2")
}
