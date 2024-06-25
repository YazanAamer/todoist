package org.example
import java.util.Scanner
import kotlin.system.exitProcess

fun main() {
    val commandParser = CommandParser()
    val resutl = commandParser.parseCommand(
        "this is a command test --option --anotheroption")
    println(resutl)

//    val scanner = Scanner(System.`in`)
//    val notes = mutableListOf<String>()
//
//    // Handling Ctrl+C to exit gracefully
//    Runtime.getRuntime().addShutdownHook(Thread {
//        println("\nProgram terminated.")
//        exitProcess(0)
//    })
//
//    println("Welcome to the To-Do List Application!")
//    while (true) {
//        print("> ")
//        val input = scanner.nextLine()
//
//        when {
//            input.equals("exit", ignoreCase = true) -> {
//                println("Exiting...")
//                break
//            }
//            input.startsWith("list notes", ignoreCase = true) -> {
//                if (notes.isEmpty()) {
//                    println("No notes available.")
//                } else {
//                    notes.forEachIndexed { index, note -> println("${index + 1}. $note") }
//                }
//            }
//            input.startsWith("add note ", ignoreCase = true) -> {
//                val note = input.removePrefix("add note ").trim()
//                if (note.isNotEmpty()) {
//                    notes.add(note)
//                    println("Note added.")
//                } else {
//                    println("Note description cannot be empty.")
//                }
//            }
//            else -> {
//                println("Unknown command. Available commands: list notes, add note \"note description\", exit")
//            }
//        }
//    }
//    println("Goodbye!")
}