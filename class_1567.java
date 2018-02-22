
// $FF: renamed from: ri
public class class_1567 {

   // $FF: renamed from: b ri
   public static final class_1567 field_8249;
   // $FF: renamed from: c long
   private final long field_8250;
   // $FF: renamed from: d long
   private long field_8251;
   // $FF: renamed from: e java.lang.String
   private static final String field_8252;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8253;


   // $FF: renamed from: <init> (long) void
   public void method_8603(long var1) {
      super();
      this.field_8250 = var1;
   }

   // $FF: renamed from: b (long) void
   public void method_8604(long var1) {
      try {
         this.field_8251 += var1 / 8L;
         if(this.field_8251 > this.field_8250) {
            RuntimeException var10000 = new RuntimeException;
            StringBuilder var10002 = new StringBuilder();
            String[] var3 = field_8253;
            var10000.<init>(var10002.append("Tried to read NBT tag that was too big; tried to allocate: ").append(this.field_8251).append("bytes where max allowed: ").append(this.field_8250).toString());
            throw var10000;
         }
      } catch (RuntimeException var4) {
         throw method_8606(var4);
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_8605() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ß³ëù­¨ëz½Ìï®o¸âÙ²ïoù£Þúút¶Ì Ä½µ;­«È¾®o¶Ì£Á¶áx¸§úá¾+éÜóê½ Ô®ëhùªÈ¨ë;´º»âw¶§Éà®";
      int var4 = "ß³ëù­¨ëz½Ìï®o¸âÙ²ïoù£Þúút¶Ì Ä½µ;­«È¾®o¶Ì£Á¶áx¸§úá¾+éÜóê½ Ô®ëhùªÈ¨ë;´º»âw¶§Éà®".length();
      char var1 = 59;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var10 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var12 = var9;
            var9 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var10)).intern();
               if((var0 += var1) >= var4) {
                  field_8253 = var5;
                  String[] var11 = field_8253;
                  field_8252 = "CL_00001903";
                  class_1568 var8 = new class_1568;
                  var8.method_8603(0L);
                  field_8249 = var8;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var10)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 209;
               break;
            case 1:
               var10009 = 190;
               break;
            case 2:
               var10009 = 201;
               break;
            case 3:
               var10009 = 157;
               break;
            case 4:
               var10009 = 8;
               break;
            case 5:
               var10009 = 202;
               break;
            default:
               var10009 = 255;
            }

            ((Object[])var10)[var6] = (char)(var10007 ^ var12 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_8606(RuntimeException var0) {
      return var0;
   }
}
