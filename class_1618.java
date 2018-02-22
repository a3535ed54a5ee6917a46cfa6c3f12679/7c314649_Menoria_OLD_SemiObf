import com.google.common.base.Charsets;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.IOUtils;

// $FF: renamed from: uA
public class class_1618 {

   // $FF: renamed from: b java.text.SimpleDateFormat
   public static final SimpleDateFormat field_8422;
   // $FF: renamed from: d java.util.Map
   private final Map field_8423;
   // $FF: renamed from: e java.util.Map
   private final Map field_8424;
   // $FF: renamed from: f java.util.LinkedList
   private final LinkedList field_8425;
   // $FF: renamed from: g net.minecraft.server.MinecraftServer
   private final MinecraftServer field_8426;
   // $FF: renamed from: h com.google.gson.Gson
   protected final Gson field_8427;
   // $FF: renamed from: i java.io.File
   private final File field_8428;
   // $FF: renamed from: j java.lang.reflect.ParameterizedType
   private static final ParameterizedType field_8429;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer, java.io.File) void
   public void method_8833(MinecraftServer var1, File var2) {
      super();
      this.field_8423 = Maps.newHashMap();
      this.field_8424 = Maps.newHashMap();
      this.field_8425 = Lists.newLinkedList();
      this.field_8426 = var1;
      this.field_8428 = var2;
      GsonBuilder var3 = new GsonBuilder();
      class_1622 var10002 = new class_1622;
      var10002.method_8856(this, (class_1619)null);
      var3.registerTypeHierarchyAdapter(class_1621.class, var10002);
      this.field_8427 = var3.create();
      this.method_8841();
   }

   // $FF: renamed from: b (net.minecraft.server.MinecraftServer, java.lang.String) com.mojang.authlib.GameProfile
   private static GameProfile method_8834(MinecraftServer var0, String var1) {
      String[] var10000 = class_752.method_4253();
      GameProfile[] var3 = new GameProfile[1];
      String[] var2 = var10000;
      class_1619 var7 = new class_1619;
      var7.method_8846(var3);
      class_1619 var4 = var7;
      var0.method_2402().findProfilesByNames(new String[]{var1}, Agent.MINECRAFT, var4);
      GameProfile var8;
      if(!var0.method_2368()) {
         var8 = var3[0];
         if(var2 == null) {
            return var8;
         }

         if(var8 == null) {
            var8 = new GameProfile;
            var8.method_1305((UUID)null, var1);
            UUID var5 = class_792.method_4635(var8);
            var8 = new GameProfile;
            var8.method_1305(var5, var1);
            GameProfile var6 = var8;
            var4.onProfileLookupSucceeded(var6);
         }
      }

      var8 = var3[0];
      return var8;
   }

   // $FF: renamed from: b (com.mojang.authlib.GameProfile) void
   public void method_8835(GameProfile var1) {
      this.method_8836(var1, (Date)null);
   }

   // $FF: renamed from: b (com.mojang.authlib.GameProfile, java.util.Date) void
   private void method_8836(GameProfile var1, Date var2) {
      UUID var4 = var1.getId();
      String[] var3 = class_752.method_4253();
      if(var2 == null) {
         Calendar var5 = Calendar.getInstance();
         var5.setTime(new Date());
         var5.add(2, 1);
         var2 = var5.getTime();
      }

      String var11 = var1.getName().toLowerCase(Locale.ROOT);
      class_1621 var10000 = new class_1621;
      var10000.method_8851(this, var1, var2, (class_1619)null);
      class_1621 var6 = var10000;
      LinkedList var7 = this.field_8425;
      synchronized(this.field_8425) {
         label24: {
            Map var12 = this.field_8424;
            UUID var10001 = var4;
            if(var3 != null) {
               if(this.field_8424.containsKey(var4)) {
                  class_1621 var8 = (class_1621)this.field_8424.get(var4);
                  this.field_8423.remove(var8.method_8849().getName().toLowerCase(Locale.ROOT));
                  this.field_8423.put(var1.getName().toLowerCase(Locale.ROOT), var6);
                  this.field_8425.remove(var1);
                  if(var3 != null) {
                     break label24;
                  }
               }

               var12 = this.field_8424;
               var10001 = var4;
            }

            var12.put(var10001, var6);
            this.field_8423.put(var11, var6);
         }

         this.field_8425.addFirst(var1);
      }
   }

   // $FF: renamed from: b (java.lang.String) com.mojang.authlib.GameProfile
   public GameProfile method_8837(String var1) {
      String var3 = var1.toLowerCase(Locale.ROOT);
      String[] var10000 = class_752.method_4253();
      class_1621 var4 = (class_1621)this.field_8423.get(var3);
      String[] var2 = var10000;
      class_1621 var11 = var4;
      if(var2 != null) {
         if(var4 != null) {
            label74: {
               Date var12 = new Date();
               if(var2 != null) {
                  if(var12.getTime() < class_1621.method_8852(var4).getTime()) {
                     break label74;
                  }

                  this.field_8424.remove(var4.method_8849().getId());
                  this.field_8423.remove(var4.method_8849().getName().toLowerCase(Locale.ROOT));
               }

               LinkedList var5 = this.field_8425;
               synchronized(this.field_8425) {
                  this.field_8425.remove(var4.method_8849());
               }

               var4 = null;
            }
         }

         var11 = var4;
      }

      label62: {
         label75: {
            GameProfile var10;
            label76: {
               if(var2 != null) {
                  if(var11 == null) {
                     break label76;
                  }

                  var11 = var4;
               }

               var10 = var11.method_8849();
               LinkedList var6 = this.field_8425;
               synchronized(this.field_8425) {
                  this.field_8425.remove(var10);
                  this.field_8425.addFirst(var10);
               }

               if(var2 != null) {
                  break label75;
               }
            }

            var10 = method_8834(this.field_8426, var3);
            if(var2 == null) {
               break label62;
            }

            if(var10 != null) {
               this.method_8835(var10);
               var4 = (class_1621)this.field_8423.get(var3);
            }
         }

         this.method_8842();
      }

      var11 = var4;
      GameProfile var13;
      if(var2 != null) {
         if(var4 == null) {
            var13 = null;
            return var13;
         }

         var11 = var4;
      }

      var13 = var11.method_8849();
      return var13;
   }

   // $FF: renamed from: b () java.lang.String[]
   public String[] method_8838() {
      ArrayList var1 = Lists.newArrayList(this.field_8423.keySet());
      return (String[])var1.toArray(new String[var1.size()]);
   }

   // $FF: renamed from: b (java.util.UUID) com.mojang.authlib.GameProfile
   public GameProfile method_8839(UUID var1) {
      String[] var10000 = class_752.method_4253();
      class_1621 var3 = (class_1621)this.field_8424.get(var1);
      String[] var2 = var10000;
      class_1621 var4 = var3;
      GameProfile var5;
      if(var2 != null) {
         if(var3 == null) {
            var5 = null;
            return var5;
         }

         var4 = var3;
      }

      var5 = var4.method_8849();
      return var5;
   }

   // $FF: renamed from: c (java.util.UUID) uD
   private class_1621 method_8840(UUID var1) {
      String[] var10000 = class_752.method_4253();
      class_1621 var3 = (class_1621)this.field_8424.get(var1);
      String[] var2 = var10000;
      class_1621 var8 = var3;
      if(var2 != null) {
         if(var3 != null) {
            GameProfile var4 = var3.method_8849();
            LinkedList var5 = this.field_8425;
            synchronized(this.field_8425) {
               this.field_8425.remove(var4);
               this.field_8425.addFirst(var4);
            }
         }

         var8 = var3;
      }

      return var8;
   }

   // $FF: renamed from: c () void
   public void method_8841() {
      String[] var10000 = class_752.method_4253();
      List var2 = null;
      String[] var1 = var10000;
      BufferedReader var3 = null;

      label97: {
         try {
            var3 = Files.newReader(this.field_8428, Charsets.UTF_8);
            var2 = (List)this.field_8427.fromJson(var3, field_8429);
            break label97;
         } catch (FileNotFoundException var13) {
            ;
         } finally {
            IOUtils.closeQuietly(var3);
         }

         return;
      }

      if(var2 != null) {
         this.field_8423.clear();
         this.field_8424.clear();
         LinkedList var4 = this.field_8425;
         synchronized(this.field_8425) {
            this.field_8425.clear();
         }

         var2 = Lists.reverse(var2);
         Iterator var15 = var2.iterator();

         while(var15.hasNext()) {
            class_1621 var5 = (class_1621)var15.next();

            try {
               if(var5 != null) {
                  this.method_8836(var5.method_8849(), var5.method_8850());
               }
            } catch (FileNotFoundException var11) {
               throw method_8845(var11);
            }

            if(var1 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: d () void
   public void method_8842() {
      String var1 = this.field_8427.toJson(this.method_8843(1000));
      BufferedWriter var2 = null;

      try {
         var2 = Files.newWriter(this.field_8428, Charsets.UTF_8);
         var2.write(var1);
         return;
      } catch (FileNotFoundException var8) {
         ;
      } catch (IOException var9) {
         return;
      } finally {
         IOUtils.closeQuietly(var2);
      }

   }

   // $FF: renamed from: b (int) java.util.List
   private List method_8843(int var1) {
      String[] var10000 = class_752.method_4253();
      ArrayList var3 = Lists.newArrayList();
      String[] var2 = var10000;
      LinkedList var5 = this.field_8425;
      ArrayList var4;
      synchronized(this.field_8425) {
         var4 = Lists.newArrayList(Iterators.limit(this.field_8425.iterator(), var1));
      }

      Iterator var9 = var4.iterator();

      while(var9.hasNext()) {
         GameProfile var6 = (GameProfile)var9.next();
         class_1621 var7 = this.method_8840(var6.getId());
         if(var2 != null) {
            if(var7 == null && var2 != null) {
               continue;
            }

            var3.add(var7);
         }

         if(var2 == null) {
            break;
         }
      }

      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8844() {
      boolean var10000 = true;
      char[] var10003 = "ô|&æºÚé%CãÍàÉvx­".toCharArray();
      Object var10004 = var10003.length;
      Object var5 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var1 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var6 = var10002;
         var10002 = var10003;
         if(var10003 <= var1) {
            String var0 = (new String((char[])var5)).intern();
            field_8422 = new SimpleDateFormat(var0);
            class_1620 var3 = new class_1620;
            var3.method_8847();
            field_8429 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 132;
            break;
         case 1:
            var10009 = 254;
            break;
         case 2:
            var10009 = 128;
            break;
         case 3:
            var10009 = 118;
            break;
         case 4:
            var10009 = 120;
            break;
         case 5:
            var10009 = 216;
            break;
         default:
            var10009 = 132;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }

   // $FF: renamed from: b (java.io.FileNotFoundException) java.io.FileNotFoundException
   private static FileNotFoundException method_8845(FileNotFoundException var0) {
      return var0;
   }
}
