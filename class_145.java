import org.lwjgl.opengl.GL11;

// $FF: renamed from: k4
class class_145 extends bcb {

   // $FF: renamed from: b bqx
   private final bqx field_460;
   // $FF: renamed from: o int
   private final int field_461;
   // $FF: renamed from: p int
   private final int field_462;
   // $FF: renamed from: q boolean
   private boolean field_463;
   // $FF: renamed from: r java.lang.String
   private static final String field_464 = "CL_00000743";


   // $FF: renamed from: <init> (int, int, int, bqx, int, int) void
   protected void method_765(int var1, int var2, int var3, bqx var4, int var5, int var6) {
      super.method_748(var1, var2, var3, 22, 22, "");
      this.field_460 = var4;
      this.field_461 = var5;
      this.field_462 = var6;
   }

   // $FF: renamed from: a (bao, int, int) void
   public void method_750(bao var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      class_145 var10000 = this;
      if(var4 != null) {
         if(!this.field_452) {
            return;
         }

         var1.method_5288().bindTexture(class_224.method_1217());
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var10000 = this;
      }

      int var10001;
      int var10002;
      label82: {
         label91: {
            var10001 = var2;
            var10002 = this.field_447;
            if(var4 != null) {
               if(var2 < this.field_447) {
                  break label91;
               }

               var10001 = var3;
               var10002 = this.field_448;
            }

            if(var4 != null) {
               if(var10001 < var10002) {
                  break label91;
               }

               var10001 = var2;
               var10002 = this.field_447 + this.field_445;
            }

            if(var4 != null) {
               if(var10001 >= var10002) {
                  break label91;
               }

               var10001 = var3;
               if(var4 == null) {
                  break label82;
               }

               var10002 = this.field_448 + this.field_446;
            }

            if(var10001 < var10002) {
               var10001 = 1;
               break label82;
            }
         }

         var10001 = 0;
      }

      int var10003;
      int var10004;
      int var10005;
      int var10006;
      label93: {
         boolean var7;
         label94: {
            short var5;
            int var6;
            label95: {
               var10000.field_453 = (boolean)var10001;
               var5 = 219;
               var6 = 0;
               var7 = this.field_451;
               if(var4 != null) {
                  if(!this.field_451) {
                     var6 += this.field_445 * 2;
                     if(var4 != null) {
                        break label95;
                     }
                  }

                  var7 = this.field_463;
               }

               if(var4 != null) {
                  if(var7) {
                     var6 += this.field_445 * 1;
                     if(var4 != null) {
                        break label95;
                     }
                  }

                  var7 = this.field_453;
               }

               if(var4 == null) {
                  break label94;
               }

               if(var7) {
                  var6 += this.field_445 * 3;
               }
            }

            var10000 = this;
            var10001 = this.field_447;
            var10002 = this.field_448;
            var10003 = var6;
            var10004 = var5;
            var10005 = this.field_445;
            var10006 = this.field_446;
            if(var4 == null) {
               break label93;
            }

            this.method_658(this.field_447, this.field_448, var6, var5, this.field_445, this.field_446);
            var7 = class_224.method_1217().equals(this.field_460);
         }

         if(!var7) {
            var1.method_5288().bindTexture(this.field_460);
         }

         var10000 = this;
         var10001 = this.field_447 + 2;
         var10002 = this.field_448 + 2;
         var10003 = this.field_461;
         var10004 = this.field_462;
         var10005 = 18;
         var10006 = 18;
      }

      var10000.method_658(var10001, var10002, var10003, var10004, var10005, var10006);
   }

   // $FF: renamed from: e () boolean
   public boolean method_766() {
      return this.field_463;
   }

   // $FF: renamed from: c (boolean) void
   public void method_767(boolean var1) {
      this.field_463 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_759() {
      boolean var10000 = true;
      char[] var10003 = "Îï«?8ì½À<".toCharArray();
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
            field_464 = (new String((char[])var4)).intern();
            String var2 = field_464;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 106;
            break;
         case 1:
            var10009 = 68;
            break;
         case 2:
            var10009 = 19;
            break;
         case 3:
            var10009 = 232;
            break;
         case 4:
            var10009 = 65;
            break;
         case 5:
            var10009 = 239;
            break;
         default:
            var10009 = 59;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
