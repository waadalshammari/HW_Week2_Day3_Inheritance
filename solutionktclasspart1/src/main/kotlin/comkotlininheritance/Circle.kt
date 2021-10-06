package comkotlininheritance

open class Circle(var radius:Double = readLine()!!.toDouble()) {

    fun getArea(): Double {


        return radius * radius * 3.14
    }

}