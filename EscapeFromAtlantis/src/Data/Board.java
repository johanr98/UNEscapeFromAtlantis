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
        board = new Tile[5][5];
        board [1][5] = x;
    }

    public Tile[][] getBoard() {
        return board;
    }

    public void setBoard(Tile[][] board) {
        this.board = board;
    }
}
