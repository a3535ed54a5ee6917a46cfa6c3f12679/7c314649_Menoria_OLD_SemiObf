import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.ChatUserMode;
import tv.twitch.chat.ChatUserSubscription;

// $FF: renamed from: l3
public class class_201 extends bdw {

   // $FF: renamed from: b v
   private static final class_130 field_900;
   // $FF: renamed from: i v
   private static final class_130 field_901;
   // $FF: renamed from: r v
   private static final class_130 field_902;
   // $FF: renamed from: s tv.twitch.chat.ChatUserInfo
   private final ChatUserInfo field_903;
   // $FF: renamed from: t rV
   private final class_66 field_904;
   // $FF: renamed from: u java.util.List
   private final List field_905;
   // $FF: renamed from: v qC
   private final class_51 field_906;
   // $FF: renamed from: w int
   private int field_907;
   // $FF: renamed from: x java.lang.String[]
   private static final String[] field_908;


   // $FF: renamed from: <init> (qC, tv.twitch.chat.ChatUserInfo) void
   public void method_1092(class_51 var1, ChatUserInfo var2) {
      super.method_651();
      this.field_905 = Lists.newArrayList();
      this.field_906 = var1;
      this.field_903 = var2;
      class_1082 var10001 = new class_1082;
      var10001.method_6134(var2.displayName);
      this.field_904 = var10001;
      this.field_905.addAll(method_1093(var2.modes, var2.subscriptions, var1));
   }

   // $FF: renamed from: b (java.util.Set, java.util.Set, qC) java.util.List
   public static List method_1093(Set var0, Set var1, class_51 var2) {
      String[] var3;
      String var13;
      class_51 var10000;
      label74: {
         var3 = class_752.method_4253();
         var10000 = var2;
         if(var3 != null) {
            if(var2 == null) {
               var13 = null;
               break label74;
            }

            var10000 = var2;
         }

         var13 = var10000.method_211();
      }

      String var4;
      boolean var14;
      label68: {
         label77: {
            var4 = var13;
            var10000 = var2;
            if(var3 != null) {
               if(var2 == null) {
                  break label77;
               }

               var10000 = var2;
            }

            var14 = var10000.method_210();
            if(var3 == null) {
               break label68;
            }

            if(var14) {
               var14 = true;
               break label68;
            }
         }

         var14 = false;
      }

      boolean var5 = var14;
      ArrayList var6 = Lists.newArrayList();
      Iterator var7 = var0.iterator();

      class_66 var9;
      class_1082 var10;
      Object var15;
      class_1082 var16;
      while(true) {
         if(var7.hasNext()) {
            ChatUserMode var8 = (ChatUserMode)var7.next();
            var9 = method_1095(var8, var4, var5);
            var15 = var9;
            if(var3 == null) {
               break;
            }

            if(var9 != null) {
               var16 = new class_1082;
               String[] var11 = field_908;
               var16.method_6134("- ");
               var10 = var16;
               var10.method_340(var9);
               var6.add(var10);
            }

            if(var3 != null) {
               continue;
            }

            var7 = var1.iterator();
         } else {
            var7 = var1.iterator();
         }

         if(!var7.hasNext()) {
            return var6;
         }

         var15 = var7.next();
         break;
      }

      while(true) {
         ChatUserSubscription var12 = (ChatUserSubscription)var15;
         var9 = method_1094(var12, var4, var5);
         if(var9 != null) {
            var16 = new class_1082;
            String[] var10002 = field_908;
            var16.method_6134("- ");
            var10 = var16;
            var10.method_340(var9);
            var6.add(var10);
         }

         if(var3 == null || !var7.hasNext()) {
            return var6;
         }

         var15 = var7.next();
      }
   }

   // $FF: renamed from: b (tv.twitch.chat.ChatUserSubscription, java.lang.String, boolean) rV
   public static class_66 method_1094(ChatUserSubscription var0, String var1, boolean var2) {
      String[] var10000 = class_752.method_4253();
      class_1081 var4 = null;
      String[] var3 = var10000;
      ChatUserSubscription var6 = var0;
      ChatUserSubscription var10001 = ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER;
      class_1081 var7;
      if(var3 != null) {
         if(var0 == ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER) {
            String[] var5;
            if(var1 == null) {
               var7 = new class_1081;
               var5 = field_908;
               var7.method_6126("stream.user.subscription.subscriber", new Object[0]);
               var4 = var7;
            } else if(var2) {
               var7 = new class_1081;
               var5 = field_908;
               var7.method_6126("stream.user.subscription.subscriber.self", new Object[0]);
               var4 = var7;
            } else {
               var7 = new class_1081;
               var5 = field_908;
               var7.method_6126("stream.user.subscription.subscriber.other", new Object[]{var1});
               var4 = var7;
            }

            var4.method_338().method_8524(field_900);
            return var4;
         }

         var6 = var0;
         var10001 = ChatUserSubscription.TTV_CHAT_USERSUB_TURBO;
      }

      if(var6 == var10001) {
         var7 = new class_1081;
         String[] var10002 = field_908;
         var7.method_6126("stream.user.subscription.turbo", new Object[0]);
         var4 = var7;
         var4.method_338().method_8524(field_902);
      }

      return var4;
   }

   // $FF: renamed from: b (tv.twitch.chat.ChatUserMode, java.lang.String, boolean) rV
   public static class_66 method_1095(ChatUserMode var0, String var1, boolean var2) {
      String[] var10000 = class_752.method_4253();
      class_1081 var4 = null;
      String[] var3 = var10000;
      ChatUserMode var6 = var0;
      ChatUserMode var10001 = ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR;
      String[] var5;
      class_1081 var7;
      if(var3 != null) {
         if(var0 == ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR) {
            var7 = new class_1081;
            var5 = field_908;
            var7.method_6126("stream.user.mode.administrator", new Object[0]);
            var4 = var7;
            var4.method_338().method_8524(field_902);
            return var4;
         }

         var6 = var0;
         var10001 = ChatUserMode.TTV_CHAT_USERMODE_BANNED;
      }

      if(var3 != null) {
         if(var6 == var10001) {
            if(var1 == null) {
               var7 = new class_1081;
               var5 = field_908;
               var7.method_6126("stream.user.mode.banned", new Object[0]);
               var4 = var7;
            } else if(var2) {
               var7 = new class_1081;
               var5 = field_908;
               var7.method_6126("stream.user.mode.banned.self", new Object[0]);
               var4 = var7;
            } else {
               var7 = new class_1081;
               var5 = field_908;
               var7.method_6126("stream.user.mode.banned.other", new Object[]{var1});
               var4 = var7;
            }

            var4.method_338().method_8524(field_901);
            return var4;
         }

         var6 = var0;
         var10001 = ChatUserMode.TTV_CHAT_USERMODE_BROADCASTER;
      }

      if(var3 != null) {
         if(var6 == var10001) {
            if(var1 == null) {
               var7 = new class_1081;
               var5 = field_908;
               var7.method_6126("stream.user.mode.broadcaster", new Object[0]);
               var4 = var7;
            } else if(var2) {
               var7 = new class_1081;
               var5 = field_908;
               var7.method_6126("stream.user.mode.broadcaster.self", new Object[0]);
               var4 = var7;
            } else {
               var7 = new class_1081;
               var5 = field_908;
               var7.method_6126("stream.user.mode.broadcaster.other", new Object[0]);
               var4 = var7;
            }

            var4.method_338().method_8524(field_900);
            return var4;
         }

         var6 = var0;
         var10001 = ChatUserMode.TTV_CHAT_USERMODE_MODERATOR;
      }

      if(var3 != null) {
         if(var6 == var10001) {
            if(var1 == null) {
               var7 = new class_1081;
               var5 = field_908;
               var7.method_6126("stream.user.mode.moderator", new Object[0]);
               var4 = var7;
            } else if(var2) {
               var7 = new class_1081;
               var5 = field_908;
               var7.method_6126("stream.user.mode.moderator.self", new Object[0]);
               var4 = var7;
            } else {
               var7 = new class_1081;
               var5 = field_908;
               var7.method_6126("stream.user.mode.moderator.other", new Object[]{var1});
               var4 = var7;
            }

            var4.method_338().method_8524(field_900);
            return var4;
         }

         var6 = var0;
         var10001 = ChatUserMode.TTV_CHAT_USERMODE_STAFF;
      }

      if(var6 == var10001) {
         var7 = new class_1081;
         String[] var10002 = field_908;
         var7.method_6126("stream.user.mode.staff", new Object[0]);
         var4 = var7;
         var4.method_338().method_8524(field_902);
      }

      return var4;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      int var2 = this.width / 3;
      int var3 = var2 - 130;
      List var10000 = this.buttonList;
      bcb var10001 = new bcb;
      int var10004 = var2 * 0 + var3 / 2;
      int var10005 = this.height - 70;
      String[] var7 = field_908;
      var10001.method_748(1, var10004, var10005, 130, 20, class_1450.method_7896("stream.userinfo.timeout", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(0, var2 * 1 + var3 / 2, this.height - 70, 130, 20, class_1450.method_7896("stream.userinfo.ban", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(2, var2 * 2 + var3 / 2, this.height - 70, 130, 20, class_1450.method_7896("stream.userinfo.mod", new Object[0]));
      var10000.add(var10001);
      String[] var8 = class_752.method_4253();
      List var9 = this.buttonList;
      bcb var10002 = new bcb;
      var10002.method_748(5, var2 * 0 + var3 / 2, this.height - 45, 130, 20, class_1450.method_7896("gui.cancel", new Object[0]));
      var9.add(var10002);
      String[] var1 = var8;
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(3, var2 * 1 + var3 / 2, this.height - 45, 130, 20, class_1450.method_7896("stream.userinfo.unban", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(4, var2 * 2 + var3 / 2, this.height - 45, 130, 20, class_1450.method_7896("stream.userinfo.unmod", new Object[0]));
      var10000.add(var10001);
      int var4 = 0;
      Iterator var5 = this.field_905.iterator();

      while(true) {
         if(var5.hasNext()) {
            class_66 var6 = (class_66)var5.next();
            var4 = Math.max(var4, this.fontRendererObj.getCharWidth(var6.method_343()));
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.field_907 = this.width / 2 - var4 / 2;
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

      label58: {
         StringBuilder var10001;
         String[] var3;
         class_51 var4;
         if(var2 != null) {
            if(var10000 == 0) {
               var4 = this.field_906;
               var10001 = new StringBuilder();
               var3 = field_908;
               var4.method_213(var10001.append("/ban ").append(this.field_903.displayName).toString());
               if(var2 != null) {
                  break label58;
               }
            }

            var10000 = var1.field_450;
         }

         byte var5 = 3;
         if(var2 != null) {
            if(var10000 == 3) {
               var4 = this.field_906;
               var10001 = new StringBuilder();
               var3 = field_908;
               var4.method_213(var10001.append("/unban ").append(this.field_903.displayName).toString());
               if(var2 != null) {
                  break label58;
               }
            }

            var10000 = var1.field_450;
            var5 = 2;
         }

         if(var2 != null) {
            if(var10000 == var5) {
               var4 = this.field_906;
               var10001 = new StringBuilder();
               var3 = field_908;
               var4.method_213(var10001.append("/mod ").append(this.field_903.displayName).toString());
               if(var2 != null) {
                  break label58;
               }
            }

            var10000 = var1.field_450;
            var5 = 4;
         }

         if(var2 != null) {
            if(var10000 == var5) {
               var4 = this.field_906;
               var10001 = new StringBuilder();
               var3 = field_908;
               var4.method_213(var10001.append("/unmod ").append(this.field_903.displayName).toString());
               if(var2 != null) {
                  break label58;
               }
            }

            var10000 = var1.field_450;
            var5 = 1;
         }

         if(var10000 == var5) {
            var4 = this.field_906;
            var10001 = new StringBuilder();
            String[] var10002 = field_908;
            var4.method_213(var10001.append("/timeout ").append(this.field_903.displayName).toString());
         }
      }

      this.field_557.method_5236((bdw)null);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      String[] var10000 = class_752.method_4253();
      this.drawCenteredString(this.fontRendererObj, this.field_904.method_342(), this.width / 2, 70, 16777215);
      String[] var4 = var10000;
      int var5 = 80;
      Iterator var6 = this.field_905.iterator();

      while(true) {
         if(var6.hasNext()) {
            class_66 var7 = (class_66)var6.next();
            this.method_657(this.fontRendererObj, var7.method_343(), this.field_907, var5, 16777215);
            var5 += this.fontRendererObj.FONT_HEIGHT;
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

   // $FF: renamed from: <clinit> () void
   static void method_1096() {
      // $FF: Couldn't be decompiled
   }
}
