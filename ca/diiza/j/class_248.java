package ca.diiza.j;

import ca.diiza.j.class_243;
import ca.diiza.j.class_244;
import ca.diiza.j.class_247;
import java.io.Writer;
import java.util.Iterator;
import java.util.Set;

// $FF: renamed from: ca.diiza.j.i
public class class_248 {

   // $FF: renamed from: a java.io.Writer
   private Writer field_1360;
   // $FF: renamed from: b int
   private int field_1361;
   // $FF: renamed from: c int
   private int field_1362;
   // $FF: renamed from: h java.lang.String
   private static final String field_1363 = ": ";


   // $FF: renamed from: <init> (java.io.Writer) void
   public void method_1405(Writer var1) {
      super();
      this.field_1360 = null;
      this.field_1361 = 2;
      this.field_1362 = 0;
      this.field_1360 = var1;
   }

   // $FF: renamed from: <init> (java.io.Writer, int) void
   public void method_1406(Writer var1, int var2) {
      super();
      this.field_1360 = null;
      this.field_1361 = 2;
      this.field_1362 = 0;
      this.field_1360 = var1;
      this.field_1361 = var2;
   }

   // $FF: renamed from: <init> (java.io.Writer, int, int) void
   public void method_1407(Writer var1, int var2, int var3) {
      super();
      this.field_1360 = null;
      this.field_1361 = 2;
      this.field_1362 = 0;
      this.field_1360 = var1;
      this.field_1361 = var2;
      this.field_1362 = var3;
   }

   // $FF: renamed from: a (java.lang.Object) void
   public void method_1408(Object var1) {
      label27: {
         String var2;
         Object var4;
         label30: {
            var2 = class_244.method_1346();
            boolean var10000 = var1 instanceof class_244;
            if(var2 == null) {
               if(var10000) {
                  class_244 var3 = (class_244)var1;
                  this.method_1410(var3);
                  if(var2 == null) {
                     return;
                  }
               }

               var4 = var1;
               if(var2 != null) {
                  break label30;
               }

               var10000 = var1 instanceof class_243;
            }

            if(!var10000) {
               break label27;
            }

            var4 = var1;
         }

         class_243 var5 = (class_243)var4;
         this.method_1409(var5);
         if(var2 == null) {
            return;
         }
      }

      this.field_1360.write(class_247.method_1401(var1));
   }

   // $FF: renamed from: a (ca.diiza.j.l) void
   private void method_1409(class_243 var1) {
      this.method_1411("[");
      this.method_1414();
      int var3 = var1.size();
      String var10000 = class_244.method_1346();
      int var4 = 0;
      String var2 = var10000;

      while(true) {
         if(var4 < var3) {
            Object var5 = var1.get(var4);
            this.method_1413();
            this.method_1408(var5);
            if(var2 != null) {
               break;
            }

            if(var2 == null) {
               if(var4 < var1.size() - 1) {
                  this.method_1412(",");
               }

               this.method_1411("");
               ++var4;
            }

            if(var2 == null) {
               continue;
            }
         }

         this.method_1415();
         this.method_1413();
         this.field_1360.write("]");
         break;
      }

   }

   // $FF: renamed from: a (ca.diiza.j.m) void
   private void method_1410(class_244 var1) {
      this.method_1411("{");
      this.method_1414();
      Set var3 = var1.keySet();
      String var10000 = class_244.method_1346();
      int var4 = var3.size();
      String var2 = var10000;
      int var5 = 0;
      Iterator var6 = var3.iterator();

      while(true) {
         if(var6.hasNext()) {
            label24: {
               String var7 = (String)var6.next();
               Object var8 = var1.get(var7);
               this.method_1413();
               this.field_1360.write(class_247.method_1401(var7));
               this.field_1360.write(": ");
               class_248 var9 = this;
               if(var2 == null) {
                  this.method_1408(var8);
                  ++var5;
                  if(var2 != null) {
                     break;
                  }

                  if(var5 < var4) {
                     this.method_1411(",");
                     if(var2 == null) {
                        break label24;
                     }
                  }

                  var9 = this;
               }

               var9.method_1411("");
            }

            if(var2 == null) {
               continue;
            }
         }

         this.method_1415();
         this.method_1413();
         this.field_1360.write("}");
         break;
      }

   }

   // $FF: renamed from: a (java.lang.String) void
   private void method_1411(String var1) {
      this.field_1360.write(var1);
      this.field_1360.write("\n");
   }

   // $FF: renamed from: b (java.lang.String) void
   private void method_1412(String var1) {
      this.field_1360.write(var1);
   }

   // $FF: renamed from: a () void
   private void method_1413() {
      String var10000 = class_244.method_1346();
      int var2 = 0;
      String var1 = var10000;

      while(var2 < this.field_1362) {
         this.field_1360.write(32);
         ++var2;
         if(var1 != null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () void
   private void method_1414() {
      this.field_1362 += this.field_1361;
   }

   // $FF: renamed from: c () void
   private void method_1415() {
      this.field_1362 -= this.field_1361;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1416() {
      boolean var10000 = true;
      char[] var10003 = "Y/".toCharArray();
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
            field_1363 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 3;
            break;
         case 1:
            var10009 = 111;
            break;
         case 2:
            var10009 = 153;
            break;
         case 3:
            var10009 = 113;
            break;
         case 4:
            var10009 = 183;
            break;
         case 5:
            var10009 = 219;
            break;
         default:
            var10009 = 254;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
