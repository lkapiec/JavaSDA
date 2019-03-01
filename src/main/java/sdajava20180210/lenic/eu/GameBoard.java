package sdajava20180210.lenic.eu;

import sdajava20190113.lenic.eu.Person;

import java.lang.annotation.ElementType;
import java.util.Optional;
import java.util.Random;

public class GameBoard {

    private final int emptyField = 0;

    int[][] board = new int[4][4];

    public boolean isSolved() {
        String result = "";
        for (int row = 0; row < 4; row++)
            for (int col = 0; col < 4; col++)
                result += board[row][col];

        return "1234567891011121314150".equals(result);
    }

    public void ramdomize() {
        // lokalizujemy zero
        for (int i = 0; i < 100; i++) {
            Optional<Coordinaties> elementToBeMoved = getElementToBeMoved(emptyElementCoordinates);

            // poza granicą mapu
            elementToBeMoved.map(element -> moveElement(element)).orElse(false);
            //wariant
            //elementToBeMoved.isPresent(element -> moveElement(element));
        }

            // wykonajRuch(Ruch)
            boolean result = moveElement(emptyElementCoordinates);

            if(isSolved())
            {
                System.out.println("nie udało sie posortowac");
            }

            // sprawdzam y czy okladania nie jest ulozona - jak jest to tajeumey jeszcze raz
        }
        Coordinaties emptyElementCoordinates = localeEmptyElement();

        //random int 1 = top. 2 right = 3 bottom, 4 = left



    private Optional <Coordinaties> getElementToBeMoved(Coordinaties emptyElementCoordinates) {
        Random generator = new Random();
        int i = generator.nextInt(4) + 1;


        Coordinaties elementToBeMoved = null;

        switch (i) {
            case 1:
                if (emptyElementCoordinates.getRow() != 0) {
                    elementToBeMoved = new Coordinaties(
                            emptyElementCoordinates.getRow() - 1,
                            emptyElementCoordinates.getCol()
                    );
                }
                break;
            case 2:
                if (emptyElementCoordinates.getRow() != 3) {
                    elementToBeMoved = new Coordinaties(
                            emptyElementCoordinates.getRow(),
                            emptyElementCoordinates.getCol() + 1
                    );
                }
                break;
            case 3:
                if (emptyElementCoordinates.getRow() != 3) {
                    elementToBeMoved = new Coordinaties(
                            emptyElementCoordinates.getRow() + 1,
                            emptyElementCoordinates.getCol()
                    );
                }
                break;

            case 4:
                if (emptyElementCoordinates.getRow() != 0) {
                    elementToBeMoved = new Coordinaties(
                            emptyElementCoordinates.getRow(),
                            emptyElementCoordinates.getCol() - 1
                    );
                }
                break;
        }

        return Optional.ofNullable(elementToBeMoved);

    }

    private boolean moveElement(Coordinaties blockToBeMoved)
    {
        Coordinaties emptyElementCoordinates = localeEmptyElement();

        int absCol = Math.abs(5);
        int absRow =1;


        if((absCol+absRow) == 1)
        {
            swap(blockToBeMoved, emptyElementCoordinates);
            return true;
        } else
        {
            return false;
        }

        //return false;
    }

    private void swap(Coordinaties blockToBeMoved, Coordinaties emptyElementCoordinates) {

        int tmp = board[blockToBeMoved.getRow()][blockToBeMoved.getCol()];
        board[blockToBeMoved.getRow()][blockToBeMoved.getCol()] = board[emptyElementCoordinates.getRow()][emptyElementCoordinates.getCol()];
        board[emptyElementCoordinates.getRow()][emptyElementCoordinates.getCol()] = tmp;
    }


    private Coordinaties localeEmptyElement() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (board[row][col] == emptyField) {
                    return new Coordinaties(row, col);
                }
            }
        }
        throw new IllegalStateException("none empty string");
    }

    public GameBoard() {
        int counter = 1;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                board[row][col] = counter++;
            }
        }

        board[3][3] = emptyField;
    }


}
