import java.util.List;

// $FF: renamed from: lc
public class class_187 extends bdw {

   // $FF: renamed from: b P[]
   private static final class_101[] field_738;
   // $FF: renamed from: i P[]
   private static final class_101[] field_739;
   // $FF: renamed from: r bdw
   private final bdw field_740;
   // $FF: renamed from: s bbj
   private final bbj field_741;
   // $FF: renamed from: t java.lang.String
   private String field_742;
   // $FF: renamed from: u java.lang.String
   private String field_743;
   // $FF: renamed from: v int
   private int field_744;
   // $FF: renamed from: w java.lang.String[]
   private static final String[] field_745;


   // $FF: renamed from: <init> (bdw, bbj) void
   public void method_986(bdw var1, bbj var2) {
      super.method_651();
      this.field_740 = var1;
      this.field_741 = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      int var2 = 0;
      String[] var7 = field_745;
      this.field_742 = class_1450.method_7896("options.chat.title", new Object[0]);
      this.field_743 = class_1450.method_7896("options.multiplayer.title", new Object[0]);
      class_101[] var3 = field_738;
      String[] var10000 = class_752.method_4253();
      int var4 = var3.length;
      int var5 = 0;
      String[] var1 = var10000;

      class_101 var6;
      int var8;
      List var9;
      class_141 var10;
      class_152 var10001;
      while(true) {
         if(var5 < var4) {
            var6 = var3[var5];
            var8 = var6.method_467();
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               label55: {
                  if(var8 != 0) {
                     var9 = this.buttonList;
                     var10001 = new class_152;
                     var10001.method_782(var6.method_469(), this.width / 2 - 155 + var2 % 2 * 160, this.height / 6 + 24 * (var2 >> 1), var6);
                     var9.add(var10001);
                     if(var1 != null) {
                        break label55;
                     }
                  }

                  var9 = this.buttonList;
                  var10 = new class_141;
                  var10.method_760(var6.method_469(), this.width / 2 - 155 + var2 % 2 * 160, this.height / 6 + 24 * (var2 >> 1), var6, this.field_741.method_5355(var6));
                  var9.add(var10);
               }
            }

            ++var2;
            ++var5;
            if(var1 != null) {
               continue;
            }
         }

         var8 = var2 % 2;
         break;
      }

      if(var1 != null) {
         if(var8 == 1) {
            ++var2;
         }

         this.field_744 = this.height / 6 + 24 * (var2 >> 1);
         var2 += 2;
         var3 = field_739;
         var4 = var3.length;
         var8 = 0;
      }

      var5 = var8;

      while(true) {
         if(var5 < var4) {
            var6 = var3[var5];
            boolean var12 = var6.method_467();
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               label39: {
                  if(var12) {
                     var9 = this.buttonList;
                     var10001 = new class_152;
                     var10001.method_782(var6.method_469(), this.width / 2 - 155 + var2 % 2 * 160, this.height / 6 + 24 * (var2 >> 1), var6);
                     var9.add(var10001);
                     if(var1 != null) {
                        break label39;
                     }
                  }

                  var9 = this.buttonList;
                  var10 = new class_141;
                  var10.method_760(var6.method_469(), this.width / 2 - 155 + var2 % 2 * 160, this.height / 6 + 24 * (var2 >> 1), var6, this.field_741.method_5355(var6));
                  var9.add(var10);
               }
            }

            ++var2;
            ++var5;
            if(var1 != null) {
               continue;
            }
         }

         var9 = this.buttonList;
         bcb var11 = new bcb;
         int var10004 = this.width / 2 - 100;
         int var10005 = this.height / 6 + 168;
         String[] var10006 = field_745;
         var11.method_747(200, var10004, var10005, class_1450.method_7896("gui.done", new Object[0]));
         var9.add(var11);
         break;
      }

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

      short var10001 = 100;
      if(var2 != null) {
         label28: {
            if(var10000 < 100) {
               var10000 = var1 instanceof class_141;
               if(var2 == null) {
                  break label28;
               }

               if(var10000 != 0) {
                  this.field_741.method_5351(((class_141)var1).method_761(), 1);
                  var1.field_449 = this.field_741.method_5355(class_101.method_464(var1.field_450));
               }
            }

            var10000 = var1.field_450;
         }

         var10001 = 200;
      }

      if(var10000 == var10001) {
         this.field_557.canLoseFocus7.method_5358();
         this.field_557.method_5236(this.field_740);
      }

   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      this.drawCenteredString(this.fontRendererObj, this.field_742, this.width / 2, 20, 16777215);
      this.drawCenteredString(this.fontRendererObj, this.field_743, this.width / 2, this.field_744 + 7, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_987() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "»wè©\'Dúdô¡<BC½sð¥\b³rõî,Y±»wè©\'Dújé¬<G¸få¥:BC½sð¥";
      int var4 = "»wè©\'Dúdô¡<BC½sð¥\b³rõî,Y±»wè©\'Dújé¬<G¸få¥:BC½sð¥".length();
      char var1 = 18;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_745 = var5;
                  field_738 = new class_101[]{class_101.field_107, class_101.field_108, class_101.field_109, class_101.field_110, class_101.field_111, class_101.field_117, class_101.field_119, class_101.field_120, class_101.field_118};
                  field_739 = new class_101[]{class_101.field_115};
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 61;
               break;
            case 1:
               var10009 = 238;
               break;
            case 2:
               var10009 = 117;
               break;
            case 3:
               var10009 = 41;
               break;
            case 4:
               var10009 = 161;
               break;
            case 5:
               var10009 = 133;
               break;
            default:
               var10009 = 222;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
