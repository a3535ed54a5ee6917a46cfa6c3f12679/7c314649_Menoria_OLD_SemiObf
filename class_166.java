import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: lx
public class class_166 extends bdw implements class_35 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_584;
   // $FF: renamed from: i java.text.DateFormat
   private final DateFormat field_585;
   // $FF: renamed from: r bdw
   protected bdw field_586;
   // $FF: renamed from: s java.lang.String
   protected String field_587;
   // $FF: renamed from: t boolean
   private boolean field_588;
   // $FF: renamed from: u int
   private int field_589;
   // $FF: renamed from: v java.util.List
   private List field_590;
   // $FF: renamed from: w ml
   private class_967 field_591;
   // $FF: renamed from: x java.lang.String
   private String field_592;
   // $FF: renamed from: y java.lang.String
   private String field_593;
   // $FF: renamed from: z java.lang.String[]
   private String[] field_594;
   // $FF: renamed from: A boolean
   private boolean field_595;
   // $FF: renamed from: B bcb
   private bcb field_596;
   // $FF: renamed from: C bcb
   private bcb field_597;
   // $FF: renamed from: D bcb
   private bcb field_598;
   // $FF: renamed from: E bcb
   private bcb field_599;
   // $FF: renamed from: F java.lang.String
   private static final String field_600;
   // $FF: renamed from: G java.lang.String[]
   private static final String[] field_601;


   // $FF: renamed from: <init> (bdw) void
   public void method_887(bdw var1) {
      super.method_651();
      this.field_585 = new SimpleDateFormat();
      String[] var10001 = field_601;
      this.field_587 = "Select world";
      this.field_594 = new String[3];
      this.field_586 = var1;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var2 = field_601;
      this.field_587 = class_1450.method_7896("selectWorld.title", new Object[0]);

      try {
         this.method_888();
      } catch (class_886 var3) {
         var2 = field_601;
         field_584.error("Couldn\'t load level list", var3);
         bao var10000 = this.field_557;
         class_174 var10001 = new class_174;
         var10001.method_932("Unable to load worlds", var3.getMessage());
         var10000.method_5236(var10001);
         return;
      }

      var2 = field_601;
      this.field_592 = class_1450.method_7896("selectWorld.world", new Object[0]);
      this.field_593 = class_1450.method_7896("selectWorld.conversion", new Object[0]);
      this.field_594[class_94.field_45.method_443()] = class_1450.method_7896("gameMode.survival", new Object[0]);
      this.field_594[class_94.field_46.method_443()] = class_1450.method_7896("gameMode.creative", new Object[0]);
      this.field_594[class_94.field_47.method_443()] = class_1450.method_7896("gameMode.adventure", new Object[0]);
      class_967 var4 = new class_967;
      var4.method_5590(this);
      this.field_591 = var4;
      this.field_591.method_5563(4, 5);
      this.method_891();
   }

   // $FF: renamed from: a () void
   private void method_888() {
      class_30 var1 = this.field_557.method_5235();
      this.field_590 = var1.method_137();
      Collections.sort(this.field_590);
      this.field_589 = -1;
   }

   // $FF: renamed from: a (int) java.lang.String
   protected String method_889(int var1) {
      return ((class_1339)this.field_590.get(var1)).method_7067();
   }

   // $FF: renamed from: b (int) java.lang.String
   protected String method_890(int var1) {
      String var3;
      String var4;
      label20: {
         String[] var10000 = class_752.method_4253();
         var3 = ((class_1339)this.field_590.get(var1)).method_7068();
         String[] var2 = var10000;
         var4 = var3;
         if(var2 != null) {
            if(var3 != null) {
               var4 = var3;
               if(var2 == null) {
                  return var4;
               }

               if(!class_1715.method_9574(var3)) {
                  break label20;
               }
            }

            StringBuilder var5 = new StringBuilder();
            String[] var10001 = field_601;
            var4 = var5.append(class_1450.method_7896("selectWorld.world", new Object[0])).append(" ").append(var1 + 1).toString();
         }

         var3 = var4;
      }

      var4 = var3;
      return var4;
   }

   // $FF: renamed from: f () void
   public void method_891() {
      List var10000 = this.buttonList;
      bcb var10002 = new bcb;
      int var10005 = this.width / 2 - 154;
      int var10006 = this.height - 52;
      String[] var1 = field_601;
      var10002.method_748(1, var10005, var10006, 150, 20, class_1450.method_7896("selectWorld.select", new Object[0]));
      var10000.add(this.field_597 = var10002);
      var10000 = this.buttonList;
      bcb var10001 = new bcb;
      var10001.method_748(3, this.width / 2 + 4, this.height - 52, 150, 20, class_1450.method_7896("selectWorld.create", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(6, this.width / 2 - 154, this.height - 28, 72, 20, class_1450.method_7896("selectWorld.rename", new Object[0]));
      var10000.add(this.field_598 = var10002);
      var10000 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(2, this.width / 2 - 76, this.height - 28, 72, 20, class_1450.method_7896("selectWorld.delete", new Object[0]));
      var10000.add(this.field_596 = var10002);
      var10000 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(7, this.width / 2 + 4, this.height - 28, 72, 20, class_1450.method_7896("selectWorld.recreate", new Object[0]));
      var10000.add(this.field_599 = var10002);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(0, this.width / 2 + 82, this.height - 28, 72, 20, class_1450.method_7896("gui.cancel", new Object[0]));
      var10000.add(var10001);
      this.field_597.field_451 = false;
      this.field_596.field_451 = false;
      this.field_598.field_451 = false;
      this.field_599.field_451 = false;
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.field_451;
      if(var2 != null) {
         if(!var1.field_451) {
            return;
         }

         var10000 = var1.field_450;
      }

      byte var10001 = 2;
      if(var2 != null) {
         if(var10000 == 2) {
            label68: {
               String var3 = this.method_890(this.field_589);
               if(var2 != null) {
                  if(var3 == null) {
                     break label68;
                  }

                  this.field_595 = true;
               }

               class_183 var4 = method_893(this, var3, this.field_589);
               this.field_557.method_5236(var4);
            }

            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = 1;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.method_892(this.field_589);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = 3;
      }

      label83: {
         bao var9;
         if(var2 != null) {
            if(var10000 == var10001) {
               var9 = this.field_557;
               class_180 var10 = new class_180;
               var10.method_943(this);
               var9.method_5236(var10);
               if(var2 != null) {
                  return;
               }
            }

            var10000 = var1.field_450;
            if(var2 == null) {
               break label83;
            }

            var10001 = 6;
         }

         if(var10000 == var10001) {
            var9 = this.field_557;
            class_167 var11 = new class_167;
            var11.method_907(this, this.method_889(this.field_589));
            var9.method_5236(var11);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
      }

      if(var2 != null) {
         if(var10000 == 0) {
            this.field_557.method_5236(this.field_586);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
      }

      if(var10000 == 7) {
         class_180 var6 = new class_180;
         var6.method_943(this);
         class_180 var7 = var6;
         class_29 var8 = this.field_557.method_5235().method_136(this.method_889(this.field_589), false);
         class_1303 var5 = var8.method_125();
         var8.method_131();
         var7.method_949(var5);
         this.field_557.method_5236(var7);
         if(var2 != null) {
            return;
         }
      }

      this.field_591.method_5569(var1);
   }

   // $FF: renamed from: d (int) void
   public void method_892(int var1) {
      String[] var10000 = class_752.method_4253();
      this.field_557.method_5236((bdw)null);
      String[] var2 = var10000;
      class_166 var6 = this;
      if(var2 != null) {
         if(this.field_588) {
            return;
         }

         this.field_588 = true;
         var6 = this;
      }

      String var3 = var6.method_889(var1);
      String var7 = var3;
      StringBuilder var8;
      if(var2 != null) {
         if(var3 == null) {
            var8 = new StringBuilder();
            String[] var5 = field_601;
            var3 = var8.append("World").append(var1).toString();
         }

         var7 = this.method_890(var1);
      }

      String var4;
      label32: {
         var4 = var7;
         var7 = var4;
         if(var2 != null) {
            if(var4 != null) {
               break label32;
            }

            var8 = new StringBuilder();
            String[] var10001 = field_601;
            var7 = var8.append("World").append(var1).toString();
         }

         var4 = var7;
      }

      bao var9 = this.field_557;
      if(var2 != null) {
         if(!this.field_557.method_5235().method_146(var3)) {
            return;
         }

         var9 = this.field_557;
      }

      var9.method_5258(var3, var4, (class_1045)null);
   }

   // $FF: renamed from: a (boolean, int) void
   public void method_160(boolean param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.field_591.method_5570(var1, var2, var3);
      this.drawCenteredString(this.fontRendererObj, this.field_587, this.width / 2, 20, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: b (mu, java.lang.String, int) lf
   public static class_183 method_893(class_35 var0, String var1, int var2) {
      String[] var8 = field_601;
      String var3 = class_1450.method_7896("selectWorld.deleteQuestion", new Object[0]);
      String var4 = "\'" + var1 + "\' " + class_1450.method_7896("selectWorld.deleteWarning", new Object[0]);
      String var5 = class_1450.method_7896("selectWorld.deleteButton", new Object[0]);
      String var6 = class_1450.method_7896("gui.cancel", new Object[0]);
      class_183 var10000 = new class_183;
      var10000.method_970(var0, var3, var4, var5, var6, var2);
      class_183 var7 = var10000;
      return var7;
   }

   // $FF: renamed from: b (lx) java.util.List
   static List method_894(class_166 var0) {
      return var0.field_590;
   }

   // $FF: renamed from: b (lx, int) int
   static int method_895(class_166 var0, int var1) {
      return var0.field_589 = var1;
   }

   // $FF: renamed from: c (lx) int
   static int method_896(class_166 var0) {
      return var0.field_589;
   }

   // $FF: renamed from: d (lx) bcb
   static bcb method_897(class_166 var0) {
      return var0.field_597;
   }

   // $FF: renamed from: e (lx) bcb
   static bcb method_898(class_166 var0) {
      return var0.field_596;
   }

   // $FF: renamed from: f (lx) bcb
   static bcb method_899(class_166 var0) {
      return var0.field_598;
   }

   // $FF: renamed from: g (lx) bcb
   static bcb method_900(class_166 var0) {
      return var0.field_599;
   }

   // $FF: renamed from: h (lx) java.lang.String
   static String method_901(class_166 var0) {
      return var0.field_592;
   }

   // $FF: renamed from: i (lx) java.text.DateFormat
   static DateFormat method_902(class_166 var0) {
      return var0.field_585;
   }

   // $FF: renamed from: j (lx) java.lang.String
   static String method_903(class_166 var0) {
      return var0.field_593;
   }

   // $FF: renamed from: k (lx) java.lang.String[]
   static String[] method_904(class_166 var0) {
      return var0.field_594;
   }

   // $FF: renamed from: <clinit> () void
   static void method_905() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (aB) aB
   private static class_886 method_906(class_886 var0) {
      return var0;
   }
}
