package sealed_class
fun main(args: Array<String>) {

    getLoad(LoadState.Success("Data loaded .."))
    LoadState.Demo.Demo1(5)
}

object Idle:LoadState()

sealed class LoadState{

    data class Success(val data:String):LoadState()
    data class Failure(val t:Throwable):LoadState()
    data object UnknownError:LoadState()

    /*you can pass sealed class inside sealed class
    if you extend sealed class Demo with LoadState
     it will act differently
     you need to declare it getLoad function*/
    sealed class Demo{
        class Demo1(val data:Int):Demo()
    }
}

fun getLoad(loadState: LoadState){
  return when(loadState){
      is LoadState.Failure -> TODO()
      is LoadState.Success -> TODO()
      LoadState.UnknownError -> TODO()
      Idle -> TODO()
      // in the Same package another file
      AnotherOne -> TODO()
  }
}
