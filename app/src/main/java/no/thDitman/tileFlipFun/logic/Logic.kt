package no.thDitman.tileFlipFun.logic

import androidx.compose.runtime.snapshots.SnapshotStateList

/**
 * updates list of the applications fetched
 *
 * @param   newList -   The new list we are making
 */
fun <T> SnapshotStateList<T>.updateList(newList: List<T>) {
    clear()
    addAll(newList)
}