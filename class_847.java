
// $FF: renamed from: oG
public class class_847 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3908;
   // $FF: renamed from: k bqx
   private static final bqx field_3909;


   // $FF: renamed from: <init> (bhr, bhr, float) void
   public void method_4903(bhr var1, bhr var2, float var3) {
      super.method_4798(var1, var3);
      this.method_4799(var2);
   }

   // $FF: renamed from: b (wS, int, float) int
   protected int method_4904(class_771 var1, int var2, float var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var2;
      if(var4 != null) {
         if(var2 == 0) {
            var10000 = var1.method_4395();
            if(var4 == null) {
               return var10000;
            }

            if(var10000 != 0) {
               this.method_4732(field_3908);
               return 1;
            }
         }

         var10000 = -1;
      }

      return var10000;
   }

   // $FF: renamed from: b (wS) bqx
   protected bqx method_4905(class_771 var1) {
      return field_3909;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "úì¡é6ý¦»ò\'÷¦¼´#çîß¥ü\"úì¡é6ý¦»ò\'÷¦¼´#çî®¦ÿ7âìß¥ü";
      int var5 = "úì¡é6ý¦»ò\'÷¦¼´#çîß¥ü\"úì¡é6ý¦»ò\'÷¦¼´#çî®¦ÿ7âìß¥ü".length();
      char var2 = 27;
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
                  var9.method_8227("textures/entity/pig/pig_saddle.png");
                  field_3908 = var9;
                  var9 = new bqx;
                  var9.method_8227("textures/entity/pig/pig.png");
                  field_3909 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 54;
               break;
            case 1:
               var10009 = 49;
               break;
            case 2:
               var10009 = 73;
               break;
            case 3:
               var10009 = 109;
               break;
            case 4:
               var10009 = 69;
               break;
            case 5:
               var10009 = 35;
               break;
            default:
               var10009 = 235;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
