package com.pes.lib

/*

Create class BankAccount
    properties
        - accName - Account Holder Name
        - accNumber - Int - account number - readOnly
        - balance - Int- always initialized to 0

    methods
        - displayInfo() - print all properties
 */

/*
create class SavingAccount - inherited from BankAccount

    - additional properties -
        interest rate - Float

      methods:
        credit(amount) - increment balance
        debit(amount) - decrement balance
        override displayInfo - prints interest rate as well
 */



 package com.pes.lib

open class BankAccount(
    var accName: String,
    val accNumber: Int
) {

    var balance: Int = 0

    open fun displayInfo() {
        println("Account Holder Name: $accName")
        println("Account Number: $accNumber")
        println("Balance: $balance")
    }
}

class SavingAccount(
    accName: String,
    accNumber: Int,
    var interestRate: Float
) : BankAccount(accName, accNumber) {

    fun credit(amount: Int) {
        balance += amount
    }

    fun debit(amount: Int) {
        balance -= amount
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Interest Rate: $interestRate")
    }
}

fun main() {

    val account = SavingAccount(
        "John",
        101,
        5.5f
    )

    account.credit(1000)
    account.debit(200)

    account.displayInfo()
}