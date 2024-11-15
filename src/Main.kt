fun main() {
        var list1 = mutableListOf(-10,3,5,13,57,155,1666,0,0,0,0,0,0,0,0,0,0) //7
        var list2 = mutableListOf(-20,-5,-2,2,5,7,9,20,100,176554) // 10

        var sizeWhole = list1.size-1
        var size2 = list2.size - 1
        var size1 = sizeWhole - size2 - 1


        var index = 0
        var index2 = 0
        var buffer = 0

        list1.forEachIndexed{mergedIndex, element ->

           var  l1 = (list1[ moveIndexAndCheckBorder(size1,index) ])
           var  l2  = (list2[  moveIndexAndCheckBorder(size2,index2) ])

                if ( l1 > l2 ) {
                    l1 = list1[moveIndexAndCheckBorder(sizeWhole, index)].also {
                        list1[sizeWhole - mergedIndex] = l1
                    }
                    index++
                } else {
                    l2 = list1[moveIndexAndCheckBorder(sizeWhole, index)].also {
                        list1[sizeWhole - mergedIndex] = l2
                    }
                    index2++
                }
            // as our logic put bigger element the last put element will be too bigger
            // so we manually put smaller element in first index to save ascending list
            if (mergedIndex == sizeWhole){
               if (list1[0] > list2[0]){
                   list1[0] = list2[0]
               }
                else{
                    list1[0] = list1[0]
                }
            }
        }


    println(list1)


}

fun moveIndexAndCheckBorder(size: Int, index:Int):Int{
    val num = size - index
    if (num >= size){
        return size
    }
    else if (num < 0){
        return 0
    }
    else
        return num
}

