package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bp  reason: default package */
/* compiled from: PG */
public class bp {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    public Typeface a(Context context, aw awVar, Resources resources, int i) {
        ax axVar = (ax) a(awVar.a, i, new bn());
        if (axVar == null) {
            return null;
        }
        Typeface a2 = bh.a(context, resources, axVar.f, axVar.a, i);
        long a3 = a(a2);
        if (a3 != 0) {
            this.a.put(Long.valueOf(a3), awVar);
        }
        return a2;
    }

    public Typeface a(Context context, cb[] cbVarArr, int i) {
        InputStream inputStream;
        if (cbVarArr.length > 0) {
            try {
                inputStream = context.getContentResolver().openInputStream(a(cbVarArr, i).a);
                try {
                    Typeface a2 = a(context, inputStream);
                    bq.a(inputStream);
                    return a2;
                } catch (IOException e) {
                    bq.a(inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bq.a(inputStream);
                    throw th;
                }
            } catch (IOException e2) {
                inputStream = null;
                bq.a(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                bq.a(inputStream);
                throw th;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Typeface a(Context context, InputStream inputStream) {
        File a2 = bq.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (bq.a(a2, inputStream)) {
                Typeface createFromFile = Typeface.createFromFile(a2.getPath());
                a2.delete();
                return createFromFile;
            }
        } catch (RuntimeException e) {
        } catch (Throwable th) {
            a2.delete();
            throw th;
        }
        a2.delete();
        return null;
    }

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        File a2 = bq.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (bq.a(a2, resources, i)) {
                Typeface createFromFile = Typeface.createFromFile(a2.getPath());
                a2.delete();
                return createFromFile;
            }
        } catch (RuntimeException e) {
        } catch (Throwable th) {
            a2.delete();
            throw th;
        }
        a2.delete();
        return null;
    }

    private static Object a(Object[] objArr, int i, bo boVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(boVar.b(obj2) - i2);
            int i4 = abs + abs + (boVar.a(obj2) == z ? 0 : 1);
            if (obj == null || i3 > i4) {
                obj = obj2;
                i3 = i4;
            }
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public cb a(cb[] cbVarArr, int i) {
        return (cb) a(cbVarArr, i, new bm());
    }

    private static long a(Typeface typeface) {
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
