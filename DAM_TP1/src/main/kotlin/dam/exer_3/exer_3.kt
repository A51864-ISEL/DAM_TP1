package dam.exer_3

import java.math.RoundingMode
import kotlin.math.roundToInt

private val bounceHeight = 100f // Meters
private val minHeight = 1.0f
private val bouncesTerminalHeight = 40 // Division lines
private val linePadding = 2 // Number of '-' on each side
private val charLine = '-'

fun bouncesViz(bounces: List<Float>) {
    if (bounces.isEmpty()) return

    val bounceStrings = bounces.map { it.toString() }
    val startCols = mutableListOf<Int>()
    var currentX = 0

    for (str in bounceStrings) {
        startCols.add(currentX)
        currentX += str.length + (2 * linePadding)
    }

    val totalCols = currentX

    val grid = MutableList(bouncesTerminalHeight) { MutableList(totalCols) { ' ' } }

    val maxBounce = bounces.maxOrNull() ?: bounceHeight

    for (i in bounces.indices) {
        val bounce = bounces[i]
        val str = bounceStrings[i]

        val mappedHeight = (bounce / maxBounce) * (bouncesTerminalHeight - 1)
        val yIndex = (bouncesTerminalHeight - 1) - mappedHeight.roundToInt()

        val safeY = yIndex.coerceIn(0, bouncesTerminalHeight - 1)

        var xCursor = startCols[i]

        repeat(linePadding) { grid[safeY][xCursor++] = charLine }
        for (char in str) { grid[safeY][xCursor++] = char }
        repeat(linePadding) { grid[safeY][xCursor++] = charLine }
    }

    for (row in grid) {
        println(row.joinToString(""))
    }
}

fun main(args: Array<String>) {
    val bounceSequence = generateSequence(bounceHeight) { it * 0.6f }
        .take(15)
        .takeWhile { it >= minHeight }

    var bounces = bounceSequence.toList()

    bounces = bounces.map { it.toBigDecimal().setScale(2, RoundingMode.UP).toFloat() }

    println(bounces.toString())
    println()
    bouncesViz(bounces)
}