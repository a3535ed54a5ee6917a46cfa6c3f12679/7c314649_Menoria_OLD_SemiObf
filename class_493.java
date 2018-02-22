
// $FF: renamed from: aZ
public class class_493 extends class_492 {

   // $FF: renamed from: g aP
   private final class_898 field_2290;
   // $FF: renamed from: h yz
   private class_792 field_2291;
   // $FF: renamed from: i int
   private int field_2292;
   // $FF: renamed from: j c5
   private final class_18 field_2293;


   // $FF: renamed from: <init> (yz, c5, aP, int, int, int) void
   public void method_2885(class_792 var1, class_18 var2, class_898 var3, int var4, int var5, int var6) {
      super.method_2869(var3, var4, var5, var6);
      this.field_2291 = var1;
      this.field_2293 = var2;
      this.field_2290 = var3;
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2874(add var1) {
      return false;
   }

   // $FF: renamed from: b (int) add
   public add method_2881(int var1) {
      String[] var2 = class_752.method_4253();
      class_493 var10000 = this;
      if(var2 != null) {
         if(this.method_2876()) {
            this.field_2292 += Math.min(var1, this.method_2875().field_2958);
         }

         var10000 = this;
      }

      return var10000.method_2881(var1);
   }

   // $FF: renamed from: b (add, int) void
   protected void method_2871(add var1, int var2) {
      this.field_2292 += var2;
      this.method_2872(var1);
   }

   // $FF: renamed from: a (add) void
   protected void method_2872(add var1) {
      var1.method_3762(this.field_2291.field_2990, this.field_2291, this.field_2292);
      this.field_2292 = 0;
   }

   // $FF: renamed from: b (yz, add) void
   public void method_2873(class_792 var1, add var2) {
      String[] var10000 = class_752.method_4253();
      this.method_2872(var2);
      String[] var3 = var10000;
      class_924 var4 = this.field_2290.method_5208();
      if(var4 != null) {
         add var5 = this.field_2290.method_84(0);
         add var6 = this.field_2290.method_84(1);
         class_493 var7 = this;
         if(var3 != null) {
            label44: {
               if(!this.method_2886(var4, var5, var6)) {
                  var7 = this;
                  if(var3 == null) {
                     break label44;
                  }

                  if(!this.method_2886(var4, var6, var5)) {
                     return;
                  }
               }

               var7 = this;
            }
         }

         var7.field_2293.method_58(var4);
         add var8 = var5;
         if(var3 != null) {
            label35: {
               if(var5 != null) {
                  var8 = var5;
                  if(var3 == null) {
                     break label35;
                  }

                  if(var5.field_2958 <= 0) {
                     var5 = null;
                  }
               }

               var8 = var6;
            }
         }

         label29: {
            if(var3 != null) {
               if(var8 == null) {
                  break label29;
               }

               var8 = var6;
            }

            if(var8.field_2958 <= 0) {
               var6 = null;
            }
         }

         this.field_2290.method_87(0, var5);
         this.field_2290.method_87(1, var6);
      }

   }

   // $FF: renamed from: b (c6, add, add) boolean
   private boolean method_2886(class_924 var1, add var2, add var3) {
      add var5 = var1.method_5418();
      String[] var10000 = class_752.method_4253();
      add var6 = var1.method_5419();
      String[] var4 = var10000;
      add var7 = var2;
      if(var4 != null) {
         if(var2 == null) {
            return false;
         }

         var7 = var2;
      }

      if(var4 != null) {
         if(var7.method_3730() != var5.method_3730()) {
            return false;
         }

         var7 = var6;
      }

      if(var4 != null) {
         label34: {
            if(var7 != null) {
               var7 = var3;
               if(var4 == null) {
                  break label34;
               }

               if(var3 != null) {
                  var7 = var6;
                  if(var4 == null) {
                     break label34;
                  }

                  if(var6.method_3730() == var3.method_3730()) {
                     var2.field_2958 -= var5.field_2958;
                     var3.field_2958 -= var6.field_2958;
                     return true;
                  }
               }
            }

            var7 = var6;
         }
      }

      if(var4 != null) {
         if(var7 != null) {
            return false;
         }

         var7 = var3;
      }

      if(var4 != null) {
         if(var7 != null) {
            return false;
         }

         var7 = var2;
      }

      var7.field_2958 -= var5.field_2958;
      return true;
   }
}
