package collections

fun <T> List<T>.plusAt(index: Int, element: T): List<T> {
    require(index in 0..size)
    return this.take(index) + element + this.drop(index)
}

//fun <T> List<T>.plusAt(index: Int, element: T): List<T> {
//    require(index in 0..size)
//    val list = this.toMutableList()
//    list.add(index, element)
//    return list
//}

//fun <T> List<T>.plusAt(index: Int, element: T): List<T> {
//    require(index in 0..size)
//    val list = arrayListOf<T>()
//
//    for ((i, elem) in this.withIndex()) {
//        if(i == index) list.add(element)
//        list.add(elem)
//    }
//
//    return list
//}