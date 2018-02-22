package ca.diiza.j;

import ca.diiza.j.class_244;

// $FF: renamed from: ca.diiza.j.k
public class class_242 {

   // $FF: renamed from: a int
   public static final int field_1327 = 0;
   // $FF: renamed from: b int
   public static final int field_1328 = 1;
   // $FF: renamed from: c int
   public static final int field_1329 = 2;
   // $FF: renamed from: d int
   public static final int field_1330 = 3;
   // $FF: renamed from: e int
   public static final int field_1331 = 4;
   // $FF: renamed from: f int
   public static final int field_1332 = 5;
   // $FF: renamed from: g int
   public static final int field_1333 = 6;
   // $FF: renamed from: h int
   public static final int field_1334 = -1;
   // $FF: renamed from: i int
   public int field_1335;
   // $FF: renamed from: j java.lang.Object
   public Object field_1336;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_1337;


   // $FF: renamed from: <init> (int, java.lang.Object) void
   public void method_1333(int var1, Object var2) {
      super();
      this.field_1335 = 0;
      this.field_1336 = null;
      this.field_1335 = var1;
      this.field_1336 = var2;
   }

   public String toString() {
      StringBuffer var2;
      label55: {
         String var1;
         String[] var3;
         label54: {
            label53: {
               label52: {
                  label51: {
                     label50: {
                        label49: {
                           String var10000 = class_244.method_1346();
                           var2 = new StringBuffer();
                           var1 = var10000;
                           if(var1 == null) {
                              switch(this.field_1335) {
                              case -1:
                                 var3 = field_1337;
                                 var2.append("END OF FILE");
                                 break;
                              case 0:
                                 break label49;
                              case 1:
                                 break label50;
                              case 2:
                                 break label51;
                              case 3:
                                 break label52;
                              case 4:
                                 break label53;
                              case 5:
                                 break label54;
                              case 6:
                                 break label55;
                              default:
                                 return var2.toString();
                              }
                           }

                           if(var1 == null) {
                              return var2.toString();
                           }
                        }

                        var3 = field_1337;
                        var2.append("VALUE(").append(this.field_1336).append(")");
                        if(var1 == null) {
                           return var2.toString();
                        }
                     }

                     var3 = field_1337;
                     var2.append("LEFT BRACE({)");
                     if(var1 == null) {
                        return var2.toString();
                     }
                  }

                  var3 = field_1337;
                  var2.append("RIGHT BRACE(})");
                  if(var1 == null) {
                     return var2.toString();
                  }
               }

               var3 = field_1337;
               var2.append("LEFT SQUARE([)");
               if(var1 == null) {
                  return var2.toString();
               }
            }

            var3 = field_1337;
            var2.append("RIGHT SQUARE(])");
            if(var1 == null) {
               return var2.toString();
            }
         }

         var3 = field_1337;
         var2.append("COMMA(,)");
         if(var1 == null) {
            return var2.toString();
         }
      }

      String[] var10001 = field_1337;
      var2.append("COLON(:)");
      return var2.toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_1334() {
      // $FF: Couldn't be decompiled
   }
}
