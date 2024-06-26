# Todolist CLI Application

This is a command-line to-do list application built with Kotlin. The application allows users to manage their tasks through various commands.

## Components

- **Command Parser**: Parses the user input commands.
- **Command Validator**: Validates the parsed commands.
- **Command Executor**: Executes the validated commands by communicating with the repository.
- **Tasks Repository**: Stores and manages the tasks.

## Features

- List notes
- Add notes
- Graceful exit on Ctrl+C or typing 'exit'

## Development Progress

1. [x] Build a command parser
2. [x] Build a command validator (add only)
3. [ ] Build a command executor
4. [ ] Build a Tasks Repo
5. [ ] Add Exception handling for entering not existing commands and options

## How to Use

1. Clone the repository.
2. Navigate to the project directory.
3. Build the project using your preferred Kotlin build tool.
4. Run the application.
5. Use the following commands to interact with the application:
    - `add <task>`: Adds a new task.
    - `list`: Lists all tasks.
    - `exit`: Exits the application.

## Contributing

Feel free to fork this repository and submit pull requests. Contributions are welcome!

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.
