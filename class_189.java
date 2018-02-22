import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: lZ
public class class_189 extends bdw {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_747;
   // $FF: renamed from: i bdw
   private bdw field_748;
   // $FF: renamed from: r java.util.List
   private List field_749;
   // $FF: renamed from: s java.util.List
   private List field_750;
   // $FF: renamed from: t mf
   private class_975 field_751;
   // $FF: renamed from: u mg
   private class_974 field_752;
   // $FF: renamed from: v java.lang.String
   private static final String field_753;
   // $FF: renamed from: w java.lang.String[]
   private static final String[] field_754;


   // $FF: renamed from: <init> (bdw) void
   public void method_1001(bdw var1) {
      super.method_651();
      this.field_748 = var1;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      List var10000 = this.buttonList;
      class_141 var10001 = new class_141;
      int var10004 = this.width / 2 - 154;
      int var10005 = this.height - 48;
      String[] var6 = field_754;
      var10001.method_747(2, var10004, var10005, class_1450.method_7896("resourcePack.openFolder", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new class_141;
      var10001.method_747(1, this.width / 2 + 4, this.height - 48, class_1450.method_7896("gui.done", new Object[0]));
      var10000.add(var10001);
      this.field_749 = new ArrayList();
      String[] var7 = class_752.method_4253();
      this.field_750 = new ArrayList();
      class_1511 var2 = this.field_557.method_5290();
      var2.method_8198();
      ArrayList var3 = Lists.newArrayList(var2.method_8199());
      String[] var1 = var7;
      var3.removeAll(var2.method_8200());
      Iterator var4 = var3.iterator();

      class_1514 var5;
      class_1372 var8;
      while(true) {
         if(var4.hasNext()) {
            var5 = (class_1514)var4.next();
            var10000 = this.field_749;
            var8 = new class_1372;
            var8.method_7481(this, var5);
            var10000.add(var8);
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         var4 = Lists.reverse(var2.method_8200()).iterator();
         break;
      }

      while(true) {
         if(var4.hasNext()) {
            var5 = (class_1514)var4.next();
            var10000 = this.field_750;
            var8 = new class_1372;
            var8.method_7481(this, var5);
            var10000.add(var8);
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         var10000 = this.field_750;
         class_1373 var9 = new class_1373;
         var9.method_7471(this);
         var10000.add(var9);
         class_975 var10 = new class_975;
         var10.method_5607(this.field_557, 200, this.height, this.field_749);
         this.field_751 = var10;
         this.field_751.method_5577(this.width / 2 - 4 - 200);
         this.field_751.method_5563(7, 8);
         class_974 var11 = new class_974;
         var11.method_5607(this.field_557, 200, this.height, this.field_750);
         this.field_752 = var11;
         this.field_752.method_5577(this.width / 2 + 4);
         this.field_752.method_5563(7, 8);
         break;
      }

   }

   // $FF: renamed from: b (mI) boolean
   public boolean method_1002(class_1371 var1) {
      return this.field_750.contains(var1);
   }

   // $FF: renamed from: c (mI) java.util.List
   public List method_1003(class_1371 var1) {
      String[] var2 = class_752.method_4253();
      class_189 var10000 = this;
      List var3;
      if(var2 != null) {
         if(this.method_1002(var1)) {
            var3 = this.field_750;
            return var3;
         }

         var10000 = this;
      }

      var3 = var10000.field_749;
      return var3;
   }

   // $FF: renamed from: f () java.util.List
   public List method_1004() {
      return this.field_749;
   }

   // $FF: renamed from: g () java.util.List
   public List method_1005() {
      return this.field_750;
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      super.method_862(var1, var2, var3);
      this.field_751.method_5604(var1, var2, var3);
      this.field_752.method_5604(var1, var2, var3);
   }

   // $FF: renamed from: b (int, int, int) void
   protected void method_863(int var1, int var2, int var3) {
      super.method_863(var1, var2, var3);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_875(0);
      this.field_751.method_5570(var1, var2, var3);
      this.field_752.method_5570(var1, var2, var3);
      String[] var4 = field_754;
      this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("resourcePack.title", new Object[0]), this.width / 2, 16, 16777215);
      this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("resourcePack.folderInfo", new Object[0]), this.width / 2 - 77, this.height - 26, 8421504);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1006() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_1007(IOException var0) {
      return var0;
   }
}
