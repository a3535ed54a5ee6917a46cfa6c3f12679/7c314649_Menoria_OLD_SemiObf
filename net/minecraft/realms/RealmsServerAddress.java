package net.minecraft.realms;

import java.util.Hashtable;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import net.minecraft.realms.RealmsScreen;

public class RealmsServerAddress {

   private final String host;
   private final int port;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2628;


   // $FF: renamed from: <init> (java.lang.String, int) void
   protected void method_3319(String var1, int var2) {
      super();
      this.host = var1;
      this.port = var2;
   }

   public String getHost() {
      return this.host;
   }

   public int getPort() {
      return this.port;
   }

   public static RealmsServerAddress parseString(String var0) {
      boolean var1 = RealmsScreen.method_3794();
      String var10000 = var0;
      if(!var1) {
         if(var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      String[] var2;
      int var10;
      String[] var11;
      label66: {
         var2 = var10000.split(":");
         var10 = var0.startsWith("[");
         if(!var1) {
            label67: {
               if(var10 != 0) {
                  int var3 = var0.indexOf("]");
                  var10 = var3;
                  if(var1) {
                     break label67;
                  }

                  if(var3 > 0) {
                     label51: {
                        String var4 = var0.substring(1, var3);
                        String var5 = var0.substring(var3 + 1).trim();
                        var10 = var5.startsWith(":");
                        if(!var1) {
                           label49: {
                              if(var10 != 0) {
                                 var10 = var5.length();
                                 if(var1) {
                                    break label49;
                                 }

                                 if(var10 > 0) {
                                    var5 = var5.substring(1);
                                    var2 = new String[]{var4, var5};
                                    if(!var1) {
                                       break label51;
                                    }
                                 }
                              }

                              var10 = 1;
                           }
                        }

                        var2 = new String[var10];
                        var2[0] = var4;
                     }
                  }
               }

               var11 = var2;
               if(var1) {
                  break label66;
               }

               var10 = var2.length;
            }
         }

         if(var10 > 2) {
            var2 = new String[]{var0};
         }

         var11 = var2;
      }

      String var7 = var11[0];
      var10 = var2.length;
      if(!var1) {
         var10 = var10 > 1?parseInt(var2[1], 25565):25565;
      }

      int var8 = var10;
      if(var8 == 25565) {
         String[] var9 = lookupSrv(var7);
         var7 = var9[0];
         var8 = parseInt(var9[1], 25565);
      }

      RealmsServerAddress var6 = new RealmsServerAddress;
      var6.method_3319(var7, var8);
      return var6;
   }

   private static String[] lookupSrv(String var0) {
      try {
         String[] var6 = field_2628;
         String var1 = "com.sun.jndi.dns.DnsContextFactory";
         Class.forName("com.sun.jndi.dns.DnsContextFactory");
         Hashtable var2 = new Hashtable();
         var2.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
         var2.put("java.naming.provider.url", "dns:");
         var2.put("com.sun.jndi.dns.timeout.retries", "1");
         InitialDirContext var3 = new InitialDirContext(var2);
         Attributes var4 = var3.getAttributes("_minecraft._tcp." + var0, new String[]{"SRV"});
         String[] var5 = var4.get("srv").get().toString().split(" ", 4);
         return new String[]{var5[3], var5[2]};
      } catch (Throwable var7) {
         return new String[]{var0, Integer.toString(25565)};
      }
   }

   private static int parseInt(String var0, int var1) {
      try {
         return Integer.parseInt(var0.trim());
      } catch (Exception var3) {
         return var1;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_3320() {
      // $FF: Couldn't be decompiled
   }
}
