import java.util.concurrent.Callable;
import org.lwjgl.input.Mouse;

// $FF: renamed from: nW
class class_1413 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7527;
   // $FF: renamed from: b int
   final int field_7528;
   // $FF: renamed from: c int
   final int field_7529;
   // $FF: renamed from: d blt
   final blt field_7530;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7531;


   // $FF: renamed from: <init> (blt, int, int) void
   void method_7712(blt var1, int var2, int var3) {
      this.field_7530 = var1;
      this.field_7528 = var2;
      this.field_7529 = var3;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7713() {
      String[] var10000 = field_7531;
      return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", new Object[]{Integer.valueOf(this.field_7528), Integer.valueOf(this.field_7529), Integer.valueOf(Mouse.getX()), Integer.valueOf(Mouse.getY())});
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_7714() {
      return this.method_7713();
   }

   // $FF: renamed from: d () java.lang.Object
   public Object method_7715() {
      return this.method_7713();
   }

   // $FF: renamed from: <clinit> () void
   static void method_7716() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "q©ùþc¢â½·\'½Fã¶TÚeëM¦í þ=¸\nïüX»\"üaÇD«7¨ó­D";
      int var4 = "q©ùþc¢â½·\'½Fã¶TÚeëM¦í þ=¸\nïüX»\"üaÇD«7¨ó­D".length();
      char var1 = 36;
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
                  field_7531 = var5;
                  String[] var10 = field_7531;
                  field_7527 = "CL_00000950";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 144;
               break;
            case 1:
               var10009 = 120;
               break;
            case 2:
               var10009 = 42;
               break;
            case 3:
               var10009 = 198;
               break;
            case 4:
               var10009 = 41;
               break;
            case 5:
               var10009 = 181;
               break;
            default:
               var10009 = 42;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
