package defpackage;

import android.util.Log;
import java.io.IOException;

/* renamed from: azl  reason: default package */
/* compiled from: PG */
final class azl implements biq {
    private final /* synthetic */ azq a;

    public /* synthetic */ azl(azq azq) {
        this.a = azq;
    }

    public final /* bridge */ /* synthetic */ void a(bit bit, long j, long j2, boolean z) {
        this.a.a((bja) bit, j, j2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(java.lang.Object, java.lang.Object):boolean
     arg types: [java.lang.String, java.lang.String]
     candidates:
      blm.a(int, int):int
      blm.a(byte[], int):int
      blm.a(long, float):long
      blm.a(long, long):long
      blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler
      blm.a(java.lang.String, int):java.lang.String
      blm.a(java.lang.String, java.lang.Object[]):java.lang.String
      blm.a(android.os.Parcel, boolean):void
      blm.a(long[], long):void
      blm.a(java.lang.Object[], java.lang.Object):boolean
      blm.a(java.util.List, long):long[]
      blm.a(java.lang.Object[], int):java.lang.Object[]
      blm.a(java.lang.String, java.lang.String):java.lang.String[]
      blm.a(java.lang.Object, java.lang.Object):boolean */
    public final /* bridge */ /* synthetic */ void a(bit bit, long j, long j2) {
        bav bav;
        long j3 = j;
        bja bja = (bja) bit;
        azq azq = this.a;
        azq.d.b(bja.b);
        bac bac = (bac) bja.c;
        bac bac2 = azq.k;
        int a2 = bac2 != null ? bac2.a() : 0;
        long j4 = bac.a(0).b;
        int i = 0;
        while (i < a2 && azq.k.a(i).b < j4) {
            i++;
        }
        if (bac.c) {
            if (a2 - i <= bac.a()) {
                long j5 = azq.p;
                if (j5 != -9223372036854775807L) {
                    long j6 = bac.g;
                    if (1000 * j6 <= j5) {
                        StringBuilder sb = new StringBuilder(73);
                        sb.append("Loaded stale dynamic manifest: ");
                        sb.append(j6);
                        sb.append(", ");
                        sb.append(j5);
                        Log.w("DashMediaSource", sb.toString());
                    }
                }
                azq.o = 0;
            } else {
                Log.w("DashMediaSource", "Loaded out of sync manifest");
            }
            int i2 = azq.o;
            azq.o = i2 + 1;
            if (i2 >= azq.c.a(bja.b)) {
                azq.h = new azd();
                return;
            } else {
                azq.b((long) Math.min((azq.o - 1) * 1000, 5000));
                return;
            }
        }
        azq.k = bac;
        boolean z = azq.l;
        bac bac3 = azq.k;
        azq.l = z & bac3.c;
        azq.m = j3 - j2;
        azq.n = j3;
        if (bac3.i != null) {
            synchronized (azq.e) {
                if (bja.a.a == azq.j) {
                    azq.j = azq.k.i;
                }
            }
        }
        if (a2 == 0) {
            bac bac4 = azq.k;
            if (!bac4.c || (bav = bac4.h) == null) {
                azq.a(true);
                return;
            }
            String str = bav.a;
            if (blm.a((Object) str, (Object) "urn:mpeg:dash:utc:direct:2014") || blm.a((Object) str, (Object) "urn:mpeg:dash:utc:direct:2012")) {
                try {
                    azq.a(blm.f(bav.b) - azq.n);
                } catch (ako e) {
                    azq.a(e);
                }
            } else if (blm.a((Object) str, (Object) "urn:mpeg:dash:utc:http-iso:2014") || blm.a((Object) str, (Object) "urn:mpeg:dash:utc:http-iso:2012")) {
                azq.a(bav, new azk());
            } else if (blm.a((Object) str, (Object) "urn:mpeg:dash:utc:http-xsdate:2014") || blm.a((Object) str, (Object) "urn:mpeg:dash:utc:http-xsdate:2012")) {
                azq.a(bav, new azp((byte) 0));
            } else {
                azq.a(new IOException("Unsupported UTC timing scheme"));
            }
        } else {
            azq.q += i;
            azq.a(true);
        }
    }

    public final /* bridge */ /* synthetic */ bir a(bit bit, long j, long j2, IOException iOException, int i) {
        bir bir;
        bja bja = (bja) bit;
        azq azq = this.a;
        long a2 = azq.c.a(iOException, i);
        if (a2 != -9223372036854775807L) {
            bir = bix.a(false, a2);
        } else {
            bir = bix.b;
        }
        azq.d.a(bja.b, iOException, !bir.a());
        return bir;
    }
}
