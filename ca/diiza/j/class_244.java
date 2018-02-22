package ca.diiza.j;

import ca.diiza.j.class_247;
import ca.diiza.j.class_3;
import ca.diiza.j.class_4;
import java.io.Writer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

// $FF: renamed from: ca.diiza.j.m
public class class_244 extends LinkedHashMap implements Map, class_3, class_4 {

   private static final long serialVersionUID = -503443796854799292L;
   // $FF: renamed from: a java.lang.String
   private static String field_1339;
   // $FF: renamed from: h java.lang.String
   private static final String field_1340;


   // $FF: renamed from: <init> () void
   public void method_1339() {
      super();
   }

   // $FF: renamed from: a (java.util.Map, java.io.Writer) void
   public static void method_1340(Map var0, Writer var1) {
      String var2;
      label42: {
         var2 = method_1346();
         if(var2 == null) {
            if(var0 != null) {
               break label42;
            }

            var1.write(field_1340);
         }

         if(var2 == null) {
            return;
         }
      }

      boolean var3 = true;
      Iterator var4 = var0.entrySet().iterator();
      var1.write(123);

      while(true) {
         if(var4.hasNext()) {
            if(var2 != null) {
               break;
            }

            label29: {
               label28: {
                  boolean var10000 = var3;
                  if(var2 == null) {
                     if(!var3) {
                        break label28;
                     }

                     var10000 = false;
                  }

                  var3 = var10000;
                  if(var2 == null) {
                     break label29;
                  }
               }

               var1.write(44);
            }

            Entry var5 = (Entry)var4.next();
            var1.write(34);
            var1.write(method_1344(String.valueOf(var5.getKey())));
            var1.write(34);
            var1.write(58);
            class_247.method_1400(var5.getValue(), var1);
            if(var2 == null) {
               continue;
            }
         }

         var1.write(125);
         break;
      }

   }

   // $FF: renamed from: a (java.io.Writer) void
   public void method_14(Writer var1) {
      method_1340(this, var1);
   }

   // $FF: renamed from: a (java.util.Map) java.lang.String
   public static String method_1341(Map var0) {
      String var1 = method_1346();
      if(var0 == null) {
         return field_1340;
      } else {
         StringBuffer var2 = new StringBuffer();
         boolean var3 = true;
         Iterator var4 = var0.entrySet().iterator();
         var2.append('{');

         while(true) {
            if(var4.hasNext()) {
               if(var1 != null) {
                  break;
               }

               label29: {
                  label28: {
                     boolean var10000 = var3;
                     if(var1 == null) {
                        if(!var3) {
                           break label28;
                        }

                        var10000 = false;
                     }

                     var3 = var10000;
                     if(var1 == null) {
                        break label29;
                     }
                  }

                  var2.append(',');
               }

               Entry var5 = (Entry)var4.next();
               method_1342(String.valueOf(var5.getKey()), var5.getValue(), var2);
               if(var1 == null) {
                  continue;
               }
            }

            var2.append('}');
            break;
         }

         return var2.toString();
      }
   }

   // $FF: renamed from: a () java.lang.String
   public String method_13() {
      return method_1341(this);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.Object, java.lang.StringBuffer) java.lang.String
   private static String method_1342(String var0, Object var1, StringBuffer var2) {
      label15: {
         var2.append('\"');
         String var3 = method_1346();
         String var10000 = var0;
         if(var3 == null) {
            if(var0 == null) {
               var2.append(field_1340);
               if(var3 == null) {
                  break label15;
               }
            }

            var10000 = var0;
         }

         class_247.method_1403(var10000, var2);
      }

      var2.append('\"').append(':');
      var2.append(class_247.method_1401(var1));
      return var2.toString();
   }

   public String toString() {
      return this.method_13();
   }

   // $FF: renamed from: a (java.lang.String, java.lang.Object) java.lang.String
   public static String method_1343(String var0, Object var1) {
      StringBuffer var2 = new StringBuffer();
      method_1342(var0, var1, var2);
      return var2.toString();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public static String method_1344(String var0) {
      return class_247.method_1402(var0);
   }

   // $FF: renamed from: b (java.lang.String) void
   public static void method_1345(String var0) {
      field_1339 = var0;
   }

   // $FF: renamed from: b () java.lang.String
   public static String method_1346() {
      return field_1339;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1347() {
      method_1345((String)null);
      boolean var10000 = true;
      char[] var10003 = "F¨¶".toCharArray();
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
            field_1340 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 63;
            break;
         case 1:
            var10009 = 235;
            break;
         case 2:
            var10009 = 211;
            break;
         case 3:
            var10009 = 205;
            break;
         case 4:
            var10009 = 65;
            break;
         case 5:
            var10009 = 52;
            break;
         default:
            var10009 = 172;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
