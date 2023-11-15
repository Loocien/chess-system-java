package com.nic.chess.pieces;

import com.nic.boardgame.Board;
import com.nic.chess.ChessPiece;
import com.nic.chess.Color;

public class Rook extends ChessPiece {


    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
