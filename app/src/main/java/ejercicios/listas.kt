package ejercicios

fun main(){
    immutableList()
    mutableList()
}

fun immutableList(){
    val readOnly:List<String> = listOf(
        "monday","tuesday","wednesday","thursday","friday","saturday","sunday")
    for (it in readOnly){
        println(it.length)
    }

    //val example = readOnly.filter { it.contains("A") }
    //println(example)


    readOnly.forEach{ println(it) }

    readOnly.forEach { day -> println(day) }
}


fun mutableList(){
    val names:MutableList<String> = mutableListOf("lenin","melvin","emerson","julio")
    print(names)
    names.add("NewElement")
    println(names)
    names.add(0, "FirstElement")
    println(names)
    names.removeAt( names.size-1)
    println(names)
}