import org.lwjgl.opengl.GL11;

// $FF: renamed from: oB
public class class_853 extends class_851 {

   // $FF: renamed from: q bqx
   private static final bqx field_3936;
   // $FF: renamed from: r bqx
   private static final bqx field_3937;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1246 var10001 = new class_1246;
      var10001.method_6510();
      super.method_4914(var10001, 0.5F);
   }

   // $FF: renamed from: b (w6, float) void
   protected void method_4931(class_786 var1, float var2) {
      if(var1.method_4529() == 1) {
         GL11.glScalef(1.2F, 1.2F, 1.2F);
      }

   }

   // $FF: renamed from: f () void
   protected void method_4924() {
      GL11.glTranslatef(0.09375F, 0.1875F, 0.0F);
   }

   // $FF: renamed from: b (w6) bqx
   protected bqx method_4932(class_786 var1) {
      return var1.method_4529() == 1?field_3937:field_3936;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "6TÇ·|IÝ¶ |_Ø§<Bµ 6^ì±6XÜ¬G4%6TÇ·|IÝ¶ |_Ø§<B±6XÜ¬G4";
      int var5 = "6TÇ·|IÝ¶ |_Ø§<Bµ 6^ì±6XÜ¬G4%6TÇ·|IÝ¶ |_Ø§<B±6XÜ¬G4".length();
      char var2 = 44;
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
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/skeleton/skeleton.png");
                  field_3936 = var9;
                  var9 = new bqx;
                  var9.method_8227("textures/entity/skeleton/wither_skeleton.png");
                  field_3937 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 247;
               break;
            case 1:
               var10009 = 79;
               break;
            case 2:
               var10009 = 48;
               break;
            case 3:
               var10009 = 175;
               break;
            case 4:
               var10009 = 222;
               break;
            case 5:
               var10009 = 117;
               break;
            default:
               var10009 = 228;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
