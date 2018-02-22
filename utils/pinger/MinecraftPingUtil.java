package utils.pinger;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import utils.pinger.MinecraftPingReply;

public class MinecraftPingUtil {

   public static byte PACKET_HANDSHAKE;
   public static byte PACKET_STATUSREQUEST;
   public static byte PACKET_PING;
   public static int PROTOCOL_VERSION;
   public static int STATUS_HANDSHAKE;
   // $FF: renamed from: h java.lang.String
   private static final String field_2976 = "VarInt too big";


   // $FF: renamed from: <init> () void
   public void method_3822() {
      super();
   }

   public static void validate(Object var0, String var1) {
      try {
         if(var0 == null) {
            throw new RuntimeException(var1);
         }
      } catch (RuntimeException var2) {
         throw method_3825(var2);
      }
   }

   // $FF: renamed from: io (boolean, java.lang.String) void
   public static void method_3823(boolean var0, String var1) {
      try {
         if(var0) {
            throw new IOException(var1);
         }
      } catch (RuntimeException var2) {
         throw method_3825(var2);
      }
   }

   public static int readVarInt(DataInputStream var0) {
      int var2 = 0;
      int var10000 = MinecraftPingReply.method_425();
      int var3 = 0;
      int var1 = var10000;

      byte var4;
      do {
         var4 = var0.readByte();
         var2 |= (var4 & 127) << var3++ * 7;
         if(var3 > 5) {
            throw new RuntimeException("VarInt too big");
         }
      } while((var4 & 128) == 128);

      try {
         if(class_689.method_3976() != 0) {
            ++var1;
            MinecraftPingReply.method_423(var1);
         }

         return var2;
      } catch (RuntimeException var5) {
         throw method_3825(var5);
      }
   }

   public static void writeVarInt(DataOutputStream var0, int var1) {
      int var2 = MinecraftPingReply.method_425();

      while(true) {
         if((var1 & -128) != 0) {
            var0.writeByte(var1 & 127 | 128);
            var1 >>>= 7;

            try {
               if(var2 == 0) {
                  break;
               }

               if(var2 != 0) {
                  continue;
               }
            } catch (RuntimeException var3) {
               throw method_3825(var3);
            }
         }

         var0.writeByte(var1);
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_3824() {
      boolean var10000 = true;
      char[] var10003 = "¾àYÓ|ýûUÎ;".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2976 = (new String((char[])var3)).intern();
            PACKET_HANDSHAKE = 0;
            PACKET_STATUSREQUEST = 0;
            PACKET_PING = 1;
            PROTOCOL_VERSION = 4;
            STATUS_HANDSHAKE = 1;
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 221;
            break;
         case 1:
            var10009 = 197;
            break;
         case 2:
            var10009 = 167;
            break;
         case 3:
            var10009 = 238;
            break;
         case 4:
            var10009 = 2;
            break;
         case 5:
            var10009 = 146;
            break;
         default:
            var10009 = 105;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_3825(RuntimeException var0) {
      return var0;
   }
}
