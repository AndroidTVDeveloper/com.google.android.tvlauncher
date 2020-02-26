package p000;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: xv */
/* compiled from: PG */
public final class C0645xv implements C0640xq {

    /* renamed from: a */
    public static final Bitmap.Config[] f10796a;

    /* renamed from: b */
    public static final Bitmap.Config[] f10797b;

    /* renamed from: c */
    public static final Bitmap.Config[] f10798c = {Bitmap.Config.RGB_565};

    /* renamed from: d */
    public static final Bitmap.Config[] f10799d = {Bitmap.Config.ARGB_4444};

    /* renamed from: e */
    public static final Bitmap.Config[] f10800e = {Bitmap.Config.ALPHA_8};

    /* renamed from: f */
    public final C0644xu f10801f = new C0644xu();

    /* renamed from: g */
    public final C0634xk f10802g = new C0634xk();

    /* renamed from: h */
    private final Map f10803h = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        int i = Build.VERSION.SDK_INT;
        Bitmap.Config[] configArr2 = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
        configArr2[configArr2.length - 1] = Bitmap.Config.RGBA_F16;
        f10796a = configArr2;
        f10797b = configArr2;
    }

    /* renamed from: a */
    public final void mo6126a(Integer num, Bitmap bitmap) {
        NavigableMap a = mo6125a(bitmap.getConfig());
        Integer num2 = (Integer) a.get(num);
        if (num2 == null) {
            String valueOf = String.valueOf(num);
            String a2 = m8662a(aie.m555a(bitmap), bitmap.getConfig());
            String valueOf2 = String.valueOf(this);
            int length = String.valueOf(valueOf).length();
            StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(a2).length() + String.valueOf(valueOf2).length());
            sb.append("Tried to decrement empty size, size: ");
            sb.append(valueOf);
            sb.append(", removed: ");
            sb.append(a2);
            sb.append(", this: ");
            sb.append(valueOf2);
            throw new NullPointerException(sb.toString());
        } else if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: a */
    static String m8662a(int i, Bitmap.Config config) {
        String valueOf = String.valueOf(config);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("[");
        sb.append(i);
        sb.append("](");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final NavigableMap mo6125a(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f10803h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f10803h.put(config, treeMap);
        return treeMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f10802g);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f10803h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f10803h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
