/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author macas
 */
public class Board {
    private Tile[][] board;
    
    public Board (MountainTile mountain, ForestTile forest, SandTile sand, 
            WaterTile water, FinishTile finish){
        board = new Tile [5][5];
        board [0][0] = finish;
        board [0][1] = water;
        board [0][2] = sand;
        board [0][3] = sand;
        board [0][4] = water;
        board [1][0] = water;
        board [1][1] = sand;
        board [1][2] = forest;
        board [1][3] = mountain;
        board [1][4] = forest;
        board [2][0] = water;
        board [2][1] = sand;
        board [2][2] = forest;
        board [2][3] = mountain;
        board [2][4] = forest;
        board [3][0] = water;
        board [3][1] = sand;
        board [3][2] = forest;
        board [3][3] = sand;
        board [3][4] = water;
        board [4][0] = finish;
        board [4][1] = water;
        board [4][2] = sand;
        board [4][3] = sand;
        board [4][4] = water;
        
    }
    
    public void printBoard(Board x){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.println(board[i][j]);
            }
        }
    }

    public Tile[][] getBoard() {
        return board;
    }

    public void setBoard(Tile[][] board) {
        this.board = board;
    }
}
