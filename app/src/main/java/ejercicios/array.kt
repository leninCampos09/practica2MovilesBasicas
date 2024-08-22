package ejercicios

fun main(){
    val diasSemana = arrayOf(
        "monday","tuesday","wednesday","thursday", "friday","saturday","sunday")

    for (indice in diasSemana.indices){
        println("dia de la semana: $indice = ${diasSemana[indice]}")
    }
    println(diasSemana.size)
}
