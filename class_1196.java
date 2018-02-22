import java.util.Random;

// $FF: renamed from: i1
class class_1196 extends class_1195 {

   // $FF: renamed from: a java.lang.String
   private static final String field_6221 = "CL_00000497";


   // $FF: renamed from: <init> () void
   private void method_6426() {
      super.method_6422();
   }

   // $FF: renamed from: b (java.util.Random, int, int, int, boolean) void
   public void method_6423(Random var1, int var2, int var3, int var4, boolean var5) {
      String[] var6 = class_752.method_4253();
      if(var6 != null) {
         if(var5) {
            label45: {
               this.field_6219 = class_1192.field_6123;
               float var7 = var1.nextFloat();
               float var8;
               int var10000 = (var8 = var7 - 0.2F) == 0.0F?0:(var8 < 0.0F?-1:1);
               if(var6 != null) {
                  if(var10000 < 0) {
                     this.field_6220 = 2;
                     if(var6 != null) {
                        break label45;
                     }
                  }

                  float var9;
                  var10000 = (var9 = var7 - 0.5F) == 0.0F?0:(var9 < 0.0F?-1:1);
               }

               if(var6 != null) {
                  if(var10000 < 0) {
                     this.field_6220 = 1;
                     if(var6 != null) {
                        break label45;
                     }
                  }

                  float var10;
                  var10000 = (var10 = var7 - 0.55F) == 0.0F?0:(var10 < 0.0F?-1:1);
               }

               if(var10000 < 0) {
                  this.field_6219 = class_1192.field_6122;
                  this.field_6220 = 2;
                  if(var6 != null) {
                     break label45;
                  }
               }

               this.field_6220 = 0;
            }

            if(var6 != null) {
               return;
            }
         }

         this.field_6219 = class_1192.field_6025;
      }

      this.field_6220 = 0;
   }

   // $FF: renamed from: <init> (java.lang.Object) void
   void method_6427(Object var1) {
      this.method_6426();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6428() {
      boolean var10000 = true;
      char[] var10003 = "C\towu;ç".toCharArray();
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
            field_6221 = (new String((char[])var4)).intern();
            String var2 = field_6221;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 161;
            break;
         case 1:
            var10009 = 235;
            break;
         case 2:
            var10009 = 58;
            break;
         case 3:
            var10009 = 221;
            break;
         case 4:
            var10009 = 187;
            break;
         case 5:
            var10009 = 78;
            break;
         default:
            var10009 = 163;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
