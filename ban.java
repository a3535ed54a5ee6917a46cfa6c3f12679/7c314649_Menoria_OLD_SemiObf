import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.lwjgl.opengl.GL11;

public class ban {

   // $FF: renamed from: a java.util.Map
   private static final Map height1;
   // $FF: renamed from: b java.util.List
   private static final List height2;


   // $FF: renamed from: a (int) int
   public static synchronized int method_5195(int var0) {
      int var1 = GL11.glGenLists(var0);
      height1.put(Integer.valueOf(var1), Integer.valueOf(var0));
      return var1;
   }

   // $FF: renamed from: b (int) void
   public static synchronized void method_5196(int var0) {
      GL11.glDeleteLists(var0, ((Integer)height1.remove(Integer.valueOf(var0))).intValue());
   }

   // $FF: renamed from: a () void
   public static synchronized void method_5197() {
      String[] var10000 = class_752.method_4253();
      Iterator var1 = height1.entrySet().iterator();
      String[] var0 = var10000;

      while(true) {
         if(var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            GL11.glDeleteLists(((Integer)var2.getKey()).intValue(), ((Integer)var2.getValue()).intValue());
            if(var0 == null) {
               break;
            }

            if(var0 != null) {
               continue;
            }
         }

         height1.clear();
         break;
      }

   }

   // $FF: renamed from: c (int) java.nio.ByteBuffer
   public static synchronized ByteBuffer method_5198(int var0) {
      return ByteBuffer.allocateDirect(var0).order(ByteOrder.nativeOrder());
   }

   // $FF: renamed from: f (int) java.nio.IntBuffer
   public static IntBuffer method_5199(int var0) {
      return method_5198(var0 << 2).asIntBuffer();
   }

   // $FF: renamed from: h (int) java.nio.FloatBuffer
   public static FloatBuffer method_5200(int var0) {
      return method_5198(var0 << 2).asFloatBuffer();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5201() {
      height1 = new HashMap();
      height2 = new ArrayList();
   }
}
