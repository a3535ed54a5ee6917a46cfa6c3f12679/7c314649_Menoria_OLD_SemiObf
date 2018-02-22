package ca.diiza.j;

import ca.diiza.j.class_243;
import ca.diiza.j.class_244;
import ca.diiza.j.class_246;
import ca.diiza.j.class_3;
import ca.diiza.j.class_4;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.List;
import java.util.Map;

// $FF: renamed from: ca.diiza.j.h
public class class_247 {

   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_1359;


   // $FF: renamed from: <init> () void
   public void method_1395() {
      super();
   }

   // $FF: renamed from: a (java.io.Reader) java.lang.Object
   public static Object method_1396(Reader var0) {
      try {
         class_246 var10000 = new class_246;
         var10000.method_1376();
         class_246 var1 = var10000;
         return var1.method_1383(var0);
      } catch (Exception var2) {
         return null;
      }
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   public static Object method_1397(String var0) {
      StringReader var1 = new StringReader(var0);
      return method_1396(var1);
   }

   // $FF: renamed from: b (java.io.Reader) java.lang.Object
   public static Object method_1398(Reader var0) {
      class_246 var10000 = new class_246;
      var10000.method_1376();
      class_246 var1 = var10000;
      return var1.method_1383(var0);
   }

   // $FF: renamed from: b (java.lang.String) java.lang.Object
   public static Object method_1399(String var0) {
      class_246 var10000 = new class_246;
      var10000.method_1376();
      class_246 var1 = var10000;
      return var1.method_1381(var0);
   }

   // $FF: renamed from: a (java.lang.Object, java.io.Writer) void
   public static void method_1400(Object var0, Writer var1) {
      String var2 = class_244.method_1346();
      Object var10000 = var0;
      String[] var3;
      if(var2 == null) {
         if(var0 == null) {
            var3 = field_1359;
            var1.write("null");
            if(var2 == null) {
               return;
            }
         }

         var10000 = var0;
      }

      boolean var4 = var10000 instanceof String;
      if(var2 == null) {
         if(var4) {
            var1.write(34);
            var1.write(method_1402((String)var0));
            var1.write(34);
            if(var2 == null) {
               return;
            }
         }

         var4 = var0 instanceof Double;
      }

      if(var2 == null) {
         if(var4) {
            label113: {
               var4 = ((Double)var0).isInfinite();
               if(var2 == null) {
                  if(var4) {
                     break label113;
                  }

                  var4 = ((Double)var0).isNaN();
               }

               if(!var4) {
                  var1.write(var0.toString());
                  if(var2 == null) {
                     return;
                  }
               }
            }

            var3 = field_1359;
            var1.write("null");
            if(var2 == null) {
               return;
            }
         }

         var4 = var0 instanceof Float;
      }

      if(var2 == null) {
         if(!var4) {
            var4 = var0 instanceof Number;
            if(var2 == null) {
               if(var4) {
                  var1.write(var0.toString());
                  if(var2 == null) {
                     return;
                  }
               }

               var4 = var0 instanceof Boolean;
            }

            if(var2 == null) {
               if(var4) {
                  var1.write(var0.toString());
                  if(var2 == null) {
                     return;
                  }
               }

               var4 = var0 instanceof class_4;
            }

            if(var2 == null) {
               if(var4) {
                  ((class_4)var0).method_14(var1);
                  if(var2 == null) {
                     return;
                  }
               }

               var4 = var0 instanceof class_3;
            }

            if(var2 == null) {
               if(var4) {
                  var1.write(((class_3)var0).method_13());
                  if(var2 == null) {
                     return;
                  }
               }

               var4 = var0 instanceof Map;
            }

            label93: {
               label134: {
                  if(var2 == null) {
                     if(var4) {
                        class_244.method_1340((Map)var0, var1);
                        if(var2 == null) {
                           return;
                        }
                     }

                     var10000 = var0;
                     if(var2 != null) {
                        break label134;
                     }

                     var4 = var0 instanceof List;
                  }

                  if(!var4) {
                     break label93;
                  }

                  var10000 = var0;
               }

               class_243.method_1336((List)var10000, var1);
               if(var2 == null) {
                  return;
               }
            }

            var1.write(var0.toString());
            if(var2 == null) {
               return;
            }
         }

         var4 = ((Float)var0).isInfinite();
      }

      label63: {
         if(var2 == null) {
            if(var4) {
               break label63;
            }

            var4 = ((Float)var0).isNaN();
         }

         if(!var4) {
            var1.write(var0.toString());
            if(var2 == null) {
               return;
            }
         }
      }

      String[] var10001 = field_1359;
      var1.write("null");
   }

   // $FF: renamed from: a (java.lang.Object) java.lang.String
   public static String method_1401(Object var0) {
      String var1 = class_244.method_1346();
      Object var10000 = var0;
      String[] var2;
      String var3;
      if(var1 == null) {
         if(var0 == null) {
            var2 = field_1359;
            var3 = "null";
            return var3;
         }

         var10000 = var0;
      }

      boolean var5 = var10000 instanceof String;
      if(var1 == null) {
         if(var5) {
            var3 = "\"" + method_1402((String)var0) + "\"";
            return var3;
         }

         var5 = var0 instanceof Double;
      }

      if(var1 == null) {
         if(var5) {
            label167: {
               label108: {
                  var5 = ((Double)var0).isInfinite();
                  if(var1 == null) {
                     if(var5) {
                        break label108;
                     }

                     var10000 = (Double)var0;
                     if(var1 != null) {
                        break label167;
                     }

                     var5 = ((Double)var10000).isNaN();
                  }

                  if(!var5) {
                     var10000 = var0;
                     break label167;
                  }
               }

               var2 = field_1359;
               var3 = "null";
               return var3;
            }

            var3 = var10000.toString();
            return var3;
         }

         var5 = var0 instanceof Float;
      }

      if(var1 == null) {
         if(var5) {
            label169: {
               label91: {
                  var5 = ((Float)var0).isInfinite();
                  if(var1 == null) {
                     if(var5) {
                        break label91;
                     }

                     var10000 = (Float)var0;
                     if(var1 != null) {
                        break label169;
                     }

                     var5 = ((Float)var10000).isNaN();
                  }

                  if(!var5) {
                     var10000 = var0;
                     break label169;
                  }
               }

               String[] var4 = field_1359;
               var3 = "null";
               return var3;
            }

            var3 = var10000.toString();
            return var3;
         }

         var5 = var0 instanceof Number;
      }

      if(var1 == null) {
         if(var5) {
            var3 = var0.toString();
            return var3;
         }

         var5 = var0 instanceof Boolean;
      }

      if(var1 == null) {
         if(var5) {
            var3 = var0.toString();
            return var3;
         }

         var5 = var0 instanceof class_3;
      }

      if(var1 == null) {
         if(var5) {
            var3 = ((class_3)var0).method_13();
            return var3;
         }

         var5 = var0 instanceof Map;
      }

      label130: {
         if(var1 == null) {
            if(var5) {
               var3 = class_244.method_1341((Map)var0);
               return var3;
            }

            var10000 = var0;
            if(var1 != null) {
               break label130;
            }

            var5 = var0 instanceof List;
         }

         if(var5) {
            var3 = class_243.method_1337((List)var0);
            return var3;
         }

         var10000 = var0;
      }

      var3 = var10000.toString();
      return var3;
   }

   // $FF: renamed from: c (java.lang.String) java.lang.String
   public static String method_1402(String var0) {
      if(var0 == null) {
         return null;
      } else {
         StringBuffer var1 = new StringBuffer();
         method_1403(var0, var1);
         return var1.toString();
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.StringBuffer) void
   static void method_1403(String var0, StringBuffer var1) {
      String var10000 = class_244.method_1346();
      int var3 = 0;
      String var2 = var10000;

      while(var3 < var0.length()) {
         label96: {
            label104: {
               char var4 = var0.charAt(var3);
               char var8 = var4;
               if(var2 == null) {
                  String[] var7;
                  switch(var4) {
                  case 8:
                     var7 = field_1359;
                     var1.append("\\b");
                     if(var2 == null) {
                        break label104;
                     }
                  case 9:
                     var7 = field_1359;
                     var1.append("\\t");
                     if(var2 == null) {
                        break label104;
                     }
                  case 10:
                     var7 = field_1359;
                     var1.append("\\n");
                     if(var2 == null) {
                        break label104;
                     }
                  case 12:
                     var7 = field_1359;
                     var1.append("\\f");
                     if(var2 == null) {
                        break label104;
                     }
                  case 13:
                     var7 = field_1359;
                     var1.append("\\r");
                     if(var2 == null) {
                        break label104;
                     }
                  case 34:
                     var7 = field_1359;
                     var1.append("\\\"");
                     if(var2 == null) {
                        break label104;
                     }
                  case 92:
                     var7 = field_1359;
                     var1.append("\\\\");
                     if(var2 == null) {
                        break label104;
                     }
                  default:
                     var8 = var4;
                  }
               }

               label83: {
                  label105: {
                     if(var2 == null) {
                        if(var8 >= 0) {
                           var8 = var4;
                           if(var2 != null) {
                              break label83;
                           }

                           if(var4 <= 31) {
                              break label105;
                           }
                        }

                        var8 = var4;
                     }

                     short var10001 = 127;
                     if(var2 == null) {
                        if(var8 >= 127) {
                           var8 = var4;
                           if(var2 != null) {
                              break label83;
                           }

                           if(var4 <= 159) {
                              break label105;
                           }
                        }

                        var8 = var4;
                        var10001 = 8192;
                     }

                     label67: {
                        if(var2 == null) {
                           if(var8 < var10001) {
                              break label67;
                           }

                           var8 = var4;
                           if(var2 != null) {
                              break label83;
                           }

                           var10001 = 8447;
                        }

                        if(var8 <= var10001) {
                           break label105;
                        }
                     }

                     var1.append(var4);
                     if(var2 == null) {
                        break label104;
                     }
                  }

                  var8 = var4;
               }

               String var5 = Integer.toHexString(var8);
               String[] var9 = field_1359;
               var1.append("\\u");
               int var6 = 0;

               while(var6 < 4 - var5.length()) {
                  var1.append('0');
                  ++var6;
                  if(var2 != null) {
                     break label96;
                  }

                  if(var2 != null) {
                     break;
                  }
               }

               var1.append(var5.toUpperCase());
            }

            ++var3;
         }

         if(var2 != null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_1404() {
      // $FF: Couldn't be decompiled
   }
}
