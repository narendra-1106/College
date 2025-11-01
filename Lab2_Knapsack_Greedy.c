#include <stdio.h>

struct Item {
    int weight, profit;
};

void knapsack(int W, struct Item arr[], int n) {
    double ratio[n];
    for (int i = 0; i < n; i++)
        ratio[i] = (double)arr[i].profit / arr[i].weight;

    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (ratio[i] < ratio[j]) {
                double temp = ratio[i]; ratio[i] = ratio[j]; ratio[j] = temp;
                struct Item t = arr[i]; arr[i] = arr[j]; arr[j] = t;
            }
        }
    }

    double totalProfit = 0.0;
    int w = W;

    for (int i = 0; i < n; i++) {
        if (arr[i].weight <= w) {
            w -= arr[i].weight;
            totalProfit += arr[i].profit;
        } else {
            totalProfit += arr[i].profit * ((double) w / arr[i].weight);
            break;
        }
    }

    printf("Maximum Profit = %.2f\n", totalProfit);
}

int main() {
    struct Item arr[] = {{10, 60}, {40, 40}, {20, 100}, {30, 120}};
    int W = 50, n = 4;
    knapsack(W, arr, n);
    return 0;
}
