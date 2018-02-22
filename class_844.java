import org.lwjgl.opengl.GL11;

// $FF: renamed from: oJ
public class class_844 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3901;
   // $FF: renamed from: k bhr
   private bhr field_3902;
   // $FF: renamed from: l java.lang.String
   private static final String field_3903;


   // $FF: renamed from: <init> (bhr, bhr, float) void
   public void method_4892(bhr var1, bhr var2, float var3) {
      super.method_4798(var1, var3);
      this.field_3902 = var2;
   }

   // $FF: renamed from: b (xd, int, float) int
   protected int method_4893(class_754 var1, int var2, float var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var1.method_3942();
      if(var4 != null) {
         if(var10000 != 0) {
            return 0;
         }

         var10000 = var2;
      }

      if(var4 != null) {
         if(var10000 == 0) {
            this.method_4799(this.field_3902);
            GL11.glEnable(2977);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            return 1;
         }

         var10000 = var2;
      }

      if(var4 != null) {
         if(var10000 == 1) {
            GL11.glDisable(3042);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }

         var10000 = -1;
      }

      return var10000;
   }

   // $FF: renamed from: b (xd, float) void
   protected void method_4894(class_754 var1, float var2) {
      float var3 = (float)var1.method_4304();
      float var4 = (var1.field_3390 + (var1.field_3389 - var1.field_3390) * var2) / (var3 * 0.5F + 1.0F);
      float var5 = 1.0F / (var4 + 1.0F);
      GL11.glScalef(var5 * var3, 1.0F / var5 * var3, var5 * var3);
   }

   // $FF: renamed from: b (xd) bqx
   protected bqx method_4895(class_754 var1) {
      return field_3901;
   }

   // $FF: renamed from: a (sv, float) void
   protected void method_4814(class_752 var1, float var2) {
      this.method_4894((class_754)var1, var2);
   }

   // $FF: renamed from: a (sv, int, float) int
   protected int method_4810(class_752 var1, int var2, float var3) {
      return this.method_4893((class_754)var1, var2, var3);
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4895((class_754)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "B\\7ùõöåE*ãôíôO<áééåJ#äíá®FW(uu½°´°\t}¹";
      int var5 = "B\\7ùõöåE*ãôíôO<áééåJ#äíá®FW(uu½°´°\t}¹".length();
      char var2 = 31;
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
                  field_3903 = "CL_00001024";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/slime/slime.png");
                  field_3901 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 76;
               break;
            case 1:
               var10009 = 67;
               break;
            case 2:
               var10009 = 53;
               break;
            case 3:
               var10009 = 247;
               break;
            case 4:
               var10009 = 250;
               break;
            case 5:
               var10009 = 254;
               break;
            default:
               var10009 = 250;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
