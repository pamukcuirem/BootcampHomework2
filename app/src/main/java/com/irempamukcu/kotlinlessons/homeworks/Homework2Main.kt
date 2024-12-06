package com.irempamukcu.kotlinlessons.homeworks

//İrem Pamukcu - Android Bootcamp - Homework2
fun main() {
    val functionClass = Homework2Functions() //Declaring class

    //Checking functions
    val sideNumber = 6
    println("If a shape has $sideNumber sides it's degree of interior angles is: ${functionClass.question1(sideNumber)}")
    println("Eğer bir şeklin $sideNumber adet kenarı varsa bir iç açısı ${functionClass.question1(sideNumber)} derecedir.")
    println()

    val workDay =151
    println("Your wage is: ${functionClass.question2(workDay)} ₺")
    println("Ücretiniz: ${functionClass.question2(workDay)} ₺")
    println()

    val duration = 5.5
    println("You should pay: ${functionClass.question3(duration)} ₺")
    println("Ödemeniz gereken miktar: ${functionClass.question3(duration)} ₺")
    println()

    val kilometer = 621.0
    println("$kilometer kilometer is ${functionClass.question4(kilometer)} miles")
    println("$kilometer kilometre ${functionClass.question4(kilometer)} mildir")
    println()

    val side1 = 8
    val side2 = 9
    println("Area of rectangle is: ${functionClass.question5(side1,side2)}")
    println("Bu dikdörtgenin alanı: ${functionClass.question5(side1,side2)}")
    println()

    val num = 0
    println("Factorial of $num is ${functionClass.question6(num)}")
    println("$num sayısının faktöriyeli: ${functionClass.question6(num)}")
    println()

    val word = "Emine"
    println("$word word has ${functionClass.question7(word)} e letter")
    println("$word kelimesi ${functionClass.question7(word)} adet e harfi içerir")
    println()



}