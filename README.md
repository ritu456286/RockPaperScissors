# Rock Paper Scissors Game

This is a simple command-line implementation of the classic Rock-Paper-Scissors game in Java. The game allows the player to play against the computer. The computer randomly selects its move, and the player can input their move via the console. The game continues until the player chooses to stop. 

## Features

- User input for player's move (R, P, S)
- Random computer move generation
- Winner determination logic
- Option to play multiple rounds
- Robust input validation
- Various Test Cases for validation using JUnit 5

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven 3.6.0 or higher

### Installation

1. Clone the repository
    ```sh
    git clone https://github.com/your-username/rock-paper-scissors.git
    ```
2. Navigate to the project directory
    ```sh
    cd rock-paper-scissors
    ```

### Running the Game

1. Compile the project using Maven
    ```sh
    mvn compile
    ```

2. Run the game
    ```sh
    mvn exec:java -Dexec.mainClass="org.game.RockPaperScissors"
    ```

## Running Tests

1. To run the tests, use the following Maven command
    ```sh
    mvn test
    ```

## Project Structure
    rock-paper-scissors
    │ README.md
    │ pom.xml
    └───src
    ├───main
    │ └───java
    │ └───org
    │ └───game
    │ └───RockPaperScissors.java
    └───test
    | └───java
    | └───org
    | └───game
    | └───RockPaperScissorsTest.java

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contributing

1. Fork the repository
2. Create your feature branch ```git checkout -b feature/fooBar```
3. Commit your changes ```git commit -am 'Add some fooBar'```
4. Push to the branch ```git push origin feature/fooBar```
5. Create a new Pull Request.

## Acknowledgements

Inspired by the classic Rock-Paper-Scissors game.
