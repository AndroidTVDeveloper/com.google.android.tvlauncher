package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: bmy  reason: default package */
/* compiled from: PG */
public final class bmy {
    @Deprecated
    public static final bok a = new bok("ClearcutLogger.API", m, l, (byte) 0, (byte) 0);
    public static volatile int b = -1;
    public static final List i = new CopyOnWriteArrayList();
    private static final bog l = new bog((byte) 0);
    private static final cel m = new bmu();
    public final Context c;
    public final String d;
    public final String e;
    public int f = -1;
    public final bmz g;
    public final bmx h;
    public final List j = new CopyOnWriteArrayList();
    public int k = 1;

    public bmy(Context context, String str) {
        boo boo = new boo(context);
        bnk bnk = new bnk(context);
        this.c = context.getApplicationContext();
        this.d = context.getPackageName();
        this.f = -1;
        this.e = str;
        this.g = boo;
        this.k = 1;
        this.h = bnk;
    }

    public final bmw a(byte[] bArr) {
        return new bmw(this, bArr);
    }
}
