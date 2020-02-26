package p000;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* renamed from: xp */
/* compiled from: PG */
public final class C0639xp implements C0630xg {

    /* renamed from: a */
    private static final Bitmap.Config f10783a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    private final C0640xq f10784b;

    /* renamed from: c */
    private final Set f10785c;

    /* renamed from: d */
    private final long f10786d;

    /* renamed from: e */
    private long f10787e;

    /* renamed from: f */
    private int f10788f;

    /* renamed from: g */
    private int f10789g;

    /* renamed from: h */
    private int f10790h;

    /* renamed from: i */
    private int f10791i;

    public C0639xp(long j) {
        int i = Build.VERSION.SDK_INT;
        C0645xv xvVar = new C0645xv();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i2 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        int i3 = Build.VERSION.SDK_INT;
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f10786d = j;
        this.f10784b = xvVar;
        this.f10785c = unmodifiableSet;
    }

    /* renamed from: a */
    public final void mo6107a() {
        m8650a(0L);
    }

    /* renamed from: c */
    private static Bitmap m8651c(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f10783a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: a */
    public final Bitmap mo6106a(int i, int i2, Bitmap.Config config) {
        Bitmap d = m8652d(i, i2, config);
        if (d == null) {
            return m8651c(i, i2, config);
        }
        d.eraseColor(0);
        return d;
    }

    /* renamed from: b */
    public final Bitmap mo6109b(int i, int i2, Bitmap.Config config) {
        Bitmap d = m8652d(i, i2, config);
        return d == null ? m8651c(i, i2, config) : d;
    }

    /* renamed from: d */
    private final synchronized Bitmap m8652d(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        Bitmap bitmap;
        int i3 = Build.VERSION.SDK_INT;
        if (config != Bitmap.Config.HARDWARE) {
            C0640xq xqVar = this.f10784b;
            if (config == null) {
                config = f10783a;
            }
            int a = aie.m554a(i, i2, config);
            C0643xt a2 = ((C0645xv) xqVar).f10801f.mo6124a(a, config);
            int i4 = Build.VERSION.SDK_INT;
            int i5 = 0;
            if (!Bitmap.Config.RGBA_F16.equals(config)) {
                int i6 = C0642xs.f10792a[config.ordinal()];
                if (i6 == 1) {
                    configArr = C0645xv.f10796a;
                } else if (i6 == 2) {
                    configArr = C0645xv.f10798c;
                } else if (i6 != 3) {
                    configArr = i6 != 4 ? new Bitmap.Config[]{config} : C0645xv.f10800e;
                } else {
                    configArr = C0645xv.f10799d;
                }
            } else {
                configArr = C0645xv.f10797b;
            }
            int length = configArr.length;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                Bitmap.Config config2 = configArr[i5];
                Integer num = (Integer) ((C0645xv) xqVar).mo6125a(config2).ceilingKey(Integer.valueOf(a));
                if (num != null) {
                    if (num.intValue() <= (a << 3)) {
                        if (num.intValue() == a) {
                            if (config2 != null) {
                                if (config2.equals(config)) {
                                }
                            } else if (config == null) {
                            }
                        }
                        ((C0645xv) xqVar).f10801f.mo6104a(a2);
                        a2 = ((C0645xv) xqVar).f10801f.mo6124a(num.intValue(), config2);
                    }
                }
                i5++;
            }
            bitmap = (Bitmap) ((C0645xv) xqVar).f10802g.mo6113a(a2);
            if (bitmap != null) {
                ((C0645xv) xqVar).mo6126a(Integer.valueOf(a2.f10793a), bitmap);
                bitmap.reconfigure(i, i2, config);
            }
            if (bitmap != null) {
                this.f10788f++;
                this.f10787e -= (long) aie.m555a(bitmap);
                bitmap.setHasAlpha(true);
                int i7 = Build.VERSION.SDK_INT;
                bitmap.setPremultiplied(true);
            } else {
                this.f10789g++;
            }
        } else {
            String valueOf = String.valueOf(config);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 176);
            sb.append("Cannot create a mutable Bitmap with config: ");
            sb.append(valueOf);
            sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(sb.toString());
        }
        return bitmap;
    }

    /* renamed from: a */
    public final synchronized void mo60a(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) aie.m555a(bitmap)) <= this.f10786d) {
                        if (this.f10785c.contains(bitmap.getConfig())) {
                            int a = aie.m555a(bitmap);
                            C0640xq xqVar = this.f10784b;
                            C0643xt a2 = ((C0645xv) xqVar).f10801f.mo6124a(aie.m555a(bitmap), bitmap.getConfig());
                            ((C0645xv) xqVar).f10802g.mo6114a(a2, bitmap);
                            NavigableMap a3 = ((C0645xv) xqVar).mo6125a(bitmap.getConfig());
                            Integer num = (Integer) a3.get(Integer.valueOf(a2.f10793a));
                            a3.put(Integer.valueOf(a2.f10793a), Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                            this.f10790h++;
                            this.f10787e += (long) a;
                            m8650a(this.f10786d);
                            return;
                        }
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } finally {
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    /* renamed from: a */
    public final void mo6108a(int i) {
        if (i < 40) {
            int i2 = Build.VERSION.SDK_INT;
            if (i < 20) {
                if (i == 15) {
                    m8650a(this.f10786d >> 1);
                    return;
                }
                return;
            }
        }
        mo6107a();
    }

    /* renamed from: a */
    private final synchronized void m8650a(long j) {
        while (true) {
            if (this.f10787e <= j) {
                break;
            }
            C0640xq xqVar = this.f10784b;
            Bitmap bitmap = (Bitmap) ((C0645xv) xqVar).f10802g.mo6112a();
            if (bitmap != null) {
                ((C0645xv) xqVar).mo6126a(Integer.valueOf(aie.m555a(bitmap)), bitmap);
            }
            if (bitmap != null) {
                this.f10787e -= (long) aie.m555a(bitmap);
                this.f10791i++;
                bitmap.recycle();
            } else {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    int i = this.f10788f;
                    int i2 = this.f10789g;
                    int i3 = this.f10790h;
                    int i4 = this.f10791i;
                    long j2 = this.f10787e;
                    long j3 = this.f10786d;
                    String valueOf = String.valueOf(this.f10784b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 151);
                    sb.append("Hits=");
                    sb.append(i);
                    sb.append(", misses=");
                    sb.append(i2);
                    sb.append(", puts=");
                    sb.append(i3);
                    sb.append(", evictions=");
                    sb.append(i4);
                    sb.append(", currentSize=");
                    sb.append(j2);
                    sb.append(", maxSize=");
                    sb.append(j3);
                    sb.append("\nStrategy=");
                    sb.append(valueOf);
                    sb.toString();
                }
                this.f10787e = 0;
            }
        }
    }
}
