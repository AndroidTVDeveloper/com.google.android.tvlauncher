package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: xv  reason: default package */
/* compiled from: PG */
public final class xv implements xq {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config[] b;
    public static final Bitmap.Config[] c = {Bitmap.Config.RGB_565};
    public static final Bitmap.Config[] d = {Bitmap.Config.ARGB_4444};
    public static final Bitmap.Config[] e = {Bitmap.Config.ALPHA_8};
    public final xu f = new xu();
    public final xk g = new xk();
    private final Map h = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        int i = Build.VERSION.SDK_INT;
        Bitmap.Config[] configArr2 = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
        configArr2[configArr2.length - 1] = Bitmap.Config.RGBA_F16;
        a = configArr2;
        b = configArr2;
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap a2 = a(bitmap.getConfig());
        Integer num2 = (Integer) a2.get(num);
        if (num2 == null) {
            String valueOf = String.valueOf(num);
            String a3 = a(aie.a(bitmap), bitmap.getConfig());
            String valueOf2 = String.valueOf(this);
            int length = String.valueOf(valueOf).length();
            StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(a3).length() + String.valueOf(valueOf2).length());
            sb.append("Tried to decrement empty size, size: ");
            sb.append(valueOf);
            sb.append(", removed: ");
            sb.append(a3);
            sb.append(", this: ");
            sb.append(valueOf2);
            throw new NullPointerException(sb.toString());
        } else if (num2.intValue() == 1) {
            a2.remove(num);
        } else {
            a2.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    static String a(int i, Bitmap.Config config) {
        String valueOf = String.valueOf(config);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("[");
        sb.append(i);
        sb.append("](");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final NavigableMap a(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.h.put(config, treeMap);
        return treeMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.g);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
