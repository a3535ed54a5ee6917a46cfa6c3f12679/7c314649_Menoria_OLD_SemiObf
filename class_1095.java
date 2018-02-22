import java.util.Random;

// $FF: renamed from: is
abstract class class_1095 extends class_1094 {

   // $FF: renamed from: d int
   protected int field_5756;
   // $FF: renamed from: e int
   protected int field_5757;
   // $FF: renamed from: f int
   protected int field_5758;
   // $FF: renamed from: g int
   protected int field_5759;
   // $FF: renamed from: h java.lang.String
   private static final String field_5760;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_5761;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
      this.field_5759 = -1;
   }

   // $FF: renamed from: <init> (java.util.Random, int, int, int, int, int, int) void
   protected void method_6223(Random var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super.method_6192(0);
      this.field_5759 = -1;
      this.field_5756 = var5;
      this.field_5757 = var6;
      String[] var8 = class_752.method_4253();
      this.field_5758 = var7;
      this.field_5753 = var1.nextInt(4);
      class_1095 var10000 = this;
      class_1206 var10001;
      if(var8 != null) {
         switch(this.field_5753) {
         case 0:
         case 2:
            var10001 = new class_1206;
            var10001.method_6481(var2, var3, var4, var2 + var5 - 1, var3 + var6 - 1, var4 + var7 - 1);
            this.field_5752 = var10001;
            if(var8 != null) {
               return;
            }
         default:
            var10000 = this;
         }
      }

      var10001 = new class_1206;
      var10001.method_6481(var2, var3, var4, var2 + var7 - 1, var3 + var6 - 1, var4 + var5 - 1);
      var10000.field_5752 = var10001;
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      String[] var2 = field_5761;
      var1.method_8667("Width", this.field_5756);
      var1.method_8667("Height", this.field_5757);
      var1.method_8667("Depth", this.field_5758);
      var1.method_8667("HPos", this.field_5759);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      String[] var2 = field_5761;
      this.field_5756 = var1.method_8681("Width");
      this.field_5757 = var1.method_8681("Height");
      this.field_5758 = var1.method_8681("Depth");
      this.field_5759 = var1.method_8681("HPos");
   }

   // $FF: renamed from: b (ahb, hS, int) boolean
   protected boolean method_6224(ahb var1, class_1206 var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_5759;
      if(var4 != null) {
         if(this.field_5759 >= 0) {
            return true;
         }

         var10000 = 0;
      }

      int var5 = var10000;
      int var6 = 0;
      int var7 = this.field_5752.field_6246;

      label60:
      while(true) {
         var10000 = var7;

         label57:
         while(var10000 <= this.field_5752.field_6249) {
            var10000 = this.field_5752.field_6244;
            if(var4 == null) {
               break label60;
            }

            int var8 = this.field_5752.field_6244;

            while(var8 <= this.field_5752.field_6247) {
               var10000 = var2.method_6487(var8, 64, var7);
               if(var4 == null) {
                  continue label57;
               }

               label51: {
                  if(var4 != null) {
                     if(var10000 == 0) {
                        break label51;
                     }

                     var10000 = var5 + Math.max(var1.method_2108(var8, var7), var1.field_1820.method_6176());
                  }

                  var5 = var10000;
                  ++var6;
               }

               ++var8;
               if(var4 == null) {
                  break;
               }
            }

            ++var7;
            if(var4 != null) {
               continue label60;
            }
            break;
         }

         var10000 = var6;
         break;
      }

      if(var4 != null) {
         if(var10000 == 0) {
            return false;
         }

         this.field_5759 = var5 / var6;
         this.field_5752.method_6486(0, this.field_5759 - this.field_5752.field_6245 + var3, 0);
         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      // $FF: Couldn't be decompiled
   }
}
