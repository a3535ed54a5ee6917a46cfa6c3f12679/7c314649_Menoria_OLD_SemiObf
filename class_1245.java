
// $FF: renamed from: m0
public class class_1245 extends class_1242 {

   // $FF: renamed from: v java.lang.String
   private static final String field_6477 = "CL_00000869";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      this.drawCenteredString7(0.0F, false);
   }

   // $FF: renamed from: <init> (float, float, int, int) void
   protected void drawCenteredString1(float var1, float var2, int var3, int var4) {
      super.drawCenteredString1(var1, var2, var3, var4);
   }

   // $FF: renamed from: <init> (float, boolean) void
   public void drawCenteredString7(float var1, boolean var2) {
      super.drawCenteredString1(var1, 0.0F, 64, var2?32:64);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      super.method_6512(var1, var2, var3, var4, var5, var6, var7);
      float var8 = class_1715.method_9555(this.field_6259 * 3.1415927F);
      float var9 = class_1715.method_9555((1.0F - (1.0F - this.field_6259) * (1.0F - this.field_6259)) * 3.1415927F);
      this.field_6463.field_6550 = 0.0F;
      this.field_6464.field_6550 = 0.0F;
      this.field_6463.field_6549 = -(0.1F - var8 * 0.6F);
      this.field_6464.field_6549 = 0.1F - var8 * 0.6F;
      this.field_6463.field_6548 = -1.5707964F;
      this.field_6464.field_6548 = -1.5707964F;
      this.field_6463.field_6548 -= var8 * 1.2F - var9 * 0.4F;
      this.field_6464.field_6548 -= var8 * 1.2F - var9 * 0.4F;
      this.field_6463.field_6550 += class_1715.method_9556(var3 * 0.09F) * 0.05F + 0.05F;
      this.field_6464.field_6550 -= class_1715.method_9556(var3 * 0.09F) * 0.05F + 0.05F;
      this.field_6463.field_6548 += class_1715.method_9555(var3 * 0.067F) * 0.05F;
      this.field_6464.field_6548 -= class_1715.method_9555(var3 * 0.067F) * 0.05F;
   }

   // $FF: renamed from: <clinit> () void
   static void drawCenteredString4() {
      boolean var10000 = true;
      char[] var10003 = "Q\'²ft²à%N»".toCharArray();
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
            field_6477 = (new String((char[])var4)).intern();
            String var2 = field_6477;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 138;
            break;
         case 1:
            var10009 = 71;
            break;
         case 2:
            var10009 = 34;
            break;
         case 3:
            var10009 = 216;
            break;
         case 4:
            var10009 = 12;
            break;
         case 5:
            var10009 = 30;
            break;
         default:
            var10009 = 216;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
