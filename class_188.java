import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsScreen;

// $FF: renamed from: lb
public class class_188 extends bdw {

   // $FF: renamed from: b net.minecraft.realms.RealmsScreen
   private RealmsScreen field_746;


   // $FF: renamed from: <init> (net.minecraft.realms.RealmsScreen) void
   public void method_988(RealmsScreen var1) {
      super.method_651();
      this.field_746 = var1;
      super.buttonList = Collections.synchronizedList(new ArrayList());
   }

   // $FF: renamed from: f () net.minecraft.realms.RealmsScreen
   public RealmsScreen method_989() {
      return this.field_746;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      this.field_746.init();
      super.initGui();
   }

   // $FF: renamed from: b (java.lang.String, int, int, int) void
   public void method_990(String var1, int var2, int var3, int var4) {
      super.drawCenteredString(this.fontRendererObj, var1, var2, var3, var4);
   }

   // $FF: renamed from: c (java.lang.String, int, int, int) void
   public void method_991(String var1, int var2, int var3, int var4) {
      super.method_657(this.fontRendererObj, var1, var2, var3, var4);
   }

   // $FF: renamed from: c (int, int, int, int, int, int) void
   public void method_658(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_746.blit(var1, var2, var3, var4, var5, var6);
      super.method_658(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: b (int, int, int, int, int, int) void
   public void drawGradientRect(int var1, int var2, int var3, int var4, int var5, int var6) {
      super.drawGradientRect(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: c () void
   public void method_873() {
      super.method_873();
   }

   // $FF: renamed from: d () boolean
   public boolean method_876() {
      return super.method_876();
   }

   // $FF: renamed from: c_ (int) void
   public void method_874(int var1) {
      super.method_874(var1);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.field_746.render(var1, var2, var3);
   }

   // $FF: renamed from: a (add, int, int) void
   public void method_859(add var1, int var2, int var3) {
      super.method_859(var1, var2, var3);
   }

   // $FF: renamed from: a (java.lang.String, int, int) void
   public void method_860(String var1, int var2, int var3) {
      super.method_860(var1, var2, var3);
   }

   // $FF: renamed from: a (java.util.List, int, int) void
   public void method_861(List var1, int var2, int var3) {
      super.method_861(var1, var2, var3);
   }

   // $FF: renamed from: e () void
   public void method_871() {
      this.field_746.tick();
      super.method_871();
   }

   // $FF: renamed from: g () int
   public int method_992() {
      return this.fontRendererObj.FONT_HEIGHT;
   }

   // $FF: renamed from: a (java.lang.String) int
   public int method_993(String var1) {
      return this.fontRendererObj.getCharWidth(var1);
   }

   // $FF: renamed from: d (java.lang.String, int, int, int) void
   public void method_994(String var1, int var2, int var3, int var4) {
      this.fontRendererObj.drawStringWithShadow(var1, var2, var3, var4);
   }

   // $FF: renamed from: b (java.lang.String, int) java.util.List
   public List method_995(String var1, int var2) {
      return this.fontRendererObj.listFormattedStringToWidth(var1, var2);
   }

   // $FF: renamed from: a (bcb) void
   public final void method_865(bcb var1) {
      this.field_746.buttonClicked(((class_151)var1).method_780());
   }

   // $FF: renamed from: h () void
   public void method_996() {
      super.buttonList.clear();
   }

   // $FF: renamed from: b (net.minecraft.realms.RealmsButton) void
   public void method_997(RealmsButton var1) {
      super.buttonList.add(var1.getProxy());
   }

   // $FF: renamed from: i () java.util.List
   public List method_998() {
      String[] var10000 = class_752.method_4253();
      ArrayList var2 = new ArrayList(super.buttonList.size());
      String[] var1 = var10000;
      Iterator var3 = super.buttonList.iterator();

      ArrayList var5;
      while(true) {
         if(var3.hasNext()) {
            bcb var4 = (bcb)var3.next();
            var5 = var2;
            if(var1 == null) {
               break;
            }

            var2.add(((class_151)var4).method_780());
            if(var1 != null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   // $FF: renamed from: c (net.minecraft.realms.RealmsButton) void
   public void method_999(RealmsButton var1) {
      super.buttonList.remove(var1);
   }

   // $FF: renamed from: a (int, int, int) void
   public void method_862(int var1, int var2, int var3) {
      this.field_746.mouseClicked(var1, var2, var3);
      super.method_862(var1, var2, var3);
   }

   // $FF: renamed from: k () void
   public void method_869() {
      this.field_746.mouseEvent();
      super.method_869();
   }

   // $FF: renamed from: l () void
   public void method_870() {
      this.field_746.keyboardEvent();
      super.method_870();
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_863(int var1, int var2, int var3) {
      this.field_746.mouseReleased(var1, var2, var3);
   }

   // $FF: renamed from: a (int, int, int, long) void
   public void method_864(int var1, int var2, int var3, long var4) {
      this.field_746.mouseDragged(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (char, int) void
   public void method_856(char var1, int var2) {
      this.field_746.keyPressed(var1, var2);
   }

   // $FF: renamed from: a (boolean, int) void
   public void method_1000(boolean var1, int var2) {
      this.field_746.confirmResult(var1, var2);
   }

   // $FF: renamed from: m () void
   public void method_872() {
      this.field_746.removed();
      super.method_872();
   }
}
