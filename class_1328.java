import org.lwjgl.opengl.GL11;

// $FF: renamed from: kQ
public class class_1328 implements class_81 {

   // $FF: renamed from: b java.lang.String
   private String field_6811;
   // $FF: renamed from: c bao
   private bao field_6812;
   // $FF: renamed from: d java.lang.String
   private String field_6813;
   // $FF: renamed from: e long
   private long field_6814;
   // $FF: renamed from: f boolean
   private boolean field_6815;
   // $FF: renamed from: g l8
   private class_1338 field_6816;
   // $FF: renamed from: h bmg
   private bmg field_6817;
   // $FF: renamed from: i java.lang.String
   private static final String field_6818 = "CL_00000655";


   // $FF: renamed from: <init> (bao) void
   public void method_6980(bao var1) {
      super();
      this.field_6811 = "";
      this.field_6813 = "";
      this.field_6814 = bao.method_5283();
      this.field_6812 = var1;
      class_1338 var10001 = new class_1338;
      var10001.method_7060(var1, var1.cursorCounter2, var1.cursorCounter3);
      this.field_6816 = var10001;
      bmg var2 = new bmg;
      var2.method_7484(var1.cursorCounter2, var1.cursorCounter3, false);
      this.field_6817 = var2;
      this.field_6817.method_7488(9728);
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_398(String var1) {
      this.field_6815 = false;
      this.method_6981(var1);
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_397(String var1) {
      this.field_6815 = true;
      this.method_6981(var1);
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_6981(String var1) {
      String[] var10000 = class_752.method_4253();
      this.field_6813 = var1;
      String[] var2 = var10000;
      int var5 = this.field_6812.cursorPosition4;
      if(var2 != null) {
         if(!this.field_6812.cursorPosition4) {
            if(!this.field_6815) {
               class_933 var7 = new class_933;
               var7.method_5463();
               throw var7;
            }

            return;
         }

         GL11.glClear(256);
         GL11.glMatrixMode(5889);
         GL11.glLoadIdentity();
         var5 = buu.method_9082();
      }

      label24: {
         label23: {
            if(var2 != null) {
               if(var5 == 0) {
                  break label23;
               }

               var5 = this.field_6816.method_7065();
            }

            int var3 = var5;
            GL11.glOrtho(0.0D, (double)(this.field_6816.method_7061() * var3), (double)(this.field_6816.method_7062() * var3), 0.0D, 100.0D, 300.0D);
            if(var2 != null) {
               break label24;
            }
         }

         class_1338 var6 = new class_1338;
         var6.method_7060(this.field_6812, this.field_6812.cursorCounter2, this.field_6812.cursorCounter3);
         class_1338 var4 = var6;
         GL11.glOrtho(0.0D, var4.method_7063(), var4.method_7064(), 0.0D, 100.0D, 300.0D);
      }

      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -200.0F);
   }

   // $FF: renamed from: d (java.lang.String) void
   public void method_399(String var1) {
      String[] var2 = class_752.method_4253();
      class_1328 var10000 = this;
      if(var2 != null) {
         if(!this.field_6812.cursorPosition4) {
            if(!this.field_6815) {
               class_933 var3 = new class_933;
               var3.method_5463();
               throw var3;
            }

            return;
         }

         this.field_6814 = 0L;
         this.field_6811 = var1;
         this.method_400(-1);
         var10000 = this;
      }

      var10000.field_6814 = 0L;
   }

   // $FF: renamed from: b (int) void
   public void method_400(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () void
   public void method_401() {}

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_6982(Exception var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6983() {
      boolean var10000 = true;
      char[] var10003 = "(¥\'¨t[ßM".toCharArray();
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
            field_6818 = (new String((char[])var4)).intern();
            String var2 = field_6818;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 247;
            break;
         case 1:
            var10009 = 117;
            break;
         case 2:
            var10009 = 228;
            break;
         case 3:
            var10009 = 173;
            break;
         case 4:
            var10009 = 4;
            break;
         case 5:
            var10009 = 216;
            break;
         default:
            var10009 = 180;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
