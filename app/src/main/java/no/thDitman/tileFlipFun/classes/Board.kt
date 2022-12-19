package no.thDitman.tileFlipFun.classes

class Board constructor(size: Int) {

    val board: MutableList<Boolean>
    var boardSize: Int = 0

    init {
        boardSize = size
        board = object : ArrayList<Boolean>() {
            //This is for initializing at a variable length
            init {
                var i = 0
                //size * size since it's a 2D board
                while (i < (size*size)) {
                    add(false)
                    i++
                }
            }
        }
    }

    fun flipOnTap(index: Int) {

    }

    fun flipSingle(index: Int) {
        board[index] = board[index].not()
    }

    fun flipAdjacent(index: Int) {
        //Makes sure left of tapped is valid
        if (index % boardSize != 0 && index != 0) {
            flipSingle(index-1)
        }

        //Makes sure above of tapped is valid
        if (index >= boardSize) {
            flipSingle(index-boardSize)
        }

        //Makes sure right of tapped is valid
        if (index % boardSize != 2) {
            flipSingle(index+1)
        }

        //Makes sure below of tapped is valid
        if (index < (boardSize*boardSize)-boardSize) {
            flipSingle(index+boardSize)
        }
    }
}