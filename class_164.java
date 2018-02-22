import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

// $FF: renamed from: lz
public class class_164 extends bdw {

   // $FF: renamed from: b bdw
   private final bdw field_568;
   // $FF: renamed from: i bbj
   private final bbj field_569;
   // $FF: renamed from: r java.util.List
   private final List field_570;
   // $FF: renamed from: s java.util.List
   private final List field_571;
   // $FF: renamed from: t java.lang.String
   private String field_572;
   // $FF: renamed from: u java.lang.String[]
   private String[] field_573;
   // $FF: renamed from: v mm
   private class_966 field_574;
   // $FF: renamed from: w bcb
   private bcb field_575;
   // $FF: renamed from: x java.lang.String
   private static final String field_576;
   // $FF: renamed from: y java.lang.String[]
   private static final String[] field_577;


   // $FF: renamed from: <init> (bdw, bbj) void
   public void method_880(bdw var1, bbj var2) {
      super.method_651();
      this.field_570 = new ArrayList();
      this.field_571 = new ArrayList();
      this.field_568 = var1;
      this.field_569 = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var10000 = class_752.method_4253();
      String[] var8 = field_577;
      this.field_572 = class_1450.method_7896("options.snooper.title", new Object[0]);
      String[] var1 = var10000;
      String var2 = class_1450.method_7896("options.snooper.desc", new Object[0]);
      ArrayList var3 = new ArrayList();
      Iterator var4 = this.fontRendererObj.listFormattedStringToWidth(var2, this.width - 30).iterator();

      List var10;
      while(true) {
         if(var4.hasNext()) {
            String var5 = (String)var4.next();
            var3.add(var5);
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.field_573 = (String[])((String[])var3.toArray(new String[0]));
         this.field_570.clear();
         this.field_571.clear();
         var10 = this.buttonList;
         bcb var10002 = new bcb;
         var10002.method_748(1, this.width / 2 - 152, this.height - 30, 150, 20, this.field_569.method_5355(class_101.field_112));
         var10.add(this.field_575 = var10002);
         var10 = this.buttonList;
         bcb var10001 = new bcb;
         int var10004 = this.width / 2 + 2;
         int var10005 = this.height - 30;
         var8 = field_577;
         var10001.method_748(2, var10004, var10005, 150, 20, class_1450.method_7896("gui.done", new Object[0]));
         var10.add(var10001);
         break;
      }

      boolean var13;
      label72: {
         label71: {
            class_357 var11 = this.field_557.method_5280();
            if(var1 != null) {
               if(var11 == null) {
                  break label71;
               }

               var11 = this.field_557.method_5280();
            }

            if(var11.method_2392() != null) {
               var13 = true;
               break label72;
            }
         }

         var13 = false;
      }

      boolean var9 = var13;
      Iterator var6 = (new TreeMap(this.field_557.method_5282().method_9272())).entrySet().iterator();

      label61:
      while(true) {
         Entry var7;
         StringBuilder var12;
         if(var6.hasNext()) {
            var7 = (Entry)var6.next();
            var10 = this.field_570;
            var12 = new StringBuilder();
            if(var1 != null) {
               String var15;
               if(var9) {
                  var8 = field_577;
                  var15 = "C ";
               } else {
                  var15 = "";
               }

               var10.add(var12.append(var15).append((String)var7.getKey()).toString());
               this.field_571.add(this.fontRendererObj.trimStringToWidth((String)var7.getValue(), this.width - 220));
               if(var1 != null) {
                  continue;
               }

               if(!var9) {
                  break;
               }

               var6 = (new TreeMap(this.field_557.method_5280().method_2392().method_9272())).entrySet().iterator();
            } else {
               var10.add(var12.toString());
               this.field_571.add(this.fontRendererObj.trimStringToWidth((String)var7.getValue(), this.width - 220));
               if(var1 == null) {
                  return;
               }

               if(var1 == null) {
                  break;
               }
            }
         } else {
            if(!var9) {
               break;
            }

            var6 = (new TreeMap(this.field_557.method_5280().method_2392().method_9272())).entrySet().iterator();
         }

         while(true) {
            if(!var6.hasNext()) {
               break label61;
            }

            var7 = (Entry)var6.next();
            var10 = this.field_570;
            var12 = new StringBuilder();
            String[] var16 = field_577;
            var10.add(var12.append("S ").append((String)var7.getKey()).toString());
            this.field_571.add(this.fontRendererObj.trimStringToWidth((String)var7.getValue(), this.width - 220));
            if(var1 == null) {
               return;
            }

            if(var1 == null) {
               break label61;
            }
         }
      }

      class_966 var14 = new class_966;
      var14.method_5589(this);
      this.field_574 = var14;
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

      bcb var3;
      label34: {
         byte var10001 = 2;
         if(var2 != null) {
            if(var10000 == 2) {
               this.field_569.method_5358();
               this.field_569.method_5358();
               this.field_557.method_5236(this.field_568);
            }

            var3 = var1;
            if(var2 == null) {
               break label34;
            }

            var10000 = var1.field_450;
            var10001 = 1;
         }

         if(var10000 != var10001) {
            return;
         }

         this.field_569.method_5351(class_101.field_112, 1);
         var3 = this.field_575;
      }

      var3.field_449 = this.field_569.method_5355(class_101.field_112);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      String[] var10000 = class_752.method_4253();
      this.method_873();
      this.field_574.method_5570(var1, var2, var3);
      this.drawCenteredString(this.fontRendererObj, this.field_572, this.width / 2, 8, 16777215);
      int var5 = 22;
      String[] var4 = var10000;
      String[] var6 = this.field_573;
      int var7 = var6.length;
      int var8 = 0;

      while(true) {
         if(var8 < var7) {
            String var9 = var6[var8];
            this.drawCenteredString(this.fontRendererObj, var9, this.width / 2, var5, 8421504);
            var5 += this.fontRendererObj.FONT_HEIGHT;
            ++var8;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         super.drawScreen(var1, var2, var3);
         break;
      }

   }

   // $FF: renamed from: b (lz) java.util.List
   static List method_881(class_164 var0) {
      return var0.field_570;
   }

   // $FF: renamed from: c (lz) java.util.List
   static List method_882(class_164 var0) {
      return var0.field_571;
   }

   // $FF: renamed from: <clinit> () void
   static void method_883() {
      // $FF: Couldn't be decompiled
   }
}
