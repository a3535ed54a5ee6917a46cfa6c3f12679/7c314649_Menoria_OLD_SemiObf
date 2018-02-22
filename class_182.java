import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: lh
public class class_182 extends bdw {

   // $FF: renamed from: b java.util.concurrent.atomic.AtomicInteger
   private static final AtomicInteger field_704;
   // $FF: renamed from: i org.apache.logging.log4j.Logger
   private static final Logger field_705;
   // $FF: renamed from: r l
   private class_120 field_706;
   // $FF: renamed from: s boolean
   private boolean field_707;
   // $FF: renamed from: t bdw
   private final bdw field_708;
   // $FF: renamed from: u java.lang.String
   private static final String field_709;
   // $FF: renamed from: v java.lang.String[]
   private static final String[] field_710;


   // $FF: renamed from: <init> (bdw, bao, nF) void
   public void method_960(bdw var1, bao var2, class_1386 var3) {
      super.method_651();
      this.field_557 = var2;
      this.field_708 = var1;
      class_1385 var4 = class_1385.method_7554(var3.field_7362);
      var2.method_5259((bjf)null);
      var2.method_5276(var3);
      this.method_962(var4.method_7552(), var4.method_7553());
   }

   // $FF: renamed from: <init> (bdw, bao, java.lang.String, int) void
   public void method_961(bdw var1, bao var2, String var3, int var4) {
      super.method_651();
      this.field_557 = var2;
      this.field_708 = var1;
      var2.method_5259((bjf)null);
      this.method_962(var3, var4);
   }

   // $FF: renamed from: b (java.lang.String, int) void
   private void method_962(String var1, int var2) {
      Logger var10000 = field_705;
      StringBuilder var10001 = new StringBuilder();
      String[] var3 = field_710;
      var10000.info(var10001.append("Connecting to ").append(var1).append(", ").append(var2).toString());
      class_645 var4 = new class_645;
      var4.method_3529(this, "Server Connector #" + field_704.incrementAndGet(), var1, var2);
      var4.start();
   }

   // $FF: renamed from: e () void
   public void method_871() {
      String[] var1 = class_752.method_4253();
      class_120 var10000 = this.field_706;
      if(var1 != null) {
         if(this.field_706 == null) {
            return;
         }

         var10000 = this.field_706;
      }

      if(var1 != null) {
         if(var10000.method_563()) {
            this.field_706.method_556();
            if(var1 != null) {
               return;
            }
         }

         var10000 = this.field_706;
      }

      if(var1 != null) {
         if(var10000.method_565() == null) {
            return;
         }

         var10000 = this.field_706;
      }

      var10000.method_564().method_237(this.field_706.method_565());
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {}

   // $FF: renamed from: b () void
   public void initGui() {
      this.buttonList.clear();
      List var10000 = this.buttonList;
      bcb var10001 = new bcb;
      int var10004 = this.width / 2 - 100;
      int var10005 = this.height / 2 + 50;
      String[] var10006 = field_710;
      var10001.method_747(0, var10004, var10005, class_1450.method_7896("gui.cancel", new Object[0]));
      var10000.add(var10001);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      if(var2 != null) {
         if(var1.field_450 != 0) {
            return;
         }

         this.field_707 = true;
      }

      class_182 var10000 = this;
      if(var2 != null) {
         if(this.field_706 != null) {
            class_120 var3 = this.field_706;
            class_1082 var10001 = new class_1082;
            String[] var10003 = field_710;
            var10001.method_6134("Aborted");
            var3.method_558(var10001);
         }

         var10000 = this;
      }

      var10000.field_557.method_5236(this.field_708);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      label15: {
         this.method_873();
         String[] var4 = class_752.method_4253();
         class_182 var10000 = this;
         if(var4 != null) {
            if(this.field_706 == null) {
               String[] var5 = field_710;
               this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("connect.connecting", new Object[0]), this.width / 2, this.height / 2 - 50, 16777215);
               if(var4 != null) {
                  break label15;
               }
            }

            var10000 = this;
         }

         String[] var10002 = field_710;
         var10000.drawCenteredString(this.fontRendererObj, class_1450.method_7896("connect.authorizing", new Object[0]), this.width / 2, this.height / 2 - 50, 16777215);
      }

      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: b (lh) boolean
   static boolean method_963(class_182 var0) {
      return var0.field_707;
   }

   // $FF: renamed from: b (lh, l) l
   static class_120 method_964(class_182 var0, class_120 var1) {
      return var0.field_706 = var1;
   }

   // $FF: renamed from: c (lh) l
   static class_120 method_965(class_182 var0) {
      return var0.field_706;
   }

   // $FF: renamed from: d (lh) bdw
   static bdw method_966(class_182 var0) {
      return var0.field_708;
   }

   // $FF: renamed from: f () org.apache.logging.log4j.Logger
   static Logger method_967() {
      return field_705;
   }

   // $FF: renamed from: <clinit> () void
   static void method_968() {
      // $FF: Couldn't be decompiled
   }
}
