package com.nic.chess;

import com.nic.boardgame.Board;
import com.nic.boardgame.BoardException;

public class ChessException extends BoardException {

    public ChessException(String msg) {
        super(msg);
    }
}
