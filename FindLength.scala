def length[A](list: List[A]): Int =
{
   lengthHelper(0, list)
}

def lengthHelper[A](c: Int, list: List[A]): Int =
list match
{
    case Nil       => c
    case _ :: tail => lengthHelper(c + 1, tail)   
}

length(List(1, 1, 2, 3, 5, 8))