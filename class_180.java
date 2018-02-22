import java.util.List;
import org.lwjgl.input.Keyboard;

// $FF: renamed from: lj
public class class_180 extends bdw {

   // $FF: renamed from: b bdw
   private bdw field_665;
   // $FF: renamed from: i k_
   private GuiTextField field_666;
   // $FF: renamed from: r k_
   private GuiTextField field_667;
   // $FF: renamed from: s java.lang.String
   private String field_668;
   // $FF: renamed from: t java.lang.String
   private String field_669;
   // $FF: renamed from: u boolean
   private boolean field_670;
   // $FF: renamed from: v boolean
   private boolean field_671;
   // $FF: renamed from: w boolean
   private boolean field_672;
   // $FF: renamed from: x boolean
   private boolean field_673;
   // $FF: renamed from: y boolean
   private boolean field_674;
   // $FF: renamed from: z boolean
   private boolean field_675;
   // $FF: renamed from: A boolean
   private boolean field_676;
   // $FF: renamed from: B bcb
   private bcb field_677;
   // $FF: renamed from: C bcb
   private bcb field_678;
   // $FF: renamed from: D bcb
   private bcb field_679;
   // $FF: renamed from: E bcb
   private bcb field_680;
   // $FF: renamed from: F bcb
   private bcb field_681;
   // $FF: renamed from: G bcb
   private bcb field_682;
   // $FF: renamed from: H bcb
   private bcb field_683;
   // $FF: renamed from: I java.lang.String
   private String field_684;
   // $FF: renamed from: J java.lang.String
   private String field_685;
   // $FF: renamed from: K java.lang.String
   private String field_686;
   // $FF: renamed from: L java.lang.String
   private String field_687;
   // $FF: renamed from: M int
   private int field_688;
   // $FF: renamed from: N java.lang.String
   public String field_689;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_690;
   // $FF: renamed from: P java.lang.String[]
   private static final String[] field_691;


   // $FF: renamed from: <init> (bdw) void
   public void method_943(bdw var1) {
      super.method_651();
      String[] var2 = field_691;
      this.field_669 = "survival";
      this.field_670 = true;
      this.field_689 = "";
      this.field_665 = var1;
      this.field_686 = "";
      this.field_687 = class_1450.method_7896("selectWorld.newWorld", new Object[0]);
   }

   // $FF: renamed from: e () void
   public void method_871() {
      this.field_666.method_712();
      this.field_667.method_712();
   }

   // $FF: renamed from: b () void
   public void initGui() {
      Keyboard.enableRepeatEvents(true);
      this.buttonList.clear();
      List var10000 = this.buttonList;
      bcb var10001 = new bcb;
      int var10004 = this.width / 2 - 155;
      int var10005 = this.height - 28;
      String[] var1 = field_691;
      var10001.method_748(0, var10004, var10005, 150, 20, class_1450.method_7896("selectWorld.create", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(1, this.width / 2 + 5, this.height - 28, 150, 20, class_1450.method_7896("gui.cancel", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      bcb var10002 = new bcb;
      var10002.method_748(2, this.width / 2 - 75, 115, 150, 20, class_1450.method_7896("selectWorld.gameMode", new Object[0]));
      var10000.add(this.field_677 = var10002);
      var10000 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(3, this.width / 2 - 75, 187, 150, 20, class_1450.method_7896("selectWorld.moreWorldOptions", new Object[0]));
      var10000.add(this.field_678 = var10002);
      var10000 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(4, this.width / 2 - 155, 100, 150, 20, class_1450.method_7896("selectWorld.mapFeatures", new Object[0]));
      var10000.add(this.field_679 = var10002);
      this.field_679.field_452 = false;
      var10000 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(7, this.width / 2 + 5, 151, 150, 20, class_1450.method_7896("selectWorld.bonusItems", new Object[0]));
      var10000.add(this.field_680 = var10002);
      this.field_680.field_452 = false;
      var10000 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(5, this.width / 2 + 5, 100, 150, 20, class_1450.method_7896("selectWorld.mapType", new Object[0]));
      var10000.add(this.field_681 = var10002);
      this.field_681.field_452 = false;
      var10000 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(6, this.width / 2 - 155, 151, 150, 20, class_1450.method_7896("selectWorld.allowCommands", new Object[0]));
      var10000.add(this.field_682 = var10002);
      this.field_682.field_452 = false;
      var10000 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(8, this.width / 2 + 5, 120, 150, 20, class_1450.method_7896("selectWorld.customizeType", new Object[0]));
      var10000.add(this.field_683 = var10002);
      this.field_683.field_452 = false;
      GuiTextField var2 = new GuiTextField;
      var2.GuiTextField(this.fontRendererObj, this.width / 2 - 100, 60, 200, 20);
      this.field_666 = var2;
      this.field_666.setFocused(true);
      this.field_666.writeText(this.field_687);
      var2 = new GuiTextField;
      var2.GuiTextField(this.fontRendererObj, this.width / 2 - 100, 60, 200, 20);
      this.field_667 = var2;
      this.field_667.writeText(this.field_686);
      this.method_948(this.field_676);
      this.method_944();
      this.method_945();
   }

   // $FF: renamed from: f () void
   private void method_944() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () void
   private void method_945() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (j_, java.lang.String) java.lang.String
   public static String method_946(class_30 param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: m () void
   public void method_872() {
      Keyboard.enableRepeatEvents(false);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h () void
   private void method_947() {
      String[] var1 = class_752.method_4253();

      class_180 var10000;
      boolean var10001;
      label22: {
         label21: {
            try {
               var10000 = this;
               var10001 = this.field_676;
               if(var1 == null) {
                  break label22;
               }

               if(!this.field_676) {
                  break label21;
               }
            } catch (NumberFormatException var2) {
               throw method_951(var2);
            }

            var10001 = false;
            break label22;
         }

         var10001 = true;
      }

      var10000.method_948(var10001);
   }

   // $FF: renamed from: b (boolean) void
   private void method_948(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int param1, int param2, float param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (jY) void
   public void method_949(class_1303 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_950() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.NumberFormatException) java.lang.NumberFormatException
   private static NumberFormatException method_951(NumberFormatException var0) {
      return var0;
   }
}
