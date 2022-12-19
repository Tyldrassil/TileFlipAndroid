package no.thDitman.tileFlipFun.classes

class Board constructor(size: Int) {

    val board: MutableList<Boolean>
    val size: Int = 0

    init {
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
        //TODO
    }
}