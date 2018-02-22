import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: ro
public class class_1583 extends class_1571 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_8277;
   // $FF: renamed from: d java.util.Map
   private Map field_8278;
   // $FF: renamed from: e java.lang.String
   private static final String field_8279;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8280;


   // $FF: renamed from: <init> () void
   public void method_8628() {
      super.method_8628();
      this.field_8278 = new HashMap();
   }

   // $FF: renamed from: b (java.io.DataOutput) void
   void method_8629(DataOutput var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = this.field_8278.keySet().iterator();
      String[] var2 = var10000;

      while(true) {
         if(var3.hasNext()) {
            String var4 = (String)var3.next();
            class_1571 var5 = (class_1571)this.field_8278.get(var4);

            try {
               method_8694(var4, var5, var1);
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  continue;
               }
            } catch (RuntimeException var6) {
               throw method_8699(var6);
            }
         }

         var1.writeByte(0);
         break;
      }

   }

   // $FF: renamed from: b (java.io.DataInput, int, ri) void
   void method_8630(DataInput var1, int var2, class_1567 var3) {
      String[] var4 = class_752.method_4253();

      try {
         if(var2 > 512) {
            RuntimeException var10000 = new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
            String[] var10002 = field_8280;
            throw var10000;
         }
      } catch (RuntimeException var8) {
         throw method_8699(var8);
      }

      this.field_8278.clear();

      byte var5;
      while((var5 = method_8695(var1, var3)) != 0) {
         String var6 = method_8696(var1, var3);
         var3.method_8604((long)(16 * var6.length()));
         class_1571 var7 = method_8697(var5, var6, var1, var2 + 1, var3);
         this.field_8278.put(var6, var7);
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a () java.util.Set
   public Set method_8663() {
      return this.field_8278.keySet();
   }

   // $FF: renamed from: b () byte
   public byte method_8631() {
      return (byte)10;
   }

   // $FF: renamed from: b (java.lang.String, rm) void
   public void method_8664(String var1, class_1571 var2) {
      this.field_8278.put(var1, var2);
   }

   // $FF: renamed from: b (java.lang.String, byte) void
   public void method_8665(String var1, byte var2) {
      Map var10000 = this.field_8278;
      class_1578 var10002 = new class_1578;
      var10002.method_8647(var2);
      var10000.put(var1, var10002);
   }

   // $FF: renamed from: b (java.lang.String, short) void
   public void method_8666(String var1, short var2) {
      Map var10000 = this.field_8278;
      class_1573 var10002 = new class_1573;
      var10002.method_8642(var2);
      var10000.put(var1, var10002);
   }

   // $FF: renamed from: b (java.lang.String, int) void
   public void method_8667(String var1, int var2) {
      Map var10000 = this.field_8278;
      class_1575 var10002 = new class_1575;
      var10002.method_8644(var2);
      var10000.put(var1, var10002);
   }

   // $FF: renamed from: b (java.lang.String, long) void
   public void method_8668(String var1, long var2) {
      Map var10000 = this.field_8278;
      class_1574 var10002 = new class_1574;
      var10002.method_8643(var2);
      var10000.put(var1, var10002);
   }

   // $FF: renamed from: b (java.lang.String, float) void
   public void method_8669(String var1, float var2) {
      Map var10000 = this.field_8278;
      class_1576 var10002 = new class_1576;
      var10002.method_8645(var2);
      var10000.put(var1, var10002);
   }

   // $FF: renamed from: b (java.lang.String, double) void
   public void initGui0(String var1, double var2) {
      Map var10000 = this.field_8278;
      class_1577 var10002 = new class_1577;
      var10002.method_8646(var2);
      var10000.put(var1, var10002);
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) void
   public void initGui1(String var1, String var2) {
      Map var10000 = this.field_8278;
      class_1579 var10002 = new class_1579;
      var10002.method_8648(var2);
      var10000.put(var1, var10002);
   }

   // $FF: renamed from: b (java.lang.String, byte[]) void
   public void initGui2(String var1, byte[] var2) {
      Map var10000 = this.field_8278;
      class_1584 var10002 = new class_1584;
      var10002.method_8700(var2);
      var10000.put(var1, var10002);
   }

   // $FF: renamed from: b (java.lang.String, int[]) void
   public void initGui3(String var1, int[] var2) {
      Map var10000 = this.field_8278;
      class_1581 var10002 = new class_1581;
      var10002.method_8661(var2);
      var10000.put(var1, var10002);
   }

   // $FF: renamed from: b (java.lang.String, boolean) void
   public void initGui4(String var1, boolean var2) {
      String[] var3 = class_752.method_4253();

      class_1583 var10000;
      String var10001;
      byte var10002;
      label22: {
         label21: {
            try {
               var10000 = this;
               var10001 = var1;
               var10002 = var2;
               if(var3 == null) {
                  break label22;
               }

               if(var2 != 0) {
                  break label21;
               }
            } catch (RuntimeException var4) {
               throw method_8699(var4);
            }

            var10002 = 0;
            break label22;
         }

         var10002 = 1;
      }

      var10000.method_8665(var10001, (byte)var10002);
   }

   // $FF: renamed from: b (java.lang.String) rm
   public class_1571 initGui5(String var1) {
      return (class_1571)this.field_8278.get(var1);
   }

   // $FF: renamed from: c (java.lang.String) byte
   public byte initGui6(String var1) {
      String[] var10000 = class_752.method_4253();
      class_1571 var3 = (class_1571)this.field_8278.get(var1);
      String[] var2 = var10000;

      class_1571 var5;
      byte var6;
      label32: {
         label22: {
            try {
               var5 = var3;
               if(var2 == null) {
                  break label32;
               }

               if(var3 == null) {
                  break label22;
               }
            } catch (RuntimeException var4) {
               throw method_8699(var4);
            }

            var5 = var3;
            break label32;
         }

         var6 = 0;
         return var6;
      }

      var6 = var5.method_8631();
      return var6;
   }

   // $FF: renamed from: d (java.lang.String) boolean
   public boolean initGui7(String var1) {
      return this.field_8278.containsKey(var1);
   }

   // $FF: renamed from: c (java.lang.String, int) boolean
   public boolean initGui8(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (java.lang.String) byte
   public byte initGui9(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f (java.lang.String) short
   public short method_8680(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g (java.lang.String) int
   public int method_8681(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h (java.lang.String) long
   public long method_8682(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: i (java.lang.String) float
   public float method_8683(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: j (java.lang.String) double
   public double method_8684(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: k (java.lang.String) java.lang.String
   public String method_8685(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: l (java.lang.String) byte[]
   public byte[] method_8686(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: m (java.lang.String) int[]
   public int[] method_8687(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: n (java.lang.String) ro
   public class_1583 method_8688(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (java.lang.String, int) rr
   public class_1580 method_8689(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: o (java.lang.String) boolean
   public boolean method_8690(String var1) {
      String[] var2 = class_752.method_4253();

      byte var10000;
      label32: {
         try {
            var10000 = this.initGui9(var1);
            if(var2 == null) {
               return (boolean)var10000;
            }

            if(var10000 != 0) {
               break label32;
            }
         } catch (RuntimeException var3) {
            throw method_8699(var3);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: p (java.lang.String) void
   public void method_8691(String var1) {
      this.field_8278.remove(var1);
   }

   public String toString() {
      String var2 = "{";
      String[] var10000 = class_752.method_4253();
      Iterator var4 = this.field_8278.keySet().iterator();
      String[] var1 = var10000;

      String var5;
      while(true) {
         if(var4.hasNext()) {
            String var3 = (String)var4.next();
            var5 = var2 + var3 + ':' + this.field_8278.get(var3) + ',';
            if(var1 == null) {
               break;
            }

            var2 = var5;
            if(var1 != null) {
               continue;
            }
         }

         var5 = var2 + "}";
         break;
      }

      return var5;
   }

   // $FF: renamed from: e () boolean
   public boolean method_8692() {
      return this.field_8278.isEmpty();
   }

   // $FF: renamed from: b (java.lang.String, int, java.lang.ClassCastException) kj
   private class_1346 method_8693(String var1, int var2, ClassCastException var3) {
      String[] var6 = field_8280;
      class_1346 var4 = class_1346.method_7153(var3, "Reading NBT data");
      class_1605 var5 = var4.method_7151("Corrupt NBT tag", 1);
      class_1565 var10002 = new class_1565;
      var10002.method_8597(this, var1);
      var5.method_8777("Tag type found", var10002);
      class_1566 var7 = new class_1566;
      var7.method_8600(this, var2);
      var5.method_8777("Tag type expected", var7);
      var5.method_8778("Tag name", var1);
      return var4;
   }

   // $FF: renamed from: c () rm
   public class_1571 method_8633() {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var1 = var10000;
      Iterator var2 = this.field_8278.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var1.method_8664(var3, ((class_1571)this.field_8278.get(var3)).method_8633());
      }

      return var1;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();

      label28: {
         boolean var10000;
         try {
            var10000 = super.equals(var1);
            if(var2 == null) {
               return var10000;
            }

            if(var10000) {
               break label28;
            }
         } catch (RuntimeException var4) {
            throw method_8699(var4);
         }

         var10000 = false;
         return var10000;
      }

      class_1583 var3 = (class_1583)var1;
      return this.field_8278.entrySet().equals(var3.field_8278.entrySet());
   }

   public int hashCode() {
      return super.hashCode() ^ this.field_8278.hashCode();
   }

   // $FF: renamed from: b (java.lang.String, rm, java.io.DataOutput) void
   private static void method_8694(String param0, class_1571 param1, DataOutput param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.DataInput, ri) byte
   private static byte method_8695(DataInput var0, class_1567 var1) {
      return var0.readByte();
   }

   // $FF: renamed from: c (java.io.DataInput, ri) java.lang.String
   private static String method_8696(DataInput var0, class_1567 var1) {
      return var0.readUTF();
   }

   // $FF: renamed from: b (byte, java.lang.String, java.io.DataInput, int, ri) rm
   static class_1571 method_8697(byte var0, String var1, DataInput var2, int var3, class_1567 var4) {
      class_1571 var5 = class_1571.method_8632(var0);

      try {
         var5.method_8630(var2, var3, var4);
         return var5;
      } catch (IOException var10) {
         String[] var9 = field_8280;
         class_1346 var7 = class_1346.method_7153(var10, "Loading NBT data");
         class_1605 var8 = var7.method_7150("NBT Tag");
         var8.method_8778("Tag name", var1);
         var8.method_8778("Tag type", Byte.valueOf(var0));
         class_643 var10000 = new class_643;
         var10000.method_3525(var7);
         throw var10000;
      }
   }

   // $FF: renamed from: b (ro) java.util.Map
   static Map method_8698(class_1583 var0) {
      return var0.field_8278;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8635() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_8699(RuntimeException var0) {
      return var0;
   }
}
