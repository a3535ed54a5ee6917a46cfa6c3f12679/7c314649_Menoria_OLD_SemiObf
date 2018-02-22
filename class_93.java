import net.minecraft.item.ItemSuperBow;

// $FF: renamed from: E
public enum class_93 {

   // $FF: renamed from: a E
   field_31,
   // $FF: renamed from: b E
   field_32,
   // $FF: renamed from: c E
   field_33,
   // $FF: renamed from: d E
   field_34,
   // $FF: renamed from: e E
   field_35,
   // $FF: renamed from: f E
   field_36,
   // $FF: renamed from: g E
   field_37,
   // $FF: renamed from: h E
   field_38,
   // $FF: renamed from: i E
   field_39,
   // $FF: renamed from: j E
   field_40,
   // $FF: renamed from: k E
   field_41;
   // $FF: renamed from: l java.lang.String
   private static final String field_42;
   // $FF: renamed from: m E[]
   // $FF: synthetic field
   private static final class_93[] field_43;


   // $FF: renamed from: <init> (java.lang.String, int) void
   private void method_439(String var1, int var2) {
      super(var1, var2);
   }

   // $FF: renamed from: b (adb) boolean
   public boolean method_440(adb var1) {
      String[] var2 = class_752.method_4253();
      class_93 var10000 = this;
      class_93 var10001 = field_31;
      if(var2 != null) {
         if(this == field_31) {
            return true;
         }

         var10000 = this;
         var10001 = field_40;
      }

      boolean var5;
      label134: {
         if(var10000 == var10001) {
            var5 = var1.method_2936();
            if(var2 == null) {
               break label134;
            }

            if(var5) {
               return true;
            }
         }

         var5 = var1 instanceof class_525;
      }

      if(var2 != null) {
         if(var5) {
            if(this == field_32) {
               return true;
            }

            class_525 var3 = (class_525)var1;
            int var4 = var3.field_2365;
            if(var2 != null) {
               if(var3.field_2365 == 0) {
                  var5 = this == field_36;
                  return var5;
               }

               var4 = var3.field_2365;
            }

            byte var6 = 2;
            if(var2 != null) {
               if(var4 == 2) {
                  var5 = this == field_34;
                  return var5;
               }

               var4 = var3.field_2365;
               var6 = 1;
            }

            if(var2 != null) {
               if(var4 == var6) {
                  var5 = this == field_35;
                  return var5;
               }

               var4 = var3.field_2365;
               var6 = 3;
            }

            var5 = var4 == var6?this == field_33:false;
            return var5;
         }

         var5 = var1 instanceof class_511;
      }

      if(var2 != null) {
         if(var5) {
            var5 = this == field_37;
            return var5;
         }

         var5 = var1 instanceof class_539;
      }

      if(var2 != null) {
         if(var5) {
            var5 = this == field_38;
            return var5;
         }

         var5 = var1 instanceof class_573;
      }

      if(var2 != null) {
         if(var5) {
            var5 = this == field_41;
            return var5;
         }

         var5 = var1 instanceof ItemSuperBow;
      }

      if(var2 != null) {
         if(var5) {
            var5 = this == field_41;
            return var5;
         }

         var5 = var1 instanceof class_528;
      }

      var5 = var5?this == field_39:false;
      return var5;
   }

   // $FF: renamed from: <clinit> () void
   static void method_441() {
      // $FF: Couldn't be decompiled
   }
}
