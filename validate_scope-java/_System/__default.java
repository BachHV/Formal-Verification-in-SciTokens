// Class __default
// Dafny class __default compiled into Java
package _System;


@SuppressWarnings({"unchecked", "deprecation"})
public class __default {
  public __default() {
  }
  public static boolean startswith(dafny.DafnySequence<? extends Character> sub, dafny.DafnySequence<? extends Character> s)
  {
    boolean t = false;
    java.math.BigInteger _0_i = java.math.BigInteger.ZERO;
    _0_i = java.math.BigInteger.valueOf((sub).length());
    if (((java.math.BigInteger.valueOf((s).length())).compareTo((java.math.BigInteger.valueOf((sub).length()))) >= 0) && (((s).take(_0_i)).equals((sub)))) {
      t = true;
      t = t;
      return t;
    }
    t = false;
    t = t;
    return t;
  }
  public static void Main(dafny.DafnySequence<? extends dafny.DafnySequence<? extends Character>> __noArgsParameter)
  {
    dafny.DafnySequence<? extends Character> _1_s;
    _1_s = dafny.DafnySequence.asString("Hello Bach");
    dafny.DafnySequence<? extends Character> _2_sub1;
    _2_sub1 = dafny.DafnySequence.asString("Hello");
    dafny.DafnySequence<? extends Character> _3_sub2;
    _3_sub2 = dafny.DafnySequence.asString("uedfheu");
    boolean _4_t1;
    boolean _out0;
    _out0 = __default.startswith(_2_sub1, _1_s);
    _4_t1 = _out0;
    boolean _5_t2;
    boolean _out1;
    _out1 = __default.startswith(_3_sub2, _1_s);
    _5_t2 = _out1;
    System.out.print(String.valueOf(_4_t1));
    System.out.print((dafny.DafnySequence.asString("\n")).verbatimString());
    System.out.print(String.valueOf(_5_t2));
  }
  public static void __Main(dafny.DafnySequence<? extends dafny.DafnySequence<? extends Character>> args) {
    __default.Main(args);
  }
  public static dafny.DafnySequence<? extends dafny.DafnySequence<? extends Character>> split1(dafny.DafnySequence<? extends Character> s, char t)
  {
    dafny.DafnySequence<? extends dafny.DafnySequence<? extends Character>> result = dafny.DafnySequence.<dafny.DafnySequence<? extends Character>> empty(dafny.DafnySequence.<Character>_typeDescriptor(dafny.TypeDescriptor.CHAR));
    java.math.BigInteger _6_i = java.math.BigInteger.ZERO;
    _6_i = java.math.BigInteger.ZERO;
    java.math.BigInteger _7_j = java.math.BigInteger.ZERO;
    _7_j = java.math.BigInteger.ZERO;
    dafny.DafnySequence<? extends Character> _8_sub;
    _8_sub = dafny.DafnySequence.asString("");
    while ((_7_j).compareTo((java.math.BigInteger.valueOf((s).length()))) < 0) {
      if ((((s).select(dafny.Helpers.toInt((_7_j)))) == (t)) || (java.util.Objects.equals(_7_j, (java.math.BigInteger.valueOf((s).length())).subtract((java.math.BigInteger.ONE))))) {
        _8_sub = (s).subsequence(dafny.Helpers.toInt((_6_i)), dafny.Helpers.toInt((_7_j)));
        result = dafny.DafnySequence.<dafny.DafnySequence<? extends Character>>concatenate(result, dafny.DafnySequence.of(dafny.DafnySequence.<Character>_typeDescriptor(dafny.TypeDescriptor.CHAR), _8_sub));
      }
      _7_j = (_7_j).add((java.math.BigInteger.ONE));
      _6_i = _7_j;
    }
    result = result;
    return result;
  }
  public static dafny.Tuple3 split2(dafny.DafnySequence<? extends Character> scope)
  {
    dafny.DafnySequence<? extends Character> info1 = dafny.DafnySequence.<Character> empty(dafny.TypeDescriptor.CHAR);
    dafny.DafnySequence<? extends Character> info2 = dafny.DafnySequence.<Character> empty(dafny.TypeDescriptor.CHAR);
    boolean t = false;
    java.math.BigInteger _9_i = java.math.BigInteger.ZERO;
    _9_i = java.math.BigInteger.ZERO;
    java.math.BigInteger _10_iter = java.math.BigInteger.ZERO;
    _10_iter = java.math.BigInteger.ZERO;
    if ((!(scope).contains((':'))) || ((java.math.BigInteger.valueOf((scope).length())).compareTo((java.math.BigInteger.ONE)) <= 0)) {
      t = false;
      info1 = dafny.DafnySequence.asString("");
      info2 = dafny.DafnySequence.asString("");
      dafny.DafnySequence<? extends Character> _rhs0 = info1;
      dafny.DafnySequence<? extends Character> _rhs1 = info2;
      boolean _rhs2 = t;
      info1 = _rhs0;
      info2 = _rhs1;
      t = _rhs2;
      return new dafny.Tuple3<>(info1, info2, t);
    }
    goto_0: {
      while ((_9_i).compareTo((java.math.BigInteger.valueOf((scope).length()))) < 0) {
        continue_0: {
          if (((scope).select(dafny.Helpers.toInt((_9_i)))) == (':')) {
            _10_iter = _9_i;
            break goto_0;
          }
          _9_i = (_9_i).add((java.math.BigInteger.ONE));
        }
      }
    }
    info1 = (scope).take(_10_iter);
    info2 = (scope).drop((_10_iter).add((java.math.BigInteger.ONE)));
    t = true;
    dafny.DafnySequence<? extends Character> _rhs3 = info1;
    dafny.DafnySequence<? extends Character> _rhs4 = info2;
    boolean _rhs5 = t;
    info1 = _rhs3;
    info2 = _rhs4;
    t = _rhs5;
    return new dafny.Tuple3<>(info1, info2, t);
  }
  public static dafny.Tuple3 Check__Scope(dafny.DafnySequence<? extends Character> scope)
  {
    dafny.DafnySequence<? extends Character> authz = dafny.DafnySequence.<Character> empty(dafny.TypeDescriptor.CHAR);
    dafny.DafnySequence<? extends Character> norm__path = dafny.DafnySequence.<Character> empty(dafny.TypeDescriptor.CHAR);
    boolean t = false;
    dafny.DafnySequence<? extends Character> _11_info1;
    _11_info1 = dafny.DafnySequence.asString("");
    dafny.DafnySequence<? extends Character> _12_info2;
    _12_info2 = dafny.DafnySequence.asString("");
    boolean _13_j;
    _13_j = true;
    dafny.DafnySequence<? extends Character> _out2;
    dafny.DafnySequence<? extends Character> _out3;
    boolean _out4;
    dafny.Tuple3<dafny.DafnySequence<? extends Character>, dafny.DafnySequence<? extends Character>, Boolean> _outcollector0 = __default.split2(scope);
    _out2 = (dafny.DafnySequence<? extends Character>) (Object) _outcollector0.dtor__0();
    _out3 = (dafny.DafnySequence<? extends Character>) (Object) _outcollector0.dtor__1();
    _out4 = (boolean) (Object) _outcollector0.dtor__2();
    _11_info1 = _out2;
    _12_info2 = _out3;
    _13_j = _out4;
    if (((((dafny.DafnySet.of(_11_info1)).<dafny.DafnySequence<? extends Character>>disjoint((dafny.DafnySet.of(dafny.DafnySequence.asString("read"), dafny.DafnySequence.asString("write"))))) || ((java.math.BigInteger.valueOf((_12_info2).length())).compareTo((java.math.BigInteger.ONE)) < 0)) || (((_12_info2).select(dafny.Helpers.toInt((java.math.BigInteger.ZERO)))) != ('/'))) || ((_13_j) == (false))) {
      t = false;
      authz = dafny.DafnySequence.asString("");
      norm__path = dafny.DafnySequence.asString("");
    } else {
      authz = _11_info1;
      if (java.util.Objects.equals(java.math.BigInteger.valueOf((_12_info2).length()), java.math.BigInteger.ONE)) {
        norm__path = dafny.DafnySequence.asString("/");
      } else {
        norm__path = _12_info2;
      }
      t = true;
    }
    dafny.DafnySequence<? extends Character> _rhs6 = authz;
    dafny.DafnySequence<? extends Character> _rhs7 = norm__path;
    boolean _rhs8 = t;
    authz = _rhs6;
    norm__path = _rhs7;
    t = _rhs8;
    return new dafny.Tuple3<>(authz, norm__path, t);
  }
  public static dafny.Tuple2 Validate__Scope(dafny.DafnySequence<? extends Character> value, boolean test__access, dafny.DafnySequence<? extends Character> norm__requested__path, dafny.DafnySequence<? extends dafny.DafnySequence<? extends dafny.DafnySequence<? extends Character>>> token__scope)
  {
    boolean t = false;
    dafny.DafnySequence<? extends dafny.DafnySequence<? extends dafny.DafnySequence<? extends Character>>> result = dafny.DafnySequence.<dafny.DafnySequence<? extends dafny.DafnySequence<? extends Character>>> empty(dafny.DafnySequence.<dafny.DafnySequence<? extends Character>>_typeDescriptor(dafny.DafnySequence.<Character>_typeDescriptor(dafny.TypeDescriptor.CHAR)));
    if(true) {
      dafny.DafnySequence<? extends dafny.DafnySequence<? extends Character>> _14_scope;
      dafny.DafnySequence<? extends dafny.DafnySequence<? extends Character>> _out5;
      _out5 = __default.split1(value, ' ');
      _14_scope = _out5;
      java.math.BigInteger _15_iter = java.math.BigInteger.ZERO;
      _15_iter = java.math.BigInteger.ZERO;
      java.math.BigInteger _16_i = java.math.BigInteger.ZERO;
      _16_i = java.math.BigInteger.ZERO;
      dafny.DafnySequence<? extends Character> _17_info1;
      _17_info1 = dafny.DafnySequence.asString("");
      dafny.DafnySequence<? extends Character> _18_info2;
      _18_info2 = dafny.DafnySequence.asString("");
      dafny.DafnySequence<? extends Character> _19_authz;
      _19_authz = dafny.DafnySequence.asString("");
      dafny.DafnySequence<? extends Character> _20_norm__path;
      _20_norm__path = dafny.DafnySequence.asString("");
      boolean _21_j;
      _21_j = true;
      boolean _22_k;
      _22_k = true;
      if ((test__access) == (true)) {
        while ((_15_iter).compareTo((java.math.BigInteger.valueOf((_14_scope).length()))) < 0) {
          dafny.DafnySequence<? extends Character> _out6;
          dafny.DafnySequence<? extends Character> _out7;
          boolean _out8;
          dafny.Tuple3<dafny.DafnySequence<? extends Character>, dafny.DafnySequence<? extends Character>, Boolean> _outcollector1 = __default.Check__Scope((_14_scope).select(dafny.Helpers.toInt((_15_iter))));
          _out6 = (dafny.DafnySequence<? extends Character>) (Object) _outcollector1.dtor__0();
          _out7 = (dafny.DafnySequence<? extends Character>) (Object) _outcollector1.dtor__1();
          _out8 = (boolean) (Object) _outcollector1.dtor__2();
          _19_authz = _out6;
          _20_norm__path = _out7;
          _21_j = _out8;
          boolean _out9;
          _out9 = __default.startswith(_20_norm__path, norm__requested__path);
          _22_k = _out9;
          if (((_21_j) == (false)) || ((_22_k) == (false))) {
            result = dafny.DafnySequence.<dafny.DafnySequence<? extends dafny.DafnySequence<? extends Character>>> empty(dafny.DafnySequence.<dafny.DafnySequence<? extends Character>>_typeDescriptor(dafny.DafnySequence.<Character>_typeDescriptor(dafny.TypeDescriptor.CHAR)));
            t = false;
            boolean _rhs9 = t;
            dafny.DafnySequence<? extends dafny.DafnySequence<? extends dafny.DafnySequence<? extends Character>>> _rhs10 = result;
            t = _rhs9;
            result = _rhs10;
            return new dafny.Tuple2<>(t, result);
          }
          _15_iter = (_15_iter).add((java.math.BigInteger.ONE));
        }
        boolean _rhs11 = t;
        dafny.DafnySequence<? extends dafny.DafnySequence<? extends dafny.DafnySequence<? extends Character>>> _rhs12 = result;
        t = _rhs11;
        result = _rhs12;
        return new dafny.Tuple2<>(t, result);
      } else {
        result = token__scope;
        while ((_15_iter).compareTo((java.math.BigInteger.valueOf((_14_scope).length()))) < 0) {
          dafny.DafnySequence<? extends Character> _out10;
          dafny.DafnySequence<? extends Character> _out11;
          boolean _out12;
          dafny.Tuple3<dafny.DafnySequence<? extends Character>, dafny.DafnySequence<? extends Character>, Boolean> _outcollector2 = __default.Check__Scope((_14_scope).select(dafny.Helpers.toInt((_15_iter))));
          _out10 = (dafny.DafnySequence<? extends Character>) (Object) _outcollector2.dtor__0();
          _out11 = (dafny.DafnySequence<? extends Character>) (Object) _outcollector2.dtor__1();
          _out12 = (boolean) (Object) _outcollector2.dtor__2();
          _19_authz = _out10;
          _20_norm__path = _out11;
          _21_j = _out12;
          result = dafny.DafnySequence.<dafny.DafnySequence<? extends dafny.DafnySequence<? extends Character>>>concatenate(result, dafny.DafnySequence.of(dafny.DafnySequence.<dafny.DafnySequence<? extends Character>>_typeDescriptor(dafny.DafnySequence.<Character>_typeDescriptor(dafny.TypeDescriptor.CHAR)), dafny.DafnySequence.of(dafny.DafnySequence.<Character>_typeDescriptor(dafny.TypeDescriptor.CHAR), _19_authz, _20_norm__path)));
          _15_iter = (_15_iter).add((java.math.BigInteger.ONE));
        }
        t = true;
        boolean _rhs13 = t;
        dafny.DafnySequence<? extends dafny.DafnySequence<? extends dafny.DafnySequence<? extends Character>>> _rhs14 = result;
        t = _rhs13;
        result = _rhs14;
        return new dafny.Tuple2<>(t, result);
      }
    }
    return new dafny.Tuple2<>(t, result);
  }
  private static final dafny.TypeDescriptor<__default> _TYPE = dafny.TypeDescriptor.referenceWithInitializer(__default.class, () -> (__default) null);
  public static dafny.TypeDescriptor<__default> _typeDescriptor() {
    return (dafny.TypeDescriptor<__default>) (dafny.TypeDescriptor<?>) _TYPE;
  }
}
