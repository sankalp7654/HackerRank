/**  
* @author SANKALP SAXENA  
*/

//
//  BinarySearch.cpp
//  HackerRank
//
//  Created by 梅宇宸 on 17/1/25.
//  Copyright © 2017年 梅宇宸. All rights reserved.
//

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

const int boardSize = 15;

void printBoard (vector<vector <int> > &chessBoard)
{
    for (unsigned i = 0; i < chessBoard.size (); i++)
    {
        for (unsigned j = 0; j < chessBoard[i].size (); j++)
        {
            cout << chessBoard[i][j];
        }
        cout << endl;
    }
}

bool isOutBoard (int x, int y)
{
    if (x < 0 || y < 0 || x >= boardSize || y >= boardSize)
    {
        return true;
    }
    
    return false;
}

// x, y from 0 to boardSize - 1
void setChessBoard (int x, int y, vector<vector <int> > &chessBoard)
{
    int x1 = x - 2;
    int x2 = x - 1;
    int x3 = x + 1;
    
    int y1 = y - 2;
    int y2 = y - 1;
    int y3 = y + 1;
    
    if (isOutBoard(x1, y3) && isOutBoard(x1, y2) && isOutBoard(x3, y1) && isOutBoard(x2, y1))
    {
        chessBoard[x][y] = 2;
    }
    else
    {
        if ((!isOutBoard(x1, y3) && chessBoard[x1][y3] == 2) ||
            (!isOutBoard(x1, y2) && chessBoard[x1][y2] == 2) ||
            (!isOutBoard(x3, y1) && chessBoard[x3][y1] == 2) ||
            (!isOutBoard(x2, y1) && chessBoard[x2][y1] == 2))
        {
            chessBoard[x][y] = 1;
        }
        else
        {
            chessBoard[x][y] = 2;
        }
    }
}

int main ()
{
    vector<vector <int> > chessBoard (boardSize);
    
    for (unsigned i = 0; i < boardSize; i++)
    {
        for (unsigned j = 0; j < boardSize; j++)
        {
            chessBoard[i].push_back(0);
        }
    }
    
    // draw order must like this cause only in this way
    // each result only depends on other reaults calc before
    // 0,0 -> 0,1 -> 1,0 -> 0,2 -> 1,1 -> 2,0 -> ... till end
    
    // draw top half of board
    int couter = 0;
    while (couter < boardSize)
    {
        int x = 0;
        int y = couter;
        while (x >= 0 && x < boardSize && y >= 0 && y < boardSize)
        {
            setChessBoard (x, y, chessBoard);
            
            x++;
            y--;
        }
        
        couter++;
    }
    
    // draw bottom half of board
    couter = 1;
    while (couter < boardSize)
    {
        int x = couter;
        int y = boardSize - 1;
        while (x >= 0 && x < boardSize && y >= 0 && y < boardSize)
        {
            setChessBoard (x, y, chessBoard);
            
            x++;
            y--;
        }
        
        couter++;
    }
    
//    printBoard(chessBoard);
    
    int n;
    cin >> n;
    int x, y;
    
    for (int i = 0; i < n; i++)
    {
        cin >> x >> y;
        if (chessBoard[x - 1][y - 1] == 2)
        {
            cout << "Second" << endl;
        }
        else
        {
            cout << "First" << endl;
        }
    }
    return 0;
}