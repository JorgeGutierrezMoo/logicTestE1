# logicTestE1

This project is made using IntelliJ IDEA in Kotlin language.

    Clone the project or Download the zip file.

    https://github.com/JorgeGutierrezMoo/logicTestE1
    
    If using terminal: clone the project use the "clone". It will look like: $ git clone https://github.com/JorgeGutierrezMoo/pokemonk.git
    There is also a GUI option named SourceTree to clone project in a clearer way.

    Verify that IntelliJ IDEA is installed in the PC. If not, please install.

    Open AIntelliJ IDEA.
    Select "Open an existing project"
    Locate the path where you saved the project, either by downloading the zip or by cloning the repository.
    Select the project name as "logicTestE1-master".
    Wait until the Android Studio IDE finishes building the project. (You can tell it is still buildind if in the bottom part of the IDE you can see text showing and changing).
    At the top part of the IntelliJ IDEA you will see a green triangle. If you put the mouse over it will display a text saying "Run App". Click it.
    
    MY SOLUTION ----------------------------------------
    
    Program generates a number T between 1 and 5000 which is the number of test cases.
    It also generates the size for rows(N) and columns(M).
    Explanation:
    You might think that you have to check in a matrix the front and right neighboor for the current position.
    Well, you could do that. But what about this:
    If you check the following:
    1. The arrow is always pointing Right(R) in the beginning
    2. You could also have the following cases for the size of the grid:
        a. N > M
            You could check N and M to see what happens when 
            - N even: arrow points Up(U) at the end
            - N not even: arrow points Down(D) at the end
            - M even: arrow points Up(U) at the end
            - M not even: arrow points Down(D) at the end
        b. N == M, for this case you have the following subcases
            Given N == M the you only have to check what happens when N is even, and what happens if it is not
            - N even: arrow points Left(L) at the end
            - N not even: arrow points Right(R) at the end
        c. N < M
            You could check N and M to see what happens when 
            - N even: arrow points Left(L) at the end
            - N not even: arrow points Right(R) at the end
            - M even: arrow points Left(L) at the end
            - M not even: arrow points Right(R) at the end
            
    As you can see all of this comes to the conclusion that:
    a. N > M is the only case when you have different results(U or D), so
    b. In any other scenario you might obtain either R o L
    
    Happy coding!
    
 INSTRUCTIONS --------------------------------     

Solve the following using Kotlin

Starting at the top left corner of an N x M grid and facing towards the right, you keep walking one square at a time in the direction you are facing.
If you reach the boundary of the grid or if the next square you are about to visit has already been visited, you turn right.
You stop when all the squares in the grid have been visited. What direction will you be facing when you stop? For example: 
Consider the case with N = 3, M = 3. The path followed will be (0,0) -> (0,1) -> (0,2) -> (1,2) -> (2,2) -> (2,1) -> (2,0) -> (1,0) -> (1,1).
At this point, all squares have been visited, and you are facing right.
Especificación de entrada

The first line contains T the number of test cases. Each of the next T lines contain two integers N and M, denoting the number of rows and columns respectively.
Especificación de salida

Output T lines, one for each test case, containing the required direction you will be facing at the end. Output L for left, R for right, U for up, and D for down. 1 <= T <= 5000, 1 <= N,M <= 10^9.
Input example

4
1 1
2 2
3 1
3 3

Output example

R
L
D
R
