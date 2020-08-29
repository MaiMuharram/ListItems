fun main(){


    val bob = Person("Bob", 31)
    val people = listOf(Person("Adem",20), bob, bob)
    val people2 = listOf(Person("Adem",20), Person("Bob", 31), bob)
    println(people )
    bob.age = 32
    println( people2)



}
class Person{
    var name:String=""
    var age:Int=0
    constructor(name:String,age:Int){
        this.name =name
        this.age =age
    }
}