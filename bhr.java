import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class bhr {

   // $FF: renamed from: p float
   public float field_6259;
   // $FF: renamed from: q boolean
   public boolean field_6260;
   // $FF: renamed from: r java.util.List
   public List field_6261;
   // $FF: renamed from: s boolean
   public boolean field_6262;
   // $FF: renamed from: a java.util.Map
   private Map field_6263;
   // $FF: renamed from: t int
   public int field_6264;
   // $FF: renamed from: u int
   public int field_6265;


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super();
      this.field_6261 = new ArrayList();
      this.field_6262 = true;
      this.field_6263 = new HashMap();
      this.field_6264 = 64;
      this.field_6265 = 32;
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {}

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {}

   // $FF: renamed from: a (sv, float, float, float) void
   public void method_6513(class_752 var1, float var2, float var3, float var4) {}

   // $FF: renamed from: a (java.util.Random) bix
   public bix method_6514(Random var1) {
      return (bix)this.field_6261.get(var1.nextInt(this.field_6261.size()));
   }

   // $FF: renamed from: a (java.lang.String, int, int) void
   protected void method_6515(String var1, int var2, int var3) {
      Map var10000 = this.field_6263;
      class_1431 var10002 = new class_1431;
      var10002.method_7790(var2, var3);
      var10000.put(var1, var10002);
   }

   // $FF: renamed from: a (java.lang.String) ns
   public class_1431 method_6516(String var1) {
      return (class_1431)this.field_6263.get(var1);
   }
}
