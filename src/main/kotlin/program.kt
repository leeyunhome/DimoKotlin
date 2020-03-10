fun main() {

    var nullArr = arrayOfNulls<Int>(5)

    nullArr[2] = 3

    nullArr.forEach {
        println(it)
    }
}