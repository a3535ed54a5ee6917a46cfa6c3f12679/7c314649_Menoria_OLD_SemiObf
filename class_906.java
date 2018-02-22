import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import gnu.trove.map.TIntObjectMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;

// $FF: renamed from: ag
public enum class_906 {

   // $FF: renamed from: a ag
   field_4459,
   // $FF: renamed from: b ag
   field_4460,
   // $FF: renamed from: c ag
   field_4461,
   // $FF: renamed from: d ag
   field_4462;
   // $FF: renamed from: f gnu.trove.map.TIntObjectMap
   private static final TIntObjectMap field_4463;
   // $FF: renamed from: g java.util.Map
   private static final Map field_4464;
   // $FF: renamed from: h int
   private final int field_4465;
   // $FF: renamed from: i com.google.common.collect.BiMap
   private final BiMap field_4466;
   // $FF: renamed from: j com.google.common.collect.BiMap
   private final BiMap field_4467;
   // $FF: renamed from: k java.lang.String
   private static final String field_4468;
   // $FF: renamed from: l ag[]
   private static final class_906[] field_4469;
   // $FF: renamed from: m java.lang.String[]
   private static final String[] field_4470;


   // $FF: renamed from: <init> (java.lang.String, int, int) void
   private void method_5327(String var1, int var2, int var3) {
      super(var1, var2);
      this.field_4466 = HashBiMap.create();
      this.field_4467 = HashBiMap.create();
      this.field_4465 = var3;
   }

   // $FF: renamed from: b (int, java.lang.Class) ag
   protected class_906 method_5328(int var1, Class var2) {
      StringBuilder var10000;
      String var3;
      String[] var4;
      if(this.field_4466.containsKey(Integer.valueOf(var1))) {
         var10000 = new StringBuilder();
         var4 = field_4470;
         var3 = var10000.append("Serverbound packet ID ").append(var1).append(" is already assigned to ").append(this.field_4466.get(Integer.valueOf(var1))).append("; cannot re-assign to ").append(var2).toString();
         LogManager.getLogger().fatal(var3);
         throw new IllegalArgumentException(var3);
      } else if(this.field_4466.containsValue(var2)) {
         var10000 = new StringBuilder();
         var4 = field_4470;
         var3 = var10000.append("Serverbound packet ").append(var2).append(" is already assigned to ID ").append(this.field_4466.inverse().get(var2)).append("; cannot re-assign to ").append(var1).toString();
         LogManager.getLogger().fatal(var3);
         throw new IllegalArgumentException(var3);
      } else {
         this.field_4466.put(Integer.valueOf(var1), var2);
         return this;
      }
   }

   // $FF: renamed from: c (int, java.lang.Class) ag
   protected class_906 method_5329(int var1, Class var2) {
      StringBuilder var10000;
      String var3;
      String[] var4;
      if(this.field_4467.containsKey(Integer.valueOf(var1))) {
         var10000 = new StringBuilder();
         var4 = field_4470;
         var3 = var10000.append("Clientbound packet ID ").append(var1).append(" is already assigned to ").append(this.field_4467.get(Integer.valueOf(var1))).append("; cannot re-assign to ").append(var2).toString();
         LogManager.getLogger().fatal(var3);
         throw new IllegalArgumentException(var3);
      } else if(this.field_4467.containsValue(var2)) {
         var10000 = new StringBuilder();
         var4 = field_4470;
         var3 = var10000.append("Clientbound packet ").append(var2).append(" is already assigned to ID ").append(this.field_4467.inverse().get(var2)).append("; cannot re-assign to ").append(var1).toString();
         LogManager.getLogger().fatal(var3);
         throw new IllegalArgumentException(var3);
      } else {
         this.field_4467.put(Integer.valueOf(var1), var2);
         return this;
      }
   }

   // $FF: renamed from: b () com.google.common.collect.BiMap
   public BiMap method_5330() {
      return this.field_4466;
   }

   // $FF: renamed from: c () com.google.common.collect.BiMap
   public BiMap method_5331() {
      return this.field_4467;
   }

   // $FF: renamed from: b (boolean) com.google.common.collect.BiMap
   public BiMap method_5332(boolean var1) {
      BiMap var10000;
      try {
         if(var1) {
            var10000 = this.method_5331();
            return var10000;
         }
      } catch (IllegalArgumentException var2) {
         throw method_5340(var2);
      }

      var10000 = this.method_5330();
      return var10000;
   }

   // $FF: renamed from: c (boolean) com.google.common.collect.BiMap
   public BiMap method_5333(boolean var1) {
      BiMap var10000;
      try {
         if(var1) {
            var10000 = this.method_5330();
            return var10000;
         }
      } catch (IllegalArgumentException var2) {
         throw method_5340(var2);
      }

      var10000 = this.method_5331();
      return var10000;
   }

   // $FF: renamed from: d () int
   public int method_5334() {
      return this.field_4465;
   }

   // $FF: renamed from: b (int) ag
   public static class_906 method_5335(int var0) {
      return (class_906)field_4463.get(var0);
   }

   // $FF: renamed from: b (r1) ag
   public static class_906 method_5336(class_250 var0) {
      return (class_906)field_4464.get(var0.getClass());
   }

   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, int, java.lang.Object) void
   private void method_5337(String var1, int var2, String var3, int var4, int var5, Object var6) {
      this.method_5327(var1, var2, var5);
   }

   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, int, java.lang.Object, ah) void
   void method_5338(String var1, int var2, String var3, int var4, int var5, Object var6, class_910 var7) {
      this.method_5337(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5339() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_5340(IllegalArgumentException var0) {
      return var0;
   }
}
