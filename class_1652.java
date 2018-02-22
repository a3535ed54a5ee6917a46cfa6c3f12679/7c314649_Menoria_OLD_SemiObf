import java.util.Random;

// $FF: renamed from: vD
public class class_1652 extends class_1650 {

   // $FF: renamed from: a add
   private add field_8601;
   // $FF: renamed from: d int
   private int field_8602;
   // $FF: renamed from: e int
   private int field_8603;


   // $FF: renamed from: <init> (adb, int, int, int, int) void
   public void method_9094(adb var1, int var2, int var3, int var4, int var5) {
      super.method_9088(var5);
      add var10001 = new add;
      var10001.method_3726(var1, 1, var2);
      this.field_8601 = var10001;
      this.field_8602 = var3;
      this.field_8603 = var4;
   }

   // $FF: renamed from: <init> (add, int, int, int) void
   public void method_9095(add var1, int var2, int var3, int var4) {
      super.method_9088(var4);
      this.field_8601 = var1;
      this.field_8602 = var2;
      this.field_8603 = var3;
   }

   // $FF: renamed from: b (java.util.Random, vD[], vI, int) void
   public static void method_9096(Random var0, class_1652[] var1, class_22 var2, int var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < var3) {
         label35: {
            label43: {
               class_1652 var6 = (class_1652)class_1725.method_9641(var0, var1);
               int var7 = var6.field_8602 + var0.nextInt(var6.field_8603 - var6.field_8602 + 1);
               int var10 = var6.field_8601.method_3739();
               if(var4 != null) {
                  if(var10 >= var7) {
                     add var8 = var6.field_8601.method_3754();
                     var8.field_2958 = var7;
                     var2.method_87(var0.nextInt(var2.method_83()), var8);
                     if(var4 != null) {
                        break label43;
                     }
                  }

                  var10 = 0;
               }

               int var11 = var10;

               while(var11 < var7) {
                  add var9 = var6.field_8601.method_3754();
                  var9.field_2958 = 1;
                  var2.method_87(var0.nextInt(var2.method_83()), var9);
                  ++var11;
                  if(var4 == null) {
                     break label35;
                  }

                  if(var4 == null) {
                     break;
                  }
               }
            }

            ++var5;
         }

         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (java.util.Random, vD[], gq, int) void
   public static void method_9097(Random var0, class_1652[] var1, class_589 var2, int var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < var3) {
         label35: {
            label43: {
               class_1652 var6 = (class_1652)class_1725.method_9641(var0, var1);
               int var7 = var6.field_8602 + var0.nextInt(var6.field_8603 - var6.field_8602 + 1);
               int var10 = var6.field_8601.method_3739();
               if(var4 != null) {
                  if(var10 >= var7) {
                     add var8 = var6.field_8601.method_3754();
                     var8.field_2958 = var7;
                     var2.method_87(var0.nextInt(var2.method_83()), var8);
                     if(var4 != null) {
                        break label43;
                     }
                  }

                  var10 = 0;
               }

               int var11 = var10;

               while(var11 < var7) {
                  add var9 = var6.field_8601.method_3754();
                  var9.field_2958 = 1;
                  var2.method_87(var0.nextInt(var2.method_83()), var9);
                  ++var11;
                  if(var4 == null) {
                     break label35;
                  }

                  if(var4 == null) {
                     break;
                  }
               }
            }

            ++var5;
         }

         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (vD[], vD[]) vD[]
   public static class_1652[] method_9098(class_1652[] var0, class_1652 ... var1) {
      String[] var10000 = class_752.method_4253();
      class_1652[] var3 = new class_1652[var0.length + var1.length];
      String[] var2 = var10000;
      int var4 = 0;
      int var5 = 0;

      class_1652[] var9;
      while(true) {
         if(var5 < var0.length) {
            var9 = var3;
            if(var2 == null) {
               break;
            }

            var3[var4++] = var0[var5];
            ++var5;
            if(var2 != null) {
               continue;
            }
         }

         var9 = var1;
         break;
      }

      class_1652[] var10 = var9;
      int var6 = var10.length;
      int var7 = 0;

      while(true) {
         if(var7 < var6) {
            class_1652 var8 = var10[var7];
            var9 = var3;
            if(var2 == null) {
               break;
            }

            var3[var4++] = var8;
            ++var7;
            if(var2 != null) {
               continue;
            }
         }

         var9 = var3;
         break;
      }

      return var9;
   }
}
