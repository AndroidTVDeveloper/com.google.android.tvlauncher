package p000;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* renamed from: baa */
/* compiled from: PG */
public final class baa implements Handler.Callback {

    /* renamed from: a */
    public final bhk f2955a;

    /* renamed from: b */
    public final azy f2956b;

    /* renamed from: c */
    public final auf f2957c = new auf();

    /* renamed from: d */
    public final Handler f2958d = blm.m3634a(blm.m3635a(), (Handler.Callback) this);

    /* renamed from: e */
    public final TreeMap f2959e = new TreeMap();

    /* renamed from: f */
    public bac f2960f;

    /* renamed from: g */
    public long f2961g = -9223372036854775807L;

    /* renamed from: h */
    public boolean f2962h;

    /* renamed from: i */
    public boolean f2963i;

    /* renamed from: j */
    private long f2964j = -9223372036854775807L;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler
     arg types: [android.os.Looper, baa]
     candidates:
      blm.a(int, int):int
      blm.a(byte[], int):int
      blm.a(long, float):long
      blm.a(long, long):long
      blm.a(java.lang.String, int):java.lang.String
      blm.a(java.lang.String, java.lang.Object[]):java.lang.String
      blm.a(android.os.Parcel, boolean):void
      blm.a(long[], long):void
      blm.a(java.lang.Object, java.lang.Object):boolean
      blm.a(java.lang.Object[], java.lang.Object):boolean
      blm.a(java.util.List, long):long[]
      blm.a(java.lang.Object[], int):java.lang.Object[]
      blm.a(java.lang.String, java.lang.String):java.lang.String[]
      blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler */
    public baa(bac bac, azy azy, bhk bhk) {
        this.f2960f = bac;
        this.f2956b = azy;
        this.f2955a = bhk;
    }

    public final boolean handleMessage(Message message) {
        if (this.f2963i) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        azx azx = (azx) message.obj;
        long j = azx.f2946a;
        long j2 = azx.f2947b;
        TreeMap treeMap = this.f2959e;
        Long valueOf = Long.valueOf(j2);
        Long l = (Long) treeMap.get(valueOf);
        if (l == null) {
            this.f2959e.put(valueOf, Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f2959e.put(valueOf, Long.valueOf(j));
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1676a() {
        long j = this.f2964j;
        if (j == -9223372036854775807L || j != this.f2961g) {
            this.f2962h = true;
            this.f2964j = this.f2961g;
            azq azq = ((azj) this.f2956b).f2879a;
            azq.f2899i.removeCallbacks(azq.f2896f);
            azq.mo1656e();
        }
    }
}
