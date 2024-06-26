package org.example

fun main() {
    val commandParser = CommandParser()
    val commandValidator: CommandValidator = AddValidator()
    val commands = commandParser.parseCommand(
        "add this is a command test and this is the note --option2 --option2")

    println(commandValidator.validate(commands))






//    val result2 = commandParser.parseCommand(
//        "remove 1 --option --anotheroption")
//
//    val result3 = commandParser.parseCommand(
//        "update 1 this is the updating string")
//
//    val result4 = commandParser.parseCommand(
//        "list --option")

    println(commands)

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