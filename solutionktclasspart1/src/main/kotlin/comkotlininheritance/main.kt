package comkotlininheritance

fun main(){
    println(" if you want To create a circle enter radius number")
    var user= readLine()!!.toDouble()
    var user2=Circle(user).getArea()
    println("circle erea is $user2")
    println("if you want To create Volume for Cylinder enter radius number")
    Cylinder().display()



}