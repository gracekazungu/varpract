import javax.swing.tree.FixedHeightLayoutCache
import kotlin.contracts.Returns
import kotlin.random.Random
fun main() {
    val inputArray = intArrayOf(1, 2, 3, 2, 4, 1, 5)
    val uniqueElements = getUniqueElements(inputArray)
    println(uniqueElements.contentToString()) // Output: [1, 2, 3, 4, 5]

    println(SecondLargest(num3 = arrayOf(45,89,90,56)))
    
    println(getSecondLargest(array = arrayOf(23,45,67,89)))
Calculate(23.0,34.8)
    Temperature(34.0)
    User("Grace",21,"black")
    println("this is first random" +  diceRoll(1..10))
    numbers(23,45,6)
calculate(3.14,14.0)
    calc(14.0)
    strings("silent","listen")
    evenNums()
    Numbers(9)
    intergers(names = listOf(23,45,46,78,90,45))
    str("Hello world")


    var person=Person("Grace","21")
    person.speak()
    var student=Student("Becky","20","7")
    student.study()

    var vehicle=Vehicle("SUBARU","LANDCRUISER","2020")
    vehicle.start()

    var car=Car("Toyota","KDA34R","2021","BLUE")
    car.start()

    var area=Rectangle(34.0,49.0)
    println(area.Area())

    var animal=Animal("Cat","miauuuu")
    animal.makeSound()
    var dog=Dog("dog","woof")
    dog.makeSound()
    var cat=Cat("Cat","meow")
    cat.makeSound()

    var personn=Personn("Cathy","23")
    personn.introduce()
    var employee=Employee("Idaya","23","Manager")
    employee.workMethod()

    var recta=Rectang(24,34)
    recta.AreaShape()

    println(ArrayInt(nums = arrayOf(23,45,67,89)))
    println(Integers(numbers = arrayOf(40,67,89,90)))

// reverseArray(arr = intArrayOf(34,45,67,89))
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val reversedArr = reverseArray(arr)
    println(reversedArr.contentToString())

val y=findCommnElements(array3 =arrayOf(1, 2, 3, 4, 5), array4 = arrayOf(3, 4, 5, 6, 7))
    println(y.contentToString()) // prints "[3, 4, 5]"


    val x=findCommonElements(array1 = arrayOf(2,92,80,45,56,78,90),
        array2 = arrayOf(23,56,90,42,43))
   println(x.contentToString())


    val arr1 = intArrayOf(1, 2, 3, 4, 5)
    val arr2 = intArrayOf(2, 4, 6, 8)
    val commonElements = findCommonElements(arr1, arr2)
    println(commonElements.contentToString())

    val user = User("myusername", "MyP4ssw0rd")
    val isValidPassword = user.validatePassword() // returns true
    println(isValidPassword)

    val user1 = User1("myusername", "MyPassword123")
    if (user.validatePassword()) {
        println("Password is valid")
    } else {
        println("Password is not valid")
    }

    val point1 = Point(0.0, 0.0)
    val point2 = Point(3.0, 4.0)

    val dist = point1.distance(point2)
    println("Distance between $point1 and $point2 is $dist") // prints "Distance between Point(x=0.0, y=0.0) and Point(x=3.0, y=4.0) is 5.0"


    val answer=EvenArray(v = arrayOf(34,23,56,79,80,21,24))
    println(answer.contentToString())

    print("Enter a decimal number: ")
    val decimal = readLine()?.toInt() ?: 0
    val binary = decimalToBinary(decimal)
    println("Binary representation: $binary")


    print("Enter a number: ")
    val num = readLine()?.toInt() ?: 0
    val factorial = calculateFactorial(num)
    println("Factorial of $num is $factorial")

    val m=VowelsArr(string = arrayOf("eating","mother","apple","nottation"))
    println(m.contentToString())

    val array = arrayOf("Apple", "banana", "Cherry", "orange", "PEAR")
    val output = filterByVowel(array)
    println(output.contentToString()) // Output: [Apple, orange, PEAR]

    val input = arrayOf("apple", "banana", "orange", "pear", "kiwi", "strawberry")
    val filteredArray = filterStringStartingWithVowel(input)
    println(filteredArray.joinToString()) // prints "apple, orange"
}
fun SecondLargest(num3:Array<Int>):Int{
    return  num3.sortedArrayDescending().get(1)

}
//Write a program that calculates the area of a rectangle.
//The user should be prompted to enter the length and width of the rectangle.
fun Calculate(length:Double,Width:Double){
    val area=length*Width
    println(area)
}
//Write a program that converts temperature from Celsius to Fahrenheit.
//The user should be prompted to enter the temperature in Celsius.
fun Temperature(Temp:Double){
    var convert=Temp*2+30
    println(convert)
}
//Write a program that prompts the user to enter their name, age, and favorite color,
//and then prints out a message including all of that information.
fun User(name:String,age:Int,Color:String){
    println("Hello my name is $name am $age years old and $Color is my favourate color")
}
//Write a program that simulates a dice roll.
//The user should be prompted to enter the number of sides on the dice,
//and then the program should randomly generate a number between 1 and the number of sides.
//The program should then print out the result of the roll.
fun diceRoll(numberssides:IntRange):Int{
//    val result= Random.nextInt(1,numberssides+1)
//    println("The result of the roll is: $result")
    var random =numberssides.random()
    return random
}
//Write a program that calculates the average of three numbers.
//The user should be prompted to enter the three numbers.
fun numbers(num1:Int,num2:Int,num3:Int){
    var sum=num1+num2+num3
    var avrg=sum/3
    println(avrg)
}
//Write a program that converts a number from decimal to binary.
//The user should be prompted to enter the decimal number.
fun decimalToBinary(decimal: Int): String {
    if (decimal == 0) {
        return "0"
    }
    if (decimal == 1) {
        return "1"
    }
    return decimalToBinary(decimal / 2) + (decimal % 2).toString()
}


//Write a program that calculates the factorial of a number.
//The user should be prompted to enter the number.

fun calculateFactorial(num: Int): Int {
    return if (num == 0) {
        1
    } else {
        num * calculateFactorial(num - 1)
    }
}
fun factorial(numm:Int) {
    var num = 1
    var facytor:Long=1
    while (facytor<=numm){
        facytor*=num.toLong()
    }
    return "Hi "
}
//Write a program that calculates the area and circumference of a circle.
//The user should be prompted to enter the radius of the circle.
fun calculate(formula:Double,radius:Double){
    var area=formula*radius*radius
    println(area)
    var circumference=2*formula*radius
    println(circumference)
}
fun calc(r: Double){
    var ar=3.14*r*r
    println(ar)

    var circ=2*3.14*r
    println(circ)
}

//Write a program that takes two strings as input and checks
//if they are anagrams of each other. An anagram is a word or phrase formed by rearranging
//the letters of another, such as "listen" and "silent".
fun strings(str1:String,str2:String) {
//    var d=str1.split("").reversed().joinToString { str->str.toString() }
//    if(d==str2){
//        println("anagrams")
//    }
//    else{
//        println("not anagrams")
//    }
    var d=str1.split("")
    var t=str2.split("")
    if(d.containsAll(t)){
        println("anagrams")
    }
    else{
        println("not anagrams")
    }
}
//Write a program that calculates the sum of all even numbers between 1 and 100.
fun evenNums(){
    var sum =0
  for(num in 1..100){
      if(num%2==0){
          sum+=num
      }
  }
    println(sum)
}
//Write a program that prompts the user to enter a number and checks if it is a prime number.
fun Numbers(num:Int){
 if(num%num==0 && num%1==0)   {
     println("$num is a prime number")
 }
    else{
        println("$num is not a prime number")
 }
}
//Write a program that reads in a list of integers and finds
//the maximum and minimum values in the list.
fun intergers(names:List<Int>){
    println(names.max())
    println(names.min())
}
//Write a program that takes a string as input and reverses the order of the
//words in the string. For example, "Hello world" should become "world Hello".
fun str(name:String){
    var h=name.split("").reversed().joinToString { n->n.toString() }
    println(h)
}

//Create a class called Person with properties for name and age.
//Write a method called speak that prints
//"Hello, my name is {name} and I am {age} years old."
open class Person(var name:String,var age:String){
    fun speak(){
        println("Hello, my name is $name and Iam $age years old")
    }
}
//Create a data class called User with properties for username and password.
//Write a method called validatePassword that checks if the password contains
//at least one uppercase letter, one lowercase letter, and one number.
data class User(val username: String, val password: String) {

    fun validatePassword(): Boolean {
        val hasUppercase = password.any { it.isUpperCase() }
        val hasLowercase = password.any { it.isLowerCase() }
        val hasNumber = password.any { it.isDigit() }
        return hasUppercase && hasLowercase && hasNumber
    }
}
data class User1(val username: String, val password: String) {

    fun validatePassword(): Boolean {
        val regex = Regex("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).+\$")
        return regex.matches(password)
    }
}
//Create a class called Vehicle with properties for make, model, and year.
//Write a method called start that prints "The {make} {model} is starting up."
open class Vehicle(var make:String,var model:String,var year:String){
   open fun start(){
        println("The $make $model is starting up")
    }
}
//Create a class called Car that extends Vehicle and adds a property for color.
//Override the start method to print "The {color} {make} {model} is starting up."
class Car(make:String, model:String, year:String,var color:String):Vehicle(make,model,year){
   override fun start(){
    println("The $color $make $model is starting up")
   }
}
//Create a class called Rectangle with properties for width and height.
//Write a method called area that returns the area of the rectangle.
class Rectangle(var width:Double,var height:Double){
 fun Area():Double{
    var Area =width*height
    return Area
 }
}
//Create a data class called Point with properties for x and y.
//Write a method called distance that takes another Point as an argument and returns
//the Euclidean distance between the two points.
data class Point(val x: Double, val y: Double) {
    fun distance(other: Point): Double {
        val dx = x - other.x
        val dy = y - other.y
        return Math.sqrt(dx * dx + dy * dy)
    }
}
//Create a class called Animal with properties for species and sound.
//Write a method called makeSound that prints "{species} says {sound}."
open class Animal(var species:String,var sound:String){
    open fun makeSound(){
        println("$species says $sound")
    }
}
//Create a class called Dog that extends Animal and sets species to "dog" and sound to "woof".
//Override the makeSound method to print "{species} barks {sound}."
class Dog(species:String,sound:String):Animal(species,sound){
    override fun makeSound() {
        println("$species barks $sound")
    }
}
//Create a class called Cat that extends Animal and sets species to "cat" and sound to "meow".
//Override the makeSound method to print "{species} meows {sound}."
class Cat(species:String,sound:String):Animal(species,sound){
    override fun makeSound() {
        println("$species meows $sound")
    }
}
//Create a data class called Student that extends Person and adds a property for grade.
//Write a method called study that prints "I am studying in grade {grade}."
class Student( name:String,age:String,var grade:String):Person(name,age){
    fun study(){
        println("Iam studying in grade $grade.")
    }
}
//Create a class called Farm with a property for a list of Animal objects.
//Write a method called makeSounds that calls the makeSound method on each animal in the list.
//class Farm(var species:String,var sound:String){
//    fun Sounds(names:List<Any>){
////val Cat=Farm("cat","meow")
//        val dog=Farm("dog","woof")
//        val both= listOf(Cat,dog)
//        println(both)
//    }
//}
//Create a class called Person with properties for name and age.
//Write a method called introduce that prints "Hi, my name is {name} and I am {age} years old."
class Personn(var name:String,var age:String){
    fun introduce(){
        println("Hi my name is $name and Iam $age years old")
    }
}
//Create a data class called Employee that extends Person and adds a property for position.
//Write a method called work that prints "I am a {position}."
class Employee(var name:String,var age:String,var position:String) {
    fun workMethod() {
        println("I am a $position")
    }
}

//Create an abstract class called Shape with an abstract method called area.
//Create a subclass called Rectangle that implements area using the formula width * height.
open class Shape(var width:Int,var height:Int){
    open fun AreaShape(){
    }
}
class Rectang(width:Int,height:Int):Shape(width,height){
    override fun AreaShape() {
        println(width*height)
    }
}
//ARRAYS
//Write a Kotlin function that takes an array of integers as input and
//returns the sum of all the elements in the array.
fun ArrayInt(nums:Array<Int>):Int {
    var sum = nums.sumOf { num -> num }
    return sum
}

//Write a Kotlin function that takes two arrays of integers as input and returns
//a new array that contains the elements that are common to both input arrays.

fun findCommnElements(array3: Array<Int>, array4: Array<Int>): Array<Int> {
    val set3 = array3.toSet() // Convert array1 to a set
    val set4 = array4.toSet() // Convert array2 to a set
    return set3.intersect(set4).toTypedArray() // Find the intersection of the two sets and convert it back to an array
}
//This function first converts the two input arrays into sets using the toSet() function.
//This allows us to easily find the intersection of the two sets using the intersect() function.
//Finally, the result is converted back into an array using the toTypedArray() function.


fun findCommonElements(arr1: IntArray, arr2: IntArray): IntArray {
    val result = mutableListOf<Int>()
    val set1 = arr1.toSet()
    val set2 = arr2.toSet()
    set1.forEach {
        if (set2.contains(it)) {
            result.add(it)
        }
    }
    return result.toIntArray()
}


fun findCommonElements(array1: Array<Int>, array2: Array<Int>): Array<Int> {
    val commonElements = mutableListOf<Int>()
    for (element in array1) {
        if (element in array2 && element !in commonElements) {
            commonElements.add(element)
        }
    }
    return commonElements.toTypedArray()
}
//Write a Kotlin function that takes an array of integers as input and
//returns the maximum element in the array.
fun Integers(numbers:Array<Int>):Int{
    return numbers.max()
}
//Write a Kotlin function that takes an array of integers as input and returns
//a new array that contains the same elements as the input array, but in reverse order.

fun reverseArray(arr: IntArray): IntArray {
    val reversedArray = IntArray(arr.size)
    for (i in arr.indices) {
        reversedArray[arr.size - 1 - i] = arr[i]
    }
    return reversedArray
}

//Write a Kotlin function that takes an array of integers as input and returns
//a new array that contains only the even elements of the input array.
fun EvenArray(v:Array<Int>):Array<Int>{
    val y= mutableListOf<Int>()
   for (num in v) {
       if(num%2==0){
        y.add(num)
       }
   }
    return y.toTypedArray()
}
//Write a Kotlin function that takes an array of strings as input
//and returns a new array that contains only the strings that start with a vowel.
fun VowelsArr(string:Array<String>):Array<String>{
    val empty= mutableListOf<String>()
    val vowels= setOf("a","e","i","o","u")
    for(vowel in vowels){
        if(string[0].contains(vowel)){
            empty.add(vowel)
        }
    }
    return empty.toTypedArray()
}

    fun filterByVowel(strings: Array<String>): Array<String> {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        return strings.filter { it.isNotEmpty() && it[0].toLowerCase() in vowels }.toTypedArray()
    }

fun filterStringStartingWithVowel(input: Array<String>): Array<String> {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    return input.filter { vowels.contains(it.toLowerCase().first()) }.toTypedArray()
}
//Write a Kotlin function that takes an array of integers as input
//and returns a new array that containsonly the unique elements of the input array.
fun getUniqueElements(inputArray: IntArray): IntArray {
    // Create a mutable set to store unique elements
    val uniqueElements = mutableSetOf<Int>()

    // Iterate over the input array and add each element to the set
    for (element in inputArray) {
        uniqueElements.add(element)
    }

    // Convert the set back to an array and return it
    return uniqueElements.toIntArray()
}

//Write a Kotlin function that takes an array of integers as input and returns
//the second largest element in the array.

fun getSecondLargest(array: Array<Int>): Int? {
    if (array.size < 2) {
        return null
    }
    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE
    for (i in array.indices) {
        if (array[i] > largest) {
            secondLargest = largest
            largest = array[i]
        } else if (array[i] > secondLargest && array[i] != largest) {
            secondLargest = array[i]
        }
    }
    return if (secondLargest == Int.MIN_VALUE) null else secondLargest
}





