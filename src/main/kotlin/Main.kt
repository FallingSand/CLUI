fun main(args: Array<String>) {
    val (l, m) = readln().split(" ").map { it.toInt() }
    val arr: MutableList<List<Int>> = mutableListOf()
    val tree = BooleanArray(l) { true }
    for (i in 1 .. m) arr.add(readln().split(" ").map { it.toInt() })
    for (i in 1 .. m)
}