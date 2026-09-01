package com.pes.lib

fun main() {

    val data = "Hi! How are you?"

    // 1. how many vowels in the string

    // 2. how many spaces

    // use of 'when' as a expression
}

package com.pes.lib

fun main() {

    val data = "Hi! How are you?"

    var vowelCount = 0
    var spaceCount = 0

    data.forEach { ch ->

        when (ch.lowercaseChar()) {
            'a', 'e', 'i', 'o', 'u' -> vowelCount++
            ' ' -> spaceCount++
        }
    }

    println("Vowel Count: $vowelCount")
    println("Space Count: $spaceCount")
}