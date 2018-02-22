import org.lwjgl.opengl.GL11;

public class bov extends class_827 {

   // $FF: renamed from: a bqx
   private static final bqx field_3896;
   // $FF: renamed from: f bqx
   private static final bqx field_3897;
   private static final String __OBFID;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1217 var10001 = new class_1217;
      var10001.method_6510();
      super.method_4798(var10001, 1.0F);
      var10001 = new class_1217;
      var10001.method_6510();
      this.method_4799(var10001);
   }

   // $FF: renamed from: b (yn) float
   protected float method_4885(class_784 var1) {
      return 180.0F;
   }

   // $FF: renamed from: a (yn, int, float) int
   protected int method_4886(class_784 var1, int var2, float var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var2;
      if(var4 != null) {
         if(var2 != 0) {
            return -1;
         }

         this.method_4732(field_3896);
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(1, 1);
         var10000 = var1.method_3942();
      }

      label22: {
         if(var4 != null) {
            if(var10000 != 0) {
               GL11.glDepthMask(false);
               if(var4 != null) {
                  break label22;
               }
            }

            var10000 = 1;
         }

         GL11.glDepthMask((boolean)var10000);
      }

      char var5 = '\uf0f0';
      int var6 = var5 % 65536;
      int var7 = var5 / 65536;
      buu.method_9080(buu.field_8557, (float)var6 / 1.0F, (float)var7 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      return 1;
   }

   // $FF: renamed from: a (yn) bqx
   protected bqx method_4887(class_784 var1) {
      return field_3897;
   }

   // $FF: renamed from: a (sv) float
   protected float method_4812(class_752 var1) {
      return this.method_4885((class_784)var1);
   }

   // $FF: renamed from: a (sv, int, float) int
   protected int method_4810(class_752 var1, int var2, float var3) {
      return this.method_4886((class_784)var1, var2, var3);
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4887((class_784)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[3];
      int var4 = 0;
      String var3 = " ¦nñUJRÚ\bIK´ÅTQµ\fÅBO¨µTF¤TV!IK´ÅTQµ\fÅBO¨ÅBO¨ÄAQ¦";
      int var5 = " ¦nñUJRÚ\bIK´ÅTQµ\fÅBO¨µTF¤TV!IK´ÅTQµ\fÅBO¨ÅBO¨ÄAQ¦".length();
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
                  __OBFID = "CL_00001027";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/spider_eyes.png");
                  field_3896 = var9;
                  var9 = new bqx;
                  var9.method_8227("textures/entity/spider/spider.png");
                  field_3897 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 228;
               break;
            case 1:
               var10009 = 109;
               break;
            case 2:
               var10009 = 182;
               break;
            case 3:
               var10009 = 184;
               break;
            case 4:
               var10009 = 70;
               break;
            case 5:
               var10009 = 226;
               break;
            default:
               var10009 = 253;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
