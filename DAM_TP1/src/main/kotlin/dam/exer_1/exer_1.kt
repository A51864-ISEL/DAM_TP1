fun main(args: Array<String>) {
    //a)
    val fitftySquaresOfP_intArrayOf = IntArray(50){ (it + 1) * (it + 1) };

    //b) Hash map with original values and their square numbers
    val fitftySquaresOfP_map = (1..50).map { it * it }.toIntArray();

    //c)
    val fitftySquaresOfP_array = Array<Int>(50) {(it + 1) * (it + 1) };

    println(fitftySquaresOfP_intArrayOf.joinToString(" "));
    println(fitftySquaresOfP_map.joinToString(" "));
    println(fitftySquaresOfP_array.joinToString(" "));
}