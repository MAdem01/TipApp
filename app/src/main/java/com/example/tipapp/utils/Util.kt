package com.example.tipapp.utils

fun calculateTotalTip(
    totalBill: Double,
    tipPercentage: Int): Double {
    return (totalBill * tipPercentage) / 100
}

fun calculateTotalPerPerson(totalBill: Double, splitBy: Int, tipPercentage: Int): Double{
    val bill = calculateTotalTip(totalBill = totalBill, tipPercentage = tipPercentage) + totalBill
    return (bill / splitBy)
}