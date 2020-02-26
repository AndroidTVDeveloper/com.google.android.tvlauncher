package p000;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: bmy */
/* compiled from: PG */
public final class bmy {
    @Deprecated

    /* renamed from: a */
    public static final bok f4435a = new bok("ClearcutLogger.API", f4439m, f4438l, (byte) 0, (byte) 0);

    /* renamed from: b */
    public static volatile int f4436b = -1;

    /* renamed from: i */
    public static final List f4437i = new CopyOnWriteArrayList();

    /* renamed from: l */
    private static final bog f4438l = new bog((byte) 0);

    /* renamed from: m */
    private static final cel f4439m = new bmu();

    /* renamed from: c */
    public final Context f4440c;

    /* renamed from: d */
    public final String f4441d;

    /* renamed from: e */
    public final String f4442e;

    /* renamed from: f */
    public int f4443f = -1;

    /* renamed from: g */
    public final bmz f4444g;

    /* renamed from: h */
    public final bmx f4445h;

    /* renamed from: j */
    public final List f4446j = new CopyOnWriteArrayList();

    /* renamed from: k */
    public int f4447k = 1;

    public bmy(Context context, String str) {
        boo boo = new boo(context);
        bnk bnk = new bnk(context);
        this.f4440c = context.getApplicationContext();
        this.f4441d = context.getPackageName();
        this.f4443f = -1;
        this.f4442e = str;
        this.f4444g = boo;
        this.f4447k = 1;
        this.f4445h = bnk;
    }

    /* renamed from: a */
    public final bmw mo2165a(byte[] bArr) {
        return new bmw(this, bArr);
    }
}
