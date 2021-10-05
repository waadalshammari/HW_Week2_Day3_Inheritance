# HW_Week2_Day3_Inheritance
The Home Work has to be delievered before 9AM: ⚠️

> Note: You must save all your solution as `solution.kt` to be submitted before 9AM. ⚠️
# Instructions 📋

## Part I: Practice with inheritance
---
### Write a superclass named 'Circle' with with following features:

Properties:
- radius for the circle radius of type double.

Class functions:
- getArea() will return the area of circle


### Write a subclass named 'Cylinder' will inherit from 'Circle' class with following features:

Properties:
- height for the cylinder hight of type double.

Class functions:
- getVolume() will return the volume of the cylinder.
- totSurArea will return the total surface area of the cylinder.
- display() will print cylinder's surface area, and volume.

How it works:
- Ask the user to create either a circle or cylinder.
- Prompt the user to input radius if it is a circle or raduis and height if it is a cylinder.
- Print the result.

## Part II: Practice with objects
---
### Create an object named 'Auth' with with following features:

Object functions:
- validate() will take username and password as string parameters and validate with "hamza" and "1234".If it is valid, print "Authorized" otherwise it will "Not Authorized"

How it works:
- Ask the user to enter name and password.
- Validate the inputs.
- Print the result.



## Part III: Bonus Challenge 
---
### Create an superclass named 'Person' with following features:
Properties:
- name : String.
- id : Int.
- email: String.

Constructor:
- init: will sets the name and email to an empty string and sets the id to zero.

Class functions:
- validateEmail(em:String): Verifies that the passed email address contains one @ character and at least one period after the @ character. If the passed email is valid, copy the passed parameter to the object's email member variable and return true, false otherwise.
- inputPerson(): Prompts the user for the name, id, and email address.
- printPerson(): Prints the name, id, and email.

### Create an subclass named 'Student' inherits from the Person class with following features:

Properties:
- major : String.
- gpa : Float.

Constructor:
- init: Sets major to an empty string and sets gpa to zero. Invokes the parent constructor to initialize name, id, and email.

Class functions:
- inputPerson(): Calls the parent version of inputPerson to read in the name, id, and email address. Then prompt for the major and gpa. 
- void printPerson(): Calls the parent version of printPeron to print the name, id, and email address. Then print the student's major and gpa up to two decimal points.

How it works:
- Ask the user to create either a Person or Student.
- Prompt the user to input information.
- Print the result.


# Learning Resources  📚
* [Classes in Kotlin](https://kotlinlang.org/docs/classes.html)
* [Inheritance in Kotlin](https://kotlinlang.org/docs/inheritance.html)
* [objects in Kotlin](https://kotlinlang.org/docs/object-declarations.html#inheriting-anonymous-objects-from-supertypes)

