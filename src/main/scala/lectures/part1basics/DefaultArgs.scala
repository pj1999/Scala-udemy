package lectures.part1basics

object DefaultArgs extends App{
    
    def trFact(n:Int, acc:Int) :  Int= {
        if(n<=1) acc
        else trFact(n-1,n*acc)
    }
    
    val fact10 = trFact(10,1)
    // so when we will call any trFact fn, we have to pass 1 in 2nd param always,
    // so regardless of passing any number for factorial , we have to pass 1 as 2nd param in all cases
    
    def trFactorial(n: Int, acc: Int=1): Int = {
        if (n <= 1) acc
        else trFact(n - 1, n * acc)
    }
    // here default values is passed here for 2nd param
    val fact11 = trFactorial(11)
    
    def savePicture(format:String="jpeg", width:Int=800, height:Int=900) : Unit = println("saving picture")
    savePicture(width=900)
    
    /*
    1. pass in every leading argument
    2. name the arguments
     */
}
