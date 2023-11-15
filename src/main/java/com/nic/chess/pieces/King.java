package com.nic.chess.pieces;

import com.nic.boardgame.Board;
import com.nic.chess.ChessPiece;
import com.nic.chess.Color;

public class King extends ChessPiece {


    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
