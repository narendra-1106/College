#include <stdio.h>
#define N 8

int board[N][N];

void printSolution() {
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++)
            printf("%c ", board[i][j] ? 'Q' : '.');
        printf("\n");
    }
    printf("\n");
}

int isSafe(int row, int col) {
    for (int i = 0; i < row; i++)
        if (board[i][col]) return 0;
    for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
        if (board[i][j]) return 0;
    for (int i = row, j = col; i >= 0 && j < N; i--, j++)
        if (board[i][j]) return 0;
    return 1;
}

int solveNQ(int row) {
    if (row == N) {
        printSolution();
        return 1;
    }
    int res = 0;
    for (int col = 0; col < N; col++) {
        if (isSafe(row, col)) {
            board[row][col] = 1;
            res = solveNQ(row + 1) || res;
            board[row][col] = 0;
        }
    }
    return res;
}

int main() {
    if (!solveNQ(0))
        printf("No solution exists\n");
    return 0;
}
