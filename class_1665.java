import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: ug
public class class_1665 implements class_25 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_8672;
   // $FF: renamed from: b java.util.Set
   private Set field_8673;
   // $FF: renamed from: c gI
   private class_1069 field_8674;
   // $FF: renamed from: d gG
   private class_25 field_8675;
   // $FF: renamed from: e gN
   private class_26 field_8676;
   // $FF: renamed from: f boolean
   public boolean field_8677;
   // $FF: renamed from: h vp
   private class_1711 field_8678;
   // $FF: renamed from: i java.util.List
   private List field_8679;
   // $FF: renamed from: j dk
   private class_354 field_8680;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_8681;


   // $FF: renamed from: <init> (dk, gN, gG) void
   public void method_9187(class_354 var1, class_26 var2, class_25 var3) {
      super();
      this.field_8673 = Collections.newSetFromMap(new ConcurrentHashMap());
      this.field_8677 = true;
      class_1711 var10001 = new class_1711;
      var10001.method_9520();
      this.field_8678 = var10001;
      this.field_8679 = new ArrayList();
      class_1070 var4 = new class_1070;
      var4.method_6013(var1, 0, 0);
      this.field_8674 = var4;
      this.field_8680 = var1;
      this.field_8676 = var2;
      this.field_8675 = var3;
   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_103(int var1, int var2) {
      return this.field_8678.method_9526(class_1035.method_5857(var1, var2));
   }

   // $FF: renamed from: f () java.util.List
   public List method_9188() {
      return this.field_8679;
   }

   // $FF: renamed from: a (int, int) void
   public void method_9189(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () void
   public void method_9190() {
      String[] var10000 = class_752.method_4253();
      Iterator var2 = this.field_8679.iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         class_1069 var3 = (class_1069)var2.next();
         this.method_9189(var3.fontRendererObj1, var3.fontRendererObj2);
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d (int, int) gI
   public class_1069 method_105(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int, int) gI
   public class_1069 method_104(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (int, int) gI
   private class_1069 method_9191(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (gI) void
   private void method_9192(class_1069 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (gI) void
   private void method_9193(class_1069 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (gG, int, int) void
   public void method_106(class_25 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (boolean, vu) boolean
   public boolean method_107(boolean param1, class_81 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   public void method_115() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () boolean
   public boolean method_108() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () boolean
   public boolean method_109() {
      String[] var1 = class_752.method_4253();

      boolean var10000;
      label32: {
         try {
            var10000 = this.field_8680.field_1856;
            if(var1 == null) {
               return var10000;
            }

            if(!this.field_8680.field_1856) {
               break label32;
            }
         } catch (class_643 var2) {
            throw method_9195(var2);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_110() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_8681;
      return var10000.append("ServerChunkCache: ").append(this.field_8678.method_9524()).append(" Drop: ").append(this.field_8673.size()).toString();
   }

   // $FF: renamed from: b (as, int, int, int) java.util.List
   public List method_111(class_922 var1, int var2, int var3, int var4) {
      return this.field_8675.method_111(var1, var2, var3, var4);
   }

   // $FF: renamed from: b (ahb, java.lang.String, int, int, int) dd
   public class_1034 method_112(ahb var1, String var2, int var3, int var4, int var5) {
      return this.field_8675.method_112(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: d () int
   public int method_113() {
      return this.field_8678.method_9524();
   }

   // $FF: renamed from: f (int, int) void
   public void method_114(int var1, int var2) {}

   // $FF: renamed from: <clinit> () void
   static void method_9194() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_9195(Throwable var0) {
      return var0;
   }
}
