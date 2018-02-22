import com.google.common.collect.Lists;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: us
public class class_1684 implements class_63 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_8782;
   // $FF: renamed from: b l
   public final class_120 field_8783;
   // $FF: renamed from: c net.minecraft.server.MinecraftServer
   private final MinecraftServer field_8784;
   // $FF: renamed from: d xi
   public class_793 field_8785;
   // $FF: renamed from: f int
   private int field_8786;
   // $FF: renamed from: g int
   private int field_8787;
   // $FF: renamed from: h boolean
   private boolean field_8788;
   // $FF: renamed from: i int
   private int field_8789;
   // $FF: renamed from: j long
   private long field_8790;
   // $FF: renamed from: k java.util.Random
   private static Random field_8791;
   // $FF: renamed from: l long
   private long field_8792;
   // $FF: renamed from: m int
   private int field_8793;
   // $FF: renamed from: n int
   private int field_8794;
   // $FF: renamed from: o vl
   private class_1706 field_8795;
   // $FF: renamed from: p double
   private double field_8796;
   // $FF: renamed from: q double
   private double field_8797;
   // $FF: renamed from: r double
   private double field_8798;
   // $FF: renamed from: s boolean
   private boolean field_8799;
   // $FF: renamed from: t java.lang.String
   private static final String field_8800;
   // $FF: renamed from: u java.lang.String[]
   private static final String[] field_8801;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer, l, xi) void
   public void method_9287(MinecraftServer var1, class_120 var2, class_793 var3) {
      super();
      class_1706 var10001 = new class_1706;
      var10001.method_9472();
      this.field_8795 = var10001;
      this.field_8799 = true;
      this.field_8784 = var1;
      this.field_8783 = var2;
      var2.method_552(this);
      this.field_8785 = var3;
      var3.field_3654 = this;
   }

   // $FF: renamed from: b () void
   public void method_239() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () l
   public class_120 method_9288() {
      return this.field_8783;
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_9289(String var1) {
      class_1082 var10000 = new class_1082;
      var10000.method_6134(var1);
      class_1082 var2 = var10000;
      class_120 var3 = this.field_8783;
      class_284 var10001 = new class_284;
      var10001.method_1639(var2);
      GenericFutureListener[] var10002 = new GenericFutureListener[1];
      class_1685 var10005 = new class_1685;
      var10005.method_9296(this, var2);
      var10002[0] = var10005;
      var3.method_553(var10001, var10002);
      this.field_8783.method_566();
   }

   // $FF: renamed from: b (tq) void
   public void method_266(class_260 var1) {
      this.field_8785.method_4647(var1.method_1502(), var1.method_1503(), var1.method_1504(), var1.method_1505());
   }

   // $FF: renamed from: b (tj) void
   public void method_262(class_264 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (double, double, double, float, float) void
   public void method_9290(double var1, double var3, double var5, float var7, float var8) {
      this.field_8799 = false;
      this.field_8796 = var1;
      this.field_8797 = var3;
      this.field_8798 = var5;
      this.field_8785.method_3886(var1, var3, var5, var7, var8);
      class_1684 var10000 = this.field_8785.field_3654;
      class_349 var10001 = new class_349;
      var10001.method_2009(var1, var3 + 1.6200000047683716D, var5, var7, var8, false);
      var10000.method_9291(var10001);
   }

   // $FF: renamed from: b (to) void
   public void method_264(class_262 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tu) void
   public void method_270(class_256 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (rV) void
   public void method_237(class_66 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (r1) void
   public void method_9291(class_250 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tr) void
   public void method_267(class_259 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (s_) void
   public void method_251(class_304 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String) void
   private void method_9292(String var1) {
      this.field_8784.method_2349().method_39(this.field_8785, var1);
   }

   // $FF: renamed from: b (s8) void
   public void method_250(class_333 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tp) void
   public void method_265(class_261 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (th) void
   public void method_260(class_269 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ta) void
   public void method_253(class_276 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tf) void
   public void method_258(class_271 var1) {
      this.field_8785.method_4646();
   }

   // $FF: renamed from: b (te) void
   public void method_257(class_272 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (td) void
   public void method_256(class_273 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ts) void
   public void method_268(class_258 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tc) void
   public void method_255(class_274 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tt) void
   public void method_269(class_257 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ti) void
   public void method_261(class_268 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () long
   private long method_9293() {
      return System.nanoTime() / 1000000L;
   }

   // $FF: renamed from: b (tn) void
   public void method_263(class_263 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (s9) void
   public void method_252(class_332 var1) {
      String[] var10000 = class_752.method_4253();
      ArrayList var3 = Lists.newArrayList();
      String[] var2 = var10000;
      Iterator var4 = this.field_8784.method_2347(this.field_8785, var1.method_1887()).iterator();

      while(true) {
         if(var4.hasNext()) {
            String var5 = (String)var4.next();

            try {
               var3.add(var5);
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  continue;
               }
            } catch (class_643 var6) {
               throw method_9295(var6);
            }
         }

         class_1684 var7 = this.field_8785.field_3654;
         class_294 var10001 = new class_294;
         var10001.method_1688((String[])((String[])var3.toArray(new String[var3.size()])));
         var7.method_9291(var10001);
         break;
      }

   }

   // $FF: renamed from: b (tb) void
   public void method_254(class_275 var1) {
      this.field_8785.method_4652(var1);
   }

   // $FF: renamed from: b (tg) void
   public void method_259(class_270 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ag, ag) void
   public void method_238(class_906 var1, class_906 var2) {
      try {
         if(var2 != class_906.field_4460) {
            IllegalStateException var10000 = new IllegalStateException("Unexpected change in protocol!");
            String[] var10002 = field_8801;
            throw var10000;
         }
      } catch (class_643 var3) {
         throw method_9295(var3);
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_9294() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_9295(Throwable var0) {
      return var0;
   }
}
