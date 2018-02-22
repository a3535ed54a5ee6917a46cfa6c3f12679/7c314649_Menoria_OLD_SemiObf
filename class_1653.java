
// $FF: renamed from: vC
public class class_1653 extends class_1650 {

   // $FF: renamed from: a java.lang.Class
   public Class field_8604;
   // $FF: renamed from: d int
   public int field_8605;
   // $FF: renamed from: e int
   public int field_8606;
   // $FF: renamed from: f java.lang.String
   private static final String field_8607;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8608;


   // $FF: renamed from: <init> (java.lang.Class, int, int, int) void
   public void method_9099(Class var1, int var2, int var3, int var4) {
      super.method_9088(var2);
      this.field_8604 = var1;
      this.field_8605 = var3;
      this.field_8606 = var4;
   }

   public String toString() {
      StringBuilder var10000 = (new StringBuilder()).append(this.field_8604.getSimpleName());
      String[] var1 = field_8608;
      return var10000.append("*(").append(this.field_8605).append("-").append(this.field_8606).append("):").append(this.field_8596).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9089() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "WT=ÿÌÑÆ DN¥Ð";
      int var4 = "WT=ÿÌÑÆ DN¥Ð".length();
      char var1 = 2;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_8608 = var5;
                  String[] var10 = field_8608;
                  field_8607 = "CL_00000161";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 230;
               break;
            case 1:
               var10009 = 43;
               break;
            case 2:
               var10009 = 11;
               break;
            case 3:
               var10009 = 121;
               break;
            case 4:
               var10009 = 110;
               break;
            case 5:
               var10009 = 136;
               break;
            default:
               var10009 = 236;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
