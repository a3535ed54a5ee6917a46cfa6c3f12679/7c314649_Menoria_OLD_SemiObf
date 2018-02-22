import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: bU
public class class_529 extends adb {

   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2376;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      boolean var10000 = var3.field_1832;
      if(var11 != null) {
         if(!var3.field_1832) {
            class_707 var13 = new class_707;
            var13.method_4062(var3, (double)((float)var4 + var8), (double)((float)var5 + var9), (double)((float)var6 + var10), var1);
            class_707 var12 = var13;
            var3.method_2089(var12);
            var10000 = var2.field_3640.field_2839;
            if(var11 != null) {
               if(!var2.field_3640.field_2839) {
                  --var1.field_2958;
               }

               var10000 = true;
            }

            return var10000;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: a (add, yz, java.util.List, boolean) void
   public void method_2963(add var1, class_792 var2, List var3, boolean var4) {
      String[] var5 = class_752.method_4253();
      add var10000 = var1;
      if(var5 != null) {
         if(!var1.method_3766()) {
            return;
         }

         var10000 = var1;
      }

      class_1583 var13 = var10000.method_3767();
      String[] var12 = field_2376;
      class_1583 var6 = var13.method_8688("Fireworks");
      var13 = var6;
      if(var5 != null) {
         if(var6 == null) {
            return;
         }

         var13 = var6;
      }

      var12 = field_2376;
      String var10001 = "Flight";
      byte var10002 = 99;
      if(var5 != null) {
         if(var13.initGui8("Flight", 99)) {
            var3.add(class_1563.method_8581("item.fireworks.flight") + " " + var6.initGui9("Flight"));
         }

         var13 = var6;
         var12 = field_2376;
         var10001 = "Explosions";
         var10002 = 10;
      }

      class_1580 var7 = var13.method_8689(var10001, var10002);
      class_1580 var14 = var7;
      if(var5 != null) {
         if(var7 == null) {
            return;
         }

         var14 = var7;
      }

      int var16 = var14.method_8658();
      if(var5 != null) {
         if(var16 <= 0) {
            return;
         }

         var16 = 0;
      }

      int var8 = var16;

      while(var8 < var7.method_8658()) {
         class_1583 var9 = var7.method_8653(var8);
         ArrayList var10 = new ArrayList();
         class_530.getBlock01(var9, var10);
         if(var5 != null) {
            label56: {
               if(var10.size() > 0) {
                  int var11 = 1;

                  while(var11 < var10.size()) {
                     StringBuilder var15 = new StringBuilder();
                     String[] var10003 = field_2376;
                     var10.set(var11, var15.append("  ").append((String)var10.get(var11)).toString());
                     ++var11;
                     if(var5 == null) {
                        break label56;
                     }

                     if(var5 == null) {
                        break;
                     }
                  }

                  var3.addAll(var10);
               }

               ++var8;
            }
         }

         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      // $FF: Couldn't be decompiled
   }
}
