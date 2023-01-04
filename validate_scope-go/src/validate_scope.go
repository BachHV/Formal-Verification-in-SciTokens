// Dafny program validate_scope.dfy compiled into Go
package main

import (
  _dafny "dafny"
  os "os"
  _System "System_"
)
var _ _dafny.Dummy__
var _ = os.Args
var _ _System.Dummy__

// Definition of class Default__
type Default__ struct {
  dummy byte
}

func New_Default___() *Default__ {
  _this := Default__{}

  return &_this
}

type CompanionStruct_Default___ struct {
}
var Companion_Default___ = CompanionStruct_Default___ {
}

func (_this *Default__) Equals(other *Default__) bool {
  return _this == other
}

func (_this *Default__) EqualsGeneric(x interface{}) bool {
  other, ok := x.(*Default__)
  return ok && _this.Equals(other)
}

func (*Default__) String() string {
  return "_module.Default__"
}
func (_this *Default__) ParentTraits_() []*_dafny.TraitID {
  return [](*_dafny.TraitID){};
}
var _ _dafny.TraitOffspring = &Default__{}
func (_static *CompanionStruct_Default___) Startswith(sub _dafny.Seq, s _dafny.Seq) bool {
  var t bool = false
  _ = t
  var _0_i _dafny.Int
  _ = _0_i
  _0_i = (sub).Cardinality()
  if ((((s).Cardinality()).Cmp(((sub).Cardinality())) >= 0) && (((s).Subseq(_dafny.NilInt, (_0_i))).Equals((sub)))) {
    t = true
    t = t
    return t
  }
  t = false
  t = t
  return t
  return t
}
func (_static *CompanionStruct_Default___) Main(__noArgsParameter _dafny.Seq) {
  var _1_s _dafny.Seq
  _ = _1_s
  _1_s = _dafny.SeqOfString("Hello Bach")
  var _2_sub1 _dafny.Seq
  _ = _2_sub1
  _2_sub1 = _dafny.SeqOfString("Hello")
  var _3_sub2 _dafny.Seq
  _ = _3_sub2
  _3_sub2 = _dafny.SeqOfString("uedfheu")
  var _4_t1 bool
  _ = _4_t1
  var _out0 bool
  _ = _out0
  _out0 = Companion_Default___.Startswith(_2_sub1, _1_s)
  _4_t1 = _out0
  var _5_t2 bool
  _ = _5_t2
  var _out1 bool
  _ = _out1
  _out1 = Companion_Default___.Startswith(_3_sub2, _1_s)
  _5_t2 = _out1
  _dafny.Print(_4_t1)
  _dafny.Print((_dafny.SeqOfString("\n")).SetString())
  _dafny.Print(_5_t2)
}
func (_static *CompanionStruct_Default___) Split1(s _dafny.Seq, t _dafny.Char) _dafny.Seq {
  var result _dafny.Seq = _dafny.EmptySeq
  _ = result
  var _6_i _dafny.Int
  _ = _6_i
  _6_i = _dafny.Zero
  var _7_j _dafny.Int
  _ = _7_j
  _7_j = _dafny.Zero
  var _8_sub _dafny.Seq
  _ = _8_sub
  _8_sub = _dafny.SeqOfString("")
  for (_7_j).Cmp(((s).Cardinality())) < 0 {
    if ((((s).Index((_7_j)).(_dafny.Char)) == (t)) || ((_7_j).Cmp((((s).Cardinality()).Minus((_dafny.One)))) == 0)) {
      _8_sub = (s).Subseq((_6_i), (_7_j))
      result = (result).Concat((_dafny.SeqOf(_8_sub)))
    }
    _7_j = (_7_j).Plus((_dafny.One))
    _6_i = _7_j
  }
  result = result
  return result
  return result
}
func (_static *CompanionStruct_Default___) Split2(scope _dafny.Seq) (_dafny.Seq, _dafny.Seq, bool) {
  var info1 _dafny.Seq = _dafny.EmptySeq.SetString()
  _ = info1
  var info2 _dafny.Seq = _dafny.EmptySeq.SetString()
  _ = info2
  var t bool = false
  _ = t
  var _9_i _dafny.Int
  _ = _9_i
  _9_i = _dafny.Zero
  var _10_iter _dafny.Int
  _ = _10_iter
  _10_iter = _dafny.Zero
  if ((!(scope).Contains((_dafny.Char(':')))) || (((scope).Cardinality()).Cmp((_dafny.One)) <= 0)) {
    t = false
    info1 = _dafny.SeqOfString("")
    info2 = _dafny.SeqOfString("")
    var _rhs0 = info1
    var _rhs1 = info2
    var _rhs2 = t
    info1 = _rhs0
    info2 = _rhs1
    t = _rhs2
    return info1, info2, t
  }
  for (_9_i).Cmp(((scope).Cardinality())) < 0 {
    if (((scope).Index((_9_i)).(_dafny.Char)) == (_dafny.Char(':'))) {
      _10_iter = _9_i
      goto L0
    }
    _9_i = (_9_i).Plus((_dafny.One))
    goto C0;
  C0:
  }
  goto L0;
L0:
  info1 = (scope).Subseq(_dafny.NilInt, (_10_iter))
  info2 = (scope).Subseq(((_10_iter).Plus((_dafny.One))), _dafny.NilInt)
  t = true
  var _rhs3 = info1
  var _rhs4 = info2
  var _rhs5 = t
  info1 = _rhs3
  info2 = _rhs4
  t = _rhs5
  return info1, info2, t
  return info1, info2, t
}
func (_static *CompanionStruct_Default___) Check__Scope(scope _dafny.Seq) (_dafny.Seq, _dafny.Seq, bool) {
  var authz _dafny.Seq = _dafny.EmptySeq.SetString()
  _ = authz
  var norm__path _dafny.Seq = _dafny.EmptySeq.SetString()
  _ = norm__path
  var t bool = false
  _ = t
  var _11_info1 _dafny.Seq
  _ = _11_info1
  _11_info1 = _dafny.SeqOfString("")
  var _12_info2 _dafny.Seq
  _ = _12_info2
  _12_info2 = _dafny.SeqOfString("")
  var _13_j bool
  _ = _13_j
  _13_j = true
  var _out2 _dafny.Seq
  _ = _out2
  var _out3 _dafny.Seq
  _ = _out3
  var _out4 bool
  _ = _out4
  _out2, _out3, _out4 = Companion_Default___.Split2(scope)
  _11_info1 = _out2
  _12_info2 = _out3
  _13_j = _out4
  if (((((_dafny.SetOf(_11_info1)).IsDisjointFrom((_dafny.SetOf(_dafny.SeqOfString("read"), _dafny.SeqOfString("write"))))) || (((_12_info2).Cardinality()).Cmp((_dafny.One)) < 0)) || (((_12_info2).Index((_dafny.Zero)).(_dafny.Char)) != (_dafny.Char('/'))/* dircomp */)) || ((_13_j) == (false))) {
    t = false
    authz = _dafny.SeqOfString("")
    norm__path = _dafny.SeqOfString("")
  } else {
    authz = _11_info1
    if (((_12_info2).Cardinality()).Cmp((_dafny.One)) == 0) {
      norm__path = _dafny.SeqOfString("/")
    } else {
      norm__path = _12_info2
    }
    t = true
  }
  var _rhs6 = authz
  var _rhs7 = norm__path
  var _rhs8 = t
  authz = _rhs6
  norm__path = _rhs7
  t = _rhs8
  return authz, norm__path, t
  return authz, norm__path, t
}
func (_static *CompanionStruct_Default___) Validate__Scope(value _dafny.Seq, test__access bool, norm__requested__path _dafny.Seq, token__scope _dafny.Seq) (bool, _dafny.Seq) {
  var t bool = false
  _ = t
  var result _dafny.Seq = _dafny.EmptySeq
  _ = result
  var _14_scope _dafny.Seq
  _ = _14_scope
  var _out5 _dafny.Seq
  _ = _out5
  _out5 = Companion_Default___.Split1(value, _dafny.Char(' '))
  _14_scope = _out5
  var _15_iter _dafny.Int
  _ = _15_iter
  _15_iter = _dafny.Zero
  var _16_i _dafny.Int
  _ = _16_i
  _16_i = _dafny.Zero
  var _17_info1 _dafny.Seq
  _ = _17_info1
  _17_info1 = _dafny.SeqOfString("")
  var _18_info2 _dafny.Seq
  _ = _18_info2
  _18_info2 = _dafny.SeqOfString("")
  var _19_authz _dafny.Seq
  _ = _19_authz
  _19_authz = _dafny.SeqOfString("")
  var _20_norm__path _dafny.Seq
  _ = _20_norm__path
  _20_norm__path = _dafny.SeqOfString("")
  var _21_j bool
  _ = _21_j
  _21_j = true
  var _22_k bool
  _ = _22_k
  _22_k = true
  if ((test__access) == (true)) {
    for (_15_iter).Cmp(((_14_scope).Cardinality())) < 0 {
      var _out6 _dafny.Seq
      _ = _out6
      var _out7 _dafny.Seq
      _ = _out7
      var _out8 bool
      _ = _out8
      _out6, _out7, _out8 = Companion_Default___.Check__Scope((_14_scope).Index((_15_iter)).(_dafny.Seq))
      _19_authz = _out6
      _20_norm__path = _out7
      _21_j = _out8
      if (((_21_j) == (false)) || ((_22_k) == (false))) {
        result = _dafny.SeqOf()
        t = false
        var _rhs9 = t
        var _rhs10 = result
        t = _rhs9
        result = _rhs10
        return t, result
      }
      _15_iter = (_15_iter).Plus((_dafny.One))
    }
    var _rhs11 = t
    var _rhs12 = result
    t = _rhs11
    result = _rhs12
    return t, result
  } else {
    result = token__scope
    for (_15_iter).Cmp(((_14_scope).Cardinality())) < 0 {
      var _out9 _dafny.Seq
      _ = _out9
      var _out10 _dafny.Seq
      _ = _out10
      var _out11 bool
      _ = _out11
      _out9, _out10, _out11 = Companion_Default___.Check__Scope((_14_scope).Index((_15_iter)).(_dafny.Seq))
      _19_authz = _out9
      _20_norm__path = _out10
      _21_j = _out11
      result = (result).Concat((_dafny.SeqOf(_dafny.SeqOf(_19_authz, _20_norm__path))))
      _15_iter = (_15_iter).Plus((_dafny.One))
    }
    t = true
    var _rhs13 = t
    var _rhs14 = result
    t = _rhs13
    result = _rhs14
    return t, result
  }
  return t, result
}
// End of class Default__
func main() {
  defer _dafny.CatchHalt()
  Companion_Default___.Main(_dafny.FromMainArguments(os.Args))
}
