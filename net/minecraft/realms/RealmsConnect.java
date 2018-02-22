package net.minecraft.realms;

import net.minecraft.realms.RealmsScreen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsConnect {

   private static final Logger LOGGER;
   private final RealmsScreen onlineScreen;
   private volatile boolean aborted;
   private class_120 connection;
   private static final String __OBFID;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5618;


   // $FF: renamed from: <init> (net.minecraft.realms.RealmsScreen) void
   public void method_6007(RealmsScreen var1) {
      super();
      this.aborted = false;
      this.onlineScreen = var1;
   }

   public void connect(String var1, int var2) {
      class_652 var10000 = new class_652;
      String[] var10003 = field_5618;
      var10000.method_3549(this, "Realms-connect-task", var1, var2);
      var10000.start();
   }

   public void abort() {
      this.aborted = true;
   }

   public void tick() {
      boolean var1 = RealmsScreen.method_3794();
      class_120 var10000 = this.connection;
      if(!var1) {
         if(this.connection == null) {
            return;
         }

         var10000 = this.connection;
      }

      if(!var1) {
         if(var10000.method_563()) {
            this.connection.method_556();
            if(!var1) {
               return;
            }
         }

         var10000 = this.connection;
      }

      if(!var1) {
         if(var10000.method_565() == null) {
            return;
         }

         var10000 = this.connection;
      }

      var10000.method_564().method_237(this.connection.method_565());
   }

   static boolean access$000(RealmsConnect var0) {
      return var0.aborted;
   }

   static class_120 access$102(RealmsConnect var0, class_120 var1) {
      return var0.connection = var1;
   }

   static class_120 access$100(RealmsConnect var0) {
      return var0.connection;
   }

   static RealmsScreen access$200(RealmsConnect var0) {
      return var0.onlineScreen;
   }

   static Logger access$300() {
      return LOGGER;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6008() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Ä%Y5]¶ñx!Õ¬-yv@ä¦\"{\ffª½-f";
      int var4 = "Ä%Y5]¶ñx!Õ¬-yv@ä¦\"{\ffª½-f".length();
      char var1 = 11;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_5618 = var5;
                  String[] var10 = field_5618;
                  __OBFID = "CL_00001844";
                  LOGGER = LogManager.getLogger();
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 236;
               break;
            case 1:
               var10009 = 162;
               break;
            case 2:
               var10009 = 39;
               break;
            case 3:
               var10009 = 126;
               break;
            case 4:
               var10009 = 2;
               break;
            case 5:
               var10009 = 110;
               break;
            default:
               var10009 = 6;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
