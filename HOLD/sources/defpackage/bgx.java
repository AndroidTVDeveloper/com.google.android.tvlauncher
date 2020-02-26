package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: bgx  reason: default package */
/* compiled from: PG */
final class bgx implements View.OnClickListener, aks, bhf {
    private final /* synthetic */ bgz a;

    public /* synthetic */ bgx(bgz bgz) {
        this.a = bgz;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void k() {
    }

    public final void onClick(View view) {
        bgz bgz = this.a;
        akt akt = bgz.m;
        if (akt == null) {
            return;
        }
        if (bgz.c == view) {
            bgz.c(akt);
        } else if (bgz.b == view) {
            bgz.b(akt);
        } else if (bgz.f == view) {
            bgz.e(akt);
        } else if (bgz.g != view) {
            int i = 1;
            if (bgz.d == view) {
                if (akt.f() != 1 && akt.f() == 4) {
                    bgz.a(akt, akt.k(), -9223372036854775807L);
                }
                this.a.n.a(akt, true);
            } else if (bgz.e == view) {
                bgz.n.a(akt, false);
            } else if (bgz.h == view) {
                int i2 = akt.i();
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
                ald.u();
                ajy ajy = ald.b;
                if (ajy.i != i2) {
                    ajy.i = i2;
                    ajy.d.a.a(12, i2).sendToTarget();
                    ajy.a(new ajj());
                }
            } else if (bgz.i == view) {
                boolean z = !akt.j();
                ald ald2 = (ald) akt;
                ald2.u();
                ajy ajy2 = ald2.b;
                if (ajy2.j != z) {
                    ajy2.j = z;
                    ajy2.d.a.a(13, z ? 1 : 0).sendToTarget();
                    ajy2.a(new ajk());
                }
            }
        } else {
            bgz.d(akt);
        }
    }

    public final void c() {
        this.a.j();
    }

    public final void b(int i) {
        this.a.e();
        this.a.j();
    }

    public final void h() {
        this.a.f();
        this.a.i();
    }

    public final void i() {
        this.a.g();
        this.a.f();
    }

    public final void a(long j) {
        bgz bgz = this.a;
        TextView textView = bgz.j;
        if (textView != null) {
            textView.setText(blm.a(bgz.k, bgz.l, j));
        }
    }

    public final void b(long j) {
        bgz bgz = this.a;
        bgz.o = true;
        TextView textView = bgz.j;
        if (textView != null) {
            textView.setText(blm.a(bgz.k, bgz.l, j));
        }
    }

    public final void a(long j, boolean z) {
        akt akt;
        bgz bgz = this.a;
        bgz.o = false;
        if (!z && (akt = bgz.m) != null) {
            akt.r();
            bgz.a(akt, akt.k(), j);
        }
    }

    public final void j() {
        this.a.h();
        this.a.f();
    }

    public final void a(alh alh) {
        this.a.f();
        this.a.i();
    }
}
