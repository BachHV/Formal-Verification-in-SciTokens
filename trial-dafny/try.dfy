method Hello(s :string) returns (b : int)
requires s == "Hello Bach"
ensures s[0..4]== "Hell"
ensures s[5..] == " Bach"
{
    b := 0;
    return b;
}