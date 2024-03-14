fun main(){
    school("akirachix")
    myName("Amanda",30)
    name("careny")
    yourName("cynthia")
    studentRecord("John",50,"012345689",60,"burundi")
    isEven(5)
    println(extract("HelloWorld"))
}
fun school(name:String){
    var a = name[0]
    var b = name[2]
    var c = name[3]
    var add = a+""+b+""+c
    println(add)
}
fun myName(name:String,age:Int):String{
    var statement = "Hi,my name is $name and i am $age years old"
    println(statement)
    return(statement)
}
fun name(name:String):Int{
    println(name.length)
    return (name.length)
}
fun yourName(name:String){
   if(name == "Nancy") {
       println("Thats me")
   }
    else{println("I don't know who that is")}
}
fun studentRecord(fullName:String,age:Int,phoneNumber:String,weight:Int,citizen:String){
  println(fullName)
    println(age)
    println(phoneNumber)
    println(weight)
    println(citizen)
    if(citizen == "Kenyan"){
        println("Kenyan")
    }
    else{println("not Kenyan")}
}
fun isEven(number:Int):Boolean{
    var result = number%2 == 0
        println(result)
    return(result)
}
//fun extractSubstring(word:String){
//    var
//    if(word.startsWith("le")){
//        val slice = word.substring(startIndex = 2)
//        word = $slice
//        println(word)
//    }
//}
//
fun extract (word:String): String{
  var newWord = word.slice(1..5)
    return newWord;

}
