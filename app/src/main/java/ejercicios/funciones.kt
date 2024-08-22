package ejercicios

//make a function show in console a simple greet

fun main(){
    greet()
    greet("irvin", 24)
    login("admin", "123")
    val res = sum(5.3, 4.7)
    println("the result of sum is: $res")
    println("function simplification ${rest(4.0, 3.0)}")

}

fun greet(){
    println("hello students")
}

//make a function show in console name and age for each user

fun greet(name:String, age:Int=0){
    println("hello user $name i see to have $age years of age")
}

fun login(user:String="-1", pass:String="-1"){
    if(user != "-1" && pass != "-1"){
        if(user == "admin" && pass == "123"){
            println("Credentials corrects")
        }else{
            println("credentials incorrectness")
        }
    }else{
        println("credentials invalids")
    }
}


fun sum(a: Double, b: Double): Double {
    return (a + b)
}

fun rest(a: Double, b: Double): Double = a - b
