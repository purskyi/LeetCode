fun main() {
    myListNode().let { println(it.Size(myListNode())) }


}

class myListNode(var myValue: Int = 0, var next: myListNode? = null) {


    fun Size(head: myListNode, num:Int = 0):Int
    {
        var size:Int = 0
        if (head.next != null)
        {
            size = Size(head.next!!, num+1)
        }
        return size
    }

    fun add(current:Int ){

        var newNode = myListNode(current)
        newNode.next = this
    }

}

/*
class Solution {
    fun middleNode(head: myListNode?): myListNode? {

        var answer = myListNode



        return
    }
}*/
