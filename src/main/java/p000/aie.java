package p000;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: aie */
/* compiled from: PG */
public final class aie {

    /* renamed from: a */
    public static final char[] f398a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f399b = new char[64];

    /* renamed from: b */
    public static int m562b(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: b */
    private static boolean m564b(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public static void m559a() {
        if (!m563b()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m565b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof aae) {
            return ((aae) obj).mo13a();
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static boolean m561a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        return obj2 == null;
    }

    /* renamed from: a */
    public static Queue m558a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    public static int m554a(int i, int i2, Bitmap.Config config) {
        int i3 = i * i2;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i4 = aid.f397a[config.ordinal()];
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

    /* renamed from: a */
    public static int m555a(Bitmap bitmap) {
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

    /* renamed from: a */
    public static List m557a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m553a(float f) {
        return m562b(Float.floatToIntBits(f), 17);
    }

    /* renamed from: a */
    public static int m556a(Object obj, int i) {
        return m562b(obj != null ? obj.hashCode() : 0, i);
    }

    /* renamed from: c */
    public static boolean m566c() {
        return !m563b();
    }

    /* renamed from: b */
    public static boolean m563b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    public static boolean m560a(int i, int i2) {
        return m564b(i) && m564b(i2);
    }
}
