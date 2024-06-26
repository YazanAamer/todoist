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
            val ok = CommandsStore.validators.get(parsedCommand.commandName)?.validate(parsedCommand)
            if(ok ?: false)
                CommandsStore.commandsFunctions.get(parsedCommand.commandName)?.execute(parsedCommand)

        } catch (e: Exception) {
            println("Command note found!")
        }

    }

}