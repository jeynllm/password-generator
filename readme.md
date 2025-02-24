Password Generator Project

Project Overview:
This project about password which will be randomly chosed by code which i wrote.The program offers different password composition options, including numbers, letters (uppercase, lowercase, or both), a combination of letters and numbers, and a mix of numbers, letters, and symbols.


Design Choices:
First of all, I used RANDOMIZATION , because it is the main object of my code will get the meaning of this project. Randomization -> random in java. This object help me to generate random characters for the password.
Second one is STRINGBULDER , I used it to construct the password efficiently instead of concatenating strings. But also I used the simple string to add the symbols and for comfortable using of the coding .
Third one is CHOICE , which I used  for to get easy way to choose any type of password, it is help me to understand that I have the choice in this code.
The fourth one it is the SCANNER, the program uses a Scanner object to read user input, allowing dynamic selection of password composition and length.


Algorithms and Data Structures Used:
Random Character Selection Algorithm:
The program creates a pool of characters based on user selection.
It generates a password by selecting characters randomly from the pool and because of this i add the object->pool for the end of the code , also tide up with random.
In the end it is look like this -> random.nextInt(pool.length()).
Data Structures:
1.String-> is used for storing predefined character sets.
2.StringBuilder -> is used for password construction due to its efficiency in string manipulation.
3.Scanner -> is used for input handling.


Mention any improvements made to the initial implementation:
The revised implementation checks for valid numeric input using -> scanner.hasNextInt() before processing user choices.
The code was refactored to use a unified character pool instead of multiple if-else conditions.
The use of charAt(random.nextInt(length)) instead of multiple conditional checks simplifies randomization.
The Scanner object is closed to prevent potential memory leaks.

Indicate whether files were used for input or output, and explain their role:
This program does not rely on files for input or output. Instead, it operates through console-based interactions, allowing users to dynamically customize password generation. For instance , string, if else and else, arrays.

Provide any additional explanations or details that may help the reader understand your approach:
This project will input the including numbers, letters (uppercase, lowercase, or both), a combination of letters and numbers, and a mix of numbers, letters, and symbols.But it can not input the ryptographic randomness.For enhanced security in critical applications, SecureRandom should be used instead of Random.

Conlusion:
This project was little difficult for me , that's why i watched so many videos and read more informations and use another object also.






