
public class azu {

   // $FF: renamed from: a O
   public class_100 field_4212;
   // $FF: renamed from: b int
   public int field_4213;
   // $FF: renamed from: c int
   public int field_4214;
   // $FF: renamed from: d int
   public int field_4215;
   // $FF: renamed from: e int
   public int field_4216;
   // $FF: renamed from: f azw
   public azw field_4217;
   // $FF: renamed from: g sa
   public class_689 field_4218;
   private static final String __OBFID;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_4219;


   // $FF: renamed from: <init> (int, int, int, int, azw) void
   public void method_5081(int var1, int var2, int var3, int var4, azw var5) {
      this.method_5082(var1, var2, var3, var4, var5, true);
   }

   // $FF: renamed from: <init> (int, int, int, int, azw, boolean) void
   public void method_5082(int var1, int var2, int var3, int var4, azw var5, boolean var6) {
      super();
      this.field_4212 = var6?class_100.field_85:class_100.field_84;
      this.field_4213 = var1;
      this.field_4214 = var2;
      this.field_4215 = var3;
      this.field_4216 = var4;
      this.field_4217 = azw.method_5086(var5.field_4220, var5.field_4221, var5.field_4222);
   }

   // $FF: renamed from: <init> (sa) void
   public void method_5083(class_689 var1) {
      this.method_5084(var1, azw.method_5086(var1.field_2994, var1.field_2995, var1.field_2996));
   }

   // $FF: renamed from: <init> (sa, azw) void
   public void method_5084(class_689 var1, azw var2) {
      super();
      this.field_4212 = class_100.field_86;
      this.field_4218 = var1;
      this.field_4217 = var2;
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_4219;
      return var10000.append("HitResult{type=").append(this.field_4212).append(", x=").append(this.field_4213).append(", y=").append(this.field_4214).append(", z=").append(this.field_4215).append(", f=").append(this.field_4216).append(", pos=").append(this.field_4217).append(", entity=").append(this.field_4218).append('}').toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5085() {
      // $FF: Couldn't be decompiled
   }
}
