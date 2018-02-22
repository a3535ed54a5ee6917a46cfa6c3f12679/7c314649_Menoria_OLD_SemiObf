
// $FF: renamed from: p4
public class class_1426 extends class_1425 {

   // $FF: renamed from: l yz
   private final class_792 field_7575;
   // $FF: renamed from: m xr
   private final class_690 field_7576;
   // $FF: renamed from: k java.lang.String
   private static final String field_7577 = "minecraft:minecart.inside";


   // $FF: renamed from: <init> (yz, xr) void
   public void method_7773(class_792 var1, class_690 var2) {
      bqx var10001 = new bqx;
      var10001.method_8227("minecraft:minecart.inside");
      super.method_7767(var10001);
      this.field_7575 = var1;
      this.field_7576 = var2;
      this.field_7573 = class_108.field_194;
      this.field_7571 = true;
      this.field_7572 = 0;
   }

   // $FF: renamed from: k () void
   public void method_7774() {
      String[] var1 = class_752.method_4253();
      class_1426 var10000 = this;
      if(var1 != null) {
         label38: {
            if(!this.field_7576.field_3012) {
               var10000 = this;
               if(var1 == null) {
                  break label38;
               }

               if(this.field_7575.method_3937()) {
                  label44: {
                     var10000 = this;
                     if(var1 != null) {
                        if(this.field_7575.field_2988 != this.field_7576) {
                           break label44;
                        }

                        var10000 = this;
                     }

                     label25: {
                        float var2 = class_1715.method_9558(var10000.field_7576.field_2997 * this.field_7576.field_2997 + this.field_7576.field_2999 * this.field_7576.field_2999);
                        if(var1 != null) {
                           if((double)var2 < 0.01D) {
                              break label25;
                           }

                           this.field_7566 = 0.0F + class_1715.method_9569(var2, 0.0F, 1.0F) * 0.75F;
                        }

                        if(var1 != null) {
                           return;
                        }
                     }

                     this.field_7566 = 0.0F;
                     return;
                  }
               }
            }

            var10000 = this;
         }
      }

      var10000.field_7574 = true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7775() {
      boolean var10000 = true;
      char[] var10003 = "<3Û÷©7.ÿ­2;ÇæË¦\"3Ñ÷".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7577 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 38;
            break;
         case 1:
            var10009 = 45;
            break;
         case 2:
            var10009 = 194;
            break;
         case 3:
            var10009 = 229;
            break;
         case 4:
            var10009 = 146;
            break;
         case 5:
            var10009 = 7;
            break;
         default:
            var10009 = 191;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
