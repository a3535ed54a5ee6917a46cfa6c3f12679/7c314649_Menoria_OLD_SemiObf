import org.lwjgl.opengl.GL11;

// $FF: renamed from: ok
public class class_814 extends bno {

   // $FF: renamed from: g blm
   private final blm field_3814;
   // $FF: renamed from: h java.lang.String
   private static final String field_3815 = "CL_00000994";


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
      blm var10001 = new blm;
      var10001.method_7203();
      this.field_3814 = var10001;
      this.field_3790 = 0.5F;
   }

   // $FF: renamed from: b (xp, double, double, double, float, float) void
   public void method_4768(class_700 var1, double var2, double var4, double var6, float var8, float var9) {
      String[] var10000 = class_752.method_4253();
      ahb var11 = var1.method_4039();
      aji var12 = var1.method_4041();
      String[] var10 = var10000;
      int var13 = class_1715.method_9561(var1.field_2994);
      int var14 = class_1715.method_9561(var1.field_2995);
      int var15 = class_1715.method_9561(var1.field_2996);
      aji var17 = var12;
      if(var10 != null) {
         if(var12 == null) {
            return;
         }

         var17 = var12;
      }

      if(var10 != null) {
         if(var17 == var11.getBlock(var13, var14, var15)) {
            return;
         }

         GL11.glPushMatrix();
         GL11.glTranslatef((float)var2, (float)var4, (float)var6);
         this.method_4731(var1);
         GL11.glDisable(2896);
         var17 = var12;
      }

      label42: {
         boolean var18 = var17 instanceof class_467;
         bmh var16;
         if(var10 != null) {
            if(var18) {
               this.field_3814.field_6952 = var11;
               var16 = bmh.instance;
               var16.setVisible2();
               var16.method_7467((double)((float)(-var13) - 0.5F), (double)((float)(-var14) - 0.5F), (double)((float)(-var15) - 0.5F));
               this.field_3814.method_7222((class_467)var12, var13, var14, var15, var1.field_3101);
               var16.method_7467(0.0D, 0.0D, 0.0D);
               var16.getVisible8();
               if(var10 != null) {
                  break label42;
               }
            }

            var18 = var12 instanceof class_416;
         }

         if(var18) {
            this.field_3814.field_6952 = var11;
            var16 = bmh.instance;
            var16.setVisible2();
            var16.method_7467((double)((float)(-var13) - 0.5F), (double)((float)(-var14) - 0.5F), (double)((float)(-var15) - 0.5F));
            this.field_3814.method_7274((class_416)var12, var13, var14, var15);
            var16.method_7467(0.0D, 0.0D, 0.0D);
            var16.getVisible8();
            if(var10 != null) {
               break label42;
            }
         }

         this.field_3814.method_7210(var12);
         this.field_3814.method_7259(var12, var11, var13, var14, var15, var1.field_3101);
      }

      GL11.glEnable(2896);
      GL11.glPopMatrix();
   }

   // $FF: renamed from: b (xp) bqx
   protected bqx method_4769(class_700 var1) {
      return bpz.field_7757;
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4769((class_700)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4768((class_700)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "I×>ò3v<òÓ".toCharArray();
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
            field_3815 = (new String((char[])var4)).intern();
            String var2 = field_3815;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 119;
            break;
         case 1:
            var10009 = 52;
            break;
         case 2:
            var10009 = 250;
            break;
         case 3:
            var10009 = 214;
            break;
         case 4:
            var10009 = 63;
            break;
         case 5:
            var10009 = 243;
            break;
         default:
            var10009 = 50;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
