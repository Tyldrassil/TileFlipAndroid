package no.thDitman.tileFlipFun.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import no.thDitman.tileFlipFun.classes.Board


@Composable
fun FlipBoard(board: Board) {
    
    LazyVerticalGrid(
        columns = GridCells.Fixed(board.boardSize),
        content = {
            items(board.board) {
                Box(modifier = Modifier.border(2.dp, Color.Magenta))
            }
        })
    
}