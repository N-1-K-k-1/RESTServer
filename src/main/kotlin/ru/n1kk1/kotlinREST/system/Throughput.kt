package ru.n1kk1.kotlinREST.system

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody
import java.io.IOException


@Controller
class Throughput {
    @GetMapping("{name}")
    @ResponseBody
    @Throws(IOException::class)
    fun getImage(@PathVariable name: String): ByteArray? {
        /*val res: URL = this::class.java.getResource("/$name")
        val file: File = Paths.get((res.toURI())).toFile()
        val absolutePath: String = file.absolutePath
        val bytes = File(absolutePath).readBytes()
        return Base64.getEncoder().encodeToString(bytes)*/
        val `in` = this::class.java.getResourceAsStream("/$name")
        return `in`.readAllBytes()
    }
}