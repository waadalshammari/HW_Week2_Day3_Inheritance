package comkotlinobject

object Auth {
    var username = "hamza"
    var password = 1234
     fun validate(){
         println("Enter your username:")
         var user = readLine()!!.toString()
         println("Enter your password:")
         var pass = readLine()!!.toInt()
         if (user == username && pass == password) {
             println("Authorized")}
         else {println("Not Authorized")}
     }
}