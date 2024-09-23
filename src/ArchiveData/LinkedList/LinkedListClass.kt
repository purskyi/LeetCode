package ArchiveData.LinkedList


data class Node(val value: Int = 0, var node: Node? = null)

class LinkedList(var head: Node = Node(0)){

    fun addNode(newNode: Node){
        var current = head
        while (current.node != null) {
            current = current.node!!
        }

        current.node = newNode
    }

    fun count(): Int{
        var count: Int = 1
        var current = head
        while (current.node != null) {
            current = current.node!!
            count++
        }
        return count
    }
    fun removeLast(){
        var current = head
        var previous = Node()
        while (current.node != null) {
            previous = current
            current = current.node!!
        }
        previous.node = null
    }
    fun removeFirst(){
        if(head.node != null) {
            head = head.node!!
        }
    }

    fun turnBackward() {

        var current = head
        var next = Node()
        var previous = Node()


        while (current.node != null){

            next = current.node!!
            current.node = previous
            previous = current
            current = next
        }
        current.node = previous
        previous = current


        head = previous
    }

    fun fillFromArray(array: Array<Int>){
        for (i in array) {
            addNode(Node(i))
        }
    }

    fun getMiddle():Node{
        var middle = count()/2

        var current = head
        for (i in 0 until middle) {
            current = current.node!!
        }

        return current
    }

    override fun toString(): String {
        return "LinkedList(head=$head)"
    }


}