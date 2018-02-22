import java.util.Random;

// $FF: renamed from: yq
public class class_1736 extends class_1727 {

   // $FF: renamed from: a sw
   private class_753 field_9071;
   // $FF: renamed from: d ahb
   private ahb field_9072;
   // $FF: renamed from: e int
   int field_9073;
   // $FF: renamed from: h java.lang.String
   private static final String field_9074 = "mobGriefing";


   // $FF: renamed from: <init> (sw) void
   public void method_9668(class_753 var1) {
      super.method_9648();
      this.field_9071 = var1;
      this.field_9072 = var1.field_2990;
      this.method_9655(7);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      Random var10000 = this.field_9071.method_4165();
      int var10001 = this.field_9071.method_4159();
      if(var1 != null) {
         var10001 = var10001 != 0?50:1000;
      }

      int var5 = var10000.nextInt(var10001);
      if(var1 != null) {
         if(var5 != 0) {
            return false;
         }

         var5 = class_1715.method_9561(this.field_9071.field_2994);
      }

      int var2 = var5;
      int var3 = class_1715.method_9561(this.field_9071.field_2995);
      int var4 = class_1715.method_9561(this.field_9071.field_2996);
      aji var6 = this.field_9072.getBlock(var2, var3, var4);
      if(var1 != null) {
         int var10002;
         int var10003;
         ahb var7;
         label34: {
            if(var6 == class_1192.field_6058) {
               var7 = this.field_9072;
               var10001 = var2;
               var10002 = var3;
               var10003 = var4;
               if(var1 == null) {
                  break label34;
               }

               if(this.field_9072.method_33(var2, var3, var4) == 1) {
                  return true;
               }
            }

            var7 = this.field_9072;
            var10001 = var2;
            var10002 = var3 - 1;
            var10003 = var4;
         }

         var6 = var7.getBlock(var10001, var10002, var10003);
      }

      return var6 == class_1192.field_6027;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9073 = 40;
      this.field_9072.method_2191(this.field_9071, (byte)10);
      this.field_9071.method_4257().method_9802();
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9073 = 0;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_9073;
      if(var1 != null) {
         var10000 = this.field_9073 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a () int
   public int method_9669() {
      return this.field_9073;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      this.field_9073 = Math.max(0, this.field_9073 - 1);
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_9073;
      if(var1 != null) {
         if(this.field_9073 != 4) {
            return;
         }

         var10000 = class_1715.method_9561(this.field_9071.field_2994);
      }

      class_1736 var6;
      label53: {
         int var2;
         int var3;
         int var4;
         ahb var7;
         label54: {
            var2 = var10000;
            var3 = class_1715.method_9561(this.field_9071.field_2995);
            var4 = class_1715.method_9561(this.field_9071.field_2996);
            aji var5 = this.field_9072.getBlock(var2, var3, var4);
            if(var1 != null) {
               if(var5 == class_1192.field_6058) {
                  var6 = this;
                  if(var1 != null) {
                     if(this.field_9072.method_2196().method_5878("mobGriefing")) {
                        this.field_9072.method_2057(var2, var3, var4, false);
                     }

                     var6 = this;
                  }

                  var6.field_9071.method_4262();
                  if(var1 != null) {
                     return;
                  }
               }

               var7 = this.field_9072;
               if(var1 == null) {
                  break label54;
               }

               var5 = this.field_9072.getBlock(var2, var3 - 1, var4);
            }

            if(var5 != class_1192.field_6027) {
               return;
            }

            var6 = this;
            if(var1 == null) {
               break label53;
            }

            var7 = this.field_9072;
         }

         if(var7.method_2196().method_5878("mobGriefing")) {
            this.field_9072.method_2210(2001, var2, var3 - 1, var4, aji.method_2415(class_1192.field_6027));
            this.field_9072.method_2054(var2, var3 - 1, var4, class_1192.field_6028, 0, 2);
         }

         var6 = this;
      }

      var6.field_9071.method_4262();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9670() {
      boolean var10000 = true;
      char[] var10003 = "`ªdæh3ok¬hÆ".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_9074 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 232;
            break;
         case 1:
            var10009 = 32;
            break;
         case 2:
            var10009 = 227;
            break;
         case 3:
            var10009 = 68;
            break;
         case 4:
            var10009 = 255;
            break;
         case 5:
            var10009 = 191;
            break;
         default:
            var10009 = 239;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
