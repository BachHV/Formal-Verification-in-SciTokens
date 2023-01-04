datatype List<T> = Nil | Cons(string, List)

function length(l: List): nat
{
  match l
  case Nil => 0
  case Cons(x, xs) => 1 + length(xs)
}

function concat(l: List, ys: List): List
{
  match l
  case Nil => ys
  case Cons(x, xs) => Cons(x, concat(xs, ys))
}

function reverse(l: List): List
{
  match l
  case Nil => Nil
  case Cons(x, xs) => concat(reverse(xs), Cons(x, Nil))
}



