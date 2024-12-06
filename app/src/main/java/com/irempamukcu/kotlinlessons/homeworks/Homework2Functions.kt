package com.irempamukcu.kotlinlessons.homeworks

import kotlin.math.ceil

//İrem Pamukcu - Android Bootcamp - Homework2

class Homework2Functions {

    //This function takes number of sides of a shape and returns degree of interior angles.
    //If input is less than 3 then returns null
    fun question1(numOfSides : Int): Double?{
        return if(numOfSides >=3) ((numOfSides-2)*180.0) / numOfSides else null
    }

    //This function calculates wage. If work hour is less than 150 then hourly payment is 40₺ else it is 80₺ for every more hour
    fun question2(days: Int): Int{
      return if(days<150) days*40 else (150*40)+((days-150)*80)

    }

    //This function calculates an parking fee. If it is less then 1 hour then it is 50₺ and it is 10₺ for every more hour.
    fun question3(duration: Double): Int{
        return if(duration<=1) 50 else 50+((ceil(duration) - 1).toInt() * 10)
    }

    //This function converts kilometers to miles.
    fun question4(kilometer: Double): Double{
        return kilometer*0.621
    }

    //This function takes length of two sides and calculates area of the rectangle.
    fun question5(side1: Int, side2: Int): Int{
        return side1*side2
    }

    //This function calculates factorial of number.
    fun question6(num: Int): Int{
        return if (num <= 1) 1 else num * question6(num - 1)
    }

    //This function counts how many e letters in the word.
    fun question7(word: String): Int {
        return word.count { it == 'e' || it == 'E' }
    }
}