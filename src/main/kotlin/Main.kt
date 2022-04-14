fun main(){
var display=currentAccount(80900,"Suzzy Maua",7000)
    display.deposit(3000.50)
    display.balance
    display.withdraw(520)
    display.balance
    display.details()
    var bank=savingAccount(80900,"Suzzy Maua",7000)
    bank.withdraw(5)
    var book=product("Kasuku",40.8,100,"other")
    var tissue=product("Hannan",50.7,60,"hygiene")
    var vegetables=product("spinach",60.1,170,"groceries")
    var items=listOf(book,tissue,vegetables)
    printCharEvenIndices("banana")



}

//Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balance and
//name in this format: “Account number x with balance y is
//operated by z”

open class currentAccount(var accountNumber:Int,var accountName:String,var balance:Int){
    fun deposit(amount:Double){

   var result= balance+amount
        println(result)

    }
   open fun withdraw(amount: Int){
       var answer= balance-amount
        println(answer)


    }
    fun details(){
        println("$accountNumber with $balance is operated by $accountName")
    }

}
class savingAccount( accountNumber:Int,accountName:String, balance:Int):currentAccount(accountNumber, accountName, balance){
    override fun withdraw(withdrawals: Int) {
//        super.withdraw(amount)
        if (withdrawals < 4) {
            balance - withdrawals
        }

    }
}

data class product(var name:String,var weight:Double,var price:Int,var category:String)
fun assignProduct(item:product){
    when(item){

    }

}
fun printCharEvenIndices(name:String){
  var char=0
    for(n in name ){
        if(char%2==0)
            println(name)

    }
}
