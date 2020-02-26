package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* renamed from: baa  reason: default package */
/* compiled from: PG */
public final class baa implements Handler.Callback {
    public final bhk a;
    public final azy b;
    public final auf c = new auf();
    public final Handler d = blm.a(blm.a(), (Handler.Callback) this);
    public final TreeMap e = new TreeMap();
    public bac f;
    public long g = -9223372036854775807L;
    public boolean h;
    public boolean i;
    private long j = -9223372036854775807L;

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
        this.f = bac;
        this.b = azy;
        this.a = bhk;
    }

    public final boolean handleMessage(Message message) {
        if (this.i) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        azx azx = (azx) message.obj;
        long j2 = azx.a;
        long j3 = azx.b;
        TreeMap treeMap = this.e;
        Long valueOf = Long.valueOf(j3);
        Long l = (Long) treeMap.get(valueOf);
        if (l == null) {
            this.e.put(valueOf, Long.valueOf(j2));
        } else if (l.longValue() > j2) {
            this.e.put(valueOf, Long.valueOf(j2));
        }
        return true;
    }

    public final void a() {
        long j2 = this.j;
        if (j2 == -9223372036854775807L || j2 != this.g) {
            this.h = true;
            this.j = this.g;
            azq azq = ((azj) this.b).a;
            azq.i.removeCallbacks(azq.f);
            azq.e();
        }
    }
}
