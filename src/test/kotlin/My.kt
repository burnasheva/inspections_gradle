package org.a.b.c;

import org.junit.Ignore
import org.junit.Test
import java.io.File
import java.nio.charset.StandardCharsets

class My {
    @Test
    @Ignore
    fun test() {
        File("").bufferedWriter(StandardCharsets.UTF_8).use { writer ->
            val ids = mutableMapOf<String, String>().toSortedMap()
            ids.putAll(arrayOf())
            ids.forEach {
            }
        }
    }
}