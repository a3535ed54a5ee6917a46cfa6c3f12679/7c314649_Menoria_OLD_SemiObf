import java.util.Collection;
import java.util.Iterator;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: jR
public class class_1295 extends class_1293 {

   // $FF: renamed from: c org.apache.logging.log4j.Logger
   private static final Logger field_6647;
   // $FF: renamed from: d kl
   private class_1348 field_6648;
   // $FF: renamed from: e ro
   private class_1583 field_6649;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6650;


   // $FF: renamed from: <init> () void
   public void method_6789() {
      String[] var10001 = field_6650;
      this.method_6768("scoreboard");
   }

   // $FF: renamed from: <init> (java.lang.String) void
   public void method_6768(String var1) {
      super.method_6768(var1);
   }

   // $FF: renamed from: b (kl) void
   public void method_6790(class_1348 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_6648 = var1;
      String[] var2 = var10000;
      class_1295 var3 = this;
      if(var2 != null) {
         if(this.field_6649 == null) {
            return;
         }

         var3 = this;
      }

      var3.method_6769(this.field_6649);
   }

   // $FF: renamed from: b (ro) void
   public void method_6769(class_1583 var1) {
      String[] var2 = class_752.method_4253();
      class_1295 var10000 = this;
      String[] var3;
      if(var2 != null) {
         if(this.field_6648 == null) {
            this.field_6649 = var1;
            return;
         }

         var3 = field_6650;
         this.method_6794(var1.method_8689("Objectives", 10));
         var10000 = this;
      }

      var3 = field_6650;
      var10000.method_6795(var1.method_8689("PlayerScores", 10));
      boolean var4 = var1.initGui8("DisplaySlots", 10);
      if(var2 != null) {
         if(var4) {
            this.method_6793(var1.method_8688("DisplaySlots"));
         }

         var3 = field_6650;
         var4 = var1.initGui8("Teams", 9);
      }

      if(var4) {
         String[] var10002 = field_6650;
         this.method_6791(var1.method_8689("Teams", 10));
      }

   }

   // $FF: renamed from: b (rr) void
   protected void method_6791(class_1580 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < var1.method_8658()) {
         class_1583 var4 = var1.method_8653(var3);
         String[] var6 = field_6650;
         class_1351 var5 = this.field_6648.method_7174(var4.method_8685("Name"));
         var5.setMaxStringLength2(var4.method_8685("DisplayName"));
         var5.setMaxStringLength5(var4.method_8685("Prefix"));
         var5.setMaxStringLength7(var4.method_8685("Suffix"));
         boolean var7 = var4.initGui8("AllowFriendlyFire", 99);
         if(var2 != null) {
            if(var7) {
               var5.setMaxStringLength9(var4.method_8690("AllowFriendlyFire"));
            }

            var6 = field_6650;
            var7 = var4.initGui8("SeeFriendlyInvisibles", 99);
         }

         if(var7) {
            var6 = field_6650;
            var5.getMaxStringLength0(var4.method_8690("SeeFriendlyInvisibles"));
         }

         String[] var10003 = field_6650;
         this.method_6792(var5, var4.method_8689("Players", 8));
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (ko, rr) void
   protected void method_6792(class_1351 var1, class_1580 var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      String[] var3 = var10000;

      while(var4 < var2.method_8658()) {
         this.field_6648.method_7176(var2.method_8657(var4), var1.method_7296());
         ++var4;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (ro) void
   protected void method_6793(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < 3) {
         label19: {
            class_1583 var7 = var1;
            StringBuilder var10001 = new StringBuilder();
            String[] var6 = field_6650;
            String var8 = var10001.append("slot_").append(var3).toString();
            if(var2 != null) {
               if(!var1.initGui8(var8, 8)) {
                  break label19;
               }

               var7 = var1;
               var8 = "slot_" + var3;
            }

            String var4 = var7.method_8685(var8);
            class_1344 var5 = this.field_6648.method_7160(var4);
            this.field_6648.method_7171(var3, var5);
         }

         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (rr) void
   protected void method_6794(class_1580 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < var1.method_8658()) {
         class_1583 var4 = var1.method_8653(var3);
         String[] var7 = field_6650;
         class_34 var5 = (class_34)class_34.field_1.get(var4.method_8685("CriteriaName"));
         class_1344 var6 = this.field_6648.method_7161(var4.method_8685("Name"), var5);
         var6.method_7120(var4.method_8685("DisplayName"));
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d (rr) void
   protected void method_6795(class_1580 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < var1.method_8658()) {
         class_1583 var4 = var1.method_8653(var3);
         String[] var7 = field_6650;
         class_1344 var5 = this.field_6648.method_7160(var4.method_8685("Objective"));
         class_1345 var6 = this.field_6648.method_7163(var4.method_8685("Name"), var5);
         var6.writeText3(var4.method_8681("Score"));
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (ro) void
   public void method_6770(class_1583 var1) {
      String[] var2 = class_752.method_4253();
      class_1295 var10000 = this;
      if(var2 != null) {
         String[] var3;
         if(this.field_6648 == null) {
            var3 = field_6650;
            field_6647.warn("Tried to save scoreboard without having a scoreboard...");
            return;
         }

         var3 = field_6650;
         var1.method_8664("Objectives", this.method_6798());
         var1.method_8664("PlayerScores", this.method_6799());
         var1.method_8664("Teams", this.method_6796());
         var10000 = this;
      }

      var10000.method_6797(var1);
   }

   // $FF: renamed from: c () rr
   protected class_1580 method_6796() {
      class_1580 var10000 = new class_1580;
      var10000.method_8628();
      class_1580 var2 = var10000;
      String[] var11 = class_752.method_4253();
      Collection var3 = this.field_6648.method_7180();
      String[] var1 = var11;
      Iterator var4 = var3.iterator();

      while(true) {
         if(var4.hasNext()) {
            class_1351 var5 = (class_1351)var4.next();
            class_1583 var12 = new class_1583;
            var12.method_8628();
            class_1583 var6 = var12;
            String[] var10 = field_6650;
            var6.initGui1("Name", var5.method_7296());
            var6.initGui1("DisplayName", var5.setMaxStringLength1());
            var6.initGui1("Prefix", var5.setMaxStringLength4());
            var6.initGui1("Suffix", var5.setMaxStringLength6());
            var6.initGui4("AllowFriendlyFire", var5.method_7299());
            var6.initGui4("SeeFriendlyInvisibles", var5.method_7298());
            var10000 = new class_1580;
            var10000.method_8628();
            if(var1 == null) {
               break;
            }

            class_1580 var7 = var10000;
            Iterator var8 = var5.setMaxStringLength3().iterator();

            while(true) {
               if(var8.hasNext()) {
                  String var9 = (String)var8.next();
                  class_1579 var10001 = new class_1579;
                  var10001.method_8648(var9);
                  var7.method_8650(var10001);
                  if(var1 == null) {
                     break;
                  }

                  if(var1 != null) {
                     continue;
                  }
               }

               String[] var13 = field_6650;
               var6.method_8664("Players", var7);
               var2.method_8650(var6);
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   // $FF: renamed from: e (ro) void
   protected void method_6797(class_1583 var1) {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var3 = var10000;
      String[] var8 = class_752.method_4253();
      boolean var4 = false;
      String[] var2 = var8;
      int var5 = 0;

      while(true) {
         if(var5 < 3) {
            class_1344 var6 = this.field_6648.method_7172(var5);
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               if(var6 != null) {
                  StringBuilder var10001 = new StringBuilder();
                  String[] var7 = field_6650;
                  var3.initGui1(var10001.append("slot_").append(var5).toString(), var6.GuiTextField7());
                  var4 = true;
               }

               ++var5;
            }

            if(var2 != null) {
               continue;
            }
         }

         if(var4) {
            String[] var9 = field_6650;
            var1.method_8664("DisplaySlots", var3);
         }
         break;
      }

   }

   // $FF: renamed from: d () rr
   protected class_1580 method_6798() {
      class_1580 var10000 = new class_1580;
      var10000.method_8628();
      class_1580 var2 = var10000;
      Collection var3 = this.field_6648.method_7165();
      String[] var8 = class_752.method_4253();
      Iterator var4 = var3.iterator();
      String[] var1 = var8;

      while(true) {
         if(var4.hasNext()) {
            class_1344 var5 = (class_1344)var4.next();
            class_1583 var9 = new class_1583;
            var9.method_8628();
            class_1583 var6 = var9;
            String[] var7 = field_6650;
            var6.initGui1("Name", var5.GuiTextField7());
            var6.initGui1("CriteriaName", var5.GuiTextField8().method_154());
            var6.initGui1("DisplayName", var5.GuiTextField9());
            var10000 = var2;
            if(var1 == null) {
               break;
            }

            var2.method_8650(var6);
            if(var1 != null) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   // $FF: renamed from: f () rr
   protected class_1580 method_6799() {
      String[] var10000 = class_752.method_4253();
      class_1580 var10001 = new class_1580;
      var10001.method_8628();
      class_1580 var2 = var10001;
      Collection var3 = this.field_6648.method_7168();
      String[] var1 = var10000;
      Iterator var4 = var3.iterator();

      class_1580 var9;
      while(true) {
         if(var4.hasNext()) {
            class_1345 var5 = (class_1345)var4.next();
            class_1583 var8 = new class_1583;
            var8.method_8628();
            class_1583 var6 = var8;
            String[] var7 = field_6650;
            var6.initGui1("Name", var5.writeText5());
            var6.initGui1("Objective", var5.writeText4().GuiTextField7());
            var6.method_8667("Score", var5.writeText2());
            var9 = var2;
            if(var1 == null) {
               break;
            }

            var2.method_8650(var6);
            if(var1 != null) {
               continue;
            }
         }

         var9 = var2;
         break;
      }

      return var9;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6800() {
      // $FF: Couldn't be decompiled
   }
}
