import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: mo
class class_964 extends bcm {

   // $FF: renamed from: w java.util.List
   private final List field_4892;
   // $FF: renamed from: x java.lang.String
   private static final String field_4893;
   // $FF: renamed from: y lF
   final class_195 field_4894;
   // $FF: renamed from: z java.lang.String[]
   private static final String[] field_4895;


   // $FF: renamed from: <init> (lF) void
   public void method_5587(class_195 var1) {
      this.field_4894 = var1;
      super.method_5549(var1.field_557, var1.width, var1.height, 32, var1.height - 64, class_195.method_1059(var1).FONT_HEIGHT * 4);
      String[] var10000 = class_752.method_4253();
      this.field_4892 = new ArrayList();
      this.method_5551(false);
      String[] var2 = var10000;
      Iterator var3 = class_1775.field_9269.values().iterator();

      while(var3.hasNext()) {
         class_1777 var4 = (class_1777)var3.next();
         if(var2 != null && (class_195.method_1044(var1).method_9402(var4.field_9283) > 0 || var2 != null && class_195.method_1044(var1).method_9402(var4.field_9284) > 0)) {
            this.field_4892.add(var4);
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () int
   protected int method_5553() {
      return this.field_4892.size();
   }

   // $FF: renamed from: a (int, boolean, int, int) void
   protected void method_5554(int var1, boolean var2, int var3, int var4) {}

   // $FF: renamed from: a (int) boolean
   protected boolean method_5555(int var1) {
      return false;
   }

   // $FF: renamed from: e () int
   protected int method_5556() {
      return this.method_5553() * class_195.method_1060(this.field_4894).FONT_HEIGHT * 4;
   }

   // $FF: renamed from: a () void
   protected void method_5557() {
      this.field_4894.method_873();
   }

   // $FF: renamed from: a (int, int, int, int, bmh, int, int) void
   protected void method_5558(int var1, int var2, int var3, int var4, bmh var5, int var6, int var7) {
      class_1777 var9 = (class_1777)this.field_4892.get(var1);
      StringBuilder var10000 = new StringBuilder();
      String[] var15 = field_4895;
      String var10 = class_1450.method_7896(var10000.append("entity.").append(class_1775.method_9760(var9.field_9280)).append(".name").toString(), new Object[0]);
      String[] var16 = class_752.method_4253();
      int var11 = class_195.method_1044(this.field_4894).method_9402(var9.field_9283);
      int var12 = class_195.method_1044(this.field_4894).method_9402(var9.field_9284);
      String[] var8 = var16;
      String var13 = class_1450.method_7896("stat.entityKills", new Object[]{Integer.valueOf(var11), var10});
      String var14 = class_1450.method_7896("stat.entityKilledBy", new Object[]{var10, Integer.valueOf(var12)});
      int var17 = var11;
      if(var8 != null) {
         if(var11 == 0) {
            var13 = class_1450.method_7896("stat.entityKills.none", new Object[]{var10});
         }

         var17 = var12;
      }

      if(var17 == 0) {
         var16 = field_4895;
         var14 = class_1450.method_7896("stat.entityKilledBy.none", new Object[]{var10});
      }

      this.field_4894.method_657(class_195.method_1061(this.field_4894), var10, var2 + 2 - 10, var3 + 1, 16777215);
      class_195 var18 = this.field_4894;
      FontRenderer var10001 = class_195.method_1062(this.field_4894);
      int var10003 = var2 + 2;
      int var10004 = var3 + 1 + class_195.method_1063(this.field_4894).FONT_HEIGHT;
      int var10005 = var11;
      if(var8 != null) {
         var10005 = var11 == 0?6316128:9474192;
      }

      var18.method_657(var10001, var13, var10003, var10004, var10005);
      var18 = this.field_4894;
      var10001 = class_195.method_1064(this.field_4894);
      var10003 = var2 + 2;
      var10004 = var3 + 1 + class_195.method_1065(this.field_4894).FONT_HEIGHT * 2;
      var10005 = var12;
      if(var8 != null) {
         var10005 = var12 == 0?6316128:9474192;
      }

      var18.method_657(var10001, var14, var10003, var10004, var10005);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      // $FF: Couldn't be decompiled
   }
}
