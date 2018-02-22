import org.lwjgl.opengl.GL11;

// $FF: renamed from: no
public class class_1209 extends bhr {

   // $FF: renamed from: b bix
   private bix field_6266;
   // $FF: renamed from: c bix
   private bix field_6267;
   // $FF: renamed from: d bix
   private bix field_6268;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6269;


   // $FF: renamed from: <init> (float, boolean) void
   public void method_6517(float var1, boolean var2) {
      super.method_6510();
      bix var10001 = new bix;
      String[] var3 = field_6269;
      var10001.method_6637(this, "glass");
      this.field_6267 = var10001;
      this.field_6267.method_6641(0, 0).method_6643(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      var10001 = new bix;
      var10001.method_6637(this, "cube");
      this.field_6266 = var10001;
      this.field_6266.method_6641(32, 0).method_6643(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      if(var2) {
         var10001 = new bix;
         var10001.method_6637(this, "base");
         this.field_6268 = var10001;
         this.field_6268.method_6641(0, 16).method_6643(-6.0F, 0.0F, -6.0F, 12, 4, 12);
      }

   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      String[] var10000 = class_752.method_4253();
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      String[] var8 = var10000;
      GL11.glTranslatef(0.0F, -0.5F, 0.0F);
      bix var10 = this.field_6268;
      if(var8 != null) {
         if(this.field_6268 != null) {
            this.field_6268.method_6646(var7);
         }

         GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, 0.8F + var4, 0.0F);
         GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
         var10 = this.field_6267;
      }

      var10.method_6646(var7);
      float var9 = 0.875F;
      GL11.glScalef(var9, var9, var9);
      GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
      GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
      this.field_6267.method_6646(var7);
      GL11.glScalef(var9, var9, var9);
      GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
      GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
      this.field_6266.method_6646(var7);
      GL11.glPopMatrix();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6518() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "È¸È\'4Ì¡Ë1ÍµÚ1";
      int var4 = "È¸È\'4Ì¡Ë1ÍµÚ1".length();
      char var1 = 5;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_6269 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 159;
               break;
            case 1:
               var10009 = 228;
               break;
            case 2:
               var10009 = 153;
               break;
            case 3:
               var10009 = 100;
               break;
            case 4:
               var10009 = 119;
               break;
            case 5:
               var10009 = 236;
               break;
            default:
               var10009 = 248;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
