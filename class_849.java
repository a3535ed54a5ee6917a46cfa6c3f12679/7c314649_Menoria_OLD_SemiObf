import org.lwjgl.opengl.GL11;

// $FF: renamed from: oE
public class class_849 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3914;
   // $FF: renamed from: k java.lang.String
   private static final String field_3915;


   // $FF: renamed from: <init> (bhr, float) void
   public void method_4798(bhr var1, float var2) {
      super.method_4798(var1, var2);
   }

   // $FF: renamed from: b (wQ, double, double, double, float, float) void
   public void method_4909(class_774 var1, double var2, double var4, double var6, float var8, float var9) {
      super.method_4830(var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: b (wQ) bqx
   protected bqx method_4910(class_774 var1) {
      return field_3914;
   }

   // $FF: renamed from: b (wQ, float) void
   protected void method_4911(class_774 var1, float var2) {
      String[] var10000 = class_752.method_4253();
      super.method_4807(var1, var2);
      String[] var3 = var10000;
      short var4 = var1.method_4159();
      if(var3 != null) {
         if(var4 != 0) {
            return;
         }

         this.method_4732(bpz.field_7757);
         GL11.glEnable(2884);
         GL11.glPushMatrix();
         GL11.glScalef(1.0F, -1.0F, 1.0F);
         GL11.glTranslatef(0.2F, 0.4F, 0.5F);
         GL11.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
         this.field_3789.drawTextBox6(class_1192.field_6067, 0, 1.0F);
         GL11.glTranslatef(0.1F, 0.0F, -0.6F);
         GL11.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
         this.field_3789.drawTextBox6(class_1192.field_6067, 0, 1.0F);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         ((class_1232)this.field_3844).field_6392.method_6648(0.0625F);
         GL11.glScalef(1.0F, -1.0F, 1.0F);
         GL11.glTranslatef(0.0F, 0.75F, -0.2F);
         GL11.glRotatef(12.0F, 0.0F, 1.0F, 0.0F);
         this.field_3789.drawTextBox6(class_1192.field_6067, 0, 1.0F);
         GL11.glPopMatrix();
         var4 = 2884;
      }

      GL11.glDisable(var4);
   }

   // $FF: renamed from: a (sw, double, double, double, float, float) void
   public void method_4830(class_753 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4909((class_774)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: c (sv, float) void
   protected void method_4807(class_752 var1, float var2) {
      this.method_4911((class_774)var1, var2);
   }

   // $FF: renamed from: a (sv, double, double, double, float, float) void
   public void method_4801(class_752 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4909((class_774)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4910((class_774)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4909((class_774)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "XUFÁÇòã6S!·¶°übºüd\nÞ¬¼t\r®ýw";
      int var5 = "XUFÁÇòã6S!·¶°übºüd\nÞ¬¼t\r®ýw".length();
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
                  field_3915 = "CL_00001016";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/cow/mooshroom.png");
                  field_3914 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 60;
               break;
            case 1:
               var10009 = 44;
               break;
            case 2:
               var10009 = 248;
               break;
            case 3:
               var10009 = 154;
               break;
            case 4:
               var10009 = 137;
               break;
            case 5:
               var10009 = 14;
               break;
            default:
               var10009 = 8;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
