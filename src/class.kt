fun main(){

        cars()
        var currentAccount=CurrentAccount(8800990,"Juliet",3400.00)
        println(currentAccount.deposit(4200.00))
        println(currentAccount.withdraw(3200.00))
        currentAccount.details()
        var savingsAccount=SavingAccount(43112,"Pam",500.00,4)
        println(savingsAccount.checkWithdrawals())


    }
    data class Car(var make:String,var model:String,var color:String)
    fun cars() {
        var newCars = listOf(
            Car("Honda", "Ra120", "Green"),
            Car("Toyota", "Rea30", "Blue"),
            Car("Benz", "Re40", "Green"),
            Car("Nissan", "Ra28", "Red")
        )
        var red= mutableListOf<Car>()
        var green= mutableListOf<Car>()
        var other= mutableListOf<Car>()
        for (cars in newCars) {
            when (cars.color){
                "Blue"->println(green.plus(cars))
                "Red"-> println(red.plus(cars))
                else -> println(other.plus(cars))
            }

        }


    }


    fun stringLength(name:String):Int{
        return name.length
    }
    open  class CurrentAccount(var accountNumber:Int,var accountName:String,var balance:Double){
        fun deposit(amount:Double):Double{
            balance+=amount
            return balance
        }
        fun withdraw(amount: Double):Double{
            balance-=amount
            return balance
        }
        fun details(){
            println("Account number $accountNumber with balance $balance is operated by $accountName")

        }
    }
    class SavingAccount(accountNumber: Int,accountName: String,balance: Double,var withDrawal:Int):CurrentAccount(accountNumber,accountName,balance){

        fun checkWithdrawals():Int{
            if(withDrawal<2){
                withDrawal++

            }
            return withDrawal
        }
    }

