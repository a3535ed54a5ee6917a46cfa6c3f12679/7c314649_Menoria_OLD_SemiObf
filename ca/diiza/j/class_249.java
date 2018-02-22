package ca.diiza.j;

import ca.diiza.j.class_244;

// $FF: renamed from: ca.diiza.j.a
public class class_249 extends Exception {

   private static final long serialVersionUID = -7880698968187728548L;
   // $FF: renamed from: a int
   public static final int field_1364 = 0;
   // $FF: renamed from: b int
   public static final int field_1365 = 1;
   // $FF: renamed from: c int
   public static final int field_1366 = 2;
   // $FF: renamed from: d int
   private int field_1367;
   // $FF: renamed from: e java.lang.Object
   private Object field_1368;
   // $FF: renamed from: f int
   private int field_1369;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_1370;


   // $FF: renamed from: <init> (int) void
   public void method_1417(int var1) {
      this.method_1419(-1, var1, (Object)null);
   }

   // $FF: renamed from: <init> (int, java.lang.Object) void
   public void method_1418(int var1, Object var2) {
      this.method_1419(-1, var1, var2);
   }

   // $FF: renamed from: <init> (int, int, java.lang.Object) void
   public void method_1419(int var1, int var2, Object var3) {
      super();
      this.field_1369 = var1;
      this.field_1367 = var2;
      this.field_1368 = var3;
   }

   // $FF: renamed from: a () int
   public int method_1420() {
      return this.field_1367;
   }

   // $FF: renamed from: a (int) void
   public void method_1421(int var1) {
      this.field_1367 = var1;
   }

   // $FF: renamed from: b () int
   public int method_1422() {
      return this.field_1369;
   }

   // $FF: renamed from: b (int) void
   public void method_1423(int var1) {
      this.field_1369 = var1;
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_1424() {
      return this.field_1368;
   }

   // $FF: renamed from: a (java.lang.Object) void
   public void method_1425(Object var1) {
      this.field_1368 = var1;
   }

   public String toString() {
      StringBuffer var2;
      label29: {
         String var1;
         String[] var3;
         label28: {
            label27: {
               String var10000 = class_244.method_1346();
               var2 = new StringBuffer();
               var1 = var10000;
               if(var1 == null) {
                  switch(this.field_1367) {
                  case 0:
                     var3 = field_1370;
                     var2.append("Unexpected character (").append(this.field_1368).append(") at position ").append(this.field_1369).append(".");
                     break;
                  case 1:
                     break label27;
                  case 2:
                     break label28;
                  default:
                     break label29;
                  }
               }

               if(var1 == null) {
                  return var2.toString();
               }
            }

            var3 = field_1370;
            var2.append("Unexpected token ").append(this.field_1368).append(" at position ").append(this.field_1369).append(".");
            if(var1 == null) {
               return var2.toString();
            }
         }

         var3 = field_1370;
         var2.append("Unexpected exception at position ").append(this.field_1369).append(": ").append(this.field_1368);
         if(var1 == null) {
            return var2.toString();
         }
      }

      String[] var10001 = field_1370;
      var2.append("Unkown error at position ").append(this.field_1369).append(".");
      return var2.toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_1426() {
      // $FF: Couldn't be decompiled
   }
}
