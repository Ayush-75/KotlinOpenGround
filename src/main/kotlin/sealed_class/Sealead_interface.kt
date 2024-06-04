package sealed_class

import sealed_class.CommonErrors.*

sealed class CommonErrors:User,Login{
    object Authorized:CommonErrors()
    object ServerError:CommonErrors()
}

sealed interface User{
    data object EmailPasswordError:User
}
sealed interface Login{
    data object SeverDownError:Login
//    data class ErrorOne(val commonErrors: CommonErrors):LoginError
}

fun getCommonErrors(commonErrors: CommonErrors){
    when(commonErrors){
        Authorized -> TODO()
        ServerError -> TODO()
        // its throwing error  -> Incompatible types: UserErrors.EmailPasswordError and CommonErrors
        //UserErrors.EmailPasswordError -> TODO()
    }
}

fun getUserErrors(userErrors: User){
    when(userErrors){
        Authorized -> TODO()
        ServerError -> TODO()
        User.EmailPasswordError -> TODO()
    }
}


fun getServerError(login: Login) {
    when (login) {
        is Login.SeverDownError -> println("Handling SeverDownError")
        Authorized -> println("not in error one")
        ServerError -> println("Not in error one ")
    }
}

fun main(args: Array<String>) {
    getServerError(Login.SeverDownError)

    getServerError(Authorized)
    getServerError(ServerError)
}