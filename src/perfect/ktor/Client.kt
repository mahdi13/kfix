package perfect.ktor

import java.net.InetAddress
import java.net.Socket

class Client(val serverIp: String, val serverPort: Int){

    fun connect(){
        val serverAddr = InetAddress.getByName(serverIp)
        var socket = Socket(serverAddr, serverPort)

    }

    fun terminate(){

    }

}