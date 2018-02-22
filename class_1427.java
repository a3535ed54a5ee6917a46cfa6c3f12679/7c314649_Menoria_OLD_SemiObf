
// $FF: renamed from: p3
public class class_1427 extends class_1425 {

   // $FF: renamed from: l xr
   private final class_690 field_7578;
   // $FF: renamed from: m float
   private float field_7579;
   // $FF: renamed from: k java.lang.String
   private static final String field_7580 = "minecraft:minecart.base";


   // $FF: renamed from: <init> (xr) void
   public void method_7776(class_690 var1) {
      bqx var10001 = new bqx;
      var10001.method_8227("minecraft:minecart.base");
      super.method_7767(var10001);
      this.field_7579 = 0.0F;
      this.field_7578 = var1;
      this.field_7571 = true;
      this.field_7572 = 0;
   }

   // $FF: renamed from: k () void
   public void method_7777() {
      String[] var1 = class_752.method_4253();
      class_690 var10000 = this.field_7578;
      if(var1 != null) {
         if(this.field_7578.field_3012) {
            this.field_7574 = true;
            return;
         }

         this.field_7568 = (float)this.field_7578.field_2994;
         this.field_7569 = (float)this.field_7578.field_2995;
         this.field_7570 = (float)this.field_7578.field_2996;
         var10000 = this.field_7578;
      }

      float var2 = class_1715.method_9558(var10000.field_2997 * this.field_7578.field_2997 + this.field_7578.field_2999 * this.field_7578.field_2999);
      if(var1 != null) {
         if((double)var2 >= 0.01D) {
            this.field_7579 = class_1715.method_9569(this.field_7579 + 0.0025F, 0.0F, 1.0F);
            this.field_7566 = 0.0F + class_1715.method_9569(var2, 0.0F, 0.5F) * 0.7F;
            if(var1 != null) {
               return;
            }
         }

         this.field_7579 = 0.0F;
      }

      this.field_7566 = 0.0F;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7778() {
      boolean var10000 = true;
      char[] var10003 = "<ò?ÑÞ7\t¦5ÍÚ2îrÁÞ\"".toCharArray();
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
            field_7580 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 251;
            break;
         case 1:
            var10009 = 215;
            break;
         case 2:
            var10009 = 54;
            break;
         case 3:
            var10009 = 82;
            break;
         case 4:
            var10009 = 246;
            break;
         case 5:
            var10009 = 9;
            break;
         default:
            var10009 = 21;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
