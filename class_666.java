
// $FF: renamed from: Af
public class class_666 implements class_22 {

   // $FF: renamed from: b add[]
   public add[] field_2844;
   // $FF: renamed from: c add[]
   public add[] field_2845;
   // $FF: renamed from: d int
   public int field_2846;
   // $FF: renamed from: e add
   private add field_2847;
   // $FF: renamed from: f yz
   public class_792 field_2848;
   // $FF: renamed from: h add
   private add field_2849;
   // $FF: renamed from: i boolean
   public boolean field_2850;
   // $FF: renamed from: j java.lang.String
   private static final String field_2851;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_2852;


   // $FF: renamed from: <init> (yz) void
   public void method_3592(class_792 var1) {
      super();
      this.field_2844 = new add[36];
      this.field_2845 = new add[4];
      this.field_2848 = var1;
   }

   // $FF: renamed from: a () add
   public add method_3593() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () int
   public static int method_3594() {
      return 9;
   }

   // $FF: renamed from: a (adb) int
   private int method_3595(adb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (adb, int) int
   private int method_3596(adb param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (add) int
   private int method_3597(add param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () int
   public int method_3598() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      while(var2 < this.field_2844.length) {
         try {
            if(this.field_2844[var2] == null) {
               return var2;
            }
         } catch (class_643 var3) {
            throw method_3620(var3);
         }

         ++var2;
         if(var1 == null) {
            break;
         }
      }

      return -1;
   }

   // $FF: renamed from: b (adb, int, boolean, boolean) void
   public void method_3599(adb param1, int param2, boolean param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int) void
   public void method_3600(int var1) {
      String[] var2 = class_752.method_4253();

      int var10000;
      label61: {
         label60: {
            try {
               var10000 = var1;
               if(var2 == null) {
                  break label61;
               }

               if(var1 <= 0) {
                  break label60;
               }
            } catch (class_643 var5) {
               throw method_3620(var5);
            }

            var1 = 1;
         }

         var10000 = var1;
      }

      label52: {
         label51: {
            try {
               if(var2 == null) {
                  break label51;
               }

               if(var10000 >= 0) {
                  break label52;
               }
            } catch (class_643 var4) {
               throw method_3620(var4);
            }

            var10000 = -1;
         }

         var1 = var10000;
      }

      this.field_2846 -= var1;

      while(true) {
         if(this.field_2846 < 0) {
            try {
               this.field_2846 += 9;
               if(var2 == null) {
                  return;
               }

               if(var2 != null) {
                  continue;
               }
            } catch (class_643 var3) {
               throw method_3620(var3);
            }
         }

         do {
            if(this.field_2846 < 9) {
               return;
            }

            this.field_2846 -= 9;
         } while(var2 != null);

         return;
      }
   }

   // $FF: renamed from: b (adb, int) int
   public int method_3601(adb param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (adb, int) void
   public void method_3602(adb param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (add) int
   private int method_3603(add param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () void
   public void method_3604() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (adb) boolean
   public boolean method_3605(adb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (adb) boolean
   public boolean method_3606(adb var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = this.method_3595(var1);
      String[] var2 = var10000;

      int var5;
      label32: {
         try {
            var5 = var3;
            if(var2 == null) {
               return (boolean)var5;
            }

            if(var3 >= 0) {
               break label32;
            }
         } catch (class_643 var4) {
            throw method_3620(var4);
         }

         var5 = 0;
         return (boolean)var5;
      }

      var5 = 1;
      return (boolean)var5;
   }

   // $FF: renamed from: c (add) boolean
   public boolean method_3607(add param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int) add
   public add method_85(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: j (int) add
   public add method_86(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, add) void
   public void method_87(int var1, add var2) {
      String[] var10000 = class_752.method_4253();
      add[] var4 = this.field_2844;
      String[] var3 = var10000;

      label20: {
         try {
            if(var3 == null) {
               return;
            }

            if(var1 < var4.length) {
               break label20;
            }
         } catch (class_643 var5) {
            throw method_3620(var5);
         }

         var1 -= var4.length;
         var4 = this.field_2845;
      }

      var4[var1] = var2;
   }

   // $FF: renamed from: b (aji) float
   public float method_3608(aji var1) {
      float var2 = 1.0F;
      if(this.field_2844[this.field_2846] != null) {
         var2 *= this.field_2844[this.field_2846].method_3734(var1);
      }

      return var2;
   }

   // $FF: renamed from: b (rr) rr
   public class_1580 method_3609(class_1580 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (rr) void
   public void method_3610(class_1580 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () int
   public int method_83() {
      return this.field_2844.length + 4;
   }

   // $FF: renamed from: c (int) add
   public add method_84(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: i () java.lang.String
   public String method_88() {
      String[] var10000 = field_2852;
      return "container.inventory";
   }

   // $FF: renamed from: j () boolean
   public boolean method_89() {
      return false;
   }

   // $FF: renamed from: k () int
   public int method_90() {
      return 64;
   }

   // $FF: renamed from: c (aji) boolean
   public boolean method_3611(aji var1) {
      String[] var2 = class_752.method_4253();

      boolean var10000;
      label53: {
         try {
            var10000 = var1.method_2424().method_5073();
            if(var2 == null) {
               return var10000;
            }

            if(!var10000) {
               break label53;
            }
         } catch (class_643 var5) {
            throw method_3620(var5);
         }

         var10000 = true;
         return var10000;
      }

      add var3 = this.method_84(this.field_2846);

      add var6;
      label54: {
         label30: {
            try {
               var6 = var3;
               if(var2 == null) {
                  break label54;
               }

               if(var3 == null) {
                  break label30;
               }
            } catch (class_643 var4) {
               throw method_3620(var4);
            }

            var6 = var3;
            break label54;
         }

         var10000 = false;
         return var10000;
      }

      var10000 = var6.method_3752(var1);
      return var10000;
   }

   // $FF: renamed from: b (int) add
   public add method_3612(int var1) {
      return this.field_2845[var1];
   }

   // $FF: renamed from: e () int
   public int method_3613() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (float) void
   public void method_3614(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () void
   public void method_3615() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: l () void
   public void method_91() {
      this.field_2850 = true;
   }

   // $FF: renamed from: d (add) void
   public void method_3616(add var1) {
      this.field_2849 = var1;
   }

   // $FF: renamed from: h () add
   public add method_3617() {
      return this.field_2849;
   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_92(class_792 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (add) boolean
   public boolean method_3618(add param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: m () void
   public void method_93() {}

   // $FF: renamed from: n () void
   public void method_94() {}

   // $FF: renamed from: d (int, add) boolean
   public boolean method_95(int var1, add var2) {
      return true;
   }

   // $FF: renamed from: a (Af) void
   public void method_3619(class_666 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_3620(Throwable var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3621() {
      // $FF: Couldn't be decompiled
   }
}
