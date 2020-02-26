package p000;

import android.util.Log;
import java.io.IOException;

/* renamed from: azl */
/* compiled from: PG */
final class azl implements biq {

    /* renamed from: a */
    private final /* synthetic */ azq f2881a;

    public /* synthetic */ azl(azq azq) {
        this.f2881a = azq;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1549a(bit bit, long j, long j2, boolean z) {
        this.f2881a.mo1652a((bja) bit, j, j2);
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
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1548a(bit bit, long j, long j2) {
        bav bav;
        long j3 = j;
        bja bja = (bja) bit;
        azq azq = this.f2881a;
        azq.f2894d.mo1527b(bja.f4105b);
        bac bac = (bac) bja.f4106c;
        bac bac2 = azq.f2901k;
        int a = bac2 != null ? bac2.mo1678a() : 0;
        long j4 = bac.mo1679a(0).f2998b;
        int i = 0;
        while (i < a && azq.f2901k.mo1679a(i).f2998b < j4) {
            i++;
        }
        if (bac.f2972c) {
            if (a - i <= bac.mo1678a()) {
                long j5 = azq.f2906p;
                if (j5 != -9223372036854775807L) {
                    long j6 = bac.f2976g;
                    if (1000 * j6 <= j5) {
                        StringBuilder sb = new StringBuilder(73);
                        sb.append("Loaded stale dynamic manifest: ");
                        sb.append(j6);
                        sb.append(", ");
                        sb.append(j5);
                        Log.w("DashMediaSource", sb.toString());
                    }
                }
                azq.f2905o = 0;
            } else {
                Log.w("DashMediaSource", "Loaded out of sync manifest");
            }
            int i2 = azq.f2905o;
            azq.f2905o = i2 + 1;
            if (i2 >= azq.f2893c.mo1973a(bja.f4105b)) {
                azq.f2898h = new azd();
                return;
            } else {
                azq.mo1655b((long) Math.min((azq.f2905o - 1) * 1000, 5000));
                return;
            }
        }
        azq.f2901k = bac;
        boolean z = azq.f2902l;
        bac bac3 = azq.f2901k;
        azq.f2902l = z & bac3.f2972c;
        azq.f2903m = j3 - j2;
        azq.f2904n = j3;
        if (bac3.f2978i != null) {
            synchronized (azq.f2895e) {
                if (bja.f4104a.f3998a == azq.f2900j) {
                    azq.f2900j = azq.f2901k.f2978i;
                }
            }
        }
        if (a == 0) {
            bac bac4 = azq.f2901k;
            if (!bac4.f2972c || (bav = bac4.f2977h) == null) {
                azq.mo1654a(true);
                return;
            }
            String str = bav.f3037a;
            if (blm.m3652a((Object) str, (Object) "urn:mpeg:dash:utc:direct:2014") || blm.m3652a((Object) str, (Object) "urn:mpeg:dash:utc:direct:2012")) {
                try {
                    azq.mo1650a(blm.m3679f(bav.f3038b) - azq.f2904n);
                } catch (ako e) {
                    azq.mo1653a(e);
                }
            } else if (blm.m3652a((Object) str, (Object) "urn:mpeg:dash:utc:http-iso:2014") || blm.m3652a((Object) str, (Object) "urn:mpeg:dash:utc:http-iso:2012")) {
                azq.mo1651a(bav, new azk());
            } else if (blm.m3652a((Object) str, (Object) "urn:mpeg:dash:utc:http-xsdate:2014") || blm.m3652a((Object) str, (Object) "urn:mpeg:dash:utc:http-xsdate:2012")) {
                azq.mo1651a(bav, new azp((byte) 0));
            } else {
                azq.mo1653a(new IOException("Unsupported UTC timing scheme"));
            }
        } else {
            azq.f2907q += i;
            azq.mo1654a(true);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bir mo1546a(bit bit, long j, long j2, IOException iOException, int i) {
        bir bir;
        bja bja = (bja) bit;
        azq azq = this.f2881a;
        long a = azq.f2893c.mo1975a(iOException, i);
        if (a != -9223372036854775807L) {
            bir = bix.m3360a(false, a);
        } else {
            bir = bix.f4093b;
        }
        azq.f2894d.mo1519a(bja.f4105b, iOException, !bir.mo1978a());
        return bir;
    }
}
