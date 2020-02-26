package p000;

import android.os.Handler;

/* renamed from: azz */
/* compiled from: PG */
public final class azz implements aov {

    /* renamed from: a */
    public final axw f2948a;

    /* renamed from: b */
    public final /* synthetic */ baa f2949b;

    /* renamed from: c */
    private final aki f2950c = new aki();

    /* renamed from: d */
    private final aua f2951d = new aua();

    public azz(baa baa, axw axw) {
        this.f2949b = baa;
        this.f2948a = axw;
    }

    /* renamed from: a */
    public final void mo1204a(akh akh) {
        this.f2948a.mo1204a(akh);
    }

    /* renamed from: a */
    public final int mo1202a(aoj aoj, int i, boolean z) {
        return this.f2948a.mo1202a(aoj, i, z);
    }

    /* renamed from: a */
    public final void mo1205a(bky bky, int i) {
        this.f2948a.mo1205a(bky, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(aki, anj, boolean, boolean, long):int
     arg types: [aki, aua, int, int, int]
     candidates:
      axw.a(long, int, int, int, aou):void
      aov.a(long, int, int, int, aou):void
      axw.a(aki, anj, boolean, boolean, long):int */
    /* renamed from: a */
    public final void mo1203a(long j, int i, int i2, int i3, aou aou) {
        aua aua;
        long j2;
        this.f2948a.mo1203a(j, i, i2, i3, aou);
        while (this.f2948a.mo1589b(false)) {
            this.f2951d.mo1139a();
            if (this.f2948a.mo1580a(this.f2950c, (anj) this.f2951d, false, false, 0L) == -4) {
                this.f2951d.mo1152g();
                aua = this.f2951d;
            } else {
                aua = null;
            }
            if (aua != null) {
                long j3 = aua.f1426d;
                aue aue = (aue) this.f2949b.f2957c.mo1353a(aua).mo1345a(0);
                String str = aue.f2431a;
                String str2 = aue.f2432b;
                if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                    try {
                        j2 = blm.m3679f(blm.m3640a(aue.f2435e));
                    } catch (ako e) {
                        j2 = -9223372036854775807L;
                    }
                    if (j2 != -9223372036854775807L) {
                        azx azx = new azx(j3, j2);
                        Handler handler = this.f2949b.f2958d;
                        handler.sendMessage(handler.obtainMessage(1, azx));
                    }
                }
            }
        }
        axw axw = this.f2948a;
        axw.mo1583a(axw.f2719a.mo1574j());
    }
}
