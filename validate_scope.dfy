method startswith(sub : string, s : string) returns (t : bool) 
{
    var i := |sub|;
    if (|s| >= |sub| && s[..i] == sub) {
        t := true;
        return t;
    }
    t := false;
    return t;
}

method Main() 
{
    var s := "Hello Bach";
    var sub1 := "Hello";
    var sub2 := "uedfheu";
    var t1 := startswith(sub1, s);
    var t2 := startswith(sub2, s);
   // assert t1 == true;
    print(t1);
    print("\n");
    print(t2);
    assert {t1} <= {false,true};
}

method split1(s : string, t : char) returns (result : seq<string>)
requires |s| > 0;
{
  var i := 0;
  var j := 0;
  var sub := "";
  while j < |s| 
  invariant i <= j <= |s|;
  {
    if (s[j] == t || j == |s| - 1) {
      sub := s[i..j];
      result := result + [sub];
    }
    j := j + 1;
    i := j;
  }
  return result;
}

method split2(scope : string) returns (info1 : string, info2 : string, t : bool) 
{
    var i := 0;
    var iter := 0;
    if (':' !in scope || |scope| <= 1) {
        t := false;
        info1 := "";
        info2 := "";
        return info1, info2, t;
    }
    while (i < |scope|) 
    invariant 0 <= i <= |scope|;
    {
        if (scope[i] == ':') {
            iter := i;
            break;
        }
        i := i + 1;
    }
    info1 := scope[..iter];
    info2 := scope[iter + 1..];
    t := true;
    return info1, info2, t;
}

method Check_Scope(scope : string) returns (authz : string, norm_path : string, t : bool) 
{
    var info1 := "";
    var info2 := "";
    var j := true;
    info1 , info2, j := split2(scope);
    if ({info1} !! {"read", "write"} || |info2| < 1 || info2[0] != '/' || j == false) {
        t := false;
        authz := "";
        norm_path := "";
    } else {
         authz := info1;
    if (|info2| == 1) {
        norm_path := "/";
    } else {
        norm_path := info2;
    }
    t := true;
    }
    return authz, norm_path, t;
}

method Validate_Scope(
    value : string, 
    test_access : bool, 
    norm_requested_path : string, 
    token_scope : seq<seq<string>>) 
    returns (
        t : bool, 
        result : seq<seq<string>>)

requires |value| > 0; 
{
    var scope := split1(value, ' ');
    var iter := 0;
    var i := 0;
    var info1 := "";
    var info2 := "";
    var authz := "";
    var norm_path := "";
    var j := true;
    var k := true;
    if (test_access == true) {
        while (iter < |scope|) 
        invariant 0 <= iter <= |scope|;
        {
            authz, norm_path, j := Check_Scope(scope[iter]);
            k := startswith(norm_path, norm_requested_path);
            if (j == false || k == false) {
                result := [];
                t := false;
                return t, result;
            }
            iter := iter + 1;
        }
        return t, result;
    } else {
        result := token_scope;
        while (iter < |scope|) 
        invariant 0 <= iter <= |scope|;
        {
            authz, norm_path, j := Check_Scope(scope[iter]);
            result := result + [[authz, norm_path]];
            iter := iter + 1;
        }
        t := true;
        return t, result;
    }
}
/*
method test_scope() returns (t : bool) 
ensures t == true;
{
    var value := "read:/protected";
    var test_access := true;
    var norm_requested_path := "";
    var token_scope : seq<seq<string>> := [["read", "protected"], ["read", "android"]];
    var result : seq<seq<string>> := [];
    t , result := Validate_Scope(value, test_access, norm_requested_path, token_scope);
    return t;
}
*/
  
