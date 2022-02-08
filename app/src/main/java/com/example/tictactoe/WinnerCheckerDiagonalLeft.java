package com.example.tictactoe;

public class WinnerCheckerDiagonalLeft implements WinnerCheckerInterface{
    private Game game;

    public WinnerCheckerDiagonalLeft(Game game){
        this.game = game;
    }

    @Override
    public Player checkWinner() {
        Square[][] field = game.getField();
        Player currPlayer;
        Player lastPlayer = null;
        int successCountre = 1;
        for(int i = 0, len = field.length; i < len; i++){
            currPlayer = field[i][i].getPlayer();
            if (currPlayer != null){
                if (lastPlayer == currPlayer){
                    successCountre++;
                    if(successCountre == len){
                        return currPlayer;
                    }
                }
            }
            lastPlayer = currPlayer;
        }

        return null;
    }
}
