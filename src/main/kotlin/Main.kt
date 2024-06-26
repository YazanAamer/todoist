package org.example

import java.util.Scanner
import kotlin.system.exitProcess

fun main() {
    val scanner = Scanner(System.`in`)
    val parser = CommandParser()

    while (true) {
        print("> ")
        val line = scanner.nextLine()

        try {
            val parsedCommand = parser.parseCommand(line)
            val result = CommandsStore.validators.get(parsedCommand.commandName)?.validate(parsedCommand)
            println(result)
            println(parsedCommand)
        } catch (e: Exception) {
            println("Command note found!")
            exitProcess(-1)
        }

    }

}