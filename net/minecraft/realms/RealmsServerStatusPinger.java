package net.minecraft.realms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.realms.ServerPing;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsServerStatusPinger {

   private static final Logger LOGGER;
   private final List connections;
   private static final String __OBFID;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2770;


   // $FF: renamed from: <init> () void
   public void method_3512() {
      super();
      this.connections = Collections.synchronizedList(new ArrayList());
   }

   public void pingServer(String param1, ServerPing param2) {
      // $FF: Couldn't be decompiled
   }

   public void tick() {
      boolean var10000 = RealmsScreen.method_3793();
      List var2 = this.connections;
      boolean var1 = var10000;
      List var3 = this.connections;
      synchronized(this.connections) {
         Iterator var4 = this.connections.iterator();

         while(var4.hasNext()) {
            label46: {
               class_120 var5 = (class_120)var4.next();
               class_120 var8 = var5;
               if(var1) {
                  if(var5.method_563()) {
                     var5.method_556();
                     if(var1) {
                        break label46;
                     }
                  }

                  var4.remove();
                  var8 = var5;
               }

               if(var1) {
                  if(var8.method_565() == null) {
                     break label46;
                  }

                  var8 = var5;
               }

               var8.method_564().method_237(var5.method_565());
            }

            if(!var1) {
               break;
            }
         }

      }
   }

   public void removeAll() {
      boolean var10000 = RealmsScreen.method_3793();
      List var2 = this.connections;
      boolean var1 = var10000;
      List var3 = this.connections;
      synchronized(this.connections) {
         Iterator var4 = this.connections.iterator();

         while(var4.hasNext()) {
            label26: {
               class_120 var5 = (class_120)var4.next();
               class_120 var8 = var5;
               if(var1) {
                  if(!var5.method_563()) {
                     break label26;
                  }

                  var4.remove();
                  var8 = var5;
               }

               class_1082 var10001 = new class_1082;
               String[] var10003 = field_2770;
               var10001.method_6134("Cancelled");
               var8.method_558(var10001);
            }

            if(!var1) {
               break;
            }
         }

      }
   }

   static Logger access$000() {
      return LOGGER;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3513() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "0?èv)¢l½Ë*}Ökh|Ànr½Õ*";
      int var4 = "0?èv)¢l½Ë*}Ökh|Ànr½Õ*".length();
      char var1 = 9;
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
                  field_2770 = var5;
                  String[] var10 = field_2770;
                  __OBFID = "CL_00001854";
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
               var10009 = 244;
               break;
            case 1:
               var10009 = 86;
               break;
            case 2:
               var10009 = 230;
               break;
            case 3:
               var10009 = 228;
               break;
            case 4:
               var10009 = 53;
               break;
            case 5:
               var10009 = 67;
               break;
            default:
               var10009 = 162;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_3514(Throwable var0) {
      return var0;
   }
}
