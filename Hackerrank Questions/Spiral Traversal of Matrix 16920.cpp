

#include <bits/stdc++.h>

using namespace std;

int main()

{

    int r, c;

    cin >> r >> c;

    int matrix[r][c];

    for (int i = 0; i < r; i++)

    {

        for (int j = 0; j < c; j++)

        {

            cin >> matrix[i][j];
        }
    }

    int i, left = 0, right = c - 1, top = 0, bottom = r - 1;

    while (left <= right && top <= bottom)

    {

        for (i = left; i <= right; ++i)
            cout << matrix[top][i] << " ";

        top++;

        for (int i = top; i <= bottom; ++i)

            cout << matrix[i][right] << " ";

        right--;

        if (top <= bottom)

        {

            for (int i = right; i >= left; --i)

                cout << matrix[bottom][i] << " ";

            bottom--;
        }

        if (left <= right)

        {

            for (int i = bottom; i >= top; --i)

                cout << matrix[i][left] << " ";

            left++;
        }
    }

    return 0;
}