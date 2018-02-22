import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: g6
public class class_1056 extends class_1052 {

   // $FF: renamed from: g java.util.List
   private List width9;
   // $FF: renamed from: h java.lang.String
   private static final String height0;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] height1;


   // $FF: renamed from: <init> () void
   public void method_5960() {
      super.method_5960();
      this.width9 = new ArrayList();
      List var10000 = this.width9;
      class_1653 var10001 = new class_1653;
      var10001.method_9099(class_790.class, 10, 2, 3);
      var10000.add(var10001);
      var10000 = this.width9;
      var10001 = new class_1653;
      var10001.method_9099(class_782.class, 5, 4, 4);
      var10000.add(var10001);
      var10000 = this.width9;
      var10001 = new class_1653;
      var10001.method_9099(class_786.class, 10, 4, 4);
      var10000.add(var10001);
      var10000 = this.width9;
      var10001 = new class_1653;
      var10001.method_9099(class_755.class, 3, 4, 4);
      var10000.add(var10001);
   }

   // $FF: renamed from: b () java.lang.String
   public String method_5963() {
      String[] var10000 = height1;
      return "Fortress";
   }

   // $FF: renamed from: a () java.util.List
   public List method_5981() {
      return this.width9;
   }

   // $FF: renamed from: b (int, int) boolean
   protected boolean method_5972(int var1, int var2) {
      int var4 = var1 >> 4;
      int var5 = var2 >> 4;
      String[] var3 = class_752.method_4253();
      this.field_5565.setSeed((long)(var4 ^ var5 << 4) ^ this.field_5566.method_2183());
      this.field_5565.nextInt();
      int var10000 = this.field_5565.nextInt(3);
      if(var3 != null) {
         if(var10000 != 0) {
            var10000 = 0;
            return (boolean)var10000;
         }

         var10000 = var1;
      }

      int var10001 = (var4 << 4) + 4 + this.field_5565.nextInt(8);
      if(var3 != null) {
         if(var10000 != var10001) {
            var10000 = 0;
            return (boolean)var10000;
         }

         var10000 = var2;
         if(var3 == null) {
            return (boolean)var10000;
         }

         var10001 = (var5 << 4) + 4 + this.field_5565.nextInt(8);
      }

      var10000 = var10000 == var10001?1:0;
      return (boolean)var10000;
   }

   // $FF: renamed from: c (int, int) i2
   protected class_1199 method_5973(int var1, int var2) {
      class_1203 var10000 = new class_1203;
      var10000.method_6467(this.field_5566, this.field_5565, var1, var2);
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5975() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "XÞp;AÈám]ý]¢.7~";
      int var4 = "XÞp;AÈám]ý]¢.7~".length();
      char var1 = 8;
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
                  height1 = var5;
                  String[] var10 = height1;
                  height0 = "CL_00000451";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 15;
               break;
            case 1:
               var10009 = 160;
               break;
            case 2:
               var10009 = 19;
               break;
            case 3:
               var10009 = 94;
               break;
            case 4:
               var10009 = 34;
               break;
            case 5:
               var10009 = 188;
               break;
            default:
               var10009 = 131;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
