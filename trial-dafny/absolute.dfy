method Abs(x: int) returns (r: int)
ensures r>=0
{
    if (x >= 0){
        return x;
    }

    if (x >= -10 && x<0){
        return -x;
    }

    if (x <= -10){
        return -x;
    }

    return x;
}
method Main(){
    var x:= 10;
    var absX := Abs(x);
    assert(absX >= 0);
    //assert(absX == 10);

}