import java.util.List;

// $FF: renamed from: lg
public class class_184 extends class_183 {

   // $FF: renamed from: x java.lang.String
   private final String field_719;
   // $FF: renamed from: y java.lang.String
   private final String field_720;
   // $FF: renamed from: z java.lang.String
   private final String field_721;
   // $FF: renamed from: A boolean
   private boolean field_722;
   // $FF: renamed from: B java.lang.String[]
   private static final String[] field_723;


   // $FF: renamed from: <init> (mu, java.lang.String, int, boolean) void
   public void method_973(class_35 var1, String var2, int var3, boolean var4) {
      String[] var5 = class_752.method_4253();
      String var10002;
      String[] var6;
      if(var4) {
         var6 = field_723;
         var10002 = "chat.link.confirmTrusted";
      } else {
         var6 = field_723;
         var10002 = "chat.link.confirm";
      }

      super.method_969(var1, class_1450.method_7896(var10002, new Object[0]), var2, var3);
      this.field_722 = true;
      class_184 var10000 = this;
      String var10001;
      if(var4) {
         var6 = field_723;
         var10001 = "chat.link.open";
      } else {
         var6 = field_723;
         var10001 = "gui.yes";
      }

      var10001 = class_1450.method_7896(var10001, new Object[0]);
      if(var5 != null) {
         this.field_714 = var10001;
         var10000 = this;
         if(var4) {
            var6 = field_723;
            var10001 = "gui.cancel";
         } else {
            var6 = field_723;
            var10001 = "gui.no";
         }
      }

      var10000.field_715 = class_1450.method_7896(var10001, new Object[0]);
      var6 = field_723;
      this.field_720 = class_1450.method_7896("chat.copy", new Object[0]);
      this.field_719 = class_1450.method_7896("chat.link.warning", new Object[0]);
      this.field_721 = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      List var10000 = this.buttonList;
      bcb var10001 = new bcb;
      var10001.method_748(0, this.width / 3 - 83 + 0, this.height / 6 + 96, 100, 20, this.field_714);
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(2, this.width / 3 - 83 + 105, this.height / 6 + 96, 100, 20, this.field_720);
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(1, this.width / 3 - 83 + 210, this.height / 6 + 96, 100, 20, this.field_715);
      var10000.add(var10001);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      if(var1.field_450 == 2) {
         this.method_974();
      }

      int var10001 = var1.field_450;
      if(var2 != null) {
         var10001 = var1.field_450 == 0?1:0;
      }

      this.field_711.method_160((boolean)var10001, this.field_716);
   }

   // $FF: renamed from: f () void
   public void method_974() {
      method_858(this.field_721);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      super.drawScreen(var1, var2, var3);
      String[] var4 = class_752.method_4253();
      class_184 var10000 = this;
      if(var4 != null) {
         if(!this.field_722) {
            return;
         }

         var10000 = this;
      }

      var10000.drawCenteredString(this.fontRendererObj, this.field_719, this.width / 2, 110, 16764108);
   }

   // $FF: renamed from: g () void
   public void method_975() {
      this.field_722 = false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_972() {
      // $FF: Couldn't be decompiled
   }
}
