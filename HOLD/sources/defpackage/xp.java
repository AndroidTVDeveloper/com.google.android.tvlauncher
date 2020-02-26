package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* renamed from: xp  reason: default package */
/* compiled from: PG */
public final class xp implements xg {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final xq b;
    private final Set c;
    private final long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;

    public xp(long j) {
        int i2 = Build.VERSION.SDK_INT;
        xv xvVar = new xv();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i3 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        int i4 = Build.VERSION.SDK_INT;
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j;
        this.b = xvVar;
        this.c = unmodifiableSet;
    }

    public final void a() {
        a(0L);
    }

    private static Bitmap c(int i2, int i3, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    public final Bitmap a(int i2, int i3, Bitmap.Config config) {
        Bitmap d2 = d(i2, i3, config);
        if (d2 == null) {
            return c(i2, i3, config);
        }
        d2.eraseColor(0);
        return d2;
    }

    public final Bitmap b(int i2, int i3, Bitmap.Config config) {
        Bitmap d2 = d(i2, i3, config);
        return d2 == null ? c(i2, i3, config) : d2;
    }

    private final synchronized Bitmap d(int i2, int i3, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        Bitmap bitmap;
        int i4 = Build.VERSION.SDK_INT;
        if (config != Bitmap.Config.HARDWARE) {
            xq xqVar = this.b;
            if (config == null) {
                config = a;
            }
            int a2 = aie.a(i2, i3, config);
            xt a3 = ((xv) xqVar).f.a(a2, config);
            int i5 = Build.VERSION.SDK_INT;
            int i6 = 0;
            if (!Bitmap.Config.RGBA_F16.equals(config)) {
                int i7 = xs.a[config.ordinal()];
                if (i7 == 1) {
                    configArr = xv.a;
                } else if (i7 == 2) {
                    configArr = xv.c;
                } else if (i7 != 3) {
                    configArr = i7 != 4 ? new Bitmap.Config[]{config} : xv.e;
                } else {
                    configArr = xv.d;
                }
            } else {
                configArr = xv.b;
            }
            int length = configArr.length;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                Bitmap.Config config2 = configArr[i6];
                Integer num = (Integer) ((xv) xqVar).a(config2).ceilingKey(Integer.valueOf(a2));
                if (num != null) {
                    if (num.intValue() <= (a2 << 3)) {
                        if (num.intValue() == a2) {
                            if (config2 != null) {
                                if (config2.equals(config)) {
                                }
                            } else if (config == null) {
                            }
                        }
                        ((xv) xqVar).f.a(a3);
                        a3 = ((xv) xqVar).f.a(num.intValue(), config2);
                    }
                }
                i6++;
            }
            bitmap = (Bitmap) ((xv) xqVar).g.a(a3);
            if (bitmap != null) {
                ((xv) xqVar).a(Integer.valueOf(a3.a), bitmap);
                bitmap.reconfigure(i2, i3, config);
            }
            if (bitmap != null) {
                this.f++;
                this.e -= (long) aie.a(bitmap);
                bitmap.setHasAlpha(true);
                int i8 = Build.VERSION.SDK_INT;
                bitmap.setPremultiplied(true);
            } else {
                this.g++;
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

    public final synchronized void a(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) aie.a(bitmap)) <= this.d) {
                        if (this.c.contains(bitmap.getConfig())) {
                            int a2 = aie.a(bitmap);
                            xq xqVar = this.b;
                            xt a3 = ((xv) xqVar).f.a(aie.a(bitmap), bitmap.getConfig());
                            ((xv) xqVar).g.a(a3, bitmap);
                            NavigableMap a4 = ((xv) xqVar).a(bitmap.getConfig());
                            Integer num = (Integer) a4.get(Integer.valueOf(a3.a));
                            a4.put(Integer.valueOf(a3.a), Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                            this.h++;
                            this.e += (long) a2;
                            a(this.d);
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

    public final void a(int i2) {
        if (i2 < 40) {
            int i3 = Build.VERSION.SDK_INT;
            if (i2 < 20) {
                if (i2 == 15) {
                    a(this.d >> 1);
                    return;
                }
                return;
            }
        }
        a();
    }

    private final synchronized void a(long j) {
        while (true) {
            if (this.e <= j) {
                break;
            }
            xq xqVar = this.b;
            Bitmap bitmap = (Bitmap) ((xv) xqVar).g.a();
            if (bitmap != null) {
                ((xv) xqVar).a(Integer.valueOf(aie.a(bitmap)), bitmap);
            }
            if (bitmap != null) {
                this.e -= (long) aie.a(bitmap);
                this.i++;
                bitmap.recycle();
            } else {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    int i2 = this.f;
                    int i3 = this.g;
                    int i4 = this.h;
                    int i5 = this.i;
                    long j2 = this.e;
                    long j3 = this.d;
                    String valueOf = String.valueOf(this.b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 151);
                    sb.append("Hits=");
                    sb.append(i2);
                    sb.append(", misses=");
                    sb.append(i3);
                    sb.append(", puts=");
                    sb.append(i4);
                    sb.append(", evictions=");
                    sb.append(i5);
                    sb.append(", currentSize=");
                    sb.append(j2);
                    sb.append(", maxSize=");
                    sb.append(j3);
                    sb.append("\nStrategy=");
                    sb.append(valueOf);
                    sb.toString();
                }
                this.e = 0;
            }
        }
    }
}
