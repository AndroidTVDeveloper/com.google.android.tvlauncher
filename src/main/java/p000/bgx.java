package p000;

import android.view.View;
import android.widget.TextView;

/* renamed from: bgx */
/* compiled from: PG */
final class bgx implements View.OnClickListener, aks, bhf {

    /* renamed from: a */
    private final /* synthetic */ bgz f3877a;

    public /* synthetic */ bgx(bgz bgz) {
        this.f3877a = bgz;
    }

    /* renamed from: a */
    public final void mo466a() {
    }

    /* renamed from: b */
    public final void mo468b() {
    }

    /* renamed from: d */
    public final void mo471d() {
    }

    /* renamed from: e */
    public final void mo472e() {
    }

    /* renamed from: f */
    public final void mo473f() {
    }

    /* renamed from: g */
    public final void mo474g() {
    }

    /* renamed from: k */
    public final void mo478k() {
    }

    public final void onClick(View view) {
        bgz bgz = this.f3877a;
        akt akt = bgz.f3900m;
        if (akt == null) {
            return;
        }
        if (bgz.f3890c == view) {
            bgz.mo1903c(akt);
        } else if (bgz.f3889b == view) {
            bgz.mo1900b(akt);
        } else if (bgz.f3893f == view) {
            bgz.mo1909e(akt);
        } else if (bgz.f3894g != view) {
            int i = 1;
            if (bgz.f3891d == view) {
                if (akt.mo392f() != 1 && akt.mo392f() == 4) {
                    bgz.m3192a(akt, akt.mo397k(), -9223372036854775807L);
                }
                this.f3877a.f3901n.mo374a(akt, true);
            } else if (bgz.f3892e == view) {
                bgz.f3901n.mo374a(akt, false);
            } else if (bgz.f3895h == view) {
                int i2 = akt.mo395i();
                while (true) {
                    if (i <= 2) {
                        int i3 = (i2 + i) % 3;
                        if (i3 == 0) {
                            i2 = i3;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                ald ald = (ald) akt;
                ald.mo523u();
                ajy ajy = ald.f644b;
                if (ajy.f484i != i2) {
                    ajy.f484i = i2;
                    ajy.f479d.f516a.mo2041a(12, i2).sendToTarget();
                    ajy.mo386a(new ajj());
                }
            } else if (bgz.f3896i == view) {
                boolean z = !akt.mo396j();
                ald ald2 = (ald) akt;
                ald2.mo523u();
                ajy ajy2 = ald2.f644b;
                if (ajy2.f485j != z) {
                    ajy2.f485j = z;
                    ajy2.f479d.f516a.mo2041a(13, z ? 1 : 0).sendToTarget();
                    ajy2.mo386a(new ajk());
                }
            }
        } else {
            bgz.mo1905d(akt);
        }
    }

    /* renamed from: c */
    public final void mo470c() {
        this.f3877a.mo1914j();
    }

    /* renamed from: b */
    public final void mo469b(int i) {
        this.f3877a.mo1908e();
        this.f3877a.mo1914j();
    }

    /* renamed from: h */
    public final void mo475h() {
        this.f3877a.mo1910f();
        this.f3877a.mo1913i();
    }

    /* renamed from: i */
    public final void mo476i() {
        this.f3877a.mo1911g();
        this.f3877a.mo1910f();
    }

    /* renamed from: a */
    public final void mo1892a(long j) {
        bgz bgz = this.f3877a;
        TextView textView = bgz.f3897j;
        if (textView != null) {
            textView.setText(blm.m3639a(bgz.f3898k, bgz.f3899l, j));
        }
    }

    /* renamed from: b */
    public final void mo1894b(long j) {
        bgz bgz = this.f3877a;
        bgz.f3902o = true;
        TextView textView = bgz.f3897j;
        if (textView != null) {
            textView.setText(blm.m3639a(bgz.f3898k, bgz.f3899l, j));
        }
    }

    /* renamed from: a */
    public final void mo1893a(long j, boolean z) {
        akt akt;
        bgz bgz = this.f3877a;
        bgz.f3902o = false;
        if (!z && (akt = bgz.f3900m) != null) {
            akt.mo404r();
            bgz.m3192a(akt, akt.mo397k(), j);
        }
    }

    /* renamed from: j */
    public final void mo477j() {
        this.f3877a.mo1912h();
        this.f3877a.mo1910f();
    }

    /* renamed from: a */
    public final void mo467a(alh alh) {
        this.f3877a.mo1910f();
        this.f3877a.mo1913i();
    }
}
