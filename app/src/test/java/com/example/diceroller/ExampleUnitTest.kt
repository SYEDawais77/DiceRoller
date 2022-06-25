package com.example.diceroller

import junit.framework.TestCase.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun generate_number(){
        val dice = Dice()
        val rollResult = dice.rollDice()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)

    }

}