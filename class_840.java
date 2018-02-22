import org.lwjgl.opengl.GL11;

// $FF: renamed from: oN
public class class_840 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3892;
   // $FF: renamed from: k ni
   private final class_1215 field_3893;
   // $FF: renamed from: l java.lang.String
   private static final String field_3894;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1215 var10001 = new class_1215;
      var10001.method_6510();
      super.method_4798(var10001, 0.5F);
      this.field_3893 = (class_1215)this.field_3844;
   }

   // $FF: renamed from: b (wX, double, double, double, float, float) void
   public void method_4877(class_765 var1, double var2, double var4, double var6, float var8, float var9) {
      super.method_4830(var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: b (wX) bqx
   protected bqx method_4878(class_765 var1) {
      return field_3892;
   }

   // $FF: renamed from: b (wX, float, float, float) void
   protected void method_4879(class_765 var1, float var2, float var3, float var4) {
      String[] var10000 = class_752.method_4253();
      super.method_4804(var1, var2, var3, var4);
      String[] var5 = var10000;
      float var9 = var1.field_3323;
      if(var5 != null) {
         if((double)var1.field_3323 < 0.01D) {
            return;
         }

         var9 = 13.0F;
      }

      float var6 = var9;
      float var7 = var1.field_3324 - var1.field_3323 * (1.0F - var4) + 6.0F;
      float var8 = (Math.abs(var7 % var6 - var6 * 0.5F) - var6 * 0.25F) / (var6 * 0.25F);
      GL11.glRotatef(6.5F * var8, 0.0F, 0.0F, 1.0F);
   }

   // $FF: renamed from: b (wX, float) void
   protected void method_4880(class_765 var1, float var2) {
      super.method_4807(var1, var2);
      String[] var3 = class_752.method_4253();
      int var10000 = var1.method_4349();
      if(var3 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = '\u803a';
      }

      GL11.glEnable(var10000);
      GL11.glPushMatrix();
      GL11.glRotatef(5.0F + 180.0F * this.field_3893.field_6310.field_6548 / 3.1415927F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(-0.6875F, 1.25F, -0.9375F);
      GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
      float var4 = 0.8F;
      GL11.glScalef(var4, -var4, var4);
      int var5 = var1.method_3883(var2);
      int var6 = var5 % 65536;
      int var7 = var5 / 65536;
      buu.method_9080(buu.field_8557, (float)var6 / 1.0F, (float)var7 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.method_4732(bpz.field_7757);
      this.field_3789.drawTextBox6(class_1192.field_6065, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glDisable('\u803a');
   }

   // $FF: renamed from: a (sw, double, double, double, float, float) void
   public void method_4830(class_753 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4877((class_765)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: c (sv, float) void
   protected void method_4807(class_752 var1, float var2) {
      this.method_4880((class_765)var1, var2);
   }

   // $FF: renamed from: a (sv, float, float, float) void
   protected void method_4804(class_752 var1, float var2, float var3, float var4) {
      this.method_4879((class_765)var1, var2, var3, var4);
   }

   // $FF: renamed from: a (sv, double, double, double, float, float) void
   public void method_4801(class_752 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4877((class_765)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4878((class_765)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4877((class_765)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "®û\\\"°ïÜý]Ò¶gòº«fé«§}îØ¢\t®¯Ð";
      int var5 = "®û\\\"°ïÜý]Ò¶gòº«fé«§}îØ¢\t®¯Ð".length();
      char var2 = 11;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var10 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var10;
            var10 = var10001;
            var10001 = var10003;
            char[] var12 = var10;
            var10 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var11)).intern();
               if((var1 += var2) >= var5) {
                  field_3894 = "CL_00001031";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/iron_golem.png");
                  field_3892 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 102;
               break;
            case 1:
               var10009 = 60;
               break;
            case 2:
               var10009 = 69;
               break;
            case 3:
               var10009 = 231;
               break;
            case 4:
               var10009 = 153;
               break;
            case 5:
               var10009 = 11;
               break;
            default:
               var10009 = 84;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
