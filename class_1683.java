import com.google.common.collect.Maps;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;
import java.util.UUID;
import java.util.Map.Entry;

// $FF: renamed from: vS
public class class_1683 {

   // $FF: renamed from: b java.util.Map
   private final Map field_8770;
   // $FF: renamed from: c java.util.Map
   private final Map field_8771;
   // $FF: renamed from: d java.lang.String
   private final String field_8772;
   // $FF: renamed from: e java.net.URL
   private final URL field_8773;
   // $FF: renamed from: f vT
   private final class_75 field_8774;
   // $FF: renamed from: g java.util.Timer
   private final Timer field_8775;
   // $FF: renamed from: h java.lang.Object
   private final Object field_8776;
   // $FF: renamed from: i long
   private final long field_8777;
   // $FF: renamed from: j boolean
   private boolean field_8778;
   // $FF: renamed from: k int
   private int field_8779;
   // $FF: renamed from: l java.lang.String
   private static final String field_8780;
   // $FF: renamed from: m java.lang.String[]
   private static final String[] field_8781;


   // $FF: renamed from: <init> (java.lang.String, vT, long) void
   public void method_9265(String var1, class_75 var2, long var3) {
      super();
      this.field_8770 = Maps.newHashMap();
      this.field_8771 = Maps.newHashMap();
      this.field_8772 = UUID.randomUUID().toString();
      Timer var10001 = new Timer("Snooper Timer", true);
      String[] var6 = field_8781;
      this.field_8775 = var10001;
      this.field_8776 = new Object();

      try {
         this.field_8773 = new URL("http://snoop.minecraft.net/" + var1 + "?version=" + 2);
      } catch (MalformedURLException var7) {
         throw new IllegalArgumentException();
      }

      this.field_8774 = var2;
      this.field_8777 = var3;
   }

   // $FF: renamed from: b () void
   public void method_9266() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () void
   private void method_9267() {
      this.method_9268();
      String[] var1 = field_8781;
      this.method_9270("snooper_token", this.field_8772);
      this.method_9271("snooper_token", this.field_8772);
      this.method_9271("os_name", System.getProperty("os.name"));
      this.method_9271("os_version", System.getProperty("os.version"));
      this.method_9271("os_architecture", System.getProperty("os.arch"));
      this.method_9271("java_version", System.getProperty("java.version"));
      this.method_9271("version", "1.7.10");
      this.field_8774.method_377(this);
   }

   // $FF: renamed from: d () void
   private void method_9268() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   public void method_9269() {
      String[] var1 = field_8781;
      this.method_9271("memory_total", Long.valueOf(Runtime.getRuntime().totalMemory()));
      this.method_9271("memory_max", Long.valueOf(Runtime.getRuntime().maxMemory()));
      this.method_9271("memory_free", Long.valueOf(Runtime.getRuntime().freeMemory()));
      this.method_9271("cpu_cores", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
      this.field_8774.method_376(this);
   }

   // $FF: renamed from: b (java.lang.String, java.lang.Object) void
   public void method_9270(String var1, Object var2) {
      Object var3 = this.field_8776;
      Object var4 = this.field_8776;
      synchronized(this.field_8776) {
         this.field_8771.put(var1, var2);
      }
   }

   // $FF: renamed from: c (java.lang.String, java.lang.Object) void
   public void method_9271(String var1, Object var2) {
      Object var3 = this.field_8776;
      Object var4 = this.field_8776;
      synchronized(this.field_8776) {
         this.field_8770.put(var1, var2);
      }
   }

   // $FF: renamed from: f () java.util.Map
   public Map method_9272() {
      String[] var10000 = class_752.method_4253();
      LinkedHashMap var2 = new LinkedHashMap();
      String[] var1 = var10000;
      Object var3 = this.field_8776;
      Object var4 = this.field_8776;
      synchronized(this.field_8776) {
         this.method_9269();
         Iterator var5 = this.field_8770.entrySet().iterator();

         Entry var6;
         while(true) {
            if(var5.hasNext()) {
               var6 = (Entry)var5.next();
               var2.put(var6.getKey(), var6.getValue().toString());
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            }

            var5 = this.field_8771.entrySet().iterator();
            break;
         }

         LinkedHashMap var9;
         while(true) {
            if(var5.hasNext()) {
               var6 = (Entry)var5.next();
               var9 = var2;
               if(var1 == null) {
                  break;
               }

               var2.put(var6.getKey(), var6.getValue().toString());
               if(var1 != null) {
                  continue;
               }
            }

            var9 = var2;
            break;
         }

         return var9;
      }
   }

   // $FF: renamed from: g () boolean
   public boolean method_9273() {
      return this.field_8778;
   }

   // $FF: renamed from: h () void
   public void method_9274() {
      this.field_8775.cancel();
   }

   // $FF: renamed from: i () java.lang.String
   public String method_9275() {
      return this.field_8772;
   }

   // $FF: renamed from: j () long
   public long method_9276() {
      return this.field_8777;
   }

   // $FF: renamed from: a (vS) int
   static int method_9277(class_1683 var0) {
      return var0.field_8779++;
   }

   // $FF: renamed from: b (vS) vT
   static class_75 method_9278(class_1683 var0) {
      return var0.field_8774;
   }

   // $FF: renamed from: c (vS) java.lang.Object
   static Object method_9279(class_1683 var0) {
      return var0.field_8776;
   }

   // $FF: renamed from: d (vS) java.util.Map
   static Map method_9280(class_1683 var0) {
      return var0.field_8771;
   }

   // $FF: renamed from: e (vS) int
   static int method_9281(class_1683 var0) {
      return var0.field_8779;
   }

   // $FF: renamed from: f (vS) java.util.Map
   static Map method_9282(class_1683 var0) {
      return var0.field_8770;
   }

   // $FF: renamed from: h (vS) java.lang.String
   static String method_9283(class_1683 var0) {
      return var0.field_8772;
   }

   // $FF: renamed from: i (vS) java.net.URL
   static URL method_9284(class_1683 var0) {
      return var0.field_8773;
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_9285(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9286() {
      // $FF: Couldn't be decompiled
   }
}
