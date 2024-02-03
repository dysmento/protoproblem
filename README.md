# protoproblem

This is the smallest project I could make to reproduce a problem I'm having with protojure.

```
> clj -M -m protoproblem.protoproblem
Reflection warning, protojure/grpc/codec/lpm.clj:184:5 - reference to field close can't be resolved.
Syntax error (VerifyError) compiling . at (protojure/internal/grpc/client/providers/http2/jetty.clj:78:29).
Instruction type does not match stack map
Exception Details:
  Location:
    org/eclipse/jetty/http/HttpField.getValueParameters(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String; @50: aload_3
  Reason:
    Type 'org/eclipse/jetty/util/QuotedStringTokenizer' (current frame, locals[3]) is not assignable to 'java/util/StringTokenizer' (stack map, locals[3])
  Current Frame:
    bci: @50
    flags: { }
    locals: { 'java/lang/String', 'java/util/Map', integer, 'org/eclipse/jetty/util/QuotedStringTokenizer' }
    stack: { }
  Stackmap Frame:
    bci: @50
    flags: { }
    locals: { 'java/lang/String', 'java/util/Map', integer, 'java/util/StringTokenizer' }
    stack: { }
  Bytecode:
    0000000: 2ac7 0005 01b0 2a10 3bb6 0038 3d1c 9c00
    0000010: 052a b02b c700 0d2a 031c b600 3cb6 0040
    0000020: b0bb 0043 592a 1cb6 0045 1248 0304 b700
    0000030: 4a4e 2db6 004d 9900 452d b600 533a 04bb
    0000040: 0043 5919 0412 56b7 0058 3a05 1905 b600
    0000050: 4d99 0027 1905 b600 533a 0601 3a07 1905
    0000060: b600 4d99 000a 1905 b600 533a 072b 1906
    0000070: 1907 b900 5b03 0057 a7ff ba2a 031c b600
    0000080: 3cb6 0040 b0                           
  Stackmap Table:
    same_frame(@6)
    append_frame(@19,Integer)
    same_frame(@33)
    append_frame(@50,Object[#78])
    full_frame(@109,{Object[#35],Object[#92],Integer,Object[#78],Object[#35],Object[#78],Object[#35],Object[#35]},{})
    full_frame(@120,{Object[#35],Object[#92],Integer,Object[#78]},{})
    same_frame(@123)


Full report at:
/var/folders/m9/b1fc0dr51cvbsfdkfx6ggd0h0000gs/T/clojure-7419998866754083199.edn
```