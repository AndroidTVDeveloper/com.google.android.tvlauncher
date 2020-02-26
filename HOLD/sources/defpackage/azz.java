package defpackage;

import android.os.Handler;

/* renamed from: azz  reason: default package */
/* compiled from: PG */
public final class azz implements aov {
    public final axw a;
    public final /* synthetic */ baa b;
    private final aki c = new aki();
    private final aua d = new aua();

    public azz(baa baa, axw axw) {
        this.b = baa;
        this.a = axw;
    }

    public final void a(akh akh) {
        this.a.a(akh);
    }

    public final int a(aoj aoj, int i, boolean z) {
        return this.a.a(aoj, i, z);
    }

    public final void a(bky bky, int i) {
        this.a.a(bky, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(aki, anj, boolean, boolean, long):int
     arg types: [aki, aua, int, int, int]
     candidates:
      axw.a(long, int, int, int, aou):void
      aov.a(long, int, int, int, aou):void
      axw.a(aki, anj, boolean, boolean, long):int */
    public final void a(long j, int i, int i2, int i3, aou aou) {
        aua aua;
        long j2;
        this.a.a(j, i, i2, i3, aou);
        while (this.a.b(false)) {
            this.d.a();
            if (this.a.a(this.c, (anj) this.d, false, false, 0L) == -4) {
                this.d.g();
                aua = this.d;
            } else {
                aua = null;
            }
            if (aua != null) {
                long j3 = aua.d;
                aue aue = (aue) this.b.c.a(aua).a(0);
                String str = aue.a;
                String str2 = aue.b;
                if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                    try {
                        j2 = blm.f(blm.a(aue.e));
                    } catch (ako e) {
                        j2 = -9223372036854775807L;
                    }
                    if (j2 != -9223372036854775807L) {
                        azx azx = new azx(j3, j2);
                        Handler handler = this.b.d;
                        handler.sendMessage(handler.obtainMessage(1, azx));
                    }
                }
            }
        }
        axw axw = this.a;
        axw.a(axw.a.j());
    }
}
