
// $FF: renamed from: sH
public class class_324 extends class_323 {

   // $FF: renamed from: a java.lang.String
   private static final String field_1643;
   // $FF: renamed from: l java.lang.String[]
   private static final String[] field_1644;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
      this.field_1640 = true;
   }

   // $FF: renamed from: <init> (int, byte, byte) void
   public void method_1847(int var1, byte var2, byte var3) {
      super.method_1838(var1);
      this.field_1638 = var2;
      this.field_1639 = var3;
      this.field_1640 = true;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      super.method_1453(var1);
      this.field_1638 = var1.readByte();
      this.field_1639 = var1.readByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      super.method_1454(var1);
      var1.writeByte(this.field_1638);
      var1.writeByte(this.field_1639);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      StringBuilder var10000 = (new StringBuilder()).append(super.method_1457());
      String[] var10001 = field_1644;
      return var10000.append(String.format(", yRot=%d, xRot=%d", new Object[]{Byte.valueOf(this.field_1638), Byte.valueOf(this.field_1639)})).toString();
   }

   // $FF: renamed from: b (rP) void
   public void method_1455(class_57 var1) {
      super.method_1839((class_64)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ß1|ÂIô _yé³\rà÷Bl+Ñ±®K(";
      int var4 = "ß1|ÂIô _yé³\rà÷Bl+Ñ±®K(".length();
      char var1 = 11;
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
                  field_1644 = var5;
                  String[] var10 = field_1644;
                  field_1643 = "CL_00001315";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 113;
               break;
            case 1:
               var10009 = 39;
               break;
            case 2:
               var10009 = 218;
               break;
            case 3:
               var10009 = 248;
               break;
            case 4:
               var10009 = 70;
               break;
            case 5:
               var10009 = 205;
               break;
            default:
               var10009 = 10;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
