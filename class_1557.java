import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.apache.logging.log4j.Logger;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.chat.Chat;
import tv.twitch.chat.ChatChannelInfo;
import tv.twitch.chat.ChatEvent;
import tv.twitch.chat.ChatMessageList;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserList;
import tv.twitch.chat.IChatCallbacks;
import tv.twitch.chat.StandardChatAPI;

// $FF: renamed from: qw
public class class_1557 implements IChatCallbacks {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_8165;
   // $FF: renamed from: b qy
   protected class_68 field_8166;
   // $FF: renamed from: c java.lang.String
   protected String field_8167;
   // $FF: renamed from: d java.lang.String
   protected String field_8168;
   // $FF: renamed from: e java.lang.String
   protected String field_8169;
   // $FF: renamed from: f java.lang.String
   protected String field_8170;
   // $FF: renamed from: g tv.twitch.chat.Chat
   protected Chat field_8171;
   // $FF: renamed from: h boolean
   protected boolean field_8172;
   // $FF: renamed from: i boolean
   protected boolean field_8173;
   // $FF: renamed from: j ac
   protected class_902 field_8174;
   // $FF: renamed from: k tv.twitch.AuthToken
   protected AuthToken field_8175;
   // $FF: renamed from: l java.util.List
   protected List field_8176;
   // $FF: renamed from: m java.util.LinkedList
   protected LinkedList field_8177;
   // $FF: renamed from: n int
   protected int field_8178;
   // $FF: renamed from: o boolean
   protected boolean field_8179;
   // $FF: renamed from: p boolean
   protected boolean field_8180;
   // $FF: renamed from: q java.lang.String
   private static final String field_8181;
   // $FF: renamed from: r java.lang.String[]
   private static final String[] field_8182;


   public void chatStatusCallback(ErrorCode var1) {
      if(!ErrorCode.succeeded(var1)) {
         this.field_8174 = class_902.visible5;
      }

   }

   public void chatChannelMembershipCallback(ChatEvent var1, ChatChannelInfo var2) {
      label19: {
         String[] var3 = class_752.method_4253();
         if(var3 != null) {
            switch(class_1559.field_8187[var1.ordinal()]) {
            case 1:
               this.field_8174 = class_902.visible4;
               this.method_8500();
               break;
            case 2:
               break label19;
            default:
               return;
            }
         }

         if(var3 != null) {
            return;
         }
      }

      this.field_8174 = class_902.visible5;
   }

   public void chatChannelUserChangeCallback(ChatUserList param1, ChatUserList param2, ChatUserList param3) {
      // $FF: Couldn't be decompiled
   }

   public void chatQueryChannelUsersCallback(ChatUserList var1) {}

   public void chatChannelMessageCallback(ChatMessageList param1) {
      // $FF: Couldn't be decompiled
   }

   public void chatClearCallback(String var1) {
      this.method_8499();
   }

   public void emoticonDataDownloadCallback(ErrorCode var1) {
      if(ErrorCode.succeeded(var1)) {
         this.method_8503();
      }

   }

   public void chatChannelTokenizedMessageCallback(ChatTokenizedMessage[] var1) {}

   // $FF: renamed from: b (qy) void
   public void method_8486(class_68 var1) {
      this.field_8166 = var1;
   }

   // $FF: renamed from: a () boolean
   public boolean method_8487() {
      return this.field_8174 == class_902.visible4;
   }

   // $FF: renamed from: b (tv.twitch.AuthToken) void
   public void method_8488(AuthToken var1) {
      this.field_8175 = var1;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_8489(String var1) {
      this.field_8169 = var1;
   }

   // $FF: renamed from: d (java.lang.String) void
   public void method_8490(String var1) {
      this.field_8167 = var1;
   }

   // $FF: renamed from: b () ac
   public class_902 method_8491() {
      return this.field_8174;
   }

   // $FF: renamed from: <init> () void
   public void method_8492() {
      super();
      this.field_8166 = null;
      this.field_8167 = "";
      this.field_8168 = "";
      this.field_8169 = "";
      this.field_8170 = "";
      this.field_8171 = null;
      this.field_8172 = false;
      this.field_8173 = false;
      this.field_8174 = class_902.visible1;
      this.field_8175 = new AuthToken();
      this.field_8176 = new ArrayList();
      this.field_8177 = new LinkedList();
      this.field_8178 = 128;
      this.field_8179 = false;
      this.field_8180 = false;
      this.field_8171 = new Chat(new StandardChatAPI());
   }

   // $FF: renamed from: e (java.lang.String) boolean
   public boolean method_8493(String var1) {
      this.method_8494();
      this.field_8173 = false;
      this.field_8168 = var1;
      return this.method_8495(var1);
   }

   // $FF: renamed from: c () boolean
   public boolean method_8494() {
      class_1557 var10000;
      label45: {
         String[] var1 = class_752.method_4253();
         var10000 = this;
         if(var1 != null) {
            label37: {
               if(this.field_8174 != class_902.visible4) {
                  var10000 = this;
                  if(var1 == null) {
                     break label37;
                  }

                  if(this.field_8174 != class_902.visible3) {
                     var10000 = this;
                     if(var1 == null) {
                        return var10000.method_8496();
                     }

                     if(this.field_8174 != class_902.visible5) {
                        break label45;
                     }

                     this.method_8501();
                     if(var1 != null) {
                        break label45;
                     }
                  }
               }

               var10000 = this;
            }
         }

         ErrorCode var2 = var10000.field_8171.disconnect();
         ErrorCode var4 = var2;
         if(var1 != null) {
            if(!ErrorCode.failed(var2)) {
               this.method_8501();
               break label45;
            }

            var4 = var2;
         }

         String var3 = ErrorCode.getString(var4);
         String[] var10001 = field_8182;
         this.method_8505(String.format("Error disconnecting: %s", new Object[]{var3}));
         return false;
      }

      var10000 = this;
      return var10000.method_8496();
   }

   // $FF: renamed from: g (java.lang.String) boolean
   protected boolean method_8495(String var1) {
      String[] var2 = class_752.method_4253();
      class_1557 var10000 = this;
      if(var2 != null) {
         if(this.field_8172) {
            return false;
         }

         var10000 = this;
      }

      ErrorCode var3 = var10000.field_8171.initialize(var1, false);
      boolean var5 = ErrorCode.failed(var3);
      if(var2 != null) {
         if(var5) {
            String var4 = ErrorCode.getString(var3);
            String[] var10001 = field_8182;
            this.method_8505(String.format("Error initializing chat: %s", new Object[]{var4}));
            this.method_8501();
            return false;
         }

         this.field_8172 = true;
         this.field_8171.setChatCallbacks(this);
         this.field_8174 = class_902.visible2;
         var5 = true;
      }

      return var5;
   }

   // $FF: renamed from: d () boolean
   protected boolean method_8496() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_8172;
      if(var1 != null) {
         if(this.field_8172) {
            ErrorCode var2 = this.field_8171.shutdown();
            var10000 = ErrorCode.failed(var2);
            if(var1 == null) {
               return var10000;
            }

            if(var10000) {
               String var3 = ErrorCode.getString(var2);
               String[] var10001 = field_8182;
               this.method_8505(String.format("Error shutting down chat: %s", new Object[]{var3}));
               return false;
            }
         }

         this.field_8174 = class_902.visible1;
         this.field_8172 = false;
         this.method_8504();
         this.field_8171.setChatCallbacks((IChatCallbacks)null);
         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: e () void
   public void method_8497() {
      String[] var1 = class_752.method_4253();
      class_1557 var10000 = this;
      if(var1 != null) {
         if(!this.field_8172) {
            return;
         }

         var10000 = this;
      }

      ErrorCode var2 = var10000.field_8171.flushEvents();
      int var5 = ErrorCode.failed(var2);
      String var3;
      if(var1 != null) {
         if(var5 != 0) {
            var3 = ErrorCode.getString(var2);
            String[] var4 = field_8182;
            this.method_8505(String.format("Error flushing chat events: %s", new Object[]{var3}));
         }

         var5 = class_1559.field_8188[this.field_8174.ordinal()];
      }

      if(var1 != null) {
         switch(var5) {
         case 1:
         case 3:
         case 4:
         default:
            if(var1 != null) {
               break;
            }
         case 2:
            label35: {
               var10000 = this;
               if(var1 != null) {
                  if(this.field_8173) {
                     var2 = this.field_8171.connectAnonymous();
                     if(var1 != null) {
                        break label35;
                     }
                  }

                  var10000 = this;
               }

               var2 = var10000.field_8171.connect(this.field_8168, this.field_8175.data);
            }

            label44: {
               ErrorCode var6 = var2;
               if(var1 != null) {
                  if(!ErrorCode.failed(var2)) {
                     break label44;
                  }

                  var6 = var2;
               }

               var3 = ErrorCode.getString(var6);
               String[] var10001 = field_8182;
               this.method_8505(String.format("Error connecting: %s", new Object[]{var3}));
               this.method_8496();
               this.method_8501();
               if(var1 != null) {
                  break;
               }
            }

            this.field_8174 = class_902.visible3;
            this.method_8502();
            if(var1 != null) {
               break;
            }
         case 5:
            this.method_8494();
         }
      }

   }

   // $FF: renamed from: h (java.lang.String) boolean
   public boolean method_8498(String var1) {
      String[] var2 = class_752.method_4253();
      class_1557 var10000 = this;
      if(var2 != null) {
         if(this.field_8174 != class_902.visible4) {
            return false;
         }

         var10000 = this;
      }

      ErrorCode var3 = var10000.field_8171.sendMessage(var1);
      boolean var5 = ErrorCode.failed(var3);
      if(var2 != null) {
         if(var5) {
            String var4 = ErrorCode.getString(var3);
            String[] var10001 = field_8182;
            this.method_8505(String.format("Error sending chat message: %s", new Object[]{var4}));
            return false;
         }

         var5 = true;
      }

      return var5;
   }

   // $FF: renamed from: f () void
   public void method_8499() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () void
   protected void method_8500() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h () void
   protected void method_8501() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: i () void
   protected void method_8502() {}

   // $FF: renamed from: j () void
   protected void method_8503() {}

   // $FF: renamed from: k () void
   protected void method_8504() {}

   // $FF: renamed from: i (java.lang.String) void
   protected void method_8505(String var1) {
      String[] var10002 = field_8182;
      field_8165.error(class_1493.field_7843, "[Chat controller] {}", new Object[]{var1});
   }

   // $FF: renamed from: <clinit> () void
   static void method_8506() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_8507(Exception var0) {
      return var0;
   }
}
