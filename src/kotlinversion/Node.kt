package kotlinversion

class Node(var data: Int) {

    var following: Node? = null

    fun appendToEnd(data: Int) {
        val end = Node(data)
        var n: Node? = this
        while (n!!.following != null) {
            n = n.following
        }
        n.following = end
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    fun printNodes() {
        var node: Node? = this
        while (node != null) {
            print("${node.data} --> ")
            node = node.following
        }
        println()
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(h: Node?): Int {
        var count = 0
        var node: Node? = h
        while (node != null) {
            count++
            node = node.following
        }
        return count
    }

    // TODO:: Implement to return the sum of the Nodes
    fun sumOfNodes(): Int {
        var sum = data;
        var node = following;
        while (node != null) {
            sum += node.data;
            node = node.following;
        }
        return sum;
    }

    fun deleteNode(head: Node, data: Int): Node? {
        var n: Node? = head
        var previousNode = head
        if (n?.data == data) {
            return head.following
        }
        // TODO:: Implement the proper loop in order to remove given data
        while (n != null) {
            if (n.data == data) {
                previousNode.following = n.following;
                n = null;
                return head;
            }
            previousNode = n;
            n = n.following;
        }
        //
        return head
    }
}