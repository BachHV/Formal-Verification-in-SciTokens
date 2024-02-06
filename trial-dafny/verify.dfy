function Max(a : int, b : int) : int 
{
    if a > b then a else b
}
method Difference(a : int, b :int) returns (c : int)
    ensures c >= 0 // post-condition
    requires  a == Max(a ,b)//precondition
{
    c := a - b;
}
method Power(a : int, n : nat) returns (t : int)
requires a > 0
{
    var i := 0;
    var u := 1;
    while (i < n)
    invariant 0 <= i
    decreases n - i//gives Dafny an expression that decreases with every loop iteration or recursive call.
        invariant 0 <= i//A loop invariant is an expression that holds upon entering a loop, and after everyexecution of the loop body, captures sth that is invariant
    {
        u := u * a;
        i := i + 1;
    }
    t := u;
}
method Find(a : array<int>, b : int) returns (t : int) 

    ensures 0 <= t ==> t < a.Length && a[t] == b
    ensures t < 0 ==> forall k :: 0 <= k < a.Length ==> a[k] != b
// forall: Like "for"in C++/Java/Python 
// ==> : Implication
    {
      t := 0; 
      while (t < a.Length) 
          invariant 0 <= t <= a.Length
          invariant forall k :: 0 <= k < t ==> a[k] != b
      {
          if (a[t] == b) {
              return;
          }
          t := t + 1;
      }
      t := -1;
    }
