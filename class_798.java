import java.util.Iterator;
import java.util.List;

// $FF: renamed from: xN
public class class_798 extends class_797 {

   // $FF: renamed from: aE add
   private add field_3733;
   // $FF: renamed from: aF java.lang.String
   private static final String field_3734;
   // $FF: renamed from: eb java.lang.String[]
   private static final String[] field_3735;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
   }

   // $FF: renamed from: <init> (ahb, sv, int) void
   public void method_4690(ahb var1, class_752 var2, int var3) {
      add var10003 = new add;
      var10003.method_3726(class_1010.field_5230, 1, var3);
      this.method_4691(var1, var2, var10003);
   }

   // $FF: renamed from: <init> (ahb, sv, add) void
   public void method_4691(ahb var1, class_752 var2, add var3) {
      super.method_4682(var1, var2);
      this.field_3733 = var3;
   }

   // $FF: renamed from: <init> (ahb, double, double, double, int) void
   public void method_4692(ahb var1, double var2, double var4, double var6, int var8) {
      add var10005 = new add;
      var10005.method_3726(class_1010.field_5230, 1, var8);
      this.method_4693(var1, var2, var4, var6, var10005);
   }

   // $FF: renamed from: <init> (ahb, double, double, double, add) void
   public void method_4693(ahb var1, double var2, double var4, double var6, add var8) {
      super.method_4683(var1, var2, var4, var6);
      this.field_3733 = var8;
   }

   // $FF: renamed from: d () float
   protected float method_4686() {
      return 0.05F;
   }

   // $FF: renamed from: a () float
   protected float method_4684() {
      return 0.5F;
   }

   // $FF: renamed from: b () float
   protected float method_4685() {
      return -20.0F;
   }

   // $FF: renamed from: c (int) void
   public void method_4694(int var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = this.field_3733;
      if(var2 != null) {
         if(this.field_3733 == null) {
            add var10001 = new add;
            var10001.method_3726(class_1010.field_5230, 1, 0);
            this.field_3733 = var10001;
         }

         var10000 = this.field_3733;
      }

      var10000.method_3746(var1);
   }

   // $FF: renamed from: f () int
   public int method_4695() {
      String[] var1 = class_752.method_4253();
      add var10000 = this.field_3733;
      if(var1 != null) {
         if(this.field_3733 == null) {
            add var10001 = new add;
            var10001.method_3726(class_1010.field_5230, 1, 0);
            this.field_3733 = var10001;
         }

         var10000 = this.field_3733;
      }

      return var10000.method_3745();
   }

   // $FF: renamed from: b (azu) void
   protected void method_4687(azu var1) {
      String[] var2 = class_752.method_4253();
      if(!this.field_2990.field_1832) {
         List var3 = class_1010.field_5230.getBlock28(this.field_3733);
         if(var2 != null) {
            label80: {
               if(var3 != null && !var3.isEmpty()) {
                  class_1343 var4 = this.field_3004.method_7097(4.0D, 2.0D, 4.0D);
                  List var5 = this.field_2990.method_2157(class_752.class, var4);
                  if(var2 == null) {
                     break label80;
                  }

                  if(var5 != null) {
                     label85: {
                        List var10000 = var5;
                        if(var2 != null) {
                           if(var5.isEmpty()) {
                              break label85;
                           }

                           var10000 = var5;
                        }

                        Iterator var6 = var10000.iterator();

                        label69:
                        do {
                           int var16 = var6.hasNext();

                           while(true) {
                              if(var16 == 0) {
                                 break label69;
                              }

                              class_752 var7 = (class_752)var6.next();
                              double var8 = this.method_3891(var7);
                              if(var2 == null) {
                                 break label80;
                              }

                              double var17 = var8;
                              double var10001 = 16.0D;
                              if(var2 != null) {
                                 if(var8 >= 16.0D) {
                                    break;
                                 }

                                 var17 = 1.0D;
                                 var10001 = Math.sqrt(var8) / 4.0D;
                              }

                              double var10 = var17 - var10001;
                              if(var7 == var1.field_4218) {
                                 var10 = 1.0D;
                              }

                              Iterator var12 = var3.iterator();

                              while(true) {
                                 if(!var12.hasNext()) {
                                    continue label69;
                                 }

                                 class_1645 var13 = (class_1645)var12.next();
                                 int var14 = var13.method_9016();
                                 var16 = class_1635.field_8489[var14].method_8969();
                                 if(var2 == null) {
                                    break;
                                 }

                                 label44: {
                                    if(var2 != null) {
                                       if(var16 != 0) {
                                          class_1635.field_8489[var14].method_8968(this.method_4688(), var7, var13.method_9018(), var10);
                                          if(var2 != null) {
                                             break label44;
                                          }
                                       }

                                       var16 = (int)(var10 * (double)var13.method_9017() + 0.5D);
                                    }

                                    int var15 = var16;
                                    if(var15 > 20) {
                                       class_1645 var18 = new class_1645;
                                       var18.method_9012(var14, var15, var13.method_9018());
                                       var7.method_4179(var18);
                                    }
                                 }

                                 if(var2 == null) {
                                    continue label69;
                                 }
                              }
                           }
                        } while(var2 != null);
                     }
                  }
               }

               this.field_2990.method_2210(2002, (int)Math.round(this.field_2994), (int)Math.round(this.field_2995), (int)Math.round(this.field_2996), this.method_4695());
            }
         }

         this.method_3851();
      }

   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      class_798 var10000;
      String[] var2;
      label25: {
         var2 = class_752.method_4253();
         var10000 = this;
         class_1583 var10001 = var1;
         if(var2 != null) {
            super.method_3908(var1);
            String[] var3 = field_3735;
            if(var1.initGui8("Potion", 10)) {
               this.field_3733 = add.method_3727(var1.method_8688("Potion"));
               if(var2 != null) {
                  break label25;
               }
            }

            var10000 = this;
            var10001 = var1;
         }

         String[] var10002 = field_3735;
         var10000.method_4694(var10001.method_8681("potionValue"));
      }

      var10000 = this;
      if(var2 != null) {
         if(this.field_3733 != null) {
            return;
         }

         var10000 = this;
      }

      var10000.method_3851();
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      if(this.field_3733 != null) {
         String[] var10001 = field_3735;
         add var10002 = this.field_3733;
         class_1583 var10003 = new class_1583;
         var10003.method_8628();
         var1.method_8664("Potion", var10002.method_3737(var10003));
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_4689() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "¯ÖhªZ¼;ý1õóÎ@6ÖhªZ×d";
      int var4 = "¯ÖhªZ¼;ý1õóÎ@6ÖhªZ×d".length();
      char var1 = 6;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_3735 = var5;
                  String[] var10 = field_3735;
                  field_3734 = "CL_00001727";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 200;
               break;
            case 1:
               var10009 = 64;
               break;
            case 2:
               var10009 = 149;
               break;
            case 3:
               var10009 = 54;
               break;
            case 4:
               var10009 = 242;
               break;
            case 5:
               var10009 = 3;
               break;
            default:
               var10009 = 244;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
