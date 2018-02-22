import org.lwjgl.opengl.GL11;

// $FF: renamed from: k8
class class_144 extends bcb {

   // $FF: renamed from: b boolean
   private final boolean field_458;
   // $FF: renamed from: o java.lang.String
   private static final String field_459 = "CL_00000745";


   // $FF: renamed from: <init> (int, int, int, boolean) void
   public void method_764(int var1, int var2, int var3, boolean var4) {
      super.method_748(var1, var2, var3, 23, 13, "");
      this.field_458 = var4;
   }

   // $FF: renamed from: a (bao, int, int) void
   public void method_750(bao var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_452;
      if(var4 != null) {
         if(!this.field_452) {
            return;
         }

         var10000 = var2;
      }

      label60: {
         label69: {
            int var10001 = this.field_447;
            if(var4 != null) {
               if(var10000 < this.field_447) {
                  break label69;
               }

               var10000 = var3;
               var10001 = this.field_448;
            }

            if(var4 != null) {
               if(var10000 < var10001) {
                  break label69;
               }

               var10000 = var2;
               var10001 = this.field_447 + this.field_445;
            }

            if(var4 != null) {
               if(var10000 >= var10001) {
                  break label69;
               }

               var10000 = var3;
               if(var4 == null) {
                  break label60;
               }

               var10001 = this.field_448 + this.field_446;
            }

            if(var10000 < var10001) {
               var10000 = 1;
               break label60;
            }
         }

         var10000 = 0;
      }

      int var6;
      int var7;
      class_144 var8;
      label71: {
         int var5 = var10000;
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var1.method_5288().bindTexture(class_193.method_1033());
         var6 = 0;
         var7 = 192;
         var10000 = var5;
         if(var4 != null) {
            if(var5 != 0) {
               var6 += 23;
            }

            var8 = this;
            if(var4 == null) {
               break label71;
            }

            var10000 = this.field_458;
         }

         if(var10000 == 0) {
            var7 += 13;
         }

         var8 = this;
      }

      var8.method_658(this.field_447, this.field_448, var6, var7, 23, 13);
   }

   // $FF: renamed from: <clinit> () void
   static void method_759() {
      boolean var10000 = true;
      char[] var10003 = "Z<¯Ùu)Gxª".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_459 = (new String((char[])var4)).intern();
            String var2 = field_459;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 165;
            break;
         case 1:
            var10009 = 204;
            break;
         case 2:
            var10009 = 240;
            break;
         case 3:
            var10009 = 35;
            break;
         case 4:
            var10009 = 85;
            break;
         case 5:
            var10009 = 9;
            break;
         default:
            var10009 = 249;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
