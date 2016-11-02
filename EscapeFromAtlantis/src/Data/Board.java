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
    
    public Board(WaterTile x){
        board = new Tile[6][6];
        for(int i=1; i<6; i++){
            for(int j=1; j<6; j++){
                board [i][j]=x;
                x.printWaterTile(x);
            }System.out.println("");
        }
    }
    
    public void printBoard(Board x){
        for(int i=1; i<6; i++){
            for(int j=1; j<6; j++){
                System.out.println(x.board[i][j]);
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
