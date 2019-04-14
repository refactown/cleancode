package refactown.cleancode.c03functions

import java.lang.IllegalArgumentException

open abstract class Employee(val name: String, val type: Type) {
    abstract fun calculatePay(): Double
}

enum class Type { COMMISSIONED, HOURLY, SALARIED; }

fun calculatePay(employee: Employee): Double {
    return when (employee.type) {
        Type.COMMISSIONED -> calculateCommissionedPay(employee)
        Type.HOURLY -> calculateHourlyPay(employee)
        Type.SALARIED -> calculateSalariedPay(employee)
        else -> throw IllegalArgumentException("Unknown type!")
    }
}

fun createEmployee(name: String, type: Type): Employee {
    return when (type) {
        Type.COMMISSIONED -> CommissionedEmployee(name)
        Type.HOURLY -> HourlyEmployee(name)
        Type.SALARIED -> SalariedEmployee(name)
        else -> throw IllegalArgumentException("Unknown type!")
    }
}

class CommissionedEmployee(name: String) : Employee(name, Type.COMMISSIONED) {
    override fun calculatePay() = 1.0
}

class HourlyEmployee(name: String) : Employee(name, Type.HOURLY) {
    override fun calculatePay(): Double = 2.0
}

class SalariedEmployee(name: String) : Employee(name, Type.SALARIED) {
    override fun calculatePay(): Double = 3.0
}

fun calculateSalariedPay(employee: Employee): Double = Double.MIN_VALUE

fun calculateHourlyPay(employee: Employee): Double = Double.POSITIVE_INFINITY

fun calculateCommissionedPay(employee: Employee): Double = Double.MAX_VALUE
