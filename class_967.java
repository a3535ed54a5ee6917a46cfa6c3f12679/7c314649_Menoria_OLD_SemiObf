import java.util.Date;

// $FF: renamed from: ml
class class_967 extends bcm {

   // $FF: renamed from: w java.lang.String
   private static final String field_4900;
   // $FF: renamed from: x lx
   final class_166 field_4901;
   // $FF: renamed from: y java.lang.String[]
   private static final String[] field_4902;


   // $FF: renamed from: <init> (lx) void
   public void method_5590(class_166 var1) {
      this.field_4901 = var1;
      super.method_5549(var1.field_557, var1.width, var1.height, 32, var1.height - 64, 36);
   }

   // $FF: renamed from: b () int
   protected int method_5553() {
      return class_166.method_894(this.field_4901).size();
   }

   // $FF: renamed from: a (int, boolean, int, int) void
   protected void method_5554(int var1, boolean var2, int var3, int var4) {
      String[] var5;
      int var7;
      label34: {
         label37: {
            String[] var10000 = class_752.method_4253();
            class_166.method_895(this.field_4901, var1);
            var5 = var10000;
            var7 = class_166.method_896(this.field_4901);
            if(var5 != null) {
               if(var7 < 0) {
                  break label37;
               }

               var7 = class_166.method_896(this.field_4901);
            }

            if(var5 == null) {
               break label34;
            }

            if(var7 < this.method_5553()) {
               var7 = 1;
               break label34;
            }
         }

         var7 = 0;
      }

      int var6 = var7;
      class_166.method_897(this.field_4901).field_451 = (boolean)var6;
      class_166.method_898(this.field_4901).field_451 = (boolean)var6;
      class_166.method_899(this.field_4901).field_451 = (boolean)var6;
      class_166.method_900(this.field_4901).field_451 = (boolean)var6;
      var7 = var2;
      if(var5 != null) {
         if(var2 == 0) {
            return;
         }

         var7 = var6;
      }

      if(var7 != 0) {
         this.field_4901.method_892(var1);
      }

   }

   // $FF: renamed from: a (int) boolean
   protected boolean method_5555(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         var10000 = var1 == class_166.method_896(this.field_4901)?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: e () int
   protected int method_5556() {
      return class_166.method_894(this.field_4901).size() * 36;
   }

   // $FF: renamed from: a () void
   protected void method_5557() {
      this.field_4901.method_873();
   }

   // $FF: renamed from: a (int, int, int, int, bmh, int, int) void
   protected void method_5558(int var1, int var2, int var3, int var4, bmh var5, int var6, int var7) {
      String[] var8;
      class_1339 var9;
      String var10;
      String var14;
      label43: {
         label42: {
            String[] var10000 = class_752.method_4253();
            var9 = (class_1339)class_166.method_894(this.field_4901).get(var1);
            var10 = var9.method_7068();
            var8 = var10000;
            var14 = var10;
            if(var8 != null) {
               if(var10 != null) {
                  var14 = var10;
                  if(var8 == null) {
                     break label43;
                  }

                  if(!class_1715.method_9574(var10)) {
                     break label42;
                  }
               }

               var14 = class_166.method_901(this.field_4901) + " " + (var1 + 1);
            }

            var10 = var14;
         }

         var14 = var9.method_7067();
      }

      String var11;
      String var12;
      label46: {
         var11 = var14;
         StringBuilder var15 = (new StringBuilder()).append(var11);
         String[] var13 = field_4902;
         var11 = var15.append(" (").append(class_166.method_902(this.field_4901).format(new Date(var9.method_7071()))).toString();
         var11 = var11 + ")";
         var12 = "";
         boolean var16 = var9.method_7070();
         if(var8 != null) {
            if(var16) {
               var12 = class_166.method_903(this.field_4901) + " " + var12;
               if(var8 != null) {
                  break label46;
               }
            }

            var12 = class_166.method_904(this.field_4901)[var9.method_7073().method_443()];
            var16 = var9.method_7074();
         }

         if(var8 != null) {
            if(var16) {
               var15 = (new StringBuilder()).append(class_130.field_280);
               var13 = field_4902;
               var12 = var15.append(class_1450.method_7896("gameMode.hardcore", new Object[0])).append(class_130.field_297).toString();
            }

            var16 = var9.method_7075();
         }

         if(var16) {
            var15 = (new StringBuilder()).append(var12);
            var13 = field_4902;
            var12 = var15.append(", ").append(class_1450.method_7896("selectWorld.cheats", new Object[0])).toString();
         }
      }

      this.field_4901.method_657(this.field_4901.fontRendererObj, var10, var2 + 2, var3 + 1, 16777215);
      this.field_4901.method_657(this.field_4901.fontRendererObj, var11, var2 + 2, var3 + 12, 8421504);
      this.field_4901.method_657(this.field_4901.fontRendererObj, var12, var2 + 2, var3 + 12 + 10, 8421504);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      // $FF: Couldn't be decompiled
   }
}
