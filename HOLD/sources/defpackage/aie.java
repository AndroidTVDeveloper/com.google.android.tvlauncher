package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: aie  reason: default package */
/* compiled from: PG */
public final class aie {
    public static final char[] a = "0123456789abcdef".toCharArray();
    public static final char[] b = new char[64];

    public static int b(int i, int i2) {
        return (i2 * 31) + i;
    }

    private static boolean b(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static void a() {
        if (!b()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof aae) {
            return ((aae) obj).a();
        }
        return obj.equals(obj2);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        return obj2 == null;
    }

    public static Queue a(int i) {
        return new ArrayDeque(i);
    }

    public static int a(int i, int i2, Bitmap.Config config) {
        int i3 = i * i2;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i4 = aid.a[config.ordinal()];
        int i5 = 4;
        if (i4 == 1) {
            i5 = 1;
        } else if (i4 == 2 || i4 == 3) {
            i5 = 2;
        } else if (i4 == 4) {
            i5 = 8;
        }
        return i3 * i5;
    }

    public static int a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            int i = Build.VERSION.SDK_INT;
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException e) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        } else {
            String valueOf = String.valueOf(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            String valueOf2 = String.valueOf(bitmap.getConfig());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66 + String.valueOf(valueOf2).length());
            sb.append("Cannot obtain size for recycled Bitmap: ");
            sb.append(valueOf);
            sb.append("[");
            sb.append(width);
            sb.append("x");
            sb.append(height);
            sb.append("] ");
            sb.append(valueOf2);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static List a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static int a(float f) {
        return b(Float.floatToIntBits(f), 17);
    }

    public static int a(Object obj, int i) {
        return b(obj != null ? obj.hashCode() : 0, i);
    }

    public static boolean c() {
        return !b();
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean a(int i, int i2) {
        return b(i) && b(i2);
    }
}
