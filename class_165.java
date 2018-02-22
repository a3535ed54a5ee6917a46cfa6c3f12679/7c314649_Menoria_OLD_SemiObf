import java.util.List;

// $FF: renamed from: ly
public class class_165 extends bdw {

   // $FF: renamed from: b bdw
   private final bdw field_578;
   // $FF: renamed from: i bcb
   private bcb field_579;
   // $FF: renamed from: r bcb
   private bcb field_580;
   // $FF: renamed from: s java.lang.String
   private String field_581;
   // $FF: renamed from: t boolean
   private boolean field_582;
   // $FF: renamed from: u java.lang.String[]
   private static final String[] field_583;


   // $FF: renamed from: <init> (bdw) void
   public void method_884(bdw var1) {
      super.method_651();
      String[] var10001 = field_583;
      this.field_581 = "survival";
      this.field_578 = var1;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      this.buttonList.clear();
      List var10000 = this.buttonList;
      bcb var10001 = new bcb;
      int var10004 = this.width / 2 - 155;
      int var10005 = this.height - 28;
      String[] var1 = field_583;
      var10001.method_748(101, var10004, var10005, 150, 20, class_1450.method_7896("lanServer.start", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(102, this.width / 2 + 5, this.height - 28, 150, 20, class_1450.method_7896("gui.cancel", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      bcb var10002 = new bcb;
      var10002.method_748(104, this.width / 2 - 155, 100, 150, 20, class_1450.method_7896("selectWorld.gameMode", new Object[0]));
      var10000.add(this.field_580 = var10002);
      var10000 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(103, this.width / 2 + 5, 100, 150, 20, class_1450.method_7896("selectWorld.allowCommands", new Object[0]));
      var10000.add(this.field_579 = var10002);
      this.method_885();
   }

   // $FF: renamed from: f () void
   private void method_885() {
      bcb var10000 = this.field_580;
      StringBuilder var10001 = new StringBuilder();
      String[] var2 = field_583;
      var10000.field_449 = var10001.append(class_1450.method_7896("selectWorld.gameMode", new Object[0])).append(" ").append(class_1450.method_7896("selectWorld.gameMode." + this.field_581, new Object[0])).toString();
      String[] var1 = class_752.method_4253();
      var10000 = this.field_579;
      String var3 = class_1450.method_7896("selectWorld.allowCommands", new Object[0]) + " ";
      if(var1 != null) {
         var10000.field_449 = var3;
         if(this.field_582) {
            this.field_579.field_449 = this.field_579.field_449 + class_1450.method_7896("options.on", new Object[0]);
            if(var1 != null) {
               return;
            }
         }

         var10001 = new StringBuilder();
         var10000 = this.field_579;
         var10001 = var10001.append(this.field_579.field_449);
         String[] var10002 = field_583;
         var3 = var10001.append(class_1450.method_7896("options.off", new Object[0])).toString();
      }

      var10000.field_449 = var3;
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.field_450;
      byte var10001 = 102;
      if(var2 != null) {
         if(var1.field_450 == 102) {
            this.field_557.method_5236(this.field_578);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = 104;
      }

      String[] var5;
      if(var2 != null) {
         if(var10000 == var10001) {
            label63: {
               class_165 var7;
               label79: {
                  var5 = field_583;
                  boolean var6 = this.field_581.equals("survival");
                  if(var2 != null) {
                     if(var6) {
                        this.field_581 = "creative";
                        if(var2 != null) {
                           break label63;
                        }
                     }

                     var7 = this;
                     if(var2 == null) {
                        break label79;
                     }

                     var5 = field_583;
                     var6 = this.field_581.equals("creative");
                  }

                  if(var6) {
                     var5 = field_583;
                     this.field_581 = "adventure";
                     if(var2 != null) {
                        break label63;
                     }
                  }

                  var7 = this;
               }

               var5 = field_583;
               var7.field_581 = "survival";
            }

            this.method_885();
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = 103;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            boolean var8 = this.field_582;
            if(var2 != null) {
               var8 = !this.field_582;
            }

            this.field_582 = var8;
            this.method_885();
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = 101;
      }

      if(var10000 == var10001) {
         Object var4;
         label41: {
            this.field_557.method_5236((bdw)null);
            String var3 = this.field_557.method_5280().method_2389(class_94.method_450(this.field_581), this.field_582);
            if(var3 != null) {
               class_1081 var9 = new class_1081;
               var5 = field_583;
               var9.method_6126("commands.publish.started", new Object[]{var3});
               var4 = var9;
               if(var2 != null) {
                  break label41;
               }
            }

            class_1082 var10 = new class_1082;
            String[] var10002 = field_583;
            var10.method_6134("commands.publish.failed");
            var4 = var10;
         }

         this.field_557.canLoseFocus4.method_707().method_675((class_66)var4);
      }

   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      String[] var4 = field_583;
      this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("lanServer.title", new Object[0]), this.width / 2, 50, 16777215);
      this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("lanServer.otherPlayers", new Object[0]), this.width / 2, 82, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_886() {
      // $FF: Couldn't be decompiled
   }
}
