package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bp */
/* compiled from: PG */
public class C0044bp {

    /* renamed from: a */
    private final ConcurrentHashMap f4535a = new ConcurrentHashMap();

    /* renamed from: a */
    public Typeface mo1962a(Context context, C0024aw awVar, Resources resources, int i) {
        C0025ax axVar = (C0025ax) m3872a(awVar.f2534a, i, new C0042bn());
        if (axVar == null) {
            return null;
        }
        Typeface a = C0036bh.m3213a(context, resources, axVar.f2588f, axVar.f2583a, i);
        long a2 = m3871a(a);
        if (a2 != 0) {
            this.f4535a.put(Long.valueOf(a2), awVar);
        }
        return a;
    }

    /* renamed from: a */
    public Typeface mo1963a(Context context, C0057cb[] cbVarArr, int i) {
        InputStream inputStream;
        if (cbVarArr.length > 0) {
            try {
                inputStream = context.getContentResolver().openInputStream(mo2102a(cbVarArr, i).f5168a);
                try {
                    Typeface a = mo2101a(context, inputStream);
                    C0045bq.m3948a(inputStream);
                    return a;
                } catch (IOException e) {
                    C0045bq.m3948a(inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    C0045bq.m3948a(inputStream);
                    throw th;
                }
            } catch (IOException e2) {
                inputStream = null;
                C0045bq.m3948a(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                C0045bq.m3948a(inputStream);
                throw th;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo2101a(Context context, InputStream inputStream) {
        File a = C0045bq.m3941a(context);
        if (a == null) {
            return null;
        }
        try {
            if (C0045bq.m3951a(a, inputStream)) {
                Typeface createFromFile = Typeface.createFromFile(a.getPath());
                a.delete();
                return createFromFile;
            }
        } catch (RuntimeException e) {
        } catch (Throwable th) {
            a.delete();
            throw th;
        }
        a.delete();
        return null;
    }

    /* renamed from: a */
    public Typeface mo1992a(Context context, Resources resources, int i, String str, int i2) {
        File a = C0045bq.m3941a(context);
        if (a == null) {
            return null;
        }
        try {
            if (C0045bq.m3950a(a, resources, i)) {
                Typeface createFromFile = Typeface.createFromFile(a.getPath());
                a.delete();
                return createFromFile;
            }
        } catch (RuntimeException e) {
        } catch (Throwable th) {
            a.delete();
            throw th;
        }
        a.delete();
        return null;
    }

    /* renamed from: a */
    private static Object m3872a(Object[] objArr, int i, C0043bo boVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(boVar.mo2137b(obj2) - i2);
            int i4 = abs + abs + (boVar.mo2136a(obj2) == z ? 0 : 1);
            if (obj == null || i3 > i4) {
                obj = obj2;
                i3 = i4;
            }
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0057cb mo2102a(C0057cb[] cbVarArr, int i) {
        return (C0057cb) m3872a(cbVarArr, i, new C0041bm());
    }

    /* renamed from: a */
    private static long m3871a(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }
}
