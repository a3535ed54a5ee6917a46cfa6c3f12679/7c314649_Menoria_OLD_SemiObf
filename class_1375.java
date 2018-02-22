import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

// $FF: renamed from: mM
public final class class_1375 implements ParameterizedType {

   // $FF: renamed from: <init> () void
   public void method_7511() {
      super();
   }

   public Type[] getActualTypeArguments() {
      Type[] var10000 = new Type[]{String.class, null};
      class_1376 var10003 = new class_1376;
      var10003.method_7512(this);
      var10000[1] = var10003;
      return var10000;
   }

   public Type getRawType() {
      return Map.class;
   }

   public Type getOwnerType() {
      return null;
   }
}
