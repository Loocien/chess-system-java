package com.nic.application;

import com.nic.boardgame.Board;
import com.nic.boardgame.Position;
import com.nic.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}