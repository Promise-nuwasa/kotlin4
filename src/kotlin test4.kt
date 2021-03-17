import java.util.*

fun main(){
placeArray("Uganda",  "kenya", "Congo", "Sudan")
    cities()
    numbers()
    val namesArray= arrayOf("Ritah","Tina","Carol")
    println(Arrays.toString(namesArray))

}
fun placeArray(Uganda:String,Kenya:String,Congo:String,Sudan:String){
    var place= arrayOf(Uganda,Kenya,Congo,Sudan)
    println(Arrays.toString(place))

}
fun cities() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    println(cities[0].capitalize() + " " + cities[1].capitalize() + " " + cities[2].capitalize() + " " + cities[3].capitalize())

}
fun numbers(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var total=numbers[1]+numbers[4]
    println(total)
    println(numbers.indexOf(158))
var num=numbers.sortedArray()
    num.forEach {number -> println(number)}
}


fun names(x:String,y:String,z:String):Array<String>{
    val namesArray=arrayOf(x,y,z)
    return namesArray
}