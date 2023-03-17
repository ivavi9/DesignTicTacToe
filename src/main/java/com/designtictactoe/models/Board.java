package com.designtictactoe.models;

import java.util.List;

public class Board {
    private List<List<Cells>> boardCells;

    public List<List<Cells>> getBoardCells() {
        return boardCells;
    }

    public void setBoardCells(List<List<Cells>> boardCells) {
        this.boardCells = boardCells;
    }
}
