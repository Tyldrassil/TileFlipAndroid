package no.thDitman.tileFlipFun.logic

import no.thDitman.tileFlipFun.classes.Board
import org.junit.Assert.*
import org.junit.Test

internal class BoardTest {

    @Test
    fun flipOnTap() {

        val actual = Board(3)

        val expected = Board(3)



    }

    @Test
    fun flipSingle() {

        val actual = Board(3)

        val expected = Board(3)

        expected.board[2] = true

        actual.flipSingle(2)

        assertEquals(expected.board.toList(), actual.board.toList())
    }

    @Test
    fun flipAdjacent() {

        val actual = Board(3)

        val expected = Board(3)

        expected.board[1] = true
        expected.board[3] = true

        actual.board.flipAdjacent(0)
        
        assertEquals(expected.board.toList(), actual.board.toList())

    }

    @Test
    fun resetBoard() {

    }
}