import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: cD
public class class_936 implements class_19 {

   // $FF: renamed from: b add
   private final add field_4770;
   // $FF: renamed from: c java.util.List
   private final List field_4771;


   // $FF: renamed from: <init> (add, java.util.List) void
   public void method_5469(add var1, List var2) {
      super();
      this.field_4770 = var1;
      this.field_4771 = var2;
   }

   // $FF: renamed from: c () add
   public add method_63() {
      return this.field_4770;
   }

   // $FF: renamed from: b (aO, ahb) boolean
   public boolean method_60(class_897 var1, ahb var2) {
      ArrayList var4 = new ArrayList(this.field_4771);
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var3 = var10000;

      boolean var11;
      while(true) {
         if(var5 < 3) {
            var11 = false;
            if(var3 == null) {
               break;
            }

            int var6 = 0;

            while(true) {
               if(var6 < 3) {
                  add var7 = var1.method_5203(var6, var5);
                  if(var3 == null) {
                     break;
                  }

                  if(var3 != null) {
                     add var12 = var7;

                     label74:
                     while(true) {
                        if(var12 != null) {
                           label95: {
                              boolean var8 = false;
                              Iterator var9 = var4.iterator();

                              while(var9.hasNext()) {
                                 add var10 = (add)var9.next();
                                 var12 = var7;
                                 if(var3 == null) {
                                    continue label74;
                                 }

                                 label97: {
                                    if(var3 != null) {
                                       if(var7.method_3730() != var10.method_3730()) {
                                          break label97;
                                       }

                                       var12 = var10;
                                    }

                                    int var13 = var12.method_3745();
                                    if(var3 != null) {
                                       label59: {
                                          if(var13 != 32767) {
                                             var13 = var7.method_3745();
                                             if(var3 == null) {
                                                break label59;
                                             }

                                             if(var13 != var10.method_3745()) {
                                                break label97;
                                             }
                                          }

                                          var8 = true;
                                          var4.remove(var10);
                                       }
                                    }

                                    if(var3 != null) {
                                       break;
                                    }
                                 }

                                 if(var3 == null) {
                                    break;
                                 }
                              }

                              var11 = var8;
                              if(var3 != null) {
                                 if(var8) {
                                    break label95;
                                 }

                                 var11 = false;
                              }

                              return var11;
                           }
                        }

                        ++var6;
                        break;
                     }
                  }

                  if(var3 != null) {
                     continue;
                  }
               }

               ++var5;
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var11 = var4.isEmpty();
         break;
      }

      return var11;
   }

   // $FF: renamed from: b (aO) add
   public add method_61(class_897 var1) {
      return this.field_4770.method_3754();
   }

   // $FF: renamed from: b () int
   public int method_62() {
      return this.field_4771.size();
   }
}
