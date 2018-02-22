package ca.diiza.l;

import ca.diiza.l.class_858;

// $FF: renamed from: ca.diiza.l.n
public class class_862 {

   // $FF: renamed from: a int
   private static final int field_4139 = 1;
   // $FF: renamed from: b int
   public static final int field_4140 = 0;
   // $FF: renamed from: c int
   public static final int field_4141 = 1;
   // $FF: renamed from: d ca.diiza.l.i[]
   protected static final class_858[] field_4142;
   // $FF: renamed from: e ca.diiza.l.i[]
   protected static final class_858[] field_4143;
   // $FF: renamed from: f java.lang.String
   public String field_4144;
   // $FF: renamed from: g int
   public int field_4145;
   // $FF: renamed from: h int
   public int field_4146;
   // $FF: renamed from: i int
   public int field_4147;
   // $FF: renamed from: j boolean
   public boolean field_4148;
   // $FF: renamed from: k float
   public float field_4149;
   // $FF: renamed from: l float
   public float field_4150;
   // $FF: renamed from: m float
   public float field_4151;
   // $FF: renamed from: n int
   public int field_4152;
   // $FF: renamed from: o int
   private static int field_4153;
   // $FF: renamed from: p java.lang.String[]
   private static final String[] field_4154;


   // $FF: renamed from: <init> (java.lang.String, int, int, int, boolean, float, float, float) void
   public void method_5023(String var1, int var2, int var3, int var4, boolean var5, float var6, float var7, float var8) {
      int var10000 = method_5030();
      super();
      int var9 = var10000;

      class_862 var11;
      String var10001;
      label22: {
         label21: {
            try {
               var11 = this;
               var10001 = var1;
               if(var9 == 0) {
                  break label22;
               }

               if(var1 == null) {
                  break label21;
               }
            } catch (RuntimeException var10) {
               throw method_5032(var10);
            }

            var10001 = var1;
            break label22;
         }

         var10001 = "";
      }

      var11.field_4144 = var10001;
      this.field_4145 = var2;
      this.field_4146 = var3;
      this.field_4147 = var4;
      this.field_4148 = var5;
      this.field_4149 = var6;
      this.field_4150 = var7;
      this.field_4151 = var8;
   }

   // $FF: renamed from: <init> (java.lang.String, int, int, int, boolean, float, float, float, int) void
   protected void method_5024(String param1, int param2, int param3, int param4, boolean param5, float param6, float param7, float param8, int param9) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <init> (ca.diiza.l.n) void
   protected void method_5025(class_862 var1) {
      super();
      this.method_5026(var1);
   }

   // $FF: renamed from: a (ca.diiza.l.n) void
   protected void method_5026(class_862 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String) ca.diiza.l.n
   protected static class_862 method_5027(String param0) {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      int var1 = (int)(this.field_4149 * 255.0F) & 255;
      int var2 = (int)(this.field_4150 * 255.0F) & 255;
      int var3 = (int)(this.field_4151 * 255.0F) & 255;
      int var4 = var1 << 16 | var2 << 8 | var3;

      String var7;
      try {
         if(this.field_4152 == 0) {
            String[] var5 = field_4154;
            var7 = "%s:%d:%d:%d:%s:%06X";
            return String.format(var7, new Object[]{this.field_4144, Integer.valueOf(this.field_4145), Integer.valueOf(this.field_4146), Integer.valueOf(this.field_4147), Boolean.valueOf(this.field_4148), Integer.valueOf(var4), Integer.valueOf(this.field_4152)});
         }
      } catch (RuntimeException var6) {
         throw method_5032(var6);
      }

      String[] var10000 = field_4154;
      var7 = "%s:%d:%d:%d:%s:%06X:%d";
      return String.format(var7, new Object[]{this.field_4144, Integer.valueOf(this.field_4145), Integer.valueOf(this.field_4146), Integer.valueOf(this.field_4147), Boolean.valueOf(this.field_4148), Integer.valueOf(var4), Integer.valueOf(this.field_4152)});
   }

   // $FF: renamed from: <clinit> () void
   static void method_5028() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "xé$å¿19 ;¤á.Eg¿.ö19xé$å¿19 ;¤á.Eg¿.ö";
      int var4 = "xé$å¿19 ;¤á.Eg¿.ö19xé$å¿19 ;¤á.Eg¿.ö".length();
      char var1 = 22;
      method_5029(22);
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_4154 = var5;
                  field_4142 = new class_858[]{class_858.field_3974, class_858.field_3975};
                  field_4143 = new class_858[]{class_858.field_3976, class_858.field_3977};
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 98;
               break;
            case 1:
               var10009 = 165;
               break;
            case 2:
               var10009 = 33;
               break;
            case 3:
               var10009 = 255;
               break;
            case 4:
               var10009 = 228;
               break;
            case 5:
               var10009 = 52;
               break;
            default:
               var10009 = 9;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: a (int) void
   public static void method_5029(int var0) {
      field_4153 = var0;
   }

   // $FF: renamed from: a () int
   public static int method_5030() {
      return field_4153;
   }

   // $FF: renamed from: b () int
   public static int method_5031() {
      int var0 = method_5030();

      try {
         return var0 == 0?56:0;
      } catch (RuntimeException var1) {
         throw method_5032(var1);
      }
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_5032(RuntimeException var0) {
      return var0;
   }
}
