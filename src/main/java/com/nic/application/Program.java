package com.nic.application;

import com.nic.chess.ChessMatch;
import com.nic.chess.ChessPiece;
import com.nic.chess.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.print("\nSource: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.print("\nTarget: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}