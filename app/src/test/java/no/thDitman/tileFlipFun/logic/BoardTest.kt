package no.thDitman.tileFlipFun.logic

import no.thDitman.tileFlipFun.classes.Board
import org.junit.Assert.*
import org.junit.Test

class BoardTest {

    @Test
    fun flipOnTap() {

        val actual = Board(3)

        val expected = Board(3)

        expected.board[0] = true
        expected.board[1] = true
        expected.board[2] = true
        expected.board[4] = true

        actual.flipOnTap(1)

        assertEquals(expected.board.toList(), actual.board.toList())
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
    fun flipAdjacentLeftInvalid() {

        val actual = Board(3)

        val expected = Board(3)

        expected.board[0] = true
        expected.board[4] = true
        expected.board[6] = true

        actual.flipAdjacent(3)

        assertEquals(expected.board.toList(), actual.board.toList())

    }

    @Test
    fun flipAdjacentTopInvalid() {

        val actual = Board(3)

        val expected = Board(3)

        expected.board[0] = true
        expected.board[2] = true
        expected.board[4] = true

        actual.flipAdjacent(1)

        assertEquals(expected.board.toList(), actual.board.toList())

    }

    @Test
    fun flipAdjacentRightInvalid() {

        val actual = Board(3)

        val expected = Board(3)

        expected.board[2] = true
        expected.board[4] = true
        expected.board[8] = true

        actual.flipAdjacent(5)

        assertEquals(expected.board.toList(), actual.board.toList())

    }

    @Test
    fun flipAdjacentBotInvalid() {

        val actual = Board(3)

        val expected = Board(3)

        expected.board[4] = true
        expected.board[6] = true
        expected.board[8] = true

        actual.flipAdjacent(7)

        assertEquals(expected.board.toList(), actual.board.toList())

    }

    @Test
    fun resetBoard() {
        val actual = Board(3)

        val expected = Board(3)

        actual.board[0] = true
        actual.board[4] = true
        actual.board[5] = true
        actual.board[7] = true

        actual.resetBoard()

        assertEquals(expected.board.toList(), actual.board.toList())
    }
}