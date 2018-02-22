import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

// $FF: renamed from: qh
public class class_1533 {

   // $FF: renamed from: b org.apache.logging.log4j.Marker
   private static final Marker field_8040;
   // $FF: renamed from: c org.apache.logging.log4j.Logger
   private static final Logger field_8041;
   // $FF: renamed from: d ql
   private final class_1541 field_8042;
   // $FF: renamed from: e bbj
   private final bbj field_8043;
   // $FF: renamed from: f AY
   private class_661 field_8044;
   // $FF: renamed from: g boolean
   private boolean field_8045;
   // $FF: renamed from: h int
   private int field_8046;
   // $FF: renamed from: i java.util.Map
   private final Map field_8047;
   // $FF: renamed from: j java.util.Map
   private final Map field_8048;
   // $FF: renamed from: k java.util.Map
   private Map field_8049;
   // $FF: renamed from: l com.google.common.collect.Multimap
   private final Multimap field_8050;
   // $FF: renamed from: m java.util.List
   private final List field_8051;
   // $FF: renamed from: n java.util.Map
   private final Map field_8052;
   // $FF: renamed from: o java.util.Map
   private final Map field_8053;
   // $FF: renamed from: p java.lang.String
   private static final String field_8054;
   // $FF: renamed from: q java.lang.String[]
   private static final String[] field_8055;


   // $FF: renamed from: <init> (ql, bbj) void
   public void method_8300(class_1541 var1, bbj var2) {
      super();
      this.field_8046 = 0;
      this.field_8047 = HashBiMap.create();
      this.field_8048 = ((BiMap)this.field_8047).inverse();
      this.field_8049 = Maps.newHashMap();
      this.field_8050 = HashMultimap.create();
      this.field_8051 = Lists.newArrayList();
      this.field_8052 = Maps.newHashMap();
      this.field_8053 = Maps.newHashMap();
      this.field_8042 = var1;
      this.field_8043 = var2;

      try {
         SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
         String[] var4 = field_8055;
         SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
      } catch (SoundSystemException var5) {
         String[] var10002 = field_8055;
         field_8041.error(field_8040, "Error linking with the LibraryJavaSound plug-in", var5);
      }

   }

   // $FF: renamed from: b () void
   public void method_8301() {
      this.method_8305();
      this.method_8302();
   }

   // $FF: renamed from: c () void
   private synchronized void method_8302() {
      String[] var1 = class_752.method_4253();

      try {
         if(var1 == null || this.field_8045) {
            return;
         }
      } catch (RuntimeException var5) {
         throw method_8325(var5);
      }

      try {
         Thread var10000 = new Thread;
         class_1537 var6 = new class_1537;
         var6.method_8354(this);
         String[] var3 = field_8055;
         var10000.<init>(var6, "Sound Library Loader");
         var10000.start();
      } catch (RuntimeException var4) {
         String[] var10002 = field_8055;
         field_8041.error(field_8040, "Error starting SoundSystem. Turning off sounds & music", var4);
         this.field_8043.method_5360(class_930.field_4729, 0.0F);
         this.field_8043.method_5358();
      }

   }

   // $FF: renamed from: b (aw) float
   private float method_8303(class_930 var1) {
      String[] var2 = class_752.method_4253();

      float var5;
      label28: {
         class_930 var10000;
         label27: {
            try {
               var10000 = var1;
               if(var2 == null) {
                  break label27;
               }

               if(var1 == null) {
                  break label28;
               }
            } catch (RuntimeException var4) {
               throw method_8325(var4);
            }

            var10000 = var1;
         }

         try {
            if(var10000 != class_930.field_4729) {
               var5 = this.field_8043.method_5359(var1);
               return var5;
            }
         } catch (RuntimeException var3) {
            throw method_8325(var3);
         }
      }

      var5 = 1.0F;
      return var5;
   }

   // $FF: renamed from: b (aw, float) void
   public void method_8304(class_930 param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () void
   public void method_8305() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   public void method_8306() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () void
   public void method_8307() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (p9) boolean
   public boolean method_8308(class_38 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (p9) void
   public void method_8309(class_38 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (p9) void
   public void method_8310(class_38 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (p9, qg) float
   private float method_8311(class_38 var1, class_1531 var2) {
      return (float)class_1715.method_9570((double)var1.method_169() * var2.method_8293(), 0.5D, 2.0D);
   }

   // $FF: renamed from: b (p9, qg, aw) float
   private float method_8312(class_38 var1, class_1531 var2, class_930 var3) {
      return (float)class_1715.method_9570((double)var1.method_168() * var2.method_8295() * (double)this.method_8303(var3), 0.0D, 1.0D);
   }

   // $FF: renamed from: g () void
   public void method_8313() {
      String[] var10000 = class_752.method_4253();
      Iterator var2 = this.field_8047.keySet().iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         String[] var10002 = field_8055;
         field_8041.debug(field_8040, "Pausing channel {}", new Object[]{var3});
         this.field_8044.pause(var3);
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: h () void
   public void method_8314() {
      String[] var10000 = class_752.method_4253();
      Iterator var2 = this.field_8047.keySet().iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         String[] var10002 = field_8055;
         field_8041.debug(field_8040, "Resuming channel {}", new Object[]{var3});
         this.field_8044.play(var3);
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (p9, int) void
   public void method_8315(class_38 var1, int var2) {
      this.field_8052.put(var1, Integer.valueOf(this.field_8046 + var2));
   }

   // $FF: renamed from: b (bqx) java.net.URL
   private static URL method_8316(bqx var0) {
      String[] var4 = field_8055;
      String var1 = String.format("%s:%s:%s", new Object[]{"mcsounddomain", var0.method_8229(), var0.method_8228()});
      class_657 var10000 = new class_657;
      var10000.method_3561(var0);
      class_657 var2 = var10000;

      try {
         return new URL((URL)null, var1, var2);
      } catch (MalformedURLException var5) {
         Error var6 = new Error("TODO: Sanely handle url exception! :D");
         String[] var10002 = field_8055;
         throw var6;
      }
   }

   // $FF: renamed from: b (yz, float) void
   public void method_8317(class_792 param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (qh, AY) AY
   static class_661 method_8318(class_1533 var0, class_661 var1) {
      return var0.field_8044 = var1;
   }

   // $FF: renamed from: b (qh, boolean) boolean
   static boolean method_8319(class_1533 var0, boolean var1) {
      return var0.field_8045 = var1;
   }

   // $FF: renamed from: b (qh) bbj
   static bbj method_8320(class_1533 var0) {
      return var0.field_8043;
   }

   // $FF: renamed from: c (qh) AY
   static class_661 method_8321(class_1533 var0) {
      return var0.field_8044;
   }

   // $FF: renamed from: i () org.apache.logging.log4j.Marker
   static Marker method_8322() {
      return field_8040;
   }

   // $FF: renamed from: j () org.apache.logging.log4j.Logger
   static Logger method_8323() {
      return field_8041;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8324() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_8325(RuntimeException var0) {
      return var0;
   }
}
