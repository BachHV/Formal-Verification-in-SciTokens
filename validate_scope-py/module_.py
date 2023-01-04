import sys
from typing import Callable, Any, TypeVar, NamedTuple
from math import floor
from itertools import count

import module_
import _dafny
import System_

assert "module_" == __name__
module_ = sys.modules[__name__]

class default__:
    def  __init__(self):
        pass

    def __dafnystr__(self) -> str:
        return "_module._default"
    @staticmethod
    def startswith(sub, s):
        t: bool = False
        d_0_i_: int
        d_0_i_ = len(sub)
        if ((len(s)) >= (len(sub))) and ((_dafny.Seq((s)[:d_0_i_:])) == (sub)):
            t = True
            t = t
            return t
        t = False
        t = t
        return t
        return t

    @staticmethod
    def Main(noArgsParameter__):
        d_1_s_: _dafny.Seq
        d_1_s_ = _dafny.Seq("Hello Bach")
        d_2_sub1_: _dafny.Seq
        d_2_sub1_ = _dafny.Seq("Hello")
        d_3_sub2_: _dafny.Seq
        d_3_sub2_ = _dafny.Seq("uedfheu")
        d_4_t1_: bool
        out0_: bool
        out0_ = module_.default__.startswith(d_2_sub1_, d_1_s_)
        d_4_t1_ = out0_
        d_5_t2_: bool
        out1_: bool
        out1_ = module_.default__.startswith(d_3_sub2_, d_1_s_)
        d_5_t2_ = out1_
        _dafny.print(d_4_t1_)
        _dafny.print(_dafny.Seq("\n"))
        _dafny.print(d_5_t2_)

    @staticmethod
    def split1(s, t):
        result: _dafny.Seq = _dafny.Seq({})
        d_6_i_: int
        d_6_i_ = 0
        d_7_j_: int
        d_7_j_ = 0
        d_8_sub_: _dafny.Seq
        d_8_sub_ = _dafny.Seq("")
        while (d_7_j_) < (len(s)):
            if (((s)[d_7_j_]) == (t)) or ((d_7_j_) == ((len(s)) - (1))):
                d_8_sub_ = _dafny.Seq((s)[d_6_i_:d_7_j_:])
                result = (result) + (_dafny.Seq([d_8_sub_]))
            d_7_j_ = (d_7_j_) + (1)
            d_6_i_ = d_7_j_
        result = result
        return result
        return result

    @staticmethod
    def split2(scope):
        info1: _dafny.Seq = _dafny.Seq({})
        info2: _dafny.Seq = _dafny.Seq({})
        t: bool = False
        d_9_i_: int
        d_9_i_ = 0
        d_10_iter_: int
        d_10_iter_ = 0
        if ((':') not in (scope)) or ((len(scope)) <= (1)):
            t = False
            info1 = _dafny.Seq("")
            info2 = _dafny.Seq("")
            rhs0_: _dafny.Seq = info1
            rhs1_: _dafny.Seq = info2
            rhs2_: bool = t
            info1 = rhs0_
            info2 = rhs1_
            t = rhs2_
            return info1, info2, t
        with _dafny.label("0"):
            while (d_9_i_) < (len(scope)):
                with _dafny.c_label("0"):
                    if ((scope)[d_9_i_]) == (':'):
                        d_10_iter_ = d_9_i_
                        raise _dafny.Break("0")
                    d_9_i_ = (d_9_i_) + (1)
                    pass
            pass
        info1 = _dafny.Seq((scope)[:d_10_iter_:])
        info2 = _dafny.Seq((scope)[(d_10_iter_) + (1)::])
        t = True
        rhs3_: _dafny.Seq = info1
        rhs4_: _dafny.Seq = info2
        rhs5_: bool = t
        info1 = rhs3_
        info2 = rhs4_
        t = rhs5_
        return info1, info2, t
        return info1, info2, t

    @staticmethod
    def Check__Scope(scope):
        authz: _dafny.Seq = _dafny.Seq({})
        norm__path: _dafny.Seq = _dafny.Seq({})
        t: bool = False
        d_11_info1_: _dafny.Seq
        d_11_info1_ = _dafny.Seq("")
        d_12_info2_: _dafny.Seq
        d_12_info2_ = _dafny.Seq("")
        d_13_j_: bool
        d_13_j_ = True
        out2_: _dafny.Seq
        out3_: _dafny.Seq
        out4_: bool
        out2_, out3_, out4_ = module_.default__.split2(scope)
        d_11_info1_ = out2_
        d_12_info2_ = out3_
        d_13_j_ = out4_
        if ((((_dafny.Set({d_11_info1_})).isdisjoint((_dafny.Set({_dafny.Seq("read"), _dafny.Seq("write")})))) or ((len(d_12_info2_)) < (1))) or (((d_12_info2_)[0]) != ('/'))) or ((d_13_j_) == (False)):
            t = False
            authz = _dafny.Seq("")
            norm__path = _dafny.Seq("")
        elif True:
            authz = d_11_info1_
            if (len(d_12_info2_)) == (1):
                norm__path = _dafny.Seq("/")
            elif True:
                norm__path = d_12_info2_
            t = True
        rhs6_: _dafny.Seq = authz
        rhs7_: _dafny.Seq = norm__path
        rhs8_: bool = t
        authz = rhs6_
        norm__path = rhs7_
        t = rhs8_
        return authz, norm__path, t
        return authz, norm__path, t

    @staticmethod
    def Validate__Scope(value, test__access, norm__requested__path, token__scope):
        t: bool = False
        result: _dafny.Seq = _dafny.Seq({})
        d_14_scope_: _dafny.Seq
        out5_: _dafny.Seq
        out5_ = module_.default__.split1(value, ' ')
        d_14_scope_ = out5_
        d_15_iter_: int
        d_15_iter_ = 0
        d_16_i_: int
        d_16_i_ = 0
        d_17_info1_: _dafny.Seq
        d_17_info1_ = _dafny.Seq("")
        d_18_info2_: _dafny.Seq
        d_18_info2_ = _dafny.Seq("")
        d_19_authz_: _dafny.Seq
        d_19_authz_ = _dafny.Seq("")
        d_20_norm__path_: _dafny.Seq
        d_20_norm__path_ = _dafny.Seq("")
        d_21_j_: bool
        d_21_j_ = True
        d_22_k_: bool
        d_22_k_ = True
        if (test__access) == (True):
            while (d_15_iter_) < (len(d_14_scope_)):
                out6_: _dafny.Seq
                out7_: _dafny.Seq
                out8_: bool
                out6_, out7_, out8_ = module_.default__.Check__Scope((d_14_scope_)[d_15_iter_])
                d_19_authz_ = out6_
                d_20_norm__path_ = out7_
                d_21_j_ = out8_
                out9_: bool
                out9_ = module_.default__.startswith(d_20_norm__path_, norm__requested__path)
                d_22_k_ = out9_
                if ((d_21_j_) == (False)) or ((d_22_k_) == (False)):
                    result = _dafny.Seq([])
                    t = False
                    rhs9_: bool = t
                    rhs10_: _dafny.Seq = result
                    t = rhs9_
                    result = rhs10_
                    return t, result
                d_15_iter_ = (d_15_iter_) + (1)
            rhs11_: bool = t
            rhs12_: _dafny.Seq = result
            t = rhs11_
            result = rhs12_
            return t, result
        elif True:
            result = token__scope
            while (d_15_iter_) < (len(d_14_scope_)):
                out10_: _dafny.Seq
                out11_: _dafny.Seq
                out12_: bool
                out10_, out11_, out12_ = module_.default__.Check__Scope((d_14_scope_)[d_15_iter_])
                d_19_authz_ = out10_
                d_20_norm__path_ = out11_
                d_21_j_ = out12_
                result = (result) + (_dafny.Seq([_dafny.Seq([d_19_authz_, d_20_norm__path_])]))
                d_15_iter_ = (d_15_iter_) + (1)
            t = True
            rhs13_: bool = t
            rhs14_: _dafny.Seq = result
            t = rhs13_
            result = rhs14_
            return t, result
        return t, result

