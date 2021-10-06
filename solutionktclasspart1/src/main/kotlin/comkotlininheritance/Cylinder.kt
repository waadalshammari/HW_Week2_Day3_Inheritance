package comkotlininheritance

class Cylinder: Circle(){
    fun getVolume(): Double {
        var h = readLine()!!.toDouble()
        return radius * radius * h * 3.14
    }
 fun display(){
     println("the volume is ${getVolume()}")
 }

}
