import java.util.List;

// $FF: renamed from: lq
public class class_173 extends bdw {

   // $FF: renamed from: b bdw
   protected bdw field_631;
   // $FF: renamed from: i mj
   private class_969 field_632;
   // $FF: renamed from: r bbj
   private final bbj field_633;
   // $FF: renamed from: s pI
   private final class_1452 field_634;
   // $FF: renamed from: t kZ
   private class_141 field_635;
   // $FF: renamed from: u kZ
   private class_141 field_636;
   // $FF: renamed from: v java.lang.String
   private static final String field_637;
   // $FF: renamed from: w java.lang.String[]
   private static final String[] field_638;


   // $FF: renamed from: <init> (bdw, bbj, pI) void
   public void method_926(bdw var1, bbj var2, class_1452 var3) {
      super.method_651();
      this.field_631 = var1;
      this.field_633 = var2;
      this.field_634 = var3;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      boolean var1 = false;
      if(this.field_635 != null) {
         ;
      }

      List var10000 = this.buttonList;
      class_141 var10002 = new class_141;
      var10002.method_760(100, this.width / 2 - 155, this.height - 38, class_101.field_123, this.field_633.method_5355(class_101.field_123));
      var10000.add(this.field_635 = var10002);
      var10000 = this.buttonList;
      var10002 = new class_141;
      int var10005 = this.width / 2 - 155 + 160;
      int var10006 = this.height - 38;
      String[] var10007 = field_638;
      var10002.method_747(6, var10005, var10006, class_1450.method_7896("gui.done", new Object[0]));
      var10000.add(this.field_636 = var10002);
      class_969 var10001 = new class_969;
      var10001.method_5595(this);
      this.field_632 = var10001;
      this.field_632.method_5563(7, 8);
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

      switch(var10000) {
      case 5:
         if(var2 != null) {
            break;
         }
      case 6:
         this.field_557.method_5236(this.field_631);
         if(var2 != null) {
            break;
         }
      case 100:
         bcb var6 = var1;
         if(var2 != null) {
            if(!(var1 instanceof class_141)) {
               break;
            }

            this.field_633.method_5351(((class_141)var1).method_761(), 1);
            var6 = var1;
         }

         var6.field_449 = this.field_633.method_5355(class_101.field_123);
         class_1338 var7 = new class_1338;
         var7.method_7060(this.field_557, this.field_557.cursorCounter2, this.field_557.cursorCounter3);
         class_1338 var3 = var7;
         int var4 = var3.method_7061();
         int var5 = var3.method_7062();
         this.method_866(this.field_557, var4, var5);
         if(var2 != null) {
            break;
         }
      default:
         this.field_632.method_5569(var1);
      }

   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.field_632.method_5570(var1, var2, var3);
      String[] var4 = field_638;
      this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("options.language", new Object[0]), this.width / 2, 16, 16777215);
      this.drawCenteredString(this.fontRendererObj, "(" + class_1450.method_7896("options.languageWarning", new Object[0]) + ")", this.width / 2, this.height - 56, 8421504);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: b (lq) pI
   static class_1452 method_927(class_173 var0) {
      return var0.field_634;
   }

   // $FF: renamed from: c (lq) bbj
   static bbj method_928(class_173 var0) {
      return var0.field_633;
   }

   // $FF: renamed from: d (lq) kZ
   static class_141 method_929(class_173 var0) {
      return var0.field_636;
   }

   // $FF: renamed from: e (lq) kZ
   static class_141 method_930(class_173 var0) {
      return var0.field_635;
   }

   // $FF: renamed from: <clinit> () void
   static void method_931() {
      // $FF: Couldn't be decompiled
   }
}
