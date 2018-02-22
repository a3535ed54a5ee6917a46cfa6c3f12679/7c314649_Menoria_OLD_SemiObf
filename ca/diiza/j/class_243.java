package ca.diiza.j;

import ca.diiza.j.class_244;
import ca.diiza.j.class_247;
import ca.diiza.j.class_3;
import ca.diiza.j.class_4;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: ca.diiza.j.l
public class class_243 extends ArrayList implements List, class_3, class_4 {

   private static final long serialVersionUID = 3957988303675231981L;
   // $FF: renamed from: h java.lang.String
   private static final String field_1338 = "null";


   // $FF: renamed from: <init> () void
   public void method_1335() {
      super();
   }

   // $FF: renamed from: a (java.util.List, java.io.Writer) void
   public static void method_1336(List var0, Writer var1) {
      String var2;
      label54: {
         var2 = class_244.method_1346();
         if(var2 == null) {
            if(var0 != null) {
               break label54;
            }

            var1.write("null");
         }

         if(var2 == null) {
            return;
         }
      }

      boolean var3 = true;
      Iterator var4 = var0.iterator();
      var1.write(91);

      while(true) {
         if(var4.hasNext()) {
            if(var2 != null) {
               break;
            }

            label41: {
               label40: {
                  boolean var10000 = var3;
                  if(var2 == null) {
                     if(!var3) {
                        break label40;
                     }

                     var10000 = false;
                  }

                  var3 = var10000;
                  if(var2 == null) {
                     break label41;
                  }
               }

               var1.write(44);
            }

            label32: {
               Object var5 = var4.next();
               Object var6 = var5;
               if(var2 == null) {
                  if(var5 == null) {
                     var1.write("null");
                     if(var2 == null) {
                        break label32;
                     }
                  }

                  var6 = var5;
               }

               class_247.method_1400(var6, var1);
            }

            if(var2 == null) {
               continue;
            }
         }

         var1.write(93);
         break;
      }

   }

   // $FF: renamed from: a (java.io.Writer) void
   public void method_14(Writer var1) {
      method_1336(this, var1);
   }

   // $FF: renamed from: a (java.util.List) java.lang.String
   public static String method_1337(List var0) {
      String var1 = class_244.method_1346();
      if(var0 == null) {
         return "null";
      } else {
         boolean var2 = true;
         StringBuffer var3 = new StringBuffer();
         Iterator var4 = var0.iterator();
         var3.append('[');

         while(true) {
            if(var4.hasNext()) {
               if(var1 != null) {
                  break;
               }

               label43: {
                  label42: {
                     boolean var10000 = var2;
                     if(var1 == null) {
                        if(!var2) {
                           break label42;
                        }

                        var10000 = false;
                     }

                     var2 = var10000;
                     if(var1 == null) {
                        break label43;
                     }
                  }

                  var3.append(',');
               }

               label34: {
                  Object var5;
                  label33: {
                     var5 = var4.next();
                     if(var1 == null) {
                        if(var5 != null) {
                           break label33;
                        }

                        var3.append("null");
                     }

                     if(var1 == null) {
                        break label34;
                     }
                  }

                  var3.append(class_247.method_1401(var5));
               }

               if(var1 == null) {
                  continue;
               }
            }

            var3.append(']');
            break;
         }

         return var3.toString();
      }
   }

   // $FF: renamed from: a () java.lang.String
   public String method_13() {
      return method_1337(this);
   }

   public String toString() {
      return this.method_13();
   }

   // $FF: renamed from: <clinit> () void
   static void method_1338() {
      boolean var10000 = true;
      char[] var10003 = "Ëhm".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_1338 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 116;
            break;
         case 1:
            var10009 = 167;
            break;
         case 2:
            var10009 = 213;
            break;
         case 3:
            var10009 = 208;
            break;
         case 4:
            var10009 = 195;
            break;
         case 5:
            var10009 = 120;
            break;
         default:
            var10009 = 47;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
