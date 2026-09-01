package com.pes.lib

fun convert(names : Array<String?>){

    // TODO
    // convert the name in array into uppercase -
    // use explicit null check , safe call operator,
    // elvis operator, assertion operator
}

fun main() {

    convert(arrayOf("john", null, "merry", "robert"))
}



package com.pes.lib

fun convert(names: Array<String?>) {

    for (name in names) {

        // Explicit null check
        if (name != null) {
            println("Explicit null check: ${name.uppercase()}")
        } else {
            println("Explicit null check: Name is null")
        }

        // Safe call operator
        println("Safe call: ${name?.uppercase()}")

        // Elvis operator
        println("Elvis operator: ${name?.uppercase() ?: "NAN"}")

        // Assertion operator
        if (name != null) {
            println("Assertion operator: ${name!!.uppercase()}")
        } else {
            println("Assertion operator: Cannot convert null")
        }

        println()
    }
}

fun main() {

    convert(arrayOf("john", null, "merry", "robert"))
}