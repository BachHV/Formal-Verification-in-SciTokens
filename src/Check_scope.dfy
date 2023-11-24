method Split(scope : string) returns (info1 : string, info2 : string, t : bool) 
{
    var i := 0;
    var iter := 0;
    if (':' !in scope || |scope| <= 1) {
        t := false;
        info1 := "";
        info2 := "";
        return;
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
}

method Check_Scope(scope : string) returns (authz : string, norm_path : string) 
{
    var info1 := "";
    var info2 := "";
    var t := true;
    info1 , info2, t := Split(scope);
    if ({info1} !! {"read", "write"} || |info2| < 1 || info2[0] != '/') {
        t := false;
        authz := "";
        norm_path := "";
        return;
    }
    authz := info1;
    if (|info2| == 1) {
        norm_path := "/";
    } else {
        norm_path := info2;
    }
    t := true;
    return;
}
