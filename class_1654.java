
// $FF: renamed from: vB
public class class_1654 extends class_1650 {

   // $FF: renamed from: a ro
   public final class_1583 field_8609;
   // $FF: renamed from: d java.lang.String
   public final String field_8610;
   // $FF: renamed from: e java.lang.String
   private static final String field_8611;
   // $FF: renamed from: f c_
   final class_982 field_8612;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8613;


   // $FF: renamed from: <init> (c_, ro) void
   public void method_9100(class_982 var1, class_1583 var2) {
      this.field_8612 = var1;
      String[] var6 = field_8613;
      super.method_9088(var2.method_8681("Weight"));
      String[] var10000 = class_752.method_4253();
      class_1583 var4 = var2.method_8688("Properties");
      String[] var3 = var10000;
      String var5 = var2.method_8685("Type");
      if(var3 != null) {
         if(var5.equals("Minecart")) {
            label31: {
               label36: {
                  class_1583 var7 = var4;
                  if(var3 != null) {
                     if(var4 == null) {
                        break label36;
                     }

                     var7 = var4;
                  }

                  var6 = field_8613;
                  switch(var7.method_8681("Type")) {
                  case 0:
                     var6 = field_8613;
                     var5 = "MinecartRideable";
                     if(var3 != null) {
                        break;
                     }
                  case 1:
                     var6 = field_8613;
                     var5 = "MinecartChest";
                     if(var3 != null) {
                        break;
                     }
                  case 2:
                     var6 = field_8613;
                     var5 = "MinecartFurnace";
                  }

                  if(var3 != null) {
                     break label31;
                  }
               }

               var10000 = field_8613;
               var5 = "MinecartRideable";
            }
         }

         this.field_8609 = var4;
         this.field_8610 = var5;
      }

   }

   // $FF: renamed from: <init> (c_, ro, java.lang.String) void
   public void method_9101(class_982 var1, class_1583 var2, String var3) {
      this.field_8612 = var1;
      String[] var4 = class_752.method_4253();
      super.method_9088(1);
      if(var4 != null) {
         String[] var5 = field_8613;
         if(var3.equals("Minecart")) {
            label31: {
               label36: {
                  class_1583 var10000 = var2;
                  if(var4 != null) {
                     if(var2 == null) {
                        break label36;
                     }

                     var10000 = var2;
                  }

                  var5 = field_8613;
                  switch(var10000.method_8681("Type")) {
                  case 0:
                     var5 = field_8613;
                     var3 = "MinecartRideable";
                     if(var4 != null) {
                        break;
                     }
                  case 1:
                     var5 = field_8613;
                     var3 = "MinecartChest";
                     if(var4 != null) {
                        break;
                     }
                  case 2:
                     var5 = field_8613;
                     var3 = "MinecartFurnace";
                  }

                  if(var4 != null) {
                     break label31;
                  }
               }

               String[] var6 = field_8613;
               var3 = "MinecartRideable";
            }
         }

         this.field_8609 = var2;
         this.field_8610 = var3;
      }

   }

   // $FF: renamed from: b () ro
   public class_1583 method_9102() {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var1 = var10000;
      String[] var2 = field_8613;
      var1.method_8664("Properties", this.field_8609);
      var1.initGui1("Type", this.field_8610);
      var1.method_8667("Weight", this.field_8596);
      return var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9089() {
      // $FF: Couldn't be decompiled
   }
}
