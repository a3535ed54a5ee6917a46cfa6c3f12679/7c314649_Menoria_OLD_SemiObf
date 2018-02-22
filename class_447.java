import java.util.List;

// $FF: renamed from: ez
public class class_447 extends class_446 {

   // $FF: renamed from: N java.lang.String[][]
   private static final String[][] field_2189;
   // $FF: renamed from: O java.lang.String[]
   public static final String[] field_2190;
   // $FF: renamed from: P java.lang.String[]
   public static final String[] field_2191;
   // $FF: renamed from: Q vL[]
   private class_73[] field_2192;
   // $FF: renamed from: R int
   private int field_2193;


   // $FF: renamed from: <init> (int) void
   protected void method_2773(int var1) {
      super.method_2427(awt.field_4180);
      this.field_2193 = var1;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2;
      if(var3 != null) {
         if(var2 < this.field_2192.length) {
            return this.field_2192[var2];
         }

         var10000 = 0;
      }

      var2 = var10000;
      return this.field_2192[var2];
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2192 = new class_73[field_2189[this.field_2193].length];
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < this.field_2192.length) {
         this.field_2192[var3] = var1.method_375(field_2189[this.field_2193][var3]);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return var1;
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < this.field_2192.length) {
         add var10001 = new add;
         var10001.method_3726(var1, 1, var5);
         var3.add(var10001);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (java.lang.String) ez
   public static class_447 method_2774(String var0) {
      String[] var2 = field_2191;
      String[] var10000 = class_752.method_4253();
      int var3 = var2.length;
      String[] var1 = var10000;
      int var4 = 0;

      String var5;
      byte var6;
      while(true) {
         if(var4 < var3) {
            var5 = var2[var4];
            if(var1 != null) {
               var6 = var5.equals(var0);
               if(var1 == null) {
                  break;
               }

               if(var6 != 0) {
                  return class_1192.field_6064;
               }

               ++var4;
            }

            if(var1 != null) {
               continue;
            }
         }

         var2 = field_2190;
         var3 = var2.length;
         var6 = 0;
         break;
      }

      var4 = var6;

      while(var4 < var3) {
         var5 = var2[var4];
         if(var1 != null) {
            if(var5.equals(var0)) {
               return class_1192.field_6065;
            }

            ++var4;
         }

         if(var1 == null) {
            break;
         }
      }

      return null;
   }

   // $FF: renamed from: e (java.lang.String) int
   public static int method_2775(String var0) {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      int var3;
      while(true) {
         if(var2 < field_2191.length) {
            label58: {
               var3 = field_2191[var2].equals(var0);
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  if(var3 == 0) {
                     ++var2;
                     if(var1 != null) {
                        continue;
                     }
                     break label58;
                  }

                  var3 = var2;
               }

               return var3;
            }
         }

         var3 = 0;
         break;
      }

      var2 = var3;

      while(true) {
         if(var2 < field_2190.length) {
            label56: {
               var3 = field_2190[var2].equals(var0);
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  if(var3 == 0) {
                     ++var2;
                     if(var1 != null) {
                        continue;
                     }
                     break label56;
                  }

                  var3 = var2;
               }

               return var3;
            }
         }

         var3 = 0;
         break;
      }

      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
